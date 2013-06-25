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
    //    Turn the background black --#22
    turtle.getBackgroundWindow().setBackground(Color.black);
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
    if (length == 10)
    {
      turtle.setPenColor(Colors.Greens.Lime);
    }
    if (length == 20)
    {
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    if (length == 30)
    {
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    if (length == 40)
    {
      turtle.setPenColor(Colors.Greens.Olive);
    }
    if (length == 50)
    {
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    if (length == 60)
    {
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int length)
  {
    turtle.turn(30);
    drawShorterBranch(turtle, length);
    turtle.turn(-60);
    drawShorterBranch(turtle, length);
    turtle.turn(30);
    setPenColor(turtle, length);
    turtle.move(-length);
  }
  private static void drawShorterBranch(Turtle turtle, int length)
  {
    drawBranch(turtle, length - 10);
  }
}