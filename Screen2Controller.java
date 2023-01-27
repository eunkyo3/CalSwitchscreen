package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Screen2Controller implements Initializable {
	
	@FXML Label lblText;
	@FXML Button btnFirst, btnClose;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void btnFirstAction(ActionEvent event) {
		try {
			Stage stage=(Stage)btnFirst.getScene().getWindow();
			Parent second = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
			Scene sc = new Scene(second);
			stage.setTitle("화면전환프로그램");
			stage.setScene(sc);
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void btnCloseAction(ActionEvent event) {
		Stage stage = (Stage) btnClose.getScene().getWindow();
		stage.close();
	}
}
