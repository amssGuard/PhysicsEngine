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
import physicsengine.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, 100, 100); // radius, x, y
        Circle circle2 = new Circle(15, 120, 120);

        if (circle1.collidesWith(circle2)) {
            System.out.println("Collision Detected!");
        } else {
            System.out.println("No Collision");
        }
    }
}
