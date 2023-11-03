import java.time.LocalDate;

public class School {
   private String name;
   private String lastname;
   private LocalDate date;
   private String group;


   public School(){

   }

    public School(String name, String lastname, LocalDate date, String group) {
        this.name = name;
        this.lastname = lastname;
        this.date = date;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

}
