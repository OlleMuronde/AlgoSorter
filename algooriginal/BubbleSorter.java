/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ollemuronde
 */
public class BubbleSorter extends Sorter {

   private String algoLocation="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/BubbleSort.txt";
    private String algorithmAnalysis="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/BubbleSortAnalysis.txt";
     private String algorithmName="BubbleSort";
     private String audioLocation="/Users/ollemuronde/Desktop/Audio/Bubble Sort.wav";
   
      
    public void sort(int[] values) {
      
        int n = values.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                pause( i ,i + 1);
                if (values[i] > values[i+1]) {
                    swap(i, i+1);
                }
            }
      
        }
    }
 
public String getAlgorithmAnalysis(){
    return this.algorithmAnalysis;
}
public String getAlgorithmLocation(){
       return this.algoLocation;
   }
public String getAlgorithmName(){
       return this.algorithmName;
   }
public String getAudioLocation(){
      return this.audioLocation;
  }

}
