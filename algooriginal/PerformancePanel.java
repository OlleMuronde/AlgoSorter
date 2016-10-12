/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author ollemuronde
 */
public class PerformancePanel extends JPanel {
 
private int numberComparisons;
private int timeTaken;
private int algorithmComplexity;
private JTextField textField;
private JScrollPane scrollPane;
private int numOfComparisons;


public PerformancePanel(){
setLayout(new BorderLayout());

textField=new JTextField();

textField.setEditable(false);


        
add(textField,BorderLayout.CENTER);
}


public void setNumComparisons(){
    numOfComparisons++;
     textField.setText("Number of comparisons is "+numOfComparisons+"   ");
    
    
}
    
}
