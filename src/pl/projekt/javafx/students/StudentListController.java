package pl.projekt.javafx.students;

import javafx.beans.property.adapter.JavaBeanIntegerProperty;
import javafx.beans.property.adapter.JavaBeanIntegerPropertyBuilder;
import javafx.beans.property.adapter.JavaBeanStringProperty;
import javafx.beans.property.adapter.JavaBeanStringPropertyBuilder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import pl.projekt.school.DBUtil;
import pl.projekt.school.dao.StudentDao;
import pl.projekt.school.model.BindingStudent;
import pl.projekt.school.model.Student;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentListController implements Initializable {
    Stage stage;
    Parent root;

    @FXML
    private Button createStudent;
    @FXML
    private Button editStudent;
    @FXML
    private Button updateStudent;
    @FXML
    private Button removeStudent;
    @FXML
    private Button studentBackButton;
    @FXML
    private Button exitButton;
    @FXML
    private Button studentForwardButton;
    @FXML
    private TableView<BindingStudent> studentListView;
    @FXML
    private TableColumn<BindingStudent, Integer> colStudId;
    @FXML
    private TableColumn<BindingStudent, String> colStudFirstName;
    @FXML
    private TableColumn<BindingStudent, String> colStudLastName;
    @FXML
    private TableColumn<BindingStudent, Integer> colStudGroupId;
    @FXML
    private TableColumn<BindingStudent, String> colStudEducation;
    @FXML
    private TableColumn<BindingStudent, Integer> colStudAge;
    @FXML
    private ObservableList<Student> observableList;





    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;

        if (event.getSource() == studentBackButton) {
            stage = (Stage) studentBackButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/mainWindow.fxml"));
        } else if (event.getSource() == studentForwardButton) {
            stage = (Stage) studentForwardButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("teachers/teacher.fxml"));
        } else {
            stage = (Stage) exitButton.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("/mainWindow.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void createStud(ActionEvent event) throws IOException {

        if (event.getSource() == createStudent) {
            stage = (Stage) createStudent.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("studentCreate.fxml"));
        }
        Scene scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();

    }

    @FXML
    private void updateStudent(ActionEvent event) throws IOException {
        if (event.getSource() == updateStudent) {
            stage = (Stage) updateStudent.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("studentUpdate.fxml"));
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    private void studentList() {
        try {
            StudentDao studentDao = new StudentDao();
            observableList = FXCollections.observableArrayList(studentDao.readAll());
            studentListView = new TableView(observableList);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private final List<BindingStudent> bindingStudentList = new ArrayList<>();




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        bindingStudentList.add(new BindingStudent(1, "Krzysiek", "Milczanowski", 4, "2020-11-15",37));
        bindingStudentList.add(new BindingStudent(2, "Adam", "Mickiewicz", 4, "2020-11-15",27));
        bindingStudentList.add(new BindingStudent(3, "Stefan", "Żeromski", 2, "2021-01-11",17));
        colStudId.setCellValueFactory(new PropertyValueFactory<>("Id"));
        colStudFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        colStudLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        colStudGroupId.setCellValueFactory(new PropertyValueFactory<>("groupId"));
        colStudEducation.setCellValueFactory(new PropertyValueFactory<>("educationYear"));
        colStudAge.setCellValueFactory(new PropertyValueFactory<>("Age"));
        studentListView.setItems(FXCollections.observableArrayList(bindingStudentList));


    }



}






