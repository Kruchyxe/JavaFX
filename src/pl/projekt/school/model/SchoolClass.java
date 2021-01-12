package pl.projekt.school.model;

public class SchoolClass {
    private int id;
    private int schoolClass;

    public SchoolClass() {
    }

    public SchoolClass(int id, int schoolClass) {
        this.id = id;
        this.schoolClass = schoolClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(int schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "id=" + id +
                ", schoolClass=" + schoolClass +
                '}';
    }
}
