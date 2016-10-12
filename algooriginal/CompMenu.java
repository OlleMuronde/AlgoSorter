/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author ollemuronde
 */
public class CompMenu extends JPanel {
    
    
    private JMenuBar menuBar;
    private JMenu file;
    private JMenu algorithms;
    private JMenu help;
    private JMenu notes;
    private JMenuItem bubbleSort;
    private JMenuItem insertionSort;
    private JMenuItem selectionSort;
    private JMenuItem mergeSort;
    private JMenuItem quickSort;
    private JMenuItem exit;
    private JMenuItem restartButton;
    private Sorter sorter;
    private JMenuItem pauseButton;
    private JButton startButton;
    private Boolean pauseStatus=false;
    private JButton comparison;
    private JCheckBox bubbleCheckBox;
    private JOptionPane optionPane;
    private  JCheckBox quickCheckBox;
    private  JCheckBox insertionCheckBox;
    private  JCheckBox selectionCheckBox;
    private  JCheckBox mergeCheckBox;
    
    
    public CompMenu(){
       setLayout(new BorderLayout());
         
       
       
        bubbleCheckBox=new JCheckBox("BubbleSort");
        quickCheckBox=new JCheckBox("Quick Sort");
        insertionCheckBox=new JCheckBox("Insertion Sort");
        selectionCheckBox=new JCheckBox("Selection Sort");
        mergeCheckBox=new JCheckBox("Merge Sort");
        
        
        
        
        menuBar = new JMenuBar();
        file = new JMenu("File");
        help = new JMenu("Help");
        notes = new JMenu("Notes");
        algorithms = new JMenu("Algorithms");
        exit = new JMenuItem("Exit");
        

        bubbleSort = new JMenuItem("BubbleSort");
        quickSort = new JMenuItem("QuickSort");
        insertionSort = new JMenuItem("InsertionSort");
        selectionSort = new JMenuItem("SelectionSort");
        mergeSort = new JMenuItem("MergeSort");
        restartButton = new JMenuItem("Restart");
        pauseButton = new JMenuItem("Pause");
      //startButton = new JButton("Start");
        comparison=new JButton ("Comparison");
        

        file.add(algorithms);
        file.add(exit);
        algorithms.add(bubbleSort);
        algorithms.add(insertionSort);
        algorithms.add(selectionSort);
        algorithms.add(mergeSort);
        algorithms.add(quickSort);

        menuBar.add(file);
      //  menuBar.add(notes);
     //   menuBar.add(help);
        menuBar.add(pauseButton);
        menuBar.add(restartButton);
       // menuBar.add(comparison);
        
       exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
       file.setMnemonic(KeyEvent.VK_F);
       comparison.setMnemonic(KeyEvent.VK_C);
       bubbleSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
       insertionSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
       selectionSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));
       
       
        
        add(menuBar,BorderLayout.NORTH);
        
     exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

        insertionSort.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        SortAnimator animator2 = new SortAnimator(new InsertionSorter());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(CompMenu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(CompMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        selectionSort.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SortAnimator animator2 = new SortAnimator(new SelectionSorter());
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(CompMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(CompMenu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        bubbleSort.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        SortAnimator animator2 = new SortAnimator(new BubbleSorter());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(CompMenu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(CompMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        quickSort.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Not yet supported");

            }

        });

        mergeSort.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Not yet supported");

            }

        });
        
        pauseButton.addActionListener(new ActionListener(){
       
            @Override
            public void actionPerformed(ActionEvent e) {
              setPauseStatus(!getPauseStatus());
              if(getPauseStatus()==true){
                pauseButton.setText("Resume");
              }else{
                  pauseButton.setText("Pause");
                 
              }
         
              
                
            }
            
            
        });
        
 restartButton.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent e) {
              SortAnimator animator2 = new SortAnimator(new InsertionSorter(),new BubbleSorter());
           }

        
    });
         }
     public void setPauseStatus(boolean b){
        
        this.pauseStatus=b;
    }
    public Boolean getPauseStatus(){
        
        return this.pauseStatus;
    }
    
    
}
