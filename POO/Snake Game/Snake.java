import java.util.ArrayList;

public class Snake {
    private Direction direction;
    private Point head;
    private ArrayList<Point> tail; 
    
    Snake(){}
    
    public ArrayList getTail(){
        return tail;
    }
    public Point getHead(){
        return head;}
    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public void setHead(Point head) {
        this.head = head;
    }
    public void setTail(ArrayList<Point> tail) {
        this.tail = tail;
    }

    public void move(){}
    public void addTail(){}
    public void turn (Direction direction){}
    


    
}
