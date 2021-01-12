package pl.projekt.school.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


public class BindingStudent {

    private final IntegerProperty id = new SimpleIntegerProperty();
    private final StringProperty firstName = new SimpleStringProperty();
    private final StringProperty lastName = new SimpleStringProperty();
    private final IntegerProperty groupId = new SimpleIntegerProperty();
    private final StringProperty educationYear = new SimpleStringProperty();
    private final IntegerProperty age = new SimpleIntegerProperty();

    public BindingStudent() {
    }

    public BindingStudent(int i, String fn, String ln, int gid, String ey, int a) {
        id.set(i);
        firstName.set(fn);
        lastName.set(ln);
        groupId.set(gid);
        educationYear.set(ey);
        age.set(a);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int i) {
        id.set(i);
    }

    public IntegerProperty id() {
        return id;
    }

    public String getFirstName() {
        return firstName.get();
    }
    public void setFirstName(String fn) {
        firstName.set(fn);
    }
    public StringProperty firstNameProperty() {
        return firstName;
    }
    public String getLastName() {
        return firstName.get();
    }
    public void setLastName(String ln) {
        lastName.set(ln);
    }
    public StringProperty lastNameProperty() {
        return lastName;
    }

    public int getGroupId() {
        return groupId.get();
    }

    public void setGroupId(int gid) {
        groupId.set(gid);
    }

    public IntegerProperty groupId() {
        return groupId;
    }
    public String getEducationYear() {
        return educationYear.get();
    }
    public void setEducationYear(String ey) {
        educationYear.set(ey);
    }
    public StringProperty educationYearProperty() {
        return educationYear;
    }
    public int getAge() {
        return age.get();
    }

    public void setAge(int a) {
        age.set(a);
    }

    public IntegerProperty age() {
        return age;
    }

}
