/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

/**
 *
 * @author ollemuronde
 */
public class PsuedocodePanel extends JPanel{
    
    private JTextArea txtArea;
    private String textFile;
    private String fileLocation;
    private JScrollPane scrollPane;
    
    
    public PsuedocodePanel(String location) throws FileNotFoundException, IOException{
   
   setLayout(new BorderLayout());
   txtArea=new JTextArea();
   scrollPane=new JScrollPane(txtArea);
   txtArea.setEditable(false);
   
     add(scrollPane,BorderLayout.CENTER);
     FileReader fr = new FileReader(location);
     BufferedReader reader=new BufferedReader(fr);
     txtArea.read(reader,null);
     
     Dimension dim=getPreferredSize();//returns object
     System.out.println(getPreferredSize());
     dim.width=300;
     dim.height=200;
     setPreferredSize(dim);
     
       Border innerBorder=BorderFactory.createTitledBorder("Psuedocode");
       Border outerBorder=BorderFactory.createEmptyBorder(5,5,5,5);
       
       setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
        
        
    }

   public void passFileLocation(String algoLocation) {
        this.fileLocation= algoLocation;
    }
 
    
}
