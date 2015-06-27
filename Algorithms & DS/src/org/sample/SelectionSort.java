package org.sample;

public class SelectionSort {

    public static void main(String[] args) {

	int[] intArray = {2, 8, 5, 9};
	int minIndex=0;
	int tempVar=0;
	for(int outerLooCounter=0; outerLooCounter<intArray.length; outerLooCounter++){
	    minIndex=outerLooCounter;
	    for(int innerLoopCounter=outerLooCounter+1; innerLoopCounter<intArray.length;innerLoopCounter++){
		if(intArray[innerLoopCounter] < intArray[outerLooCounter]){
		    minIndex = innerLoopCounter;
		}
	    }
	    tempVar=intArray[minIndex];
	    intArray[minIndex]=intArray[outerLooCounter];
	    intArray[outerLooCounter]=tempVar;
	}
	System.out.println(intArray);
    }

}
