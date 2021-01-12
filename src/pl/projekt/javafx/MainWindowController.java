package pl.projekt.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable {

    @FXML
    private Button studentList;
    @FXML
    private Button teacherList;
    @FXML
    private Button classList;
    @FXML
    private Button subjectList;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if(event.getSource()== studentList){
            stage = (Stage) studentList.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("students/studentList.fxml"));
        }
        else if(event.getSource()== teacherList){
            stage = (Stage) teacherList.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("teachers/teacher.fxml"));
        }

        else{
            stage = (Stage) classList.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
