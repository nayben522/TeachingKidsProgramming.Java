package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    //    Make the tortoise move as fast as possible --#3
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8
    //    ------------- Recipe for createColorPalette --#8
    //    Add steel blue to the color wheel --#7
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    //    Add dark orchid to the color wheel --#11
    ColorWheel.addColor(Colors.Purples.DarkOrchid);
    //    Add dark slate blue to the color wheel --#12
    ColorWheel.addColor(Blues.SlateBlue);
    //    Add teal to the color wheel --#13
    ColorWheel.addColor(Blues.Teal);
    //    Add indigo to the color wheel --#14
    //    ------------- End of createColorPalette recipe 
    //    DrawPentagon (recipe below) --#10
    //    ------------- Recipe for drawPentagon --#10
    //    Do the following 200 times --#2
    for (int i = 1; i <= 200; i++)
    {
      //        AdjustPen (recipe below) --#9
      //        ------------- Recipe for adjustPen --#9
      //        Change the color of the line the tortoise draws to the next color on the color wheel --#6
      Tortoise.setPenColor(ColorWheel.getNextColor());
      //        Increase the tortoises pen width by 1 --#15                                              
      //        If the tortoises pen width is greater than 4, then --#17
      //            Reset it to 1 --#16
      //        ------------- End of adjustPen recipe 
      //        Move the tortoise the length of a side --#4
      Tortoise.move(4);
      //        Turn the tortoise 1/5th of 360 degrees --#1
      Tortoise.turn(360 / 5);
      //        Turn the tortoise 1 more degree --#5
      Tortoise.turn(73);
      //    Repeat
      Tortoise.turn(73);
    }
    //    ------------- End of drawPentagon recipe
  }
}
