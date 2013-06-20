package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawhouse(height);
    drawhouse(120);
    drawhouse(90);
    drawhouse(20);
  }
  private static void drawhouse(int height)
  {
    Tortoise.setPenColor(Colors.Grays.LightGray);
    Tortoise.move(height);
    //flatroof();
    //Airsroof
    //Mavericksroof
    //turn left 90
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void mavericksroof()
  {
    Tortoise.turn(-90);
    Tortoise.move(5);
    Tortoise.turn(135);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.turn(135);
    Tortoise.move(5);
    Tortoise.turn(-90);
  }
  private static void arisroof()
  {
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(60);
  }
  private static void flatroof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
