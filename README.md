# 2D Physics Engine

A simple 2D physics engine built in Java to simulate basic physics interactions. Currently, the engine supports collision detection between circles. The goal is to gradually extend the engine to handle more complex interactions such as object movement, forces, and additional collision types.

## Features

- **Circle Collision Detection**: Checks when two circles collide based on their radius and position.
  

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/amssGuard/PhysicsEngine.git
    cd PhysicsEngine
    ```

2. Import the project into your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).

3. Compile and run the engine:
    ```bash
    javac PhyEng.java
    java PhyEng
    ```

## Usage

To test circle collision, create two `Circle` objects and check if they collide.

Example:

```java
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
