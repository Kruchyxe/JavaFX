package pl.projekt.school.dao;

import pl.projekt.school.DBUtil;
import pl.projekt.school.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {


    private static final String CREATE_STUDENT =
            "INSERT INTO students (firstName, lastName, groupId, educationYear, age) VALUES (?, ?, ?, ?, ?);";

    private static final String READ_STUDENT =
            "SELECT * FROM students WHERE id = ?;";

    private static final String READ_ALL_STUDENT =
            "SELECT * FROM students;";

    private static final String UPDATE_STUDENT =
            "UPDATE students SET firstname = ?, lastName = ?, groupId = ?, educationYear = ?, age = ? WHERE id = ?;";

    private static final String DELETE_STUDENT =
            "DELETE FROM students WHERE id = ?;";


    public Student insert(Student student) {
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_STUDENT);
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setInt(3, student.getGroupId());
            statement.setString(4, student.getEducationYear());
            statement.setInt(5, student.getAge());
            statement.executeUpdate();
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Student> readAll() {
        List <Student> studentList = new ArrayList<>();
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(READ_ALL_STUDENT);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setFirstName(resultSet.getString("firstName"));
                student.setLastName(resultSet.getString("lastName"));
                student.setGroupId(resultSet.getInt("groupId"));
                student.setEducationYear(resultSet.getString("educationYear"));
                student.setAge(resultSet.getInt("age"));

                studentList.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return studentList;
    }


    public void update(Student student) {
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(UPDATE_STUDENT);
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setInt(3, student.getGroupId());
            statement.setString(4, student.getEducationYear());
            statement.setInt(5, student.getAge());
            statement.setInt(6, student.getId());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int studentId) {
        try (Connection conn = DBUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(DELETE_STUDENT);
            statement.setInt(1, studentId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
