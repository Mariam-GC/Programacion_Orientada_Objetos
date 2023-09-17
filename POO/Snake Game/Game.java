import javax.swing.JPanel;
import java.util.*;
import javax.imageio.ImageIO;
import java.util.Timer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;

public class Game {
    //Variables
    private Snake snake;
    private Point Cherry;
    private int points;
    private int best;
    private GameStatus status;
    //Constructor
    Game(){

    }
    //Encapsulamiento
    public Snake getSnake() {
        return snake;
    }
    public void setSnake(Snake snake) {
        this.snake = snake;
    }
    public Point getCherry() {
        return Cherry;
    }
    public void setCherry(Point cherry) {
        Cherry = cherry;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getBest() {
        return best;
    }
    public void setBest(int best) {
        this.best = best;
    }
    public GameStatus getStatus() {
        return status;
    }
    public void setStatus(GameStatus status) {
        this.status = status;
    }
    //Métodos
    public void paintComponent(Graphics g){
    }
    private void update(){}
    private void reset(){}
    
    

}
