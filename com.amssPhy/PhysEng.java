package com.amssPhy;
import javax.swing.*;
import java.awt.*;

class Ball{
    double x, y;
    double vx, vy;
    double radius;
    Color color;

    Ball(double x, double y, double vx, double vy, double radius, Color color){
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.radius = radius;
        this.color = color;
    }

    public void move(){
        x += vx;
        y += vy;
        vy += 0.1;// let's assume it as gravity
    }

    public void draw(Graphics g){
        g.setColor(color);
        g.fillOval((int)x-(int)radius,(int)y-(int)radius,(int)(2*radius),(int)(2*radius));
    }

    public boolean checkCollision(Ball other){
        double distance = Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
        return distance <= (this.radius + other.radius);
    }
}

public class PhysEng extends JPanel{

    Ball ball1, ball2;

    public PhysEng(){
        ball1 = new Ball(100, 100, 2, 2, 20, Color.RED);
        ball2 = new Ball(200, 100, -2, 2, 20, Color.BLUE);

        Timer timer = new Timer(10, e -> {
            ball1.move();
            ball2.move();

            if (ball1.checkCollision(ball2)) {
                ball1.vx = -ball1.vx;
                ball1.vy = -ball1.vy;
                ball2.vx = -ball2.vx;
                ball2.vy = -ball2.vy;
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        ball1.draw(g);
        ball2.draw(g);
    }
public static void main(String [] args){
    JFrame frame = new JFrame("Physics Engine");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.add(new PhysEng());
    frame.setVisible(true);
}
}
