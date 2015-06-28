package org.sample;

public class InsertionSortAlgorithm {

    public static void main(String[] args) {

	int[] intArray = {2, 5, 8, 3};
	int current=0;
	int j=0;
	for(int i=0; i<intArray.length;i++){
	    current=intArray[i];
	    j=i-1;
	    while(j>=0 && intArray[j]>current){
		intArray[j+1]=intArray[j];
		j=j-1;
		intArray[j+1]=current;
	    }
	}
	System.out.println(intArray);
	
    }

}
