class Point{
private int x;
private int y;
//Constructores
Point (){
    this.x = 0;
    this.y = 0;

}
Point(int x, int y){
    this.x = x;
    this.y = y;
}
//Encapsulamiento
public int getX() {
    return x;
}
public void setX(int x) {
    this.x = x;
}
public int getY() {
    return y;
}
public void setY(int y) {
    this.y = y;
}
//Métodos
public void move( Direction direction, int num ){
}
public boolean equals (Point point){
    return true;
}
public String toString(){
    return null;}
public boolean intersects (Point point){
    return true;
}
}
