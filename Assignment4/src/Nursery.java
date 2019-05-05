import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;


public class Nursery extends Application {
	
	private MenuBar menuBar;
	private Menu homeItem;
	private Menu aboutUs;
	private Menu dogsAvailable;
	private Menu gallery;
	private Menu contactUs;
	
	private MenuItem ranchHistory;
	private MenuItem kennels;
	private MenuItem puppies;
	private MenuItem adults;
	private MenuItem locationArea;
	private MenuItem map;

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
		
		
		Label name1 = new Label("Siberians of");
		name1.setStyle("-fx-font-size:35; -fx-text-fill:#14265b");
		Label name2 = new Label("the Heartland");
		name2.setStyle("-fx-font-size:35; -fx-text-fill:#14265b");
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
		
		menuBar = new MenuBar();
		homeItem = new Menu("Home");
		aboutUs = new Menu("About Us");
		dogsAvailable = new Menu("Dogs Available");
		gallery = new Menu("Gallery");
		contactUs = new Menu("Contact Us");
		menuBar.getMenus().add(homeItem);
		menuBar.getMenus().add(aboutUs);
		menuBar.getMenus().add(dogsAvailable);
		menuBar.getMenus().add(gallery);
		menuBar.getMenus().add(contactUs);
		HBox menuHBox = new HBox(menuBar);
		menuHBox.setAlignment(Pos.CENTER_RIGHT);
		
		buildAboutUsMenu();
		buildDogsAvailableMenu();
		buildContactUsMenu();
		
				
		HBox header2 = new HBox (120, nameVBox, menuHBox);
		header2.setPadding(new Insets(15));
		
		
		
		Label availablePuppies = new Label("Available Puppies");
		availablePuppies.setStyle("-fx-font-size:40; -fx-text-fill:#ef709b");
		HBox availablePuppiesHBox = new HBox(availablePuppies);
		availablePuppiesHBox.setStyle("-fx-background-color:#e3eaea");
		availablePuppiesHBox.setAlignment(Pos.CENTER);
		availablePuppiesHBox.setPadding(new Insets(10));
		
		
		Image dog1Image = new Image("file:Pictures/dog1.jpg");
		ImageView dog1ImageView = new ImageView(dog1Image);
		dog1ImageView.setFitHeight(500);
		dog1ImageView.setFitWidth(500);
		
		Label dog1Label = new Label("Siberian Husky (Maggie)");
		dog1Label.setStyle("-fx-font-size:35; -fx-text-fill:#6eb7e5");
		//goldenRetreverLabel.setFont(new Font(50));
		Text dog1Description = new Text("The Siberian Husky is a medium-sized working dog, quick and light on his feet and free\nand graceful in action. His moderately compact and well furred body, erect ears and brush\ntail suggest his Northern heritage. His characteristic gait is smooth and seemingly\neffortless. He performs his original function in harness most capably, carrying a light load\nat a moderate speed over great distances. His body proportions and form reflect this\nbasic balance of power, speed and endurance.\n");
		dog1Description.setFont(new Font(20));
		
		
		Text dog1NationalCity = new Text("Name :\tMaggie\nAge :\t10 Week\nBreed :\tSiberian Husky\nDOB :\t02-21-2019\nWeight :\nGender :\tFemale\nID :\t\t1882B");
		dog1NationalCity.setStyle("-fx-font-size:20");
		
		Button dog1RequestButton = new Button("My Puppy Request Now!");
		dog1RequestButton.setMinWidth(400);
		//dog1RequestButton.setStyle("-fx-background-color:#3da8ce");
		
		VBox dog1NationalCityVBox = new VBox(dog1NationalCity);
		dog1NationalCityVBox.setPadding(new Insets(10));
		dog1NationalCityVBox.setStyle("-fx-background-color:#dee9ed");
		
		VBox dog1DesVBox = new VBox(20, dog1Label, dog1Description,dog1NationalCityVBox, dog1RequestButton);
		
		HBox dog1HBox = new HBox(20, dog1ImageView, dog1DesVBox);
		dog1HBox.setPadding(new Insets(20));

	/*********************************************/
		
		Image dog2Image = new Image("file:Pictures/dog2.jpg");
		ImageView dog2ImageView = new ImageView(dog2Image);
		dog2ImageView.setFitHeight(500);
		dog2ImageView.setFitWidth(500);
		
		
		Label shibaLabel = new Label("Shiba Inu (Orion)");
		shibaLabel.setStyle("-fx-font-size:35; -fx-text-fill:#6eb7e5");
		//goldenRetreverLabel.setFont(new Font(50));
		Text dog2Description = new Text("The Shiba is the smallest of the Japanese native breeds of dog and was\noriginally developed for hunting by sight and scent in the dense undergrowth\nof Japan’s mountainous areas. Alert and agile with keen senses, he is also an\nexcellent watchdog and companion. His frame is compact with well-developed\nmuscles. Males and females are distinctly different in appearance: males are\nmasculine without coarseness, females are feminine without weakness of\nstructure.");
		dog2Description.setFont(new Font(20));
		
		Text dog2NationalCity = new Text("Name :\tOrion\nAge :\t10 Week\nBreed :\tShiba Inu\nDOB :\t02-16-2019\nWeight :\t6 lbs 2 oz\nGender :\tMale\nID :\t\t7538B");
		dog2NationalCity.setStyle("-fx-font-size:20");
		
		Button dog2RequestButton = new Button("My Puppy Request Now!");
		dog2RequestButton.setMinWidth(400);
		//dog1RequestButton.setStyle("-fx-background-color:#3da8ce");
		
		VBox dog2NationalCityVBox = new VBox(dog2NationalCity);
		dog2NationalCityVBox.setPadding(new Insets(10));
		dog2NationalCityVBox.setStyle("-fx-background-color:#dee9ed");
		
		VBox dog2DesVBox = new VBox(20, shibaLabel, dog2Description,dog2NationalCityVBox, dog2RequestButton);
		
		HBox dog2HBox = new HBox(20, dog2ImageView, dog2DesVBox);
		dog2HBox.setPadding(new Insets(20));
		
		
		
		
		
		VBox bodyVBox = new VBox(10, dog1HBox, dog2HBox);
		
		ScrollPane scrollPane = new ScrollPane(bodyVBox);
		scrollPane.setFitToHeight(true);
		
		VBox vbox = new VBox(header1, header2, availablePuppiesHBox, scrollPane);
		scrollPane.setFitToHeight(true);
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	private void buildContactUsMenu() {
		locationArea = new MenuItem("Location/Our Area");
		map = new MenuItem("Map");
		
		contactUs.getItems().add(locationArea);
		contactUs.getItems().add(map);
		
	}

	private void buildAboutUsMenu() {
		
		ranchHistory = new MenuItem("Ranch History");
		kennels = new MenuItem("Kennels");
		
		aboutUs.getItems().add(ranchHistory);
		aboutUs.getItems().add(kennels);
		
		
	}
	
	private void buildDogsAvailableMenu() {
		puppies = new MenuItem("Puppies");
		adults = new MenuItem("Adults");
		
		dogsAvailable.getItems().add(puppies);
		dogsAvailable.getItems().add(adults);
	}

}
