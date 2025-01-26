package com.amssPhy;

public class collisionMath {
    public static void main(String [] args){
        double x1 = 100, y1 = 100, r1 = 100;
        double x2 = 130, y2 = 130, r2 =20;

        if (checkCircleCollision(x1,y1,r1,x2,y2,r2)){
            System.out.println("The circles collide!");
        }else{
            System.out.println("The circles don't collide.");
        }
    }

    public static boolean checkCircleCollision(double x1, double y1, double r1, double x2, double y2, double r2){
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance <= (r1 + r2);
    }
}
