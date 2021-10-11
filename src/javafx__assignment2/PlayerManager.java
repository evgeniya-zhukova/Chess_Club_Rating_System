/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx__assignment2;


public class PlayerManager {
        
        // define variables and array of objects
        private int playerId;
        private int numPlayer;
        private final int maxPlayer;
        private Player[] playerList;

        //constructor
    public PlayerManager(int maxPlayer) {
        this.playerId = 1;
        this.numPlayer = 0;
        this.maxPlayer = maxPlayer;
        playerList = new Player[maxPlayer];
    }

        //add player method
    public boolean addPlayer(String firstName, String lastName, int numGame, int numWin)
    {
        if (numPlayer >= maxPlayer)
            {return false;}
        Player pl = new Player(playerId, firstName, lastName, numGame, numWin);
        playerList[numPlayer]= pl;
        playerId++;
        numPlayer++;
        return true;
    }
    
        //find player method
    public int findPlayer(int playerId)
    {
        for (int i = 0; i < numPlayer; i++)
        {
            if (playerList[i].getPlayerId() == playerId)
            return i;
        }
            return -1;
    }

        //get games method
    public int getGames(int playerId)
    {
        return playerList[playerId-1].getNumGame();
    }
    
        //edit win method
    public boolean editWin(int numWin, int numGame, int playerId)
    {
        int location = findPlayer(playerId);
        if (location == -1) 
            {return false;}
        playerList[location].setNumWin(numWin);
        playerList[location].setNumGame(numGame);
        playerList[location].setNumLose(numGame-numWin);
        return true;
    }
    
        //edit lose method                     
    public boolean editLose(int numLose, int numGame, int playerId)
    {
        int location = findPlayer(playerId);
        if (location == -1) 
            {return false;}
        playerList[location].setNumLose(numLose);
        playerList[location].setNumGame(numGame);
        playerList[location].setNumWin(numGame-numLose);
        return true;
    }  
    
        //remove player method
    public boolean removePlayer(int playerId)
    {
        int location = findPlayer(playerId);
        if (location == -1) 
            {return false;}
        playerList[location] = playerList[numPlayer - 1];
        numPlayer--;
        return true;
    }

        //print players with highest win rate
    public String bestWinRate()
    {
        String s = "";
        double best = 0;
        for (int i = 0; i < numPlayer; i++) {
            if (best < playerList[i].getWinRate()){
                best = playerList[i].getWinRate();
            }
        }
        for (int i = 0; i < numPlayer; i++) {
            if(best == playerList[i].getWinRate()){
                s += playerList[i].toString();
            }
        }
        return s;
    }    
    
        //print players with highest win rate
    public String mostWin()
    {
        String s = "";
        int best = 0;
        for (int i = 0; i < numPlayer; i++) {
            if (best < playerList[i].getNumWin()){
                best = playerList[i].getNumWin();
            }
        }
        for (int i = 0; i < numPlayer; i++) {
            if(best == playerList[i].getNumWin()){
                s += playerList[i].toString();
            }
        }
        return s;
    } 
    
        //print an informatoin about all players
    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i < numPlayer; i++){
            s += playerList[i].toString();
        }
        return s;
    }      
}              