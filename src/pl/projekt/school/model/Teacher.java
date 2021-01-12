package pl.projekt.school.model;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private int groupId;
    private String email;
    private int phone;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, int groupId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
    }

    public Teacher(int id, String firstName, String lastName, int groupId, String email, int phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupId = groupId;
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupId=" + groupId +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
