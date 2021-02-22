import java.time.Year;
import java.util.*;
import java.util.jar.Attributes.Name;

class Outer_Demo {
    private String Id;
    private String Name;
    private String Year_founded;
    private String City;
    private String State;
    private String Country;
    private int No_of_students;
    private ArrayList<String> Courses;

    void input_clg_data(String Id, String Name, String Year_founded, String City, String State, String Country,
            int No_of_students, ArrayList<String> Courses) {
        Id = this.Id;
        Name = this.Name;
        Year_founded = this.Year_founded;
        City = this.City;
        State = this.State;
        Country = this.Country;
        No_of_students = this.No_of_students;
        Courses = this.Courses;
    }

    void return_details() {
        System.out.println(Id + " " + Name + " " + Year_founded + " " + State + " " + Country + " " + No_of_students
                + " " + Courses);

    }

    private class Student {
        private String id;
        private String Student_Name;
        private int Year_of_Batch;
        private String Clg_id;
        private ArrayList<String> Skills;

        void input_student_data(String id, String Student_Name, String Year_of_Batch, String Clg_id,
                ArrayList<String> Skills) {
            id = this.id;
            Student_Name = this.Student_Name;
            Year_of_Batch = this.Year_of_Batch;
            Clg_id = this.Clg_id;
            Skills = this.Skills;
        }

    }
}
