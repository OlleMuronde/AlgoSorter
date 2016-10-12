/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Slider extends JComponent{
    private JSlider slider;
    
 public Slider(){
  setLayout(new BorderLayout());
  
 slider=new JSlider(JSlider.VERTICAL,1,5,1);
 slider.setMajorTickSpacing(1);
 slider.setMinorTickSpacing(0);
 slider.setPaintLabels(true);
 slider.setPaintTicks(false);
 slider.setName("Speed");
 slider.setBorder(new TitledBorder(new EtchedBorder(),"Speed"));
 slider.setValueIsAdjusting(true);
 slider.getValueIsAdjusting();
 slider.getValue();
 slider.setAlignmentY(150);
 Dimension dim=getPreferredSize();
 dim.width=300;
 dim.height=100;
 setPreferredSize(dim);
 add(slider,BorderLayout.EAST);

 
 
 }
 
 public int returnSliderValue(){
     
     return this.slider.getValue();
 }
 public boolean returnIsValueAdjusting(){
     return this.slider.getValueIsAdjusting();
 }
}
