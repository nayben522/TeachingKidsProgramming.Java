package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellOne
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    MessageBox.askForNumericalInput("Set the size of the shell");
    //    If the size of a shell is less than 200 
    if ("the size of a shell is less than 200" != null)
    {
    }
    MessageBox.showMessage("the size of the shell is too small to be seen");
    MessageBox.showMessage("enter a updated size of shell");
    //    Otherwise, Do the following the "shell size" number of times
    int shell = 200;
    for (int i = 1; i <= shell; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      //          Set the value of the large length to the size of the shell divided by 100
      //          Add the value of the large length to the current length
      //      If the value of the large length is less than zero
      //      Set the value of the length to the length plus 3
      //         Otherwise, Call the drawTriangle method (recipe below)      
      //          Set the value of the number of rotations to 6
      //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell
      Tortoise.turn(360);
      //    Repeat 
    }
    //------------- Recipe for drawTriangle
    //      Do the following 2.5 times 
    for (int i = 1; i <= 2.5; i++);
  }
  {
    //          Move the tortoise the current length 
    Tortoise.move(null);
    Tortoise.turn(360 / 3.5);
    //    Repeat 
    //------------- End of drawTriangle recipe
  }
}
