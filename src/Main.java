import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        University university = new University("Zeinab", "Myrzaiym", "Nurlan", "Yntymak");
//        for (String s : university.setStudentsName()) {
//            System.out.println(s);
//
//        }
////////////////////////////////////////////////////////////////////////////////////////////

//        Car car = new Car("mazda", "2003- god", "Korea");
//        Car car1 = new Car("lexus","2009","USA");
//        Car car2 = new Car("BMV","2003","JApon");
//
//        Car [] cars = {car,car1,car2};
//
//        for (Car c : cars) {
//
//            c.setMarca("Mazda 5");
//
//            c.setDateVyhoda("2009");
//
//            c.setCounter("Korea");
//
//
//            System.out.println("Marca: " + c.getMarca());
//            System.out.println("Year: " + c.getDateVyhoda());
//            System.out.println("Counter: " + c.getCounter());
//        }

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//        Person[] people = {
//                new Person("Zeinab", "Alapaeva", LocalDate.of(1994, 3, 25), 'f'),
//                new Person("Myrzaiym", "Kylychpekov", LocalDate.of(1995, 10, 13), 'f'),
//                new Person("Nurlan", "Rasyl", LocalDate.of(2005, 2, 10), 'm')
//        };
//
//        for (Person person : people) {
//            System.out.println("First Name: " + person.getName());
//            System.out.println("Last Name: " + person.getLastName());
//            System.out.println("Birth Date: " + person.getDate());
//            System.out.println("Gender: " + person.getGender());
//            System.out.println();
//        }
//
//     /////////////////////////////////////////////////////////////////////////////////////////////////////////

        School[] schools = {
                new School("Adinai", "Namazalieva", LocalDate.of(2015, 10, 8), "english"),
                new School("Aizirec", "Baktybekova", LocalDate.of(2001, 4, 8), "english"),
                new School("Asylzat", "Altynbekova", LocalDate.of(2004, 3, 6), "english")
        };

        for (School school : schools) {
            System.out.println("First Name: " + school.getName());
            System.out.println("Last Name: " + school.getLastname());
            System.out.println("Birth Date: " + school.getDate());
            System.out.println("Language: " + school.getGroup());
            System.out.println();
        }
    }}