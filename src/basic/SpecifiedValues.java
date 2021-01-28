package basic;

public class SpecifiedValues {
    
    private String gdpOrExpenditure;
    private String gdpOrFood;

    public void setGDPExpenditureChoice(String q1Choice) {

        gdpOrExpenditure = q1Choice;

    }

    public String getGDPExpenditureChoice() {

        return gdpOrExpenditure;

    }

    public void setGDPFoodChoice(String q2Choice) {

        gdpOrFood = q2Choice;

    }

    public String getGDPFoodChoice() {

        return gdpOrFood;

    }
   
    public void mergeSort(Integer[] arr) {

        int[] temp = new int[arr.length];
        mergeSortHelper(arr, 0, arr.length - 1, temp);

    }
  
    private static void mergeSortHelper(Integer[] arr, int from, int to, int[] temp) {

       // If the array length is greater than 1
        if(to - from >= 1) {
           
            int mid = (from + to) / 2;   // split the list in half
            mergeSortHelper(arr, from, mid, temp);  //mergesort the first half
            mergeSortHelper(arr, mid + 1, to, temp); // mergesort the second half
            merge(arr, from, mid, to, temp); //merge

        }
    }
  
    private static void merge(Integer[] arr, int from, int mid, int to, int[] temp) {

        int i = from;       // track left array position
        int j = mid + 1;    // track right array position
        int k = from;       // track temp position
      
        while(i <= mid && j <= to) {
           // If the element in the left subarray is less
           // than the element in the right subarray it
           // is next in the merged list
           if(arr[i] < arr[j]) {

               temp[k] = arr[i];
               i++;

           }
           else {

               temp[k] = arr[j];
               j++;

           }
           k++;
        }
      
       // We may have missed elements from either list
       while(i <= mid) {

           temp[k] = arr[i];
           i++;
           k++;

       }
      
       while(j <= to) {

           temp[k] = arr[j];
           j++;
           k++;

       }
      
       // Copy over from temp to elements
       for(k = from; k <= to; k++) {

           arr[k] = temp[k];
           
       }
    }
}

