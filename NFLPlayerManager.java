/** 
 * Program: NFL Player Program
 * File: PlayerManager.java 
 * Summary: The PlayerManager program displays 6 characters and their attributes. 
 * Added GUI functionality. You can select a list of players using their team or position. You may add them to your roster. If you would like,
 * you may delete them from your roster as well.
 * Author: Robert J Nichols
 * Date: 11/04/2017
 **/ 

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class NFLPlayerManager extends Application{ //Instructor Hebert: I tried but could not figure out the array list so I did it the incorrect way but I wanted to get the program to run.    
    
    public NFLPlayerManager(){
        createPlayers();
    }

    public ArrayList<OffensivePlayer> offensivePlayers = new ArrayList<>();
    public ArrayList<DefensivePlayer> defensivePlayers = new ArrayList<>();
        
    public void createPlayers(){        
        // Instantiate the Offensive Player class. 
        OffensivePlayer offensivePlayer1 = new OffensivePlayer("Tom ", "Brady", 40, 12, "Michigan", "18 Seasons", "Patriots", "Quarterback", "Passing Yards", 2541, true); // Creates an instance of the Player class and initialize class instance variables
        OffensivePlayer offensivePlayer2 = new OffensivePlayer("Bryson ", "Albright", 23, 54, "Miami", "1 Season", "Cardinals",  "Running Back", "Touchdowns", 2, true); // Creates an instance of the Player class and initialize class instance variables
        OffensivePlayer offensivePlayer3 = new OffensivePlayer("Kaelin ", "Clay", 25, 12, "Utah", "3 Seasons", "Panthers",  "Wide Receiver", "Touchdowns", 2, true); // Creates an instance of the Player class and initialize class instance variables
        // Instantiate the Defensive Player class.     
        DefensivePlayer defensivePlayer1 = new DefensivePlayer("Matt ", "Kalil", 28, 75, "Southern California", "6 Seasons", "Panthers",  "Tackle", "Games Started", 2, true); // Creates an instance of the Player class and initialize class instance variables
        DefensivePlayer defensivePlayer2  = new DefensivePlayer("David ", "Mayo", 24, 55, "Texas", "3 Seasons", "Patriots", "Line backer", "Tackles", 24,true); // Creates an instance of the Player class and initialize class instance variables
        DefensivePlayer defensivePlayer3 = new DefensivePlayer("Russel ", "Shepard", 27, 5, "Ohio", "5 Seasons", "Cardinals",  "Corner Back", "Tackles", 2, true); // Creates an instance of the Player class and initialize class instance variables
        
        offensivePlayers.add(offensivePlayer1); //add offensive players to the array list
        offensivePlayers.add(offensivePlayer2);
        offensivePlayers.add(offensivePlayer3);
        defensivePlayers.add(defensivePlayer1); //add defensive players to the array list
        defensivePlayers.add(defensivePlayer2);
        defensivePlayers.add(defensivePlayer3);
        
    }   
    
    @Override
    public void start(Stage stage){
        stage.setWidth(1200);
        stage.setHeight(750);
        
        //Scene 1 MAIN MENU
        //ImagePane for LOGO
        Pane imagePane = new Pane();
        Image image = new Image("images/BigLOGO.png");
        ImageView imageView = new ImageView(image);
        imageView.relocate(-50, -200);
        imageView.setFitHeight(350);
        imageView.setFitWidth(450);
        imagePane.getChildren().add(imageView);
        
        //TEXT
        Text text1 = new Text();
        text1.setTextAlignment(TextAlignment.LEFT);
        text1.setText("NFL Player Picker.");
        text1.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 50));
        
        //Button
        Button btnBegin = new Button("Click here, let's begin.");
        btnBegin.setTextAlignment(TextAlignment.CENTER);
        btnBegin.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 20));
        
        //VBox for text
        VBox vbox = new VBox(5);
        vbox.getChildren().addAll(text1, btnBegin);
        vbox.setAlignment(Pos.CENTER);
        
        //GridLayout manager to add the image pane and text vbox to
        GridPane pane = new GridPane();
        pane.getChildren().addAll(imagePane, vbox);
        pane.setAlignment(Pos.CENTER);
        pane.setStyle("-fx-background-color: lightslategray");
        //END SCENE 1
        
        
        //SCENE 2 Players MENU
        //LOGO on bottom left 
        Pane logoPane = new Pane();
        Image image2 = new Image("images/SmallLOGO.png");
        ImageView iv2 = new ImageView(image2);
        iv2.relocate(-50, 600);
        iv2.setFitHeight(120);
        iv2.setFitWidth(150);
        logoPane.getChildren().add(iv2);
        
        
        //ListView for players.
        ListView listView = new ListView();   
        listView.setMaxHeight(150);
        
        //Menu items for different positions
        MenuItem menuItem1 = new MenuItem("Quarterback");
        MenuItem menuItem2 = new MenuItem("Running back");
        MenuItem menuItem3 = new MenuItem("Wide Receiver");
        MenuItem menuItem4 = new MenuItem("Tackle");
        MenuItem menuItem5 = new MenuItem("Line Backer");
        MenuItem menuItem6 = new MenuItem("Corner Back");
        MenuButton menuButton = new MenuButton("Positions", null, menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6); //menu button with list of menu items for positions available to choose from.
        
        //BUTTONS
        //Roster button to return to the roster screen
        Button btnRoster = new Button("Roster");
        Pane btnpane = new Pane();
        btnpane.getChildren().addAll( btnRoster);
        btnRoster.relocate(-50,-113);
        
        Button team1 = new Button("Patriots"); // first team
        Button team2 = new Button("Cardinals"); // second team
        Button team3 = new Button("Panthers"); // third team
          
        //Hbox for buttons horizontally listed
        HBox hboxbtn = new HBox(5);
        hboxbtn.getChildren().addAll(team1, team2, team3);
        hboxbtn.setAlignment(Pos.CENTER);
        
        //Text to choose a position
        Text positionText = new Text("Choose a Position.");
        positionText.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 20));
        
        //Text to choose a team
        Text teamText = new Text("Choose a team.");
        teamText.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 20));
        
        //Informative Text
        Text addText = new Text("If you would like to add to your team, simply left click the player.");
        addText.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 17));
        
        //Searchfield text
        Text search = new Text("Enter Player number to search for player.");
        search.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 17));
        
        //TextField for search box
        TextField searchField = new TextField();
        searchField.setMaxWidth(50);
        
        //SEARCHFIELD HBOX
        HBox searchHbox = new HBox(5);
        searchHbox.getChildren().addAll(search, searchField);
        searchHbox.setAlignment(Pos.CENTER);
        
        //VBOX to add all components and list them vertically
        VBox vbox2 = new VBox(5);
        vbox2.getChildren().addAll(btnpane, search, searchField, teamText, hboxbtn, positionText, menuButton, addText, listView);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setMinWidth(1100);
        vbox2.setPadding(new Insets(0, 50, 15, 12));
        
        //gridpane to list everything in a grid. added logo and vbox2.
        GridPane pane2 = new GridPane();
        pane2.getChildren().addAll(logoPane,vbox2);
        pane2.setAlignment(Pos.CENTER);
        pane2.setStyle("-fx-background-color: lightslategray"); //changed the scenes background color.
        //END SCENE 2
        
        
        //SCENE 3 ROSTER
        //Bottom left logo display
        Pane logoPane2 = new Pane();
        Image image3 = new Image("images/SmallLOGO.png");
        ImageView iv3 = new ImageView(image3);
        iv3.relocate(-50, 600);
        iv3.setFitHeight(120);
        iv3.setFitWidth(150);
        logoPane2.getChildren().add(iv3);
        
        //player screen button top left to return to players screen.
        Pane btnpane2 = new Pane();
        Button btnPlayers = new Button("Players");
        btnpane2.getChildren().addAll(btnPlayers);
        btnPlayers.relocate(-40,-168);
        
        //Text for current roster info text.
        Text rosterText = new Text("Current Roster.");
        rosterText.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 20));
        
        //Informative text for deleting a player from the roster.
        Text deleteText = new Text("Left click a player to remove from your roster.");
        deleteText.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 17));
        
        //ListView of roster to have players added to.
        ListView roster = new ListView();
        roster.setMaxHeight(150);
        
        //main vbox of the scene. used to list the components vertically.
        VBox vbox3 = new VBox(5);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setMinWidth(1100);
        vbox3.getChildren().addAll(btnpane2, rosterText, deleteText, roster);
        
        //uses gridpane to layout everything in a grid. added bottom left logo and main vbox3 for the scene.
        GridPane pane3 = new GridPane();
        pane3.getChildren().addAll(logoPane2, vbox3);
        pane3.setAlignment(Pos.CENTER);
        pane3.setStyle("-fx-background-color: lightslategray");
        //ENDSCENE3
              
        //Main scene
        Scene scene = new Scene(pane);
        
        //player scene
        Scene scene2 = new Scene(pane2);
        
        //roster scene
        Scene scene3 = new Scene(pane3);
        
        //When you click on the list, if that player isn't already added to the roster, adds player to the roster.
        listView.setOnMouseClicked(e -> {        
            if(!roster.getItems().contains(listView.getSelectionModel().getSelectedItem())){
                roster.getItems().add(listView.getSelectionModel().getSelectedItem());
            }
            else
            {
                System.out.println("You can't add the same player twice.");
            }
        });
        
        //Deletes item from the roster on mouse click.
        roster.setOnMouseClicked(e ->{
            roster.getItems().remove(roster.getSelectionModel().getSelectedItem());
        });
        
        //MenuItems Functionality
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist adds to the listview.
        menuItem1.setOnAction(e -> {
            if(e.getSource() == menuItem1)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(offensivePlayers.get(i).getPosition().contains("Quarterback")){
                        listView.getItems().add(offensivePlayers.get(i));
                    }
                }
        });
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist adds to the listview.
        menuItem2.setOnAction(e -> {
            if(e.getSource() == menuItem2)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(offensivePlayers.get(i).getPosition().contains("Running Back")){
                        listView.getItems().add(offensivePlayers.get(i));
                    }
                }
        });
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist adds to the listview.
        menuItem3.setOnAction(e -> {
            if(e.getSource() == menuItem3)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(offensivePlayers.get(i).getPosition().contains("Wide Receiver")){
                        listView.getItems().add(offensivePlayers.get(i));
                    }
                }
        });
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist adds to the listview.        
        menuItem4.setOnAction(e -> {
            if(e.getSource() == menuItem4)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(defensivePlayers.get(i).getPosition().contains("Tackle")){
                        listView.getItems().add(defensivePlayers.get(i));
                    }
                }
        });
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist adds to the listview.        
        menuItem5.setOnAction(e -> {
            if(e.getSource() == menuItem5)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(defensivePlayers.get(i).getPosition().contains("Line backer")){
                        listView.getItems().add(defensivePlayers.get(i));
                    }
                }
        });
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist and adds to the listview.       
        menuItem6.setOnAction(e -> {
            if(e.getSource() == menuItem6)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(defensivePlayers.get(i).getPosition().contains("Corner Back")){
                        listView.getItems().add(defensivePlayers.get(i));
                    }
                }
        });
        
        //Button Functionality
        //When you click the button, it switches to scene 2. (Player selection screen)
        btnBegin.setOnAction(e -> {
            if(e.getSource() == btnBegin)
                stage.setScene(scene2);

        });
        //When you click the button, it switches to scene 3. (Roster screen)
        btnRoster.setOnAction(e -> {
            if(e.getSource() == btnRoster)
                stage.setScene(scene3); 
        });
        //When you click teh button, returns to scene 2. (Player selection screen)
        btnPlayers.setOnAction(e -> {
            if(e.getSource() == btnPlayers){
                stage.setScene(scene2);
            }
        });
        
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist and adds to the listview.  
        team1.setOnAction(e ->{
            if(e.getSource() == team1)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(offensivePlayers.get(i).getTeam().contains("Patriots")){
                        listView.getItems().add(offensivePlayers.get(i));
                    }
                    if(defensivePlayers.get(i).getTeam().contains("Patriots")){
                        listView.getItems().add(defensivePlayers.get(i));
                    }
                }
        });
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist and adds to the listview.  
        team2.setOnAction(e ->{
            if(e.getSource() == team2)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(offensivePlayers.get(i).getTeam().contains("Cardinals")){
                        listView.getItems().add(offensivePlayers.get(i));
                    }
                    if(defensivePlayers.get(i).getTeam().contains("Cardinals")){
                        listView.getItems().add(defensivePlayers.get(i));
                    }
                }
        });
        //Deletes the list items before listing them again. Prevents list items from continously stacking. Loops through each player with the designated string within the arraylist and adds to the listview.  
        team3.setOnAction(e ->{
            if(e.getSource() == team3)
                listView.getItems().removeAll(offensivePlayers);
                listView.getItems().removeAll(defensivePlayers);
                for(int i=0; i < 3; i++){
                    if(offensivePlayers.get(i).getTeam().contains("Panthers")){
                        listView.getItems().add(offensivePlayers.get(i));
                    }
                    if(defensivePlayers.get(i).getTeam().contains("Panthers")){
                        listView.getItems().add(defensivePlayers.get(i));
                    }
                }
        });        

        stage.setTitle("NFL Player Picker"); //Title of the Stage
        stage.setScene(scene);//Main Scene on startup.
        stage.show();
    }
    public static void main(String[] args) {
    launch(args);
    }
}


