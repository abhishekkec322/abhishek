
public class MergeSortedArrayKeepAll {
	public static void main(String[] args) {

	    int a [] = {3,5,7,9,12,14, 15};
	    int b [] = {3, 6 ,7, 10};
	    int j = 0, k = 0;

	    //output array should be 3,5,6,7,7,9,10,12,14,15

	    int c [] = new int[a.length+b.length];//10 values

	    // we're filling c with the next appropriate number
	    // we start with checking a[0] and b[0] till we add
	    // all the elements
	    for (int i = 0; i < c.length; i++) {
	        // if both "a" and "b" have elements left to check
	        if (j < a.length && k < b.length) {
	            // check if "b" has a smaller element
	            if (b[k] < a[j]) {
	                // if so add it to "c"
	                c[i] = b[k];
	                k++;
	            }
	            // if "a" has a smaller element
	            else {
	                // add it to "c"
	                c[i] = a[j];
	                j++;
	            }       
	        }
	        // if there are no more elements to check in "a"
	        // but there are still elements to check in "b"
	        else if (k < b.length) {
	            // add those elements in "b" to "c"
	            c[i] = b[k];
	            k++;
	        }
	        // if there are no more elements to check in "b"
	        // but there are still elements to check in "a"
	        else {
	            // add those elements in "a" to "c"
	            c[i] = a[j];
	            j++;
	        }
	    }

	    for(int i = 0; i < c.length; i++)
	        System.out.println(c[i]);
	}
}
