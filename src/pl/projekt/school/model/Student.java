package pl.projekt.school.model;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

import java.util.List;
import java.util.Objects;


public class Student {



    private int id;
    private String firstName;
    private String lastName;
    private int groupId;
    private String educationYear;
    private int age;


    public Student() {

    }

    public Student(int id, String firstName, String lastName, int groupId, String educationYear, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
        this.educationYear = educationYear;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(String educationYear) {
        this.educationYear = educationYear;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }





    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupId=" + groupId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getGroupId() == student.getGroupId() && getFirstName().equals(student.getFirstName())
                && getLastName().equals(student.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGroupId());
    }

//    public void setFirstName(String firstName) {
//    }
//
//    public void setLastName(String lastName) {
//    }
}
