//
package algooriginal;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

   

public class SortAnimator extends JFrame
{  
   protected static  int VALUES_LENGTH = 50;
   protected static final int FRAME_WIDTH = 1500;
   protected static final int FRAME_HEIGHT = 500; 
   protected PsuedocodePanel pseudoPanel;
   protected Menu menu;
   protected InformationPanel infoPanel;
   protected String algoName;
   protected String algoLocation;
   protected String nameofAlgo;
   protected Slider slider;
   protected PerformancePanel performancePanel;
    private String nameofAlgoA;
    private String algoLocationA;
    private String algoNameA;
    private SummaryPanel summaryPanel;
    private SummaryPanel summaryPanelA;
    private PerformancePanel performancePanelA;
    private CompMenu compMenu;
    private DualSlider dualSlider;
    private SoundClass sound;
   private  Sound    s1;

   
   public SortAnimator(Sorter s) throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException
   {  super("Algorithm running");
       try {
           System.setProperty("apple.laf.useScreenMenuBar", "true");
           System.setProperty("com.apple.mrj.application.apple.menu.about.name", "AlgoSorter");
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           GridBagConstraints gc= new GridBagConstraints();
           setLayout(new GridBagLayout());
           
           String link;
           link=s.getAudioLocation();
           System.out.println(link);
           s.setConfigStatus(true);
       //   s1=new Sound("/Users/joebloggs/Desktop/Java/Ensoniq-SQ-2-Electric-Piano-C4.wav");
           sound=new SoundClass(link);
           
           nameofAlgo=s.getAlgorithmName();
           menu=new Menu(nameofAlgo);
           algoLocation=s.getAlgorithmLocation();
           algoName =s.getAlgorithmAnalysis();
           performancePanel=new PerformancePanel();
           slider=new Slider();
           pseudoPanel=new PsuedocodePanel(algoLocation);
           ArrayComponent panel = new ArrayComponent();
           infoPanel= new InformationPanel(algoName);
           
           
           
           gc.gridy=0;
           gc.gridx=0;
           gc.weighty=1;
           gc.weightx=0;
           gc.gridheight=1;
           gc.fill=GridBagConstraints.NONE;
           gc.anchor=GridBagConstraints.FIRST_LINE_START;
           add(menu,gc);
           
           gc.gridy=0;
           gc.gridx=90;
           gc.weighty=1;
           gc.weightx=1;
           gc.gridheight=1;
           gc.fill=GridBagConstraints.NONE;
           gc.anchor=GridBagConstraints.NORTHEAST;
           add(sound,gc);
           
           gc.gridy=0;
           gc.gridx=25;
           gc.weighty=1;
           gc.weightx=1;
           gc.gridheight=1;
           gc.fill=GridBagConstraints.CENTER;
           gc.anchor=GridBagConstraints.NORTH;
           add(performancePanel,gc);
           
           
           
           gc.gridy=1;
           gc.gridx=0;
           gc.gridwidth=90;
           gc.gridheight=1;
           gc.weighty=1;
           gc.weightx=1000;
           gc.fill=GridBagConstraints.BOTH;
           gc.anchor=GridBagConstraints.NORTH;
           add(panel,gc);
           
           
           
           gc.gridy=1;
           gc.gridx=90;
           gc.gridwidth=10;
           gc.gridheight=1;
           gc.weighty=1;
           gc.weightx=1;
           gc.fill=GridBagConstraints.BOTH;
           gc.anchor=GridBagConstraints.NORTHEAST;
           add(slider,gc);
           
           
           
           
           
           
           gc.gridy=2;
           gc.gridx=0;
           gc.gridwidth=50;
           gc.gridheight=1;
           gc.weighty=0;
           gc.weightx=0;
           gc.fill=GridBagConstraints.HORIZONTAL;
           gc.anchor=GridBagConstraints.LAST_LINE_START;
           add(infoPanel,gc);
           
           gc.gridy=2;
           gc.gridx=50;
           gc.gridwidth=50;
           gc.gridheight=1;
           gc.weighty=0;
           gc.weightx=1;
           gc.fill=GridBagConstraints.HORIZONTAL;
           gc.anchor=GridBagConstraints.LAST_LINE_END;
           
           add(pseudoPanel,gc);
           
           
           setSize(FRAME_WIDTH, FRAME_HEIGHT);
           setVisible(true);
           int[] values = new int[VALUES_LENGTH];
           for (int i = 0; i < values.length; i++)
               values[i] = (int) (Math.random() * panel.getHeight());
           
           s.setValues(values);
           s.setPanel(panel);
           s.setMenu(menu);
           s.setSlider(slider);
           s.setPerfromancePanel(performancePanel);
           s.setSound(sound);
           s.setS1(s1);
           
           Thread t = new Thread(s);
           t.start();
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(SortAnimator.class.getName()).log(Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           Logger.getLogger(SortAnimator.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(SortAnimator.class.getName()).log(Level.SEVERE, null, ex);
       } catch (UnsupportedLookAndFeelException ex) {
           Logger.getLogger(SortAnimator.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    
      
      
   }
   
   public SortAnimator(Sorter s,Sorter a)
   {
      
   setLayout(new GridBagLayout());
   GridBagConstraints gc=new GridBagConstraints();
   
   
   s.setConfigStatus(false);
   a.setConfigStatus(false);
 nameofAlgo=s.getAlgorithmName();
summaryPanel=new SummaryPanel(s);
algoLocation=s.getAlgorithmLocation();
algoName =s.getAlgorithmAnalysis();
ArrayComponent panel = new ArrayComponent();
performancePanel=new PerformancePanel();

summaryPanelA=new SummaryPanel(a);
nameofAlgoA=a.getAlgorithmName();
algoLocationA=a.getAlgorithmLocation();
algoNameA =a.getAlgorithmAnalysis();
ArrayComponent panelb = new ArrayComponent();
performancePanelA=new PerformancePanel();



compMenu= new CompMenu();
dualSlider=new DualSlider();

JSplitPane splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel,panelb);
splitPane.setResizeWeight(0.5);

      gc.gridy=0;
      gc.gridx=0;
      gc.gridwidth=100;
      gc.weighty=1;
      gc.weightx=1;
      gc.gridheight=1;
      gc.fill=GridBagConstraints.HORIZONTAL;
      gc.anchor=GridBagConstraints.NORTH;
      add(compMenu,gc);
      
      gc.gridy=1;
      gc.gridx=45;
      gc.gridwidth=50;
      gc.weighty=1;
      gc.weightx=1;
       gc.gridheight=1;
       gc.fill=GridBagConstraints.CENTER;
       gc.anchor=GridBagConstraints.CENTER;
       add(dualSlider,gc);
      
      gc.gridy=1;
      gc.gridx=0;
      gc.gridwidth=100;
      gc.weighty=1;
      gc.weightx=1;
      gc.gridheight=1;
      gc.fill=GridBagConstraints.CENTER;
      gc.anchor=GridBagConstraints.CENTER;
      add(dualSlider,gc);
       
       gc.gridy=2;
      gc.gridx=25;
      gc.gridwidth=25;
      gc.weighty=1;
      gc.weightx=1;
       gc.gridheight=1;
       gc.fill=GridBagConstraints.NONE;
       gc.anchor=GridBagConstraints.FIRST_LINE_START;
       add(summaryPanel,gc);
      
      gc.gridy=2;
      gc.gridx=75;
      gc.gridwidth=25;
      gc.weighty=1;
      gc.weightx=1;
      gc.gridheight=1;
      gc.fill=GridBagConstraints.NONE;
      gc.anchor=GridBagConstraints.CENTER;
      add(summaryPanelA,gc);
      
      
      
      gc.gridy=3;
      gc.gridx=0;
      gc.gridwidth=100;
      gc.weighty=10;
      gc.weightx=1;
      gc.gridheight=100;
      gc.fill=GridBagConstraints.BOTH;
      gc.anchor=GridBagConstraints.CENTER;
      add(splitPane,gc);
      

      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setVisible(true);
      
      int[] values = new int[VALUES_LENGTH];
      for (int i = 0; i < values.length; i++)
         values[i] = (int) (Math.random() * panel.getHeight());
      
      int[] valuestwo = new int[VALUES_LENGTH];
      for (int i = 0; i < valuestwo.length; i++)
         valuestwo[i] = (int) (Math.random() * panel.getHeight());
      s.setDualSlider(dualSlider);
      s.setCompMenu(compMenu);
      s.setValues(values);
      s.setPanel(panel);
      s.setPerfromancePanel(performancePanel);
      s.setSummaryPanel(summaryPanel);
     
      a.setDualSlider(dualSlider);
      a.setValues(valuestwo);
      a.setPanel(panelb);
      a.setPerfromancePanel(performancePanel);
      a.setSummaryPanel(summaryPanelA);
      a.setCompMenu(compMenu);
      Thread t = new Thread(s);
      Thread t1=new Thread(a);
      t.start();
      t1.start();
   
   };
   
   public static void setArraySize(int i){
       VALUES_LENGTH=i;
   }

}












//gc.gridy=0;
//      gc.gridx=0;
//      gc.gridwidth=100;
//      gc.weighty=1;
//      gc.weightx=1;
//      gc.gridheight=1;
//      gc.fill=GridBagConstraints.HORIZONTAL;
//      gc.anchor=GridBagConstraints.NORTH;
//      add(compMenu,gc);
//      
//       gc.gridy=1;
//      gc.gridx=25;
//      gc.gridwidth=25;
//      gc.weighty=1;
//      gc.weightx=1;
//       gc.gridheight=1;
//       gc.fill=GridBagConstraints.NONE;
//       gc.anchor=GridBagConstraints.FIRST_LINE_START;
//       add(summaryPanel,gc);
//      
//      gc.gridy=1;
//      gc.gridx=75;
//      gc.gridwidth=25;
//      gc.weighty=1;
//      gc.weightx=1;
//      gc.gridheight=1;
//      gc.fill=GridBagConstraints.NONE;
//      gc.anchor=GridBagConstraints.CENTER;
//      add(summaryPanelA,gc);
//      
//      
//      
//      gc.gridy=2;
//      gc.gridx=0;
//      gc.gridwidth=100;
//      gc.weighty=10;
//      gc.weightx=1;
//      gc.gridheight=100;
//      gc.fill=GridBagConstraints.BOTH;
//      gc.anchor=GridBagConstraints.CENTER;
//      add(splitPane,gc);
//      





















































































