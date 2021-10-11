/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx__assignment2;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Player {
    
        // define variables
        private int playerId;
        private String firstName;
        private String lastName;
        private int numGame;
        private int numWin;
        private int numLose;
        private double winRate;

        //constructor
    public Player(int playerId, String firstName, String lastName, int numGame, int numWin) {
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numGame = numGame;
        this.numWin = numWin;
        this.numLose = numGame - numWin;
        if (numGame != 0)
            {
                this.winRate = (double)numWin/numGame;
                winRate = new BigDecimal(winRate).setScale(3, RoundingMode.UP).doubleValue();
            }
        else
            {this.winRate = 0;}
    }

    //getters, setters
    public int getPlayerId() {
        return playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getNumGame() {
        return numGame;
    }

    public void setNumGame(int numGame) {
        this.numGame = numGame;
    }

    public int getNumWin() {
        return numWin;
    }

    public void setNumWin(int numWin) {
        this.numWin = numWin;
        this.numLose = numGame - numWin;
        if (numGame != 0)
            {
            this.winRate = (double)numWin/numGame;
            winRate = new BigDecimal(winRate).setScale(3, RoundingMode.UP).doubleValue();
            }
        else
            {this.winRate = 0;}
    }

    public int getNumLose() {
        return numLose;
    }
    
    public void setNumLose(int numLose) {
        this.numLose = numLose;
        this.numWin = numGame - numLose;
        if (numGame != 0)
            {
            this.winRate = (double)numWin/numGame;
            winRate = new BigDecimal(winRate).setScale(3, RoundingMode.UP).doubleValue();
            }
        else
            {this.winRate = 0;}
    }

    public double getWinRate() {
        return winRate;
    }
    
    //print an information about a player
    public String toString() {
        String s = "";
        s += "\n\nID: " + getPlayerId() + "\t\tFirst name: " + getFirstName() + "\t\tLast name: " + getLastName()
                + "\nGame was played: " + getNumGame() + "\t\twinRate: " + getWinRate() + "\nGame Win: "
                + getNumWin() + "\t\tGame Lose: " + getNumLose() ;
        return s;
    }
}