/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSorter extends Sorter {

    
    private String algoLocation="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/InsertionSort.txt";
    private String algorithmAnalysis="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/InsertionSortAnalysis.txt";
    private String algorithmName="InsertionSort";
    private String audioLocation="/Users/ollemuronde/Desktop/Audio/Insertion Sort.wav";
    
	@Override
	public void sort(int[] values) {
		for (int i = 1; i < values.length; i++)
	      { 
			int key=values[i];
			int j=i;
	        while (j>0 && key<values[j-1]){
                           
                                pause(i,j-1);
                            
	        	values[j]=values[j-1];
	            j=j-1;
	      } 
	       values[j]=key;
	       
	      }
	}
	
public String getAlgorithmLocation(){
       return this.algoLocation;
   }
public String getAlgorithmAnalysis(){
       return this.algorithmAnalysis;
   }
public String getAlgorithmName(){
    return this.algorithmName;
    
}
public String getAudioLocation(){
      return this.audioLocation;
  }

}
