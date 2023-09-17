import java.util.ArrayList;

/*
Clase Persona
Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Nombre
• Apellido
• Edad: no debe permitir edades menores a 0 ni mayores a 110 
Constructores: Debe implementar los siguientes constructores
• Constructor sin parámetros: debe inicializar las propiedades del objeto por
default
• Constructor que reciba los atributos de la clase como parámetros y los inicialice
con los valores proporcionados
Métodos: deberá implementar los siguientes métodos
• Mostrar datos de la persona en la consola (System.out.println)
*/
class Person{
    //Atributos en privado porque se encapsularán "pojo"
    private String name;
    private String lastName;
    private int age;
/*• Constructor sin parámetros: debe inicializar las propiedades del objeto por
default
• Constructor que reciba los atributos de la clase como parámetros y los inicialice
con los valores proporcionados */
    Person (){//Este es un método constructor vacío
        this.name = "";
        this.lastName = "";
        this.age = 0;
    }
    Person(String name, String lastName,int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
    //Aquí se encapsulan
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name= newName;    
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }
    public int getAge(){
        return age;
    }
    // • Edad: no debe permitir edades menores a 0 ni mayores a 110
    public void setAge(int newAge){
        if(newAge<=0 && newAge>=110){
        System.out.println("La edad ingresada no está permitida");}
        else{
            this.age = newAge;
        }
    }
    /*Métodos: deberá implementar los siguientes métodos
    • Mostrar datos de la persona en la consola (System.out.println)*/
    public void displayData()
    {
        System.out.println(getName());
        System.out.println(getLastName());
        System.out.println(getAge());
    }
}
/*Clase Profesor
Atributos: Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Número de empleado
Constructores: Debe implementar los siguientes constructores
• Constructor sin parámetros: debe inicializar las propiedades del objeto por
default
• Constructor que reciba todos los atributos de la clase como parámetros y los
inicialice con los valores proporcionados
Métodos: deberá implementar los siguientes métodos
• Deberá sobrescribir el método Mostrar Datos del padre */
class Teacher extends Person{
/*
Atributos: Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Número de empleado
*/
private int employeeOfNumber;
/*
• Constructor sin parámetros: debe inicializar las propiedades del objeto por
default
• Constructor que reciba todos los atributos de la clase como parámetros y los
inicialice con los valores proporcionados
*/
    Teacher(){
    this.employeeOfNumber = 0;
    }
    Teacher(String name, String lastName, int age, int employeeOfNumber){
        super(name, lastName,age);
        this.employeeOfNumber = employeeOfNumber;
    }
    public int getEmployeeOfNumber (){
        return employeeOfNumber;
    }
    public void setEmployeeOfNumber(int newEmployeeOfnumber){
        this.employeeOfNumber = newEmployeeOfnumber;
    }
/*
Métodos: deberá implementar los siguientes métodos
• Deberá sobrescribir el método Mostrar Datos del padre
*/
    public void displayData(){
        System.out.println(getName());
        System.out.println(getLastName());
        System.out.println(getAge());
        System.out.println(getEmployeeOfNumber());
    }
/*
Clase Profesor Interino
Atributos: Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Fecha de inicio
• Fecha de fin
Constructores: Debe implementar los siguientes constructores
• Constructor que recibe fecha de inicio e inicialice la fecha
• Constructor que reciba todos los atributos de la clase como parámetros y los
inicialice con los valores proporcionados
Métodos: deberá implementar los siguientes métodos
• Deberá sobrescribir el método Mostrar Datos del padre 
*/
}
class InternTeacher extends Teacher{
/*
Atributos: Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Fecha de inicio
• Fecha de fin
*/
private int startDate;
private int finishDate;
/*
Constructores: Debe implementar los siguientes constructores
• Constructor que recibe fecha de inicio e inicialice la fecha
• Constructor que reciba todos los atributos de la clase como parámetros y los
inicialice con los valores proporcionados
*/
    InternTeacher (){}
    InternTeacher(int startDate){
        this.startDate = startDate;
    }
    InternTeacher(int startDate,int finishDate){
        this.startDate = startDate;
        this.finishDate = finishDate;
    }
    InternTeacher(String name, String lastName, int age, int employeeOfnumber, int startDate,int finishDate){
        //super es para los atributos de la clase padre
        super(name, lastName, age, employeeOfnumber);
        this.startDate = startDate;
        this.finishDate = finishDate;
    }
    public int getStartDate(){
        return startDate;
    }
/*
Métodos: deberá implementar los siguientes métodos
• Deberá sobrescribir el método Mostrar Datos del padre 
*/
    public void setStartDate(int newStartDate){
        this.startDate = newStartDate;
    }
    public int getFinishDate(){
        return finishDate;
    }
    public void setFinishDate(int newFinishDate){
        this.finishDate = newFinishDate;
    }

