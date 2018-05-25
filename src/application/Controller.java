package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

	@FXML
	private Button BtnSum, BtnRes, BtnMult, BtnDiv;
	
	@FXML
	private TextField TFnum1, TFnum2, TFresult;
	
	int Inum1, Inum2;

   @FXML
   public void initialize() {
	   
   }
   
   public void sumar (ActionEvent event) {
       System.out.println("sumando!");
       
       Inum1= Integer.parseInt(TFnum1.getText());
       Inum2= Integer.parseInt(TFnum2.getText());
       
       int result = Inum1 + Inum2;
       
       TFresult.setText(Integer.toString(result));
   }
   
   public void restar (ActionEvent event) {
       System.out.println("restando!");
       
       Inum1= Integer.parseInt(TFnum1.getText());
       Inum2= Integer.parseInt(TFnum2.getText());
       
       int result = Inum1 - Inum2;
       
       TFresult.setText(Integer.toString(result));
   }

   
   public void multiplicar (ActionEvent event) {
       System.out.println("multiplicando!");
       
       Inum1= Integer.parseInt(TFnum1.getText());
       Inum2= Integer.parseInt(TFnum2.getText());
       
       int result = Inum1 * Inum2;
       
       TFresult.setText(Integer.toString(result));
   }

   
   public void dividir (ActionEvent event) {
       System.out.println("dividiendo!");
       
       Inum1= Integer.parseInt(TFnum1.getText());
       Inum2= Integer.parseInt(TFnum2.getText());
       
       int result = Inum1 / Inum2;
       
       TFresult.setText(Integer.toString(result));
   }


}
