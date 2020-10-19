import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;


    Difference(int[]arr){
        this.elements=arr;
    }

    void computeDifference(){
        Arrays.sort(elements);
        maximumDifference=Math.abs(elements[0]-elements[elements.length-1]);
    }

	// Add your code here

} // End of Difference class