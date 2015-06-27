package org.sample;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {

	int[] intArray = {8,5,2,6,3};
	int tempVar=0;
	for(int outerLoopCounter=0; outerLoopCounter<intArray.length-1; outerLoopCounter++){
	    for(int innerLoopCounter=0; innerLoopCounter<intArray.length-1-outerLoopCounter; innerLoopCounter++){
		if(intArray[innerLoopCounter] > intArray[innerLoopCounter+1]){
		    tempVar = intArray[innerLoopCounter+1];
		    intArray[innerLoopCounter+1] = intArray[innerLoopCounter];
		    intArray[innerLoopCounter] = tempVar;
		}
	    }
	}
	System.out.println(intArray);
    }

}
