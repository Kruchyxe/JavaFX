package pl.projekt.javafx.teachers;

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

public class TeacherController implements Initializable {

    @FXML
    private Button backToStudent;
    @FXML
    private Button exitToMain;
    @FXML
    private Button forwardToClass;
    @FXML
    private Button createTeacher;
    @FXML
    private Button editTeacher;
    @FXML
    private Button updateTeacher;
    @FXML
    private Button removeTeacher;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if(event.getSource()== backToStudent){
            stage = (Stage) backToStudent.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("students/studentList.fxml"));
        }
        else if(event.getSource()== forwardToClass){
            stage = (Stage) forwardToClass.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("class.fxml"));
        }

        else{
            stage = (Stage) exitToMain.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
