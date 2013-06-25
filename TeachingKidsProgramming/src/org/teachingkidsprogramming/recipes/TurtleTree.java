package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Color.gray.black);
    int length = 60;
    drawBranch(turtle, length);
  }
  private static void drawBranch(Turtle turtle, int length)
  {
    if (0 < length)
    {
      setPenColor(turtle, length);
      turtle.move(length);
      drawLowerBranches(turtle, length);
    }
  }
  private static void setPenColor(Turtle turtle, int length)
  {
    if (length <= 5)
    {
      turtle.setPenWidth(50);
      turtle.setPenColor(Colors.Greens.Lime);
    }
    else if (length <= 20)
    {
      turtle.setPenWidth(61);
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    else if (length <= 30)
    {
      turtle.setPenWidth(4);
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    else if (length <= 40)
    {
      turtle.setPenWidth(23);
      turtle.setPenColor(Colors.Reds.IndianRed);
    }
    else if (length <= 50)
    {
      turtle.setPenWidth(6);
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    else if (length <= 60)
    {
      turtle.setPenWidth(12);
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int length)
  {
    turtle.turn(rightAngle());
    drawShorterBranch(turtle, length);
    turtle.turn(-29 - 30);
    drawShorterBranch(turtle, length);
    turtle.turn(leftAngle());
    setPenColor(turtle, length);
    turtle.move(-length);
  }
  private static int leftAngle()
  {
    return 30;
  }
  private static int rightAngle()
  {
    return 30;
  }
  private static void drawShorterBranch(Turtle turtle, int length)
  {
    drawBranch(turtle, length - 10);
  }
}