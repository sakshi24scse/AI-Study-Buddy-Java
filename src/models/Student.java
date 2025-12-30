package models;

public class Student {
    private int id;
    private String name;
    private int studyHours;

    public Student(int id, String name, int studyHours) {
        this.id = id;
        this.name = name;
        this.studyHours = studyHours;
    }

    public int getStudyHours() {
        return studyHours;
    }
}
