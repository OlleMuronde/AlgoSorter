/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algooriginal;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.*;
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

public class Menu extends JPanel {

    private JMenuBar menuBar;
    private JMenu file;
    private JMenu algorithms;
    private JMenu help;
    private JMenuItem notes;
    private JMenuItem comparison;
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
    private Boolean pauseStatus = false;
    private JCheckBox bubbleCheckBox;
    private JOptionPane optionPane;
    private JCheckBox quickCheckBox;
    private JCheckBox insertionCheckBox;
    private JCheckBox selectionCheckBox;
    private JCheckBox mergeCheckBox;
    private JButton playButton;
    private JMenuItem chinese;
    private SoundClass sound;
    
    public Menu(String algorithmName) {

        //  setLayout(new GridBagLayout());
        setLayout(new BorderLayout());

        bubbleCheckBox = new JCheckBox("BubbleSort");
        quickCheckBox = new JCheckBox("Quick Sort");
        insertionCheckBox = new JCheckBox("Insertion Sort");
        selectionCheckBox = new JCheckBox("Selection Sort");
        mergeCheckBox = new JCheckBox("Merge Sort");
       
        menuBar = new JMenuBar();
        file = new JMenu("File");
        help = new JMenu("Help");
        algorithms = new JMenu("Algorithms");
        exit = new JMenuItem("Exit");
        comparison = new JMenuItem("Compare");
        notes = new JMenuItem("Notes");
        bubbleSort = new JMenuItem("BubbleSort");
        quickSort = new JMenuItem("QuickSort");
        insertionSort = new JMenuItem("InsertionSort");
        selectionSort = new JMenuItem("SelectionSort");
        mergeSort = new JMenuItem("MergeSort");
        restartButton = new JMenuItem("Restart");
        pauseButton = new JMenuItem("Pause");
        //startButton = new JButton("Start");
        chinese=new JMenuItem("Chinese");

        file.add(algorithms);
        file.add(comparison);
        file.add(exit);
        file.add(notes);
        file.add(chinese);
        algorithms.add(bubbleSort);
        algorithms.add(insertionSort);
        algorithms.add(selectionSort);
        algorithms.add(mergeSort);
        algorithms.add(quickSort);

        menuBar.add(file);
        menuBar.add(pauseButton);
        menuBar.add(restartButton);

        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        file.setMnemonic(KeyEvent.VK_F);
        comparison.setMnemonic(KeyEvent.VK_C);
        bubbleSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        insertionSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        selectionSort.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        add(menuBar, BorderLayout.NORTH);
        
        chinese.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sound=new SoundClass("/Users/ollemuronde/Desktop/Audio/Quick Sort Chineses.wav");
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
        notes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("http://python-textbok.readthedocs.org/en/latest/Sorting_and_Searching_Algorithms.html#sorting-algorithms").toURI());
                } catch (Exception a) {
                }

            }

        });

        restartButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Sorter.restartDelay();//delay bug resolver
                if (algorithmName == "BubbleSort") {
                    try {
                        SortAnimator animator2 = new SortAnimator(new BubbleSorter());

                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (algorithmName == "InsertionSort") {
                    try {
                        try {
                            SortAnimator animator2 = new SortAnimator(new InsertionSorter());
                            InsertionSorter.restartDelay();
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (algorithmName == "QuickSort") {
                    try {
                        SortAnimator animator2 = new SortAnimator(new QuickSorter());
                        QuickSorter.restartDelay();
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (algorithmName == "SelectionSort") {
                    try {
                        SortAnimator animator2 = new SortAnimator(new SelectionSorter());
                        SelectionSorter.restartDelay();
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (algorithmName == "MergeSort") {
                    try {
                        SortAnimator animator2 = new SortAnimator(new SelectionSorter());
                        InsertionSorter.restartDelay();
                    } catch (IOException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        });
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
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
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
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        quickSort.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        SortAnimator animator2 = new SortAnimator(new QuickSorter());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
        mergeSort.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        SortAnimator animator2 = new SortAnimator(new MergeSorter());
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        pauseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setPauseStatus(!getPauseStatus());
                if (getPauseStatus() == true) {
                    pauseButton.setText("Resume");
                } else {
                    pauseButton.setText("Pause");

                }

            }

        });
        comparison.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JPanel a1 = new JPanel();
                a1.add(bubbleCheckBox);
                a1.add(quickCheckBox);
                a1.add(insertionCheckBox);
                a1.add(selectionCheckBox);
                a1.add(mergeCheckBox);
                JOptionPane.showConfirmDialog(null, a1);

              //  Object buttonPressed = e.getSource();
                if ((insertionCheckBox.isSelected() && (bubbleCheckBox.isSelected()))) {
                    SortAnimator animator = new SortAnimator(new InsertionSorter(), new BubbleSorter());

                } else if ((insertionCheckBox.isSelected()) && (quickCheckBox.isSelected())) {
                    SortAnimator animator = new SortAnimator(new InsertionSorter(), new QuickSorter());

                } else if ((insertionCheckBox.isSelected()) && (selectionCheckBox.isSelected())) {
                    SortAnimator animator = new SortAnimator(new InsertionSorter(), new SelectionSorter());

                } else if ((insertionCheckBox.isSelected()) && (mergeCheckBox.isSelected())) {
                    SortAnimator animator = new SortAnimator(new InsertionSorter(), new MergeSorter());

                } else if ((quickCheckBox.isSelected()) && (bubbleCheckBox.isSelected())) {
                    SortAnimator animator = new SortAnimator(new QuickSorter(), new BubbleSorter());
                } else if ((quickCheckBox.isSelected()) && (mergeCheckBox.isSelected())) {
                      SortAnimator animator = new SortAnimator(new QuickSorter(), new MergeSorter());
                } else if ((quickCheckBox.isSelected()) && (selectionCheckBox.isSelected())) {
                            SortAnimator animator = new SortAnimator(new QuickSorter(), new SelectionSorter());
                } else if ((selectionCheckBox.isSelected()) && (bubbleCheckBox.isSelected())) {
                    SortAnimator animator = new SortAnimator(new SelectionSorter(), new BubbleSorter());

                } else if ((selectionCheckBox.isSelected()) && (mergeCheckBox.isSelected())) {
                  SortAnimator animator = new SortAnimator(new SelectionSorter(), new MergeSorter());
                } else if ((mergeCheckBox.isSelected()) && (bubbleCheckBox.isSelected())) {
                     SortAnimator animator = new SortAnimator(new BubbleSorter(), new MergeSorter());
                } else {
                    
                }

            }

        });

    }

    public void setPauseStatus(boolean b) {

        this.pauseStatus = b;
    }

    public Boolean getPauseStatus() {

        return this.pauseStatus;
    }

}

/// When creating a Menu first create the JMenuBar and then JMenu which is the top level components 
   //  e.g file,help etc. add these to the JMenuBar and then create the JMenuItems which are the subitems and add these to the JMenu's 
