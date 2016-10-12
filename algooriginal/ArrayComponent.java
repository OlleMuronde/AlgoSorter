/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import static java.awt.Color.*;
import static java.awt.Color.blue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author ollemuronde
 */
public class ArrayComponent extends JPanel
{
    
   private int[] values;
   private int highlighted1;
   private int highlighted2;
   public synchronized void paintComponent(Graphics g)
   {
      if (values == null) return;                         ///uses values from setValues() to paint interface
      Graphics2D g2 = (Graphics2D) g; 
       g2.setPaint(black);                                                     /// Note values are indicies returned from the pause method 
      int width = getWidth() / values.length;             /// This allows us to build array and use the index of the min element to paint array using the fill to indicate where the MIN ELEMENT IS LOCATED AT THE TIME
      for (int i = 0; i < values.length; i++)            
      {
        
         int h = values[i];
          int y =  getHeight() - h;
         Rectangle2D rectangleBar = new Rectangle2D.Double(
           width * i, y, width, h);
         
         if (i == highlighted1 || i == highlighted2)
         {  if(i==highlighted1){
              g2.setPaint(red);// denotes value one which is being compared 
            g2.fill(rectangleBar);}
            else if(i==highlighted2){
                g2.setPaint(black); // denotes a value two which is being 
                   g2.fill(rectangleBar);}           
         } 
          else
          g2.draw(rectangleBar);
     }
   }

   /**
      Sets the values to be painted.
      @param values the array of values to display
      @param highlighted1 the first highlighted position
      @param highlighted2 the second highlighted position
   */
   public synchronized void setValues(int[] values,
      int highlighted1, int highlighted2)
   {
      this.values = (int[]) values.clone();  /// Gets values from pause and sets them as private instance variables
      this.highlighted1 = highlighted1;               /// Calls repaint() which updates interface 
      this.highlighted2 = highlighted2;
      repaint();
   }

   
   
//   
//         if (i == highlighted1 || i == highlighted2)
//            g2.fill(rectangleBar);
//         else
//            g2.draw(rectangleBar);
   
}