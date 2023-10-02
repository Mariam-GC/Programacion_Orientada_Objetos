public class Coche {
    @Override
    public String toString() {
        return "Coche [modelo=" + modelo + ", color=" + color + "]";
    }
    public Coche(int modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }
    public Coche() {
    }
    public Coche(int modelo) {
        this.modelo = modelo;
    }
    
    int modelo;
    String color;
    
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
