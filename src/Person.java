import java.time.LocalDate;

public class Person {
    private String name;
    private  String lastName;
    private LocalDate date;
    private char gender;




    public Person(){

    }

    public Person(String name, String lastName, LocalDate date, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", date=" + date +
                ", gender=" + gender +
                '}';
    }


}
