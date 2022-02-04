import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

public class MergeSort {
	
	/*public void mergeSort(ArrayList<Student> list) {
        ArrayList<Student> helper = new ArrayList<Student>();
        mergeSort(list, helper, 0, list.size()-1);
    }
      private static void mergeSort(ArrayList<Student> list, ArrayList<Student> helper, int low, int high) {
        if(low < high) {
            int middle = (low+high)/2;
            mergeSort(list, helper, low, middle); //sort left half
            mergeSort(list, helper, middle+1, high); //sort right half
            merge(list, helper, low, middle, high); // merge
        }
    }
    
        private static void merge(ArrayList<Student> list, ArrayList<Student> helper, int low, int middle, int high) {

        for(int i=low; i< high + 1; i++) {
            helper.add(i, list.get(i));
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        //Iterate through helper array, copying back smaller element in the original list 
         
        while(helperLeft < middle && helperRight < high) {
            if(helper.get(helperLeft).isLessThan(helper.get(helperRight))) {
                list.set(current, helper.get(helperLeft));
                helperLeft++;
            } else {
                list.set(current, helper.get(helperRight));
                helperRight++;
            }
            current++;
        }

        //Copy remaining elements
        int remaining = middle - helperLeft;
        for(int j=0; j <= remaining; j++) {
            list.set(current+j, helper.get(helperLeft+j));
        }

    }
    
    
    
	private Student[] list;
	private Student[] helper;
	
	public void sort(List<Student> studentList) {
	    list = studentList.toArray(new Student[studentList.size()]);
	    helper = new Student[list.length];
	    mergeSort(0, list.length - 1);
	    studentList = Arrays.asList(list);
	}
	private void mergeSort(int low, int high) {
	    if(low < high) {
	        int middle = low + (high - low) / 2;
	        mergeSort(low, middle); //sort left half
	        mergeSort(middle + 1, high); //sort right half
	        merge(low, middle, high); // merge
	    }
	}

	private void merge(int low, int middle, int high) {

	    for(int i=low; i<= high; i++) {
	        helper[i] = list[i];
	    }

	    int helperLeft = low;
	    int helperRight = middle + 1;
	    int current = low;

	    
	    //Iterate through helper array, copying back smaller element in the original list
	    
	    while(helperLeft <= middle && helperRight <= high) {
	        if(helper[helperLeft].compareTo(helper[helperRight]) < 0) {
	            list[current] = helper[helperLeft];
	            helperLeft++;
	        } else {
	            list[current] = helper[helperRight];
	            helperRight++;
	        }
	        current++;
	    }

	    while (helperLeft <= middle) {
	        list[current] = helper[helperLeft];
	        current++;
	        helperLeft++;
	    }

	}
*/
	
	
	public void mergeSort(ArrayList<Student> data, int start, int end) {  //Method to separate the list into single units
		
		if (start < end) {						//loop that breaks into single data chunks
			int middle = (start + end)/2;		//locate middle of each chunk and divide
			mergeSort(data, start, middle);		//recursive call to keep splitting the array into left chunks
			mergeSort(data, middle+1, end);		//recursive call to keep splitting the array into right chunks
			merge(data, start, middle, end);	//reconstruct each section into a full list
		}
	}

	
	private static void merge(ArrayList<Student> data, int start, int middle, int end) {
		
		int left = middle - start +1;	//new variables for each side of the split
		int right = end - middle;
		
		Student leftArray[] = new Student[left];	//defining each side as its own array to iterate thru
		Student rightArray[] = new Student[right];	
		
		for (int i = 0; i < left; i++) {	//populate the arrays with copied data so it is not overwritten
			leftArray[i] = data.get(start + i);
		}
		
		for (int j = 0; j < right; j++) {	//populate the arrays with copied data so it is not overwritten
			rightArray[j] = data.get(middle + 1 + j);
		}
		
		int i = 0;
		int j = 0;
		for (int k = start; k <= end; k++) {	//construct a new list in the desired order using k as index
			if ((j >= right) || (i < left && leftArray[i].getRollNum() <= rightArray[j].getRollNum())) {	//sorts appropriately 
				data.set(k, leftArray[i]);
				i++;						//increment i as each side of the split gets sorted into index k
			}
			else {
				data.set(k, rightArray[j]);
				j++;						//increment j as each side of the split gets sorted into index k
			}
		}
	}
}
