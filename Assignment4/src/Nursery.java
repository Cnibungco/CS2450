import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class Nursery extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		Label addressLabel = new Label("24083 SD HWY 50 CHAMBERLAIN, SD, 57325");
		addressLabel.setStyle("-fx-text-fill: white");
		Label emailLabel = new Label("mkwessel@hotmail.com");
		emailLabel.setStyle("-fx-text-fill: white");
		Label phoneLabel = new Label("1-605-680-3097");
		phoneLabel.setStyle("-fx-text-fill: white");
		
		HBox header1 = new HBox(20, phoneLabel, emailLabel, addressLabel);
		header1.setPadding(new Insets(10));
		header1.setAlignment(Pos.TOP_RIGHT);
		header1.setStyle("-fx-background-color:#7cbcbb");
		
		
		Label name1 = new Label("Seberians of");
		name1.setStyle("-fx-font-size:30; -fx-text-fill:#14265b");
		Label name2 = new Label("the Heartland");
		name2.setStyle("-fx-font-size:30; -fx-text-fill:#14265b");
		VBox nameVBox = new VBox(name1, name2);
		
		Button homeButton = new Button("Home");
		homeButton.setStyle("-fx-text-fill:#14265b");
		Button nurseryButton = new Button("Nursery");
		nurseryButton.setStyle("-fx-text-fill:#14265b");
		Button first8WeeksButton = new Button("First 8 Weeks");
		first8WeeksButton.setStyle("-fx-text-fill:#14265b");
		Button heartlandAdultsButton = new Button("Hearland Adults");
		heartlandAdultsButton.setStyle("-fx-text-fill:#14265b");
		Button adultsForSaleButton = new Button("Adults for Sale");
		adultsForSaleButton.setStyle("-fx-text-fill:#14265b");
		Button puppyGaleeryButton = new Button("Puppy Gallery");
		puppyGaleeryButton.setStyle("-fx-text-fill:#14265b");
		Button kennelsButton = new Button("Kennels");
		kennelsButton.setStyle("-fx-text-fill:#14265b");
		Button ranchHistoryButton = new Button("Ranch History");
		ranchHistoryButton.setStyle("-fx-text-fill:#14265b");
		Button shotsFAQButton = new Button("Shorts/FAQ");
		shotsFAQButton.setStyle("-fx-text-fill:#14265b");
		Button contactButton = new Button("Contact Us");
		contactButton.setStyle("-fx-text-fill:#14265b");
		Button ourArea = new Button("Our Area");
		ourArea.setStyle("-fx-text-fill:#14265b");
		Button commnetsButton = new Button("Comments");
		commnetsButton.setStyle("-fx-text-fill:#14265b");
		
		HBox tabHBox = new HBox(homeButton, nurseryButton, first8WeeksButton, heartlandAdultsButton, adultsForSaleButton, puppyGaleeryButton, kennelsButton, ranchHistoryButton, shotsFAQButton, contactButton, ourArea, commnetsButton);
		tabHBox.setAlignment(Pos.CENTER_RIGHT);
				
		HBox header2 = new HBox (120, nameVBox, tabHBox);
		header2.setPadding(new Insets(10));
		
		VBox vbox = new VBox(header1, header2);
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
