package pl.projekt.javafx.students;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pl.projekt.school.dao.StudentDao;
import pl.projekt.school.model.Student;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentCreateController implements Initializable {

    @FXML
    private Button createStudent;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField groupId;
    @FXML
    private TextField educationYear;
    @FXML
    private TextField age;
    @FXML
    private Button studentBackButton;
    @FXML
    private Button exitButton;
    @FXML
    private Button studentForwardButton;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if(event.getSource()== studentBackButton){
            stage = (Stage) studentBackButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("studentList.fxml"));
        }
        else if(event.getSource()== studentForwardButton){
            stage = (Stage) studentForwardButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/teachers/teacher.fxml"));
        }

        else{
            stage = (Stage) exitButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/mainWindow.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void createStud (ActionEvent event) throws IOException {

            Student student = new Student();

            student.setFirstName(firstName.getText());
            student.setLastName(lastName.getText());
            student.setGroupId(Integer.parseInt(groupId.getText()));
            student.setEducationYear(educationYear.getText());
            student.setAge(Integer.parseInt(age.getText()));
            StudentDao studentDao = new StudentDao();
            studentDao.insert(student);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
