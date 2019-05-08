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
	super(usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    // Precondition: elements contains an ArrayList of Strings
    // Postcondition: output is sorted
    public void mySort() {
        // your code here
	for (int alreadyInserted = 0; alreadyInserted < elements.size(); alreadyInserted++){
	    insert(alreadyInserted);
	}
    }

    // Precondition: 1<= index <= size - 2
    // Postcondition: The value at index+1 is the same as the value at index 
    public void shift(int index){
	elements.set(index + 1, elements.get(index));
    }
    // Precondition: indexToDropAfter >= -1
    // Postcondition: valueToDrop is inserted after indexToDropAfter
    public void drop(int indexToDropAfter, String valueToDrop){
	elements.set(indexToDropAfter + 1, valueToDrop);
    }

    // Precondition: 0 <= alreadyInsert <= size - 1   
    // Postcondition: The first unsorted elemented is inserted
    public void insert(int alreadyInserted) {
	String valueToInsert = elements.get(alreadyInserted);
	int indexToCompare = alreadyInserted - 1;
	while( indexToCompare >= 0 && valueToInsert.compareTo(elements.get(indexToCompare)) < 0) {
	    shift(indexToCompare);
	    indexToCompare--;
	}
	
	drop(indexToCompare,valueToInsert);
    }

}
