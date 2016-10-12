/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algooriginal;

/**
 *
 * @author ollemuronde
 */
class QuickSorter extends Sorter {
    private int[] numbers;
    private int number;  
   private String algoLocation="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/QuickSort.txt";
    private String algorithmAnalysis="/Users/ollemuronde/NetBeansProjects/AlgoOriginal/src/algooriginal/QuickSortAnalysis.txt";
     private String algorithmName="QuickSort";
     private String audioLocation="/Users/ollemuronde/Desktop/Audio/QuickSort.wav";
    private String audioLocationChinese="/Users/ollemuronde/Desktop/Audio/Quick Sort Chineses.wav";


    public void sort(int[] values) {
    // check for empty or null array
    if (values ==null || values.length==0){
      return;
    }
    this.numbers = values;
    number = values.length;
    quicksort(0, number - 1);
  }

  private void quicksort(int low, int high) {
    int i = low, j = high;
    // Get the pivot element from the middle of the list
    int pivot = numbers[low + (high-low)/2];

    // Divide into two lists
    while (i <= j) {
      // If the current value from the left list is smaller then the pivot
      // element then get the next element from the left list
      while (numbers[i] < pivot) {
        i++;
      }
      // If the current value from the right list is larger then the pivot
      // element then get the next element from the right list
      while (numbers[j] > pivot) {
        j--;
      }

      // If we have found a values in the left list which is larger then
      // the pivot element and if we have found a value in the right list
      // which is smaller then the pivot element then we swap the
      // values.
      // As we are done we can increase i and j
      if (i <= j) {
            pause(i,j);
          swap(i, j);
        i++;
        j--;
        pause(i,j);
      }
    }
    // Recursion
    if (low < j)
      quicksort(low, j);
    if (i < high)
      quicksort(i, high);
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
public String getAudioLocationChinese(){
    return this.audioLocationChinese;
}

}
