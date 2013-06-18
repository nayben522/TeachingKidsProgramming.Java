package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sides = 4;
    for (int i = 1; i <= sides; i++)
    {
      Tortoise.setPenColor(Color.blue);
      Tortoise.setPenWidth(2);
      Tortoise.move(50);
      Tortoise.turn(360 / sides);
    }
  }
}
