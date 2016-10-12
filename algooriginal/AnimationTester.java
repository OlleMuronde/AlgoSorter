/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algooriginal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.DEFAULT_OPTION;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ollemuronde
 */
public class AnimationTester extends JFrame {

    private static JCheckBox quickCheckBox;
    private static JCheckBox insertionCheckBox;
    private static JCheckBox selectionCheckBox;
    private static JCheckBox mergeCheckBox;
    private static JCheckBox bubbleCheckBox;
    private static int arraySize;

    public static void main(String[] args) throws IOException, InterruptedException,NegativeArraySizeException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, UnsupportedAudioFileException, LineUnavailableException{
        // take the menu bar off the jframe

        bubbleCheckBox = new JCheckBox("BubbleSort");
        quickCheckBox = new JCheckBox("Quick Sort");
        insertionCheckBox = new JCheckBox("Insertion Sort");
        selectionCheckBox = new JCheckBox("Selection Sort");
        mergeCheckBox = new JCheckBox("Merge Sort");

        if (insertionCheckBox.isSelected()) {

            lockCheckboxes(insertionCheckBox);

            SortAnimator animator = new SortAnimator(new InsertionSorter());

        } else if (bubbleCheckBox.isSelected()) {
            SortAnimator animator = new SortAnimator(new BubbleSorter());
        } else if (selectionCheckBox.isSelected()) {
            SortAnimator animator = new SortAnimator(new SelectionSorter());
        } else if (quickCheckBox.isSelected()) {
            SortAnimator animator = new SortAnimator(new QuickSorter());
        } else if (mergeCheckBox.isSelected()) {
            SortAnimator animator = new SortAnimator(new InsertionSorter());
        }

        insertionCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lockCheckboxes(insertionCheckBox);
                    JCheckBox cb=(JCheckBox) e.getSource();
                    JOptionPane op=(JOptionPane) SwingUtilities.getAncestorOfClass(JOptionPane.class,cb);
                    if(op!=null){
                        op.setValue(JOptionPane.OK_OPTION);
                    }
                    SwingUtilities.getWindowAncestor(cb).dispose();
                } catch (IOException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        selectionCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lockCheckboxes(selectionCheckBox);
                    JCheckBox cb=(JCheckBox) e.getSource();
                    JOptionPane op=(JOptionPane) SwingUtilities.getAncestorOfClass(JOptionPane.class,cb);
                    if(op!=null){
                        op.setValue(JOptionPane.OK_OPTION);
                    }
                    SwingUtilities.getWindowAncestor(cb).dispose();
                } catch (IOException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        mergeCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lockCheckboxes(mergeCheckBox);
                    JCheckBox cb=(JCheckBox) e.getSource();
                    JOptionPane op=(JOptionPane) SwingUtilities.getAncestorOfClass(JOptionPane.class,cb);
                    if(op!=null){
                        op.setValue(JOptionPane.OK_OPTION);
                    }
                    SwingUtilities.getWindowAncestor(cb).dispose();
                } catch (IOException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        bubbleCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lockCheckboxes(bubbleCheckBox);
                    JCheckBox cb=(JCheckBox) e.getSource();
                    JOptionPane op=(JOptionPane) SwingUtilities.getAncestorOfClass(JOptionPane.class,cb);
                    if(op!=null){
                        op.setValue(JOptionPane.OK_OPTION);
                    }
                    SwingUtilities.getWindowAncestor(cb).dispose();
                } catch (IOException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });
        quickCheckBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lockCheckboxes(quickCheckBox);
                    JCheckBox cb=(JCheckBox) e.getSource();
                    JOptionPane op=(JOptionPane) SwingUtilities.getAncestorOfClass(JOptionPane.class,cb);
                    if(op!=null){
                        op.setValue(JOptionPane.OK_OPTION);
                    }
                    SwingUtilities.getWindowAncestor(cb).dispose();
               
                } catch (IOException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(AnimationTester.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        });

        JPanel a1 = new JPanel();
        a1.add(bubbleCheckBox);
        a1.add(quickCheckBox);
        a1.add(insertionCheckBox);
        a1.add(selectionCheckBox);
        a1.add(mergeCheckBox);
try{
        arraySize=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of elements would like to sort (Recommend max=50)"));
      while(arraySize>50||arraySize<1){
            arraySize=Integer.parseInt(JOptionPane.showInputDialog(null, "The input you entered is invalid please enter an Integer between 1 and 50)"));
        }
        JOptionPane.showMessageDialog(null, a1, "Choose an algorithm to run", DEFAULT_OPTION);
        
        }
        catch(NumberFormatException | NegativeArraySizeException e){
            arraySize=Integer.parseInt(JOptionPane.showInputDialog(null, "Your input was invalid please enter an Integer"));
            JOptionPane.showMessageDialog(null, a1, "Choose an algorithm to run", DEFAULT_OPTION);
        }
//JOptionPane.showMessageDialog(null, a1, "Choose an algorithm to run", DEFAULT_OPTION);
    }

    public static void lockCheckboxes(JCheckBox a) throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException {
        if (a == insertionCheckBox) {
            selectionCheckBox.setEnabled(false);
            quickCheckBox.setEnabled(false);
            bubbleCheckBox.setEnabled(false);
            mergeCheckBox.setEnabled(false);
            SortAnimator.setArraySize(arraySize);
            SortAnimator animator = new SortAnimator(new InsertionSorter());
             animator.setBounds(200,150, 1000,550);
        } else if (a == selectionCheckBox) {
            SortAnimator.setArraySize(arraySize);
            SortAnimator animator = new SortAnimator(new SelectionSorter());
            animator.setBounds(200,150, 1000,550);
            insertionCheckBox.setEnabled(false);
            quickCheckBox.setEnabled(false);
            bubbleCheckBox.setEnabled(false);
            mergeCheckBox.setEnabled(false);

        } else if (a == quickCheckBox) {
            SortAnimator.setArraySize(arraySize);
            SortAnimator animator = new SortAnimator(new QuickSorter());
            selectionCheckBox.setEnabled(false);
            insertionCheckBox.setEnabled(false);
            bubbleCheckBox.setEnabled(false);
            mergeCheckBox.setEnabled(false);
            animator.setBounds(200,150, 1000,550);

        } else if (a == bubbleCheckBox) {
            SortAnimator.setArraySize(arraySize);
            SortAnimator animator = new SortAnimator(new BubbleSorter());
            selectionCheckBox.setEnabled(false);
            quickCheckBox.setEnabled(false);
            insertionCheckBox.setEnabled(false);
            mergeCheckBox.setEnabled(false);
            animator.setBounds(200,150, 1000,550);
            
        } else if (a == mergeCheckBox) {
            SortAnimator.setArraySize(arraySize);
            SortAnimator animator = new SortAnimator(new MergeSorter());
            selectionCheckBox.setEnabled(false);
            quickCheckBox.setEnabled(false);
            bubbleCheckBox.setEnabled(false);
            insertionCheckBox.setEnabled(false);
            animator.setBounds(200,150, 1000,550);
        }

    }

}
