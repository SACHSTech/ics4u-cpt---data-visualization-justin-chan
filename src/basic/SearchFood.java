package basic;


public class SearchFood {

    private int expenditure;

    /**
     * 
     * @param theExpenditure
     */

    public void setExpenditureAmount(int theExpenditure) {

        expenditure = theExpenditure;

    }

    /**
     * 
     * @return
     */

    public int getExpenditureAmount() {

        return expenditure;

    }
    
    /**
     * 
     * @param intArray
     * @param intKey
     * @return
     */

    public int binarySearch(Integer[] intArray, int intKey) {

        int low = 0;          // set low marker to beginning of list
        int high = intArray.length - 1; // set high marker to the end list      

        while(low <= high) {        // repeat while low and high not crossed

            int mid = (low + high) / 2; // set mid location (cut list in half)
            int cur = intArray[mid];      // get the mid value
          
            if(cur == intKey) {      // key is the mid element value
           
                System.out.println("Yes it is");
                return mid;       // return location of key
            }
            else if(cur < intKey) {     // key is in the upper half
        
                low = mid + 1;      // advance low marker, search upper half
            }
            else {

                high = mid - 1;     // advance high marker, search lower half

            }
        }
        System.out.println("No it isn't");
        return -1;          // key not found in list
   }

}
