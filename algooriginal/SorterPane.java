/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.io.IOException;

/**
 *
 * @author ollemuronde
 */
public class SorterPane extends SortAnimator {
    private String nameofAlgoA;
    private String algoLocationA;
    private String algoNameA;

    public SorterPane(Sorter s,Sorter a){
        super(s,a);
    }
    
 public void SorterPane(Sorter s, Sorter a) throws IOException{
nameofAlgo=s.getAlgorithmName();
//menu=new Menu(nameofAlgo);
algoLocation=s.getAlgorithmLocation();
algoName =s.getAlgorithmAnalysis();
//performancePanel=new PerformancePanel();
//slider=new Slider();
//pseudoPanel=new PsuedocodePanel(algoLocation);
ArrayComponent panel = new ArrayComponent();
//infoPanel= new InformationPanel(algoName);
//performancePanel.resetComparisons();

nameofAlgoA=a.getAlgorithmName();
//menu=new Menu(nameofAlgo);
algoLocationA=a.getAlgorithmLocation();
algoNameA =a.getAlgorithmAnalysis();
//performancePanel=new PerformancePanel();
//slider=new Slider();
//pseudoPanel=new PsuedocodePanel(algoLocation);
ArrayComponent panelb = new ArrayComponent();
//infoPanel= new InformationPanel(algoName);
//performancePanel.resetComparisons();

 }
    
}
