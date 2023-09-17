import java.lang.reflect.Array;

public class FullTimeTeacher{
    String name;
    String firstLastName;
    String secondLastName;
    int age;
    String degree;
    String [] subjectsToTeach;
    String specialty;
    int birthdate;
    float salary;

    FullTimeTeacher (){

    }

    FullTimeTeacher (String name,String firstLastName, String secondLastName,int age, String degree, String [] subjectsToTeach, String specialty,int birthdate,float salary){
        this.name = name;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
    }


    void prepareSubjectsMaterial(){}
    void teach (){}
    void prepareExams (){}
    void reviewExams (){}
    void gradeExams (){}//calificar exámenes
    void giveConsulting (){}//impartir asesorias
    void giveTutorials(){}//impartir tutorias


    public static void main(String[] args) {
        
    }

    


}