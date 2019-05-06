/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {

    public SelectionSorter(ArrayList<String> usersData) {
	super(usersData);
    }

    public void mySort() {
	for(int index = 0; index < elements.size() - 1; index++){
	    int smallestIndex = findMinIndex(index);
	    String temp = elements.get(index);
	    elements.set(index, elements.get(smallestIndex));
	    elements.set(smallestIndex, temp);
	}
    }

    

    public int findMinIndex(int startIndex) {
	int minIndex = startIndex;
	int iterate = startIndex + 1;
	String toBeCompared = elements.get(startIndex);
	while(iterate < elements.size()) {
	    if(toBeCompared.compareTo(elements.get(iterate)) > 0) {
		toBeCompared = elements.get(iterate);
		minIndex = iterate;
	    }
	    iterate++;
	}
	return minIndex;
    }

    
}
