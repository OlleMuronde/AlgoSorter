/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ollemuronde
 */
public class SummaryPanel extends JPanel {
    
    private JTextField algorithmName;
    private JLabel algorithmComplexity;
    private JTextField numComparisons;
    private int numOfComparisons;
   
    
    public SummaryPanel(Sorter a) {
        setLayout(new BorderLayout());
        algorithmName = new JTextField();
        numComparisons = new JTextField();

        add(algorithmName,BorderLayout.NORTH);
        add(numComparisons);

    }
    public void setNumComparisons(){
    numOfComparisons++;
     numComparisons.setText("Number of comparisons is "+numOfComparisons+"    ");
   // textArea.append("Number of comparisons is"+comparisons);/// LOOK INTO WHY THIS WORKS !!!
  // textArea.setText(textArea.getText().toString().replaceAll("[0-9]+",comparisons+""));
    
    
}

  public void setAlgoName(String name) {
     algorithmName.setText(name);
    
        
    }
    
}
