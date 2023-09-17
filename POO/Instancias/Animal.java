package Instancias;


public class Animal {
    String name;
    int age;

    void ladrar(int numOfLadridos){
        //"Out significa "salida de dato"... tambien se puede poner "sout + tab"
        System.out.println(name + "hizo" + numOfLadridos);

    }

    int sumar(int n1, int n2) {
        return n1 + n2;
    }
    
}
