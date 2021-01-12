package pl.projekt.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.projekt.school.dao.StudentDao;


import java.sql.SQLException;


public class Main extends Application {



    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        stage.setTitle("Scheduler");
        stage.setScene(new Scene(root, 950, 725));
        stage.show();
    }


    public static void main(String[] args) throws SQLException {
        launch(args);

    }

}
