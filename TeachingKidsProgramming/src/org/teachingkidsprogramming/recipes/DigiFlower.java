package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(Colors.Grays.Silver);
    Tortoise.setPenWidth(3);
    createColorPallette();
    for (int i = 1; i <= 15; i++)
    {
      drawOctagon();
      Tortoise.turn(360 / 15);
    }
    createColorPallette();
  }
  private static void createColorPallette()
  {
    Color color1 = Colors.Reds.Red;
    Color color2 = Colors.Oranges.DarkOrange;
    Color color3 = Colors.Yellows.Gold;
    Color color4 = Colors.Yellows.Yellow;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
  }
  private static void drawOctagon()
  {
    for (int i1 = 1; i1 <= 8; i1++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
}