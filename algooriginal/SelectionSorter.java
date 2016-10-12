/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SelectionSorter extends Sorter
{
   private String algoLocation="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/SelectionSort.txt";
    private String algorithmName="SelectionSort";
    private String algorithmAnalysis="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/SelectionSortAnalysis.txt";
    private String audioLocation="/Users/ollemuronde/Desktop/Audio/Selection Sort.wav";
   public void sort(int[] values)
   {  

      for (int i = 0; i < values.length - 1; i++)
      {  
          int minPos = i;
          for (int j = i + 1; j < values.length; j++)
          {
              if (values[j] < values[minPos])
                  minPos = j;
              pause(minPos, j);
          }
          pause(minPos, i);
          swap(minPos, i);
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