/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javafx__assignment2;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class JavaFX__Assignment2 extends Application implements EventHandler<ActionEvent>{
   
    Scene mainMenu, memServMenu, reportServMenu, addMemScene, recWinScene, 
            recLossScene, listMemScene, bestPlScene, mostWinScene;
    Button btnAMSubm, btnRWSubm,btnRLSubm, btnRWClear, btnRLClear;
    TextField fNameText, lNameText, gameText, winText, changeWinText, chooseIdText,
            changeLossText, chooseIdText1, changeGameText, changeGamesText;
    Label invAMLabel, listMemStrLabel, bestStrLabel, mostWinStrLabel,
            listMemStrLabelRW, listMemStrLabelRL, invRWLabel, invRLLabel;
    PlayerManager playerManager = new PlayerManager(100);
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        
        
    //MAIN MENU
        GridPane grid = new GridPane(); // to have a grid stage to put our comp. on
        grid.setAlignment(Pos.CENTER); // set the alignment of a grid
        grid.setHgap(10); // 10 pixels between col
        grid.setVgap(10); // 10 pixels between rows
        mainMenu = new Scene(grid, 700,450);//set scene Main Menu
        
        //Label Main Menu
        Label mainMenuLabel = new Label("Chess Club System");//create a label
        mainMenuLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));//set font
        grid.add(mainMenuLabel, 0, 0);//add label to GridPane
        
        //Button "Member Services"
        Button btnMemServ = new Button("Member Services");//create a button
        btnMemServ.setPrefSize(420, 70);//set size of a button
        btnMemServ.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        grid.add(btnMemServ, 0, 5);//add button to Grid Pane
        btnMemServ.setOnAction(actionEvent -> primaryStage.setScene(memServMenu));//set action
        
        //Button "Report Services"
        Button btnReportServ = new Button("Report Services");//create a button
        btnReportServ.setPrefSize(420, 70);//set size of a button
        btnReportServ.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        grid.add(btnReportServ, 0, 7);//add button to Grid Pane
        btnReportServ.setOnAction(actionEvent -> primaryStage.setScene(reportServMenu));//set action
        
        //Button "Exit"
        Button btnExit = new Button("Exit");//create a button
        btnExit.setPrefSize(420, 70);//set size of a button
        btnExit.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        grid.add(btnExit, 0, 9);//add button to Grid Pane
        btnExit.setOnAction(actionEvent -> primaryStage.close());//set action
        
        
        
        
        
    //MEMBER SERVICES MENU
        GridPane gridMS = new GridPane(); // to have a grid stage to put our comp. on
        gridMS.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridMS.setHgap(10); // pixels between col
        gridMS.setVgap(10); // pixels between rows
        memServMenu = new Scene(gridMS, 700,500);//set scene Member Services menu
    
        //Label Member Services
        Label memServLabel = new Label("Member Services");//create a label
        memServLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));//set font
        gridMS.add(memServLabel, 0, 0);//add label to GridPane
        
        //Button "Add Member"
        Button btnAddMem = new Button("Add Member");//create a button
        btnAddMem.setPrefSize(375, 75);//set size of a button
        btnAddMem.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridMS.add(btnAddMem, 0, 5);//add button to Grid Pane
        btnAddMem.setOnAction(actionEvent -> primaryStage.setScene(addMemScene));//set action
        
        //Button "Record Win"
        Button btnRecWin = new Button("Record Win");//create a button
        btnRecWin.setPrefSize(375, 75);//set size of a button
        btnRecWin.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridMS.add(btnRecWin, 0, 7);//add button to Grid Pane
        btnRecWin.setOnAction(actionEvent -> primaryStage.setScene(recWinScene));//set action
        
        //Button "Record Loss"
        Button btnRecLoss = new Button("Record Loss");//create a button
        btnRecLoss.setPrefSize(375, 75);//set size of a button
        btnRecLoss.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridMS.add(btnRecLoss, 0, 9);//add button to Grid Pane
        btnRecLoss.setOnAction(actionEvent -> primaryStage.setScene(recLossScene));//set action
        
        //Button "Back to Main Menu"
        Button btnMainMenu = new Button("Back to Main Menu");//create a button
        btnMainMenu.setPrefSize(375, 75);//set size of a button
        btnMainMenu.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridMS.add(btnMainMenu, 0, 11);//add button to Grid Pane
        btnMainMenu.setOnAction(actionEvent -> primaryStage.setScene(mainMenu));//set action
        
        
        
        
        
    //REPORT SERVICES MENU
        GridPane gridRS = new GridPane(); // to have a grid stage to put our comp. on
        gridRS.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridRS.setHgap(5); // pixels between col
        gridRS.setVgap(10); // pixels between rows
        reportServMenu = new Scene(gridRS, 700,500);//set scene Report Services menu
    
        //Label Report Services
        Label reportServLabel = new Label("Report Services");//create a label
        reportServLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));//set font
        gridRS.add(reportServLabel, 0, 0);//add label to GridPane
        
        //Button "List Members"
        Button btnListMem = new Button("List Members");//create a button
        btnListMem.setPrefSize(375, 75);//set size of a button
        btnListMem.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridRS.add(btnListMem, 0, 5);//add button to Grid Pane
        btnListMem.setOnAction(actionEvent -> primaryStage.setScene(listMemScene));//set action
        
        //Button "View Best Player"
        Button btnBestPl = new Button("View Best Player");//create a button
        btnBestPl.setPrefSize(375, 75);//set size of a button
        btnBestPl.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridRS.add(btnBestPl, 0, 7);//add button to Grid Pane
        btnBestPl.setOnAction(actionEvent -> primaryStage.setScene(bestPlScene));//set action
        
        //Button "View Player With The Most Wins"
        Button btnMostWin = new Button("View Player With The Most Wins");//create a button
        btnMostWin.setPrefSize(375, 75);//set size of a button
        btnMostWin.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridRS.add(btnMostWin, 0, 9);//add button to Grid Pane
        btnMostWin.setOnAction(actionEvent -> primaryStage.setScene(mostWinScene));//set action
        
        //Button "Back to Main Menu"
        Button btnMainMen = new Button("Back to Main Menu");//create a button
        btnMainMen.setPrefSize(375, 75);//set size of a button
        btnMainMen.setFont(Font.font("Tahoma", FontWeight.NORMAL, 24));//set font
        gridRS.add(btnMainMen, 0, 11);//add button to Grid Pane
        btnMainMen.setOnAction(actionEvent -> primaryStage.setScene(mainMenu));//set action
        
        
        
        
        
    //ADD MEMBER MENU
        GridPane gridAM = new GridPane(); // to have a grid stage to put our comp. on
        gridAM.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridAM.setHgap(10); // pixels between col
        gridAM.setVgap(10); // pixels between rows
        addMemScene = new Scene(gridAM, 700,550);//set scene Add Member menu
        
        //Label Add Member
        Label addMemLabel = new Label("Add Member");//create a label
        addMemLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));//set font
        gridAM.add(addMemLabel, 0, 0);//add label to GridPane
        
        //Label First name
        Label fNameLabel = new Label("First name");//create a label
        fNameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(fNameLabel, 0, 1);//add label to GridPane
        
        //Label Last name
        Label lNameLabel = new Label("Last name");//create a label
        lNameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(lNameLabel, 0, 3);//add label to GridPane
        
        //Label Number game played
        Label gameLabel = new Label("Number game played");//create a label
        gameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(gameLabel, 0, 5);//add label to GridPane
        
        //Label Number win
        Label winLabel = new Label("Number win");//create a label
        winLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(winLabel, 0, 7);//add label to GridPane
        
        //Label Invisible
        invAMLabel = new Label("");//create a label
        invAMLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        invAMLabel.setTextFill(Color.web("#b20707"));//set color
        gridAM.add(invAMLabel, 1, 10);//add label to GridPane
        
        //TextField First name
        fNameText = new TextField("");//create a text field
        fNameText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(fNameText, 1, 1);//add text field to GridPane
        
        //TextField Last name
        lNameText = new TextField("");//create a text field
        lNameText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(lNameText, 1, 3);//add text field to GridPane
        
        //TextField Number game played
        gameText = new TextField("");//create a text field
        gameText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(gameText, 1, 5);//add text field to GridPane
        
        //TextField Number win
        winText = new TextField("");//create a text field
        winText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(winText, 1, 7);//add text field to GridPane
        
        //Button "Submit"
        btnAMSubm = new Button("Submit");//create a button
        btnAMSubm.setPrefSize(305, 30);//set size of a button
        btnAMSubm.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(btnAMSubm, 0, 10);//add button to Grid Pane
        //set action
        btnAMSubm.setOnAction(this);
        
        //Button "Clear Form"
        Button btnAMClear = new Button("Clear Form");//create a button
        btnAMClear.setPrefSize(305, 30);//set size of a button
        btnAMClear.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(btnAMClear, 0, 12);//add button to Grid Pane
        //set action
        btnAMClear.setOnAction(actionEvent -> 
        {
            //clear text fields
            fNameText.setText("");
            lNameText.setText("");
            gameText.setText("");
            winText.setText("");
            invAMLabel.setText("");
        });
        
        //Button "Back to Member Services Menu"
        Button btnMainAMS = new Button("Back to Member Services Menu");//create a button
        btnMainAMS.setPrefSize(305, 30);//set size of a button
        btnMainAMS.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridAM.add(btnMainAMS, 0, 14);//add button to Grid Pane
        //set action 
        btnMainAMS.setOnAction(actionEvent -> 
        {
            primaryStage.setScene(memServMenu);
            //clear text fields
            fNameText.setText("");
            lNameText.setText("");
            gameText.setText("");
            winText.setText("");
            invAMLabel.setText("");
        });   
        
        
        
        
        
    //RECORD WIN MENU
        GridPane gridRW = new GridPane(); // to have a grid stage to put our comp. on
        gridRW.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridRW.setHgap(5); // pixels between col
        gridRW.setVgap(5); // pixels between rows
        recWinScene = new Scene(gridRW, 700, 550);//set scene menu
    
        //Record Win Label
        Label recWinLabel = new Label("Record Win");//create a label
        recWinLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));//set font
        gridRW.add(recWinLabel, 0, 0);//add label to GridPane
                
        //List Members
        listMemStrLabelRW = new Label();//create a label
        listMemStrLabelRW.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));//set font
        gridRW.add(listMemStrLabelRW, 0, 1);//add label to GridPane
        
        //Label Choose ID
        Label chooseIdLabel = new Label("Choose player ID");//create a label
        chooseIdLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));//set font
        gridRW.add(chooseIdLabel, 1, 4);//add label to GridPane
        
        //Label Change Games
        Label gameRecLabel = new Label("New number of games");//create a label
        gameRecLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));//set font
        gridRW.add(gameRecLabel, 1, 6);//add label to GridPane
        
        //Label Change Win
        Label winRecLabel = new Label("New number of wins");//create a label
        winRecLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));//set font
        gridRW.add(winRecLabel, 1, 8);//add label to GridPane
        
        //TextField Choose ID
        chooseIdText = new TextField("");//create a text field
        chooseIdText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));//set font
        gridRW.add(chooseIdText, 0, 4);//add text field to GridPane
        
        //TextField Change Games
        changeGameText = new TextField("");//create a text field
        changeGameText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));//set font
        gridRW.add(changeGameText, 0, 6);//add text field to GridPane
        
        //TextField Change Win
        changeWinText = new TextField("");//create a text field
        changeWinText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));//set font
        gridRW.add(changeWinText, 0, 8);//add text field to GridPane
                
        //Label Invisible
        invRWLabel = new Label("");//create a label
        invRWLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));//set font
        invRWLabel.setTextFill(Color.web("#b20707"));//set color
        gridRW.add(invRWLabel, 1, 9);//add label to GridPane
        
        //Button "Submit"
        btnRWSubm = new Button("Submit");//create a button
        btnRWSubm.setPrefSize(305, 30);//set size of a button
        btnRWSubm.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));//set font
        gridRW.add(btnRWSubm, 0, 10);//add button to Grid Pane
        //set action
        btnRWSubm.setOnAction(this);
        
        //Button "Clear Form"
        btnRWClear = new Button("Clear Form");//create a button
        btnRWClear.setPrefSize(305, 30);//set size of a button
        btnRWClear.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));//set font
        gridRW.add(btnRWClear, 0, 11);//add button to Grid Pane
        //set action
        btnRWClear.setOnAction(actionEvent -> 
        {
            //clear text fields
            chooseIdText.setText("");
            changeGameText.setText("");
            changeWinText.setText("");
            invRWLabel.setText("");
        });
        
        //Button "Back to Report Services Menu"
        Button btnMainRW = new Button("Back to Member Services Menu");//create a button
        btnMainRW.setPrefSize(305, 30);//set size of a button
        btnMainRW.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));//set font
        gridRW.add(btnMainRW, 0, 12);//add button to Grid Pane
        btnMainRW.setOnAction(actionEvent -> 
            {
                primaryStage.setScene(memServMenu);
                //clear text fields
                chooseIdText.setText("");
                changeGameText.setText("");
                changeWinText.setText("");
                invRWLabel.setText("");       
            });//set action        
       
        
        
        
        
    //RECORD LOSS MENU
        GridPane gridRL = new GridPane(); // to have a grid stage to put our comp. on
        gridRL.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridRL.setHgap(10); // pixels between col
        gridRL.setVgap(10); // pixels between rows
        recLossScene = new Scene(gridRL, 700,550);//set scene menu
    
        //Record Loss Label
        Label recLossLabel = new Label("Record Loss");//create a label
        recLossLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));//set font
        gridRL.add(recLossLabel, 0, 0);//add label to GridPane
        
        //List Members
        listMemStrLabelRL = new Label();//create a label
        listMemStrLabelRL.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));//set font
        gridRL.add(listMemStrLabelRL, 0, 1);//add label to GridPane
        
        //Label Choose ID
        Label chooseIdLabel1 = new Label("Choose player ID");//create a label
        chooseIdLabel1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));//set font
        gridRL.add(chooseIdLabel1, 1, 4);//add label to GridPane
        
        //Label Change Games
        Label gamesRecLabel = new Label("New number of games");//create a label
        gamesRecLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));//set font
        gridRL.add(gamesRecLabel, 1, 6);//add label to GridPane
        
        //Label Change Loss
        Label lossRecLabel = new Label("Enter new number of losses");//create a label
        lossRecLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 16));//set font
        gridRL.add(lossRecLabel, 1, 8);//add label to GridPane
        
        //TextField Choose ID
        chooseIdText1 = new TextField("");//create a text field
        chooseIdText1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));//set font
        gridRL.add(chooseIdText1, 0, 4);//add text field to GridPane
                
        //TextField Change Games
        changeGamesText = new TextField("");//create a text field
        changeGamesText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));//set font
        gridRL.add(changeGamesText, 0, 6);//add text field to GridPane
        
        //TextField Change Loss
        changeLossText = new TextField("");//create a text field
        changeLossText.setFont(Font.font("Tahoma", FontWeight.NORMAL, 15));//set font
        gridRL.add(changeLossText, 0, 8);//add text field to GridPane
                
        //Label Invisible
        invRLLabel = new Label("");//create a label
        invRLLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));//set font
        invRLLabel.setTextFill(Color.web("#b20707"));//set color
        gridRL.add(invRLLabel, 1, 9);//add label to GridPane
        
        //Button "Submit"
        btnRLSubm = new Button("Submit");//create a button
        btnRLSubm.setPrefSize(305, 30);//set size of a button
        btnRLSubm.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));//set font
        gridRL.add(btnRLSubm, 0, 10);//add button to Grid Pane
        //set action
        btnRLSubm.setOnAction(this);
        
        //Button "Clear Form"
        btnRLClear = new Button("Clear Form");//create a button
        btnRLClear.setPrefSize(305, 30);//set size of a button
        btnRLClear.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));//set font
        gridRL.add(btnRLClear, 0, 11);//add button to Grid Pane
        //set action
        btnRLClear.setOnAction(actionEvent -> 
        {
            //clear text fields
            chooseIdText1.setText("");
            changeLossText.setText("");
            invRLLabel.setText("");
        });
        
        //Button "Back to Report Services Menu"
        Button btnMainRL = new Button("Back to Member Services Menu");//create a button
        btnMainRL.setPrefSize(305, 30);//set size of a button
        btnMainRL.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridRL.add(btnMainRL, 0, 12);//add button to Grid Pane
        btnMainRL.setOnAction(actionEvent -> 
            {
                primaryStage.setScene(memServMenu);
                //clear text fields
                chooseIdText1.setText("");
                changeLossText.setText("");
                invRLLabel.setText("");       
            });//set action                 
        
        
             

        
    //LIST MEMBERS MENU
        GridPane gridLM = new GridPane(); // to have a grid stage to put our comp. on
        gridLM.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridLM.setHgap(10); // pixels between col
        gridLM.setVgap(10); // pixels between rows
        listMemScene = new Scene(gridLM, 700,550);//set scene List Members menu
    
        //List Members Label
        Label listMemLabel = new Label("List Members");//create a label
        listMemLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));//set font
        gridLM.add(listMemLabel, 0, 0);//add label to GridPane
        
        //List Members
        listMemStrLabel = new Label();//create a label
        listMemStrLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));//set font
        gridLM.add(listMemStrLabel, 0, 2);//add label to GridPane
        
        //Button "Back to Report Services Menu"
        Button btnMainRS = new Button("Back to Report Services Menu");//create a button
        btnMainRS.setPrefSize(305, 30);//set size of a button
        btnMainRS.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridLM.add(btnMainRS, 0, 14);//add button to Grid Pane
        btnMainRS.setOnAction(actionEvent -> primaryStage.setScene(reportServMenu));//set action        
        
        
        
        
        
    //VIEW BEST PLAYER MENU
        GridPane gridBP = new GridPane(); // to have a grid stage to put our comp. on
        gridBP.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridBP.setHgap(10); // pixels between col
        gridBP.setVgap(10); // pixels between rows
        bestPlScene = new Scene(gridBP, 700,550);//set scene 
    
        //Best Win Rate Label
        Label bestLabel = new Label("Best Player (Best Win Rate)");//create a label
        bestLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));//set font
        gridBP.add(bestLabel, 0, 0);//add label to GridPane
        
        //List Win Rate
        bestStrLabel = new Label();//create a label
        bestStrLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));//set font
        gridBP.add(bestStrLabel, 0, 2);//add label to GridPane
        
        //Button "Back to Report Services Menu"
        Button btnMainRS2 = new Button("Back to Report Services Menu");//create a button
        btnMainRS2.setPrefSize(305, 30);//set size of a button
        btnMainRS2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridBP.add(btnMainRS2, 0, 14);//add button to Grid Pane
        btnMainRS2.setOnAction(actionEvent -> primaryStage.setScene(reportServMenu));//set action 
        
        
        
        
        
    //VIEW PLAYER WITH THE MOST WINS MENU
        GridPane gridMW = new GridPane(); // to have a grid stage to put our comp. on
        gridMW.setAlignment(Pos.CENTER); // set the alignment of a grid
        gridMW.setHgap(10); // pixels between col
        gridMW.setVgap(10); // pixels between rows
        mostWinScene = new Scene(gridMW, 700,550);//set scene 
    
        //Player With The Most Wins menu Label
        Label mostWinLabel = new Label("The Most Wins");//create a label
        mostWinLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));//set font
        gridMW.add(mostWinLabel, 0, 0);//add label to GridPane
        
        //Player With The Most Wins menu
        mostWinStrLabel = new Label();//create a label
        mostWinStrLabel.setText(playerManager.mostWin());
        mostWinStrLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));//set font
        gridMW.add(mostWinStrLabel, 0, 2);//add label to GridPane
        
        //Button "Back to Report Services Menu"
        Button btnMainRS3 = new Button("Back to Report Services Menu");//create a button
        btnMainRS3.setPrefSize(305, 30);//set size of a button
        btnMainRS3.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));//set font
        gridMW.add(btnMainRS3, 0, 14);//add button to Grid Pane
        btnMainRS3.setOnAction(actionEvent -> primaryStage.setScene(reportServMenu));//set action 
 

        
        
        
        primaryStage.setTitle("Chess Club System");
        primaryStage.setScene(mainMenu);
        primaryStage.show();
    }
    
    
    
    
    //function for checking if input is digit
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }   
    
    
           @Override
    public void handle(ActionEvent event){
        
        //add Member Button event
        if(event.getSource()== btnAMSubm){
            //get data from TextFields
            String firstName = fNameText.getText();
            String lastName = lNameText.getText();
            String games = gameText.getText();
            String wins = winText.getText();        
            
            //add player function
            if (isDigit(games) && isDigit(wins))
            {
                int gm = Integer.parseInt(games);
                int wn = Integer.parseInt(wins);  
            if (gm<wn){
                invAMLabel.setText("Wins should be less then number of games.");
            }
            else{
                playerManager.addPlayer(firstName, lastName, gm, wn);
                invAMLabel.setText("A player was added successful.");

                //sent data to Report Services
                listMemStrLabel.setText(playerManager.toString());
                listMemStrLabelRL.setText("Member list: " + playerManager.toString());
                listMemStrLabelRW.setText("Member list: " + playerManager.toString());
                bestStrLabel.setText(playerManager.bestWinRate());
                mostWinStrLabel.setText(playerManager.mostWin());
            }
            }
            else
            {invAMLabel.setText("A player was not added.");}
        }
             
        
        
        //Record Win Button event
        if(event.getSource()== btnRWSubm){
            //get data from TextFields
            String id = chooseIdText.getText();
            String newWin = changeWinText.getText(); 
            String newGame = changeGameText.getText();

            //Record Win function
            if (isDigit(id) && isDigit(newWin) && isDigit(newGame))
            {
            int cid = Integer.parseInt(id);
            int nw = Integer.parseInt(newWin); 
            int ng = Integer.parseInt(newGame);
                if (ng<nw){
                        invRWLabel.setText("Wins should be less then number of games.");
                    }
                else{
                    playerManager.editWin(nw, ng, cid); 
                    invRWLabel.setText("A number of wins was changed successful.");

                    //sent data to Report Services
                    listMemStrLabel.setText(playerManager.toString());
                    listMemStrLabelRL.setText("Member list: " + playerManager.toString());
                    listMemStrLabelRW.setText("Member list: " + playerManager.toString());
                    bestStrLabel.setText(playerManager.bestWinRate());
                    mostWinStrLabel.setText(playerManager.mostWin());
                }
            }
            else
            {invRWLabel.setText("A number of wins was not changed.");}
        }
        

                        
        //Record Loss Button event
        if(event.getSource()== btnRLSubm){
            //get data from TextFields
            String id = chooseIdText1.getText();
            String newLoss = changeLossText.getText();       
            String newGames = changeGamesText.getText();
            
            //Record Loss function
            if (isDigit(id) && isDigit(newLoss) && isDigit(newGames))
            {
                int cid = Integer.parseInt(id);
                int nl = Integer.parseInt(newLoss); 
                int ng = Integer.parseInt(newGames);
                if (ng<nl){
                    invRLLabel.setText("Losses should be less then number of games.");
                }
                else{
                    playerManager.editLose(nl, ng, cid);
                    invRLLabel.setText("A number of losses was changed successful.");

                    //sent data to Report Services
                    listMemStrLabel.setText(playerManager.toString());
                    listMemStrLabelRL.setText("Member list: " + playerManager.toString());
                    listMemStrLabelRW.setText("Member list: " + playerManager.toString());
                    bestStrLabel.setText(playerManager.bestWinRate());
                    mostWinStrLabel.setText(playerManager.mostWin());
                }
            }
            else
                {invRLLabel.setText("A number of losses was not changed.");}
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
            
    }  
}




        