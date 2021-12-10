package paket;

import java.util.Date;

public class Student {
    private int id;
    private String PIB;
    private String adress;
    private Date birth;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String PIB, String adress, Date birth, String faculty, int course, String group) {
        this.id = id;
        this.PIB = PIB;
        this.adress = adress;
        this.birth = birth;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getPIB() {
        return PIB;
    }

    public String getAdress() {
        return adress;
    }

    public Date getBirth() {
        return birth;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student {" + PIB + ", " + faculty + ", " + course + ", " + group + "}";
    }
}

