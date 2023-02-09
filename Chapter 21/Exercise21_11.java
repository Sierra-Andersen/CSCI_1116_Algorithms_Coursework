/*
 * Modifier: Sierra Andersen
 * Date: 8 Feb 2023
 * 
 * This program was modified to load the name popularity ranking data and display the rank based upon the user-given information.
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class Exercise21_11 extends Application {
	private Map<String, Integer>[] mapForBoy = new HashMap[10];
	private Map<String, Integer>[] mapForGirl = new HashMap[10];

	private Button btFindRanking = new Button("Find Ranking");
	private ComboBox<Integer> cboYear = new ComboBox<>();
	private ComboBox<String> cboGender = new ComboBox<>();
	private TextField tfName = new TextField();
	private Label lblResult = new Label();

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.add(new Label("Select a year:"), 0, 0);
		gridPane.add(new Label("Boy or girl?"), 0, 1);
		gridPane.add(new Label("Enter a name:"), 0, 2);
		gridPane.add(cboYear, 1, 0);
		gridPane.add(cboGender, 1, 1);
		gridPane.add(tfName, 1, 2);
		gridPane.add(btFindRanking, 1, 3);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(5);
		gridPane.setVgap(5);

		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(gridPane);
		borderPane.setBottom(lblResult);
		BorderPane.setAlignment(lblResult, Pos.CENTER);

		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 370, 160);
		primaryStage.setTitle("Exercise21_11"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		for (int year = 2001; year <= 2010; year++) {
			cboYear.getItems().add(year);
		}
		cboYear.setValue(2001);

		cboGender.getItems().addAll("Male", "Female");
		cboGender.setValue("Male");

		//Load url data into the Maps
		for(int i = 0; i < mapForGirl.length; i++) {
			loadURL("http://liveexample.pearsoncmg.com/data/babynamesranking"+(i+2001)+".txt", mapForBoy, mapForGirl, i);
		}

		Text nameRankTxt = new Text();

		System.out.println(mapForBoy[cboYear.getValue()-2001].get(tfName.getText()));
		
		btFindRanking.setOnAction(e->{
			gridPane.getChildren().remove(nameRankTxt);
			if(cboGender.getValue().equals("Male"))
				if(mapForBoy[cboYear.getValue()-2001].get(tfName.getText())==null)
					nameRankTxt.setText("That is an uncommon name and did not make the list.");
				else	
					nameRankTxt.setText("Boy name "+ tfName.getText() +" is ranked #"+ mapForBoy[cboYear.getValue()-2001].get(tfName.getText())  + " in the year "+ cboYear.getValue());
			
			else if(cboGender.getValue().equals("Female"))
				if(mapForGirl[cboYear.getValue()-2001].get(tfName.getText())== null)
					nameRankTxt.setText("That is an uncommon name and did not make the list.");
				else
					nameRankTxt.setText("Girl name "+ tfName.getText() +" is ranked #"+ mapForGirl[cboYear.getValue()-2001].get(tfName.getText())  + " in the year "+ cboYear.getValue());

			gridPane.add(nameRankTxt, 1, 4);
		});

	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}


	//process the URL and load the data into the Array
	public void loadURL(String website, Map<String, Integer>[] mapForBoy, Map<String, Integer>[] mapForGirl, int index) {
		try {
			URL url = new URL(website);
			Scanner input = new Scanner(url.openStream());

			HashMap<String, Integer> boyMap = new HashMap<String,Integer>();
			HashMap<String, Integer> girlMap = new HashMap<String,Integer>();
			while(input.hasNext()) {
				int rank = input.nextInt();
				String boyName = input.next();
				input.nextInt();
				String girlName = input.next();
				int girlCount = input.nextInt();

				boyMap.put(boyName, rank);
				girlMap.put(girlName, rank);
			}
			mapForBoy[index] = boyMap;
			mapForGirl[index] = girlMap;
		}
		catch(MalformedURLException ex) {
			ex.printStackTrace();
		}

		catch(IOException ex) {
			System.out.println("Invalid URL");
		}
	}

}
