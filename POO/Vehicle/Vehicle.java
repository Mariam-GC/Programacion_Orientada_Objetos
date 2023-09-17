package Vehicle;

// Estas son clases
//Solo la clase principal puede ser pública
public  class Vehicle {
    //Estos son los atributos de la clase vehicle
    String color;
    int numberOfTries;
    int numberOfSeats;
     //Este es un método constructor vacio
    Vehicle (){
    }
    //Método constructor con parámetros
    Vehicle (int numberOfSeats, int numberOfTries){
    this.numberOfSeats = numberOfSeats;
    this.numberOfTries = numberOfTries;
    }
    //Estos son los métodos de la clase vehicle
    void run (){}
    void trunOnLights (){}
    void trunOffLigths (){}
    // Crear una instancia de las siguientes clases
    // en el método main de la clase Vehiculo
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Train myTrain = new Train();
        Truck myTruck = new Truck();
        Car myCar = new Car();
        Bicycle mBicycle = new Bicycle();
        Submarine mySubmarine = new Submarine();
        Boat myBoat = new Boat();
        Raft myRaft = new Raft();
    }
}
class Train {
    //Estos son los atributos de la clase Train
    int numberOfTrainCarriges;
    float size;
    int numberOfTrainWheel;
    //Métodos constructores
    Train (){

    }
    Train (int numberOfTrainCarriges, float size,int numberOfTrainWheel) {
        this.numberOfTrainCarriges = numberOfTrainCarriges;
        this.size = size;
        this.numberOfTrainWheel = numberOfTrainWheel;

        }

    //estos son los métodos de la clase Train
    void curb (){}
    void move (){}
    void whitstle (){}
    
}
        
class Truck {
    //Estos son los atributos de la clase Truck
    float size;
    int numberOfTruckBoxes;
    String typeOfTransportation;
     //Métodos constructores
     Truck (){

     }
     Truck (float size, int numberOfTruckBoxes,String typeOfTransportation) {
        this.size = size;
        this.numberOfTruckBoxes = numberOfTruckBoxes;
        this.typeOfTransportation = typeOfTransportation;
     }
    //estos son los métodos de la clase Truck
    void run (){}
    void proceded (){}
    void backAway (){}

}
class Car {
    //Estos son los atributos de la clase Car
    String color;
    int numberOfSeats;
    int numberOfWindows;
    //Estos son los métodos de la clase
    Car (){

    }
    Car (String color,int numberOfSeats, int numberOfWindows) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWindows = numberOfWindows;
    }
    //estos son los métodos de la clase Car
    void run (){}
    void putOnTurnSignals (){}
    void moveBack (){}

}
class Bicycle {
    //Estos son los atributos de la clase Bicycle
    int numberOfTries;
    String color;
    String trademark;
    //Estos son los métodos constructores
    Bicycle (){

    }
    Bicycle (int numberOfTries, String color, String trademark){
        this.numberOfTries = numberOfTries;
        this.color = color;
        this.trademark = trademark;
    }
    //estos son los métodos de la clase Bicycle
    void doTricks (){}
    void skid (){}
    void pedal (){}

}
class Submarine {
    //Estos son los atributos de la clase Submarine
    int numberOfWindows;
    int size;
    float weight;
    //Estos son los métodos constructores
    Submarine (){

    }
    Submarine (int numberOfWindows, int size, float weight){
        this.numberOfWindows = numberOfWindows;
        this.size = size;
        this.weight = weight;
    }
    //estos son los métodos de la clase Submarine
    void approach (){}
    void atack (){}
    void inmerse (){}

}
class Boat {
    //Estos son los atributos de la clase Boat
    String material;
    float size;
    float typeOfMotor;
    //Estos son los métodos constructores
    Boat (){

    }
    Boat(String material, float size, float typeOfMotor){
        this.material = material;
        this.size = size;
        this.typeOfMotor = typeOfMotor;

    }
    //estos son los métodos de la clase Boat
    void hover (){}
    void row (){}
    void sink (){}
    
}
class Raft {
    //Estos son los atributos de la clase Raft
    String material;
    float size;
    float buoyancy;
    //Estos son los métodos constructores
    Raft (){

    }
    //Estos son los métodos constructores
    Raft (String material, Float size, float buoyancy){
        this.material = material;
        this.size = size;
        this.buoyancy = buoyancy;
    }
    //estos son los métodos de la clase Raft
    void drift (){}
    void move (){}
    void snik (){}
}