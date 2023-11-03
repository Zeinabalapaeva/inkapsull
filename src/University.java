import java.util.Arrays;

public class University {
    private String[] studentsName;

    public University(String... studentsName) {
        this.studentsName = studentsName;
    }

    public String[] getStudentsName() {
        return studentsName;
    }

    public String[] setStudentsName() {
   return this.setStudentsName();
        }



    @Override
    public String toString() {
        return "University{" +
                "studentsName=" + Arrays.toString(studentsName) +
                '}';
    }
}




