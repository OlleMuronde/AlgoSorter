/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algooriginal;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This runnable executes a sort algorithm. When two elements are compared, the
 * algorithm pauses and updates a panel.
 */
public abstract class Sorter implements Runnable {

    private String algoLocation = "";
    private String algorithmAnalysis = "";
    private String algorithmName = "";
    private int[] values;
    private ArrayComponent panel;
    private static int DELAY = 5000;
    private static int DELAYTWO=5000;
    private static int DELAYCOPY = 1000;
    private static int DUALDELAYCOPY=1000;
    private Boolean animationState = false;
    private Menu menu;
    private Slider slider;
    private static int numofComparisons = 0;
    private PerformancePanel performancePanel;
    private SummaryPanel summaryPanel;
    private Boolean firstConfig;
    private CompMenu compMenu;
    private DualSlider dualSlider;
    private SoundClass sound;
    private Sound  s1;
    protected  String audioLocation="/Users/ollemuronde/Desktop/Java/music_box_happy_birthday_NifterDotCom.wav";
    
    

    /**
     * Sets the values for this sorter.
     *
     * @param values the array to sort
     */
    public void setValues(int[] values) {
        this.values = values;
    }

    /**
     * Sets the panel for this sorter.
     *
     * @param panel the panel for showing the sort animation
     */
    public void setPanel(ArrayComponent panel) {
        this.panel = panel;
    }

    public void setMenu(Menu menu) {

        this.menu = menu;
    }

    public void setSlider(Slider slider) {
        this.slider = slider;
    }

    public void setPerfromancePanel(PerformancePanel p) {
        this.performancePanel = p;
    }

    public void setSummaryPanel(SummaryPanel s) {
        this.summaryPanel = s;
    }
    public void setCompMenu(CompMenu m){
        this.compMenu=m;
    }
    public void setDualSlider(DualSlider s){
        this.dualSlider=s;
    }
    public void setSound(SoundClass s){
        this.sound=s;
    }
    public void setS1(Sound s1){
        this.s1=s1;
    }

    /**
     * Sorts the array managed by this Sorter.
     */
    public abstract void sort(int[] values);

    public synchronized void pause(int marked1, int marked2) {
        if (firstConfig) {
            performancePanel.setNumComparisons();

            if (this.slider.returnIsValueAdjusting() == false) {
                  int b = (DELAYCOPY / (this.slider.returnSliderValue()));
                this.DELAY = b;
                
             
            }
            while (menu.getPauseStatus() == true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sorter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            panel.setValues(values, marked1, marked2);  // TAKES in values passed when pause is called in algorithm code
            try //and calls set values() which sets them as private instance variables 
            {
                Thread.sleep(DELAY);// POINT AT WHICH ALGORITHM PAUSES
              //  System.out.println(DELAY);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
        } else {
            if (!firstConfig) {
                summaryPanel.setAlgoName(getAlgorithmName());
             //   performancePanel.setNumComparisons();
                summaryPanel.setNumComparisons();
                

                if (this.dualSlider.returnIsValueAdjusting() == false) {
                     int b = (DUALDELAYCOPY / (this.dualSlider.returnSliderValue()));
                   this.DELAYTWO = b;
               }
                while (compMenu.getPauseStatus() == true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Sorter.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                panel.setValues(values, marked1, marked2);  // TAKES in values passed when pause is called in algorithm code
                try //and calls set values() which sets them as private instance variables 
                {
                    Thread.sleep(DELAYTWO);// POINT AT WHICH ALGORITHM PAUSES
                } catch (InterruptedException exception) {
                    Thread.currentThread().interrupt();
                }
            }
        }
     
    }

    public void swap(int i, int j) {
       
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        
    }

    public void run() {
        sort(values);
    }

    public String getAlgorithmLocation() {
        return this.algoLocation;
    }

    public String getAlgorithmAnalysis() {
        return this.algorithmAnalysis;
    }

    public String getAlgorithmName() {

        return this.algorithmName;
    }

    public void setAnimationStateTrue() {
        this.animationState = true;
    }

    public int getNumberOfComps() {

        return this.numofComparisons;
    }

   public void setConfigStatus(boolean b) {
      this.firstConfig=b;
    }
  public static void restartDelay(){
      DELAYCOPY=500;
      DELAY=500;
  }
  public int[]getValues(){
     sort(values);
      return values;
  }
  public String getAudioLocation(){
      return this.audioLocation;
  }
}

//// This class is abstract and thus any algorithm we have will have the following methods and inherit these.
/// The class receives the array of random values from sortAnimator and the ArrayComponent panel () and uses sets them as private instance variables 
///
