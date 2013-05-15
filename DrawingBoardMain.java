/*
Author: Michele Pierini
Date: 05/06/13
Program Name: DrawingBoardMain.java
Objective: Create a thread that runs the drawing board.
*/

import javax.swing.*;

public class DrawingBoardMain {

    public static void main(String[] args) 
    {
        try
        {
            SwingUtilities.invokeLater(new Runnable()
            {
                public void run()
                {
                    new DrawingBoard();
                }
            });
        } catch (Exception e) {}
    }
}
