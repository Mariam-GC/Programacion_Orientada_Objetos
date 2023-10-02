package Instancias;

public class Person {
    //Este es el método constructor, simpre va enseguida de la clase con la que se trabaje.
    //Lo que va adentro de el método constructor se llama argumento.
    //Los argumentos muestran el tipo de dato que se van a utilizar y cuántos.
    //Dentro de las llaves se escribe el código que representa el método.
    //Es necesario siempre tener un método constructor vacío
    Person () {

    }
    Person (String nameargumento, int ageargumento) {
        this.name = nameargumento;//la palaba .this hace referencia a la instancia definida en la clase.
        this.age = ageargumento;
    }
    //Estos son atributos
    String name;
    int age;

    /*
    String o;
    char s;
    Integer a;
    Boolean c;
    boolean p; 
    */  

    //Estos son métodos.
    void exale (){
        System.out.println(this.name + " está exalando");
    }

}
// Clase principal, se puede llamar MainClass.
class Aplication{
    //Este es el método main.
    public static void main(String[] args) {
        //Un objeto es una instancia de una clase.
        //Vamos a crear un nuevo objeto.
        //lo que va dentro del método Person son los parametros del objeto "angel"
        Person angel = new Person("Angel", 21);
        angel.exale();
        
        //Esta es otra forma de instanciar un objeto, sin tener que usar el método constructor
        //Person mariam = new Person();
        // "Mariam" es un estado, ya que es el valor del atributo del objeto.
        // mariam.name = "Mariam";
        // mariam.exale();
    }

} 
