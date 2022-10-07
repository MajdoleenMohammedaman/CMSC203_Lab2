


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
    //declare five buttons, a label, and a text field
	private Button fButton;
	private Button sButton;
	private Button tButton;
	private Button frButton;
	private Button fiButton;
	private TextField firstTextField;
	private Label printlabel;
    //declare two HBoxes
	private HBox hrBox;
	private HBox shrBox;
	private Button sixButton;
	
	//student Task #4:
	//  declare an instance of DataManager
	private DataManager dm;
	
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		Button button1 = new Button("Hello");
		Button button2 = new Button("Howdy");
		Button button3 = new Button("Chinese");
		Button button6 = new Button("Arabic");
		Button button4 = new Button("Clear");
		Button button5 = new Button("Exit");
		Label label1 = new Label("Feedback:");
		TextField fTextField = new TextField();		
		//instantiate the HBoxes
		HBox fhBox = new HBox();
		HBox shBox = new HBox();
		
		//student Task #4:
		//  instantiate the DataManager instance
		DataManager dataManager = new DataManager();
		//  set margins and set alignment of the components
		HBox.setMargin(button1, getInsets());
		HBox.setMargin(button2, getInsets());
		HBox.setMargin(button3, getInsets());
		HBox.setMargin(button4, getInsets());
		HBox.setMargin(button5, getInsets());
		HBox.setMargin(button6, getInsets());
		
		fhBox.setAlignment(Pos.CENTER);
		shBox.setAlignment(Pos.CENTER);
		
		//student Task #3:
	    //add the label and textfield to one of the HBoxes
		fhBox.getChildren().addAll(label1, fTextField);
		//add the buttons to the other HBox
		shBox.getChildren().addAll(button1, button2, button3, button4, button5);
		//add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(fhBox,shBox);
		
		//Task #4:
		//  create a private inner class to handle the button clicks
		
		class ButtonHandler implements EventHandler<ActionEvent> {
			
			@Override
			public void handle(ActionEvent event) {
				button1.setOnAction(new ButtonHandler());
				button2.setOnAction(new ButtonHandler());
				button3.setOnAction(new ButtonHandler());
				button4.setOnAction(new ButtonHandler());
				button5.setOnAction(new ButtonHandler());
				button5.setOnAction(new ButtonHandler());
				
				event.getTarget();
				if (button1.isPressed()) {
					dataManager.getHello();
				}
				else if (button2.isPressed()) {
					dataManager.getHowdy();
				}
				else if (button3.isPressed()) {
					dataManager.getChinese();
				}
				else if (button6.equals(sixButton)) {
					dataManager.getArabic();
				}
				else if (button4.equals(frButton)) {
					fTextField.setText("");
				}
				else if (button5.equals(fiButton)) {
					System.exit(0);
				}
				
				
			}
			
			
		}
	}
	
	
	
}
	
