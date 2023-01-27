package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Screen1Controller implements Initializable {
	
	@FXML Label lblText, lblSum;
	@FXML Button btnSecond, btnChange, btnClose, btnCal;
	@FXML TextField txtPer, txtPrice;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	//두번쨰 화면으로 전환
	public void btnSecondAction(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
			Stage stage = new Stage();
			stage.setTitle("화면전환프로그램");
			stage.setScene(new Scene(root, 600, 400));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//label 바꾸기
	public void btnChangeAction(ActionEvent event) {
		lblText.setText("스마트웹콘텐츠과");
		btnClose.setText("닫기");
	}
	
	//창닫기
	public void btnCloseAction(ActionEvent event) {
		Stage stage= (Stage) btnClose.getScene().getWindow();
		stage.close();
	}
	
	public void btnCalAction(ActionEvent event) {
		// 문자를 숫자로 변환
//		int tmpPer1 = Integer.parseInt(txtPer.getText());
//		int tmpPer3 = Integer.parseInt(txtPrice.getText());
		// 숫자를 문자로 변환
//		String tmpPer2 = String.valueOf(tmpPer1);
		// 문자를 레이블에 출력
		int tmpPer = Integer.parseInt(txtPer.getText());
		int tmpPrice = Integer.parseInt(txtPrice.getText());
		// 클래스 접근용 객체 선언
		MulModel model = new MulModel();
		DecimalFormat df = new DecimalFormat("#,###");
		int tmpSum = model.mul(tmpPer, tmpPrice);
//		int tmpSum = tmpPer * tmpPrice;
		
		lblSum.setText(df.format(tmpSum));
//		lblSum.setText(txtPer.getText());
	}
	
	
	
}
