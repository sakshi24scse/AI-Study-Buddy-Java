package models;

public class Person {
    protected String name;
    protected String email;

    public Person() {}

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayRole() {
        System.out.println("Person role undefined");
    }
}
