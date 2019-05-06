/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        // your code here, if necessary
	elements = usersData;
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        // your code here
    }

    public void shift(int index){
	elements.set(index + 1, list.get(index));
    }

    public void drop(int indexToDropAfter, int valueToDrop){
	elements.set(indexToDropAfter + 1, valueToDrop);
    }
    
    public void insert(int alreadyInserted) {
	String valueToInsert = elements.get(alreadyInserted);
	int indexToCompare = alreadyInserted - 1;
	while( indexToCompare >= 0 && valueToInsert.compareTo(list.get(indexToCompare)) < 0) {
	    shift(indexToCompare);
	    indexToCompare--;
	}
	
	drop(indexToCompare,valueToInsert);
    }

    public static void insertionSort(List_inArraySlots list) {
	for (int alreadyInserted = 0; alreadyInserted < list.size(); alreadyInserted++){
	    insert(list, alreadyInserted);
	}
    }
}