    public void displayData(){
        System.out.println(getName());
        System.out.println(getLastName());
        System.out.println(getAge());
        System.out.println(getEmployeeOfNumber());
        System.out.println(getStartDate());
        System.out.println(getFinishDate());
    }
}
/*
Clase Profesor Titular
Atributos: Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Número de Cubículo
Constructores: Debe implementar los siguientes constructores
• Constructor sin parámetros
• Constructor que reciba todos los atributos de la clase como parámetros y los
inicialice con los valores proporcionados
Métodos: deberá implementar los siguientes métodos
• Deberá sobrescribir el método Mostrar Datos del padre
*/
class TeacherTitular extends Teacher{
/*
Atributos: Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Número de Cubículo
*/
private int cubicleNumber;
/*
Constructores: Debe implementar los siguientes constructores
• Constructor sin parámetros
• Constructor que reciba todos los atributos de la clase como parámetros y los
inicialice con los valores proporcionados 
*/
    TeacherTitular(){}
    TeacherTitular(String name, String lastName, int age, int employeeOfNumber, int cubicleNumber){
        super(name,lastName,age, employeeOfNumber);
        this.cubicleNumber=cubicleNumber;
    }
    public int getCubicleNumber(){
        return cubicleNumber;
    }
    public void setCubicleNumber(int newCubicleNumber){
        this.cubicleNumber = newCubicleNumber;
    }
/*Métodos: deberá implementar los siguientes métodos
• Deberá sobrescribir el método Mostrar Datos del padre */
    public void displayData(){
        System.out.println(getName());
        System.out.println(getLastName());
        System.out.println(getAge());
        System.out.println(getEmployeeOfNumber());
        System.out.println(getCubicleNumber());
    }
}
/*
Clase Lista de Profesores
Atributos: Esta clase debe contener los siguientes atributos los cuales deberán ser
encapsulados
• Lista de profesores: se deberá utilizar una variable de tipo java.util.ArrayList y
deberá contener objetos de tipo <Profesor>
Constructores: Debe implementar los siguientes constructores
• Constructor sin parámetros: inicialice la lista de profesores creando una instancia
de tipo ArrayList < Profesor >
Métodos: deberá implementar los siguientes métodos
• Agregar Profesor: este método debe recibir un parámetro de tipo Profesor el cual
será agregado a la lista de profesores utilizando el método add de la clase
ArrayList
• Listar profesores: este método deberá imprimir en la consola la lista de
profesores utilizando el método mostrar datos de cada tipo de profesor
 */
class ListOfTeachers{
    private ArrayList<Teacher> list; 
    public ListOfTeachers(){
        list = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher){
        this.list.add(teacher);
    }
    public void listTeachers (){
        for (Teacher teacher : list) {//ciclo forich es un ciclo for, especial para listas enlasadas
            teacher.displayData();
        }
    }
}
/*
Clase Sega
Atributos:
• 2 profesores titulares
• 2 profesores interinos 
• 1 lista de profesores 
Constructores: 
Métodos: deberá implementar los siguientes métodos
• Implementar el método main en el cual se crearán 4 objetos de tipo profesor 
utilizando sus constructores para capturar los datos correspondientes, además
de crear una lista de profesores y agregar los 4 profesores creados 
anteriormente, y por ultimo deberá imprimir la lista de profesores mediante el 
método Listar Profesores de la lista de profesores */
public class Sega{
    static TeacherTitular mariam;
    static TeacherTitular adrian;
    static InternTeacher paty;
    static InternTeacher jessica;
    static ListOfTeachers ListOfTeachers;
    public static void main(String[] args) {
        mariam = new TeacherTitular("Mariam","García",29, 1, 1); 
        adrian = new TeacherTitular("Adrian", "Alarcon",30, 2, 2);
        paty = new InternTeacher("Paty","Rivas",30, 3, 2005, 2022);
        jessica = new InternTeacher("Jessica","Ruiz",37, 4, 2022, 2023);
        ListOfTeachers = new ListOfTeachers();
        ListOfTeachers.addTeacher(mariam);
        ListOfTeachers.addTeacher(adrian);
        ListOfTeachers.addTeacher(paty);
        ListOfTeachers.addTeacher(jessica);
        ListOfTeachers.listTeachers();
    }
}

