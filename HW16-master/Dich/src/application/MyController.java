package application;

import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MyController implements Initializable{
	@FXML
	private Button button1;
	
	@FXML
	private Button button2;
	
	@FXML
	private TextField txt1;
	
	@FXML
	private Label label1;
	
	public void initialize(URL location, ResourceBundle resources) {
		 
	       // TODO (don't really need to do anything here).
	      
	}
	// When user click on button1
	// this method will be called.
	public void action(ActionEvent event) {
		label1.setText("Hello"+" "+txt1.getText());
		//должно быть что-то такое, но у меня оно не получилось
		//(Label label1,TextField txt1)
		//	-> label1.setText("Hello"+txt1.getText());
	}
}