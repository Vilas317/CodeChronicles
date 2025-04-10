package Java_DSA_Practice.Arrays.Easy;
//import java.util.*;
public class largestElement {
    public static void main(String args[]){
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: "+ /*sort*/ findLargestElement(arr1));

        int arr2[] = {8,10,5,7,9};
        System.out.println("The Largest element in the array is: "+ /*sort*/ findLargestElement(arr2));
    }
    //Brute Force
    /*static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    
}*/
//Recursive Approach
static int findLargestElement(int arr[]) {
    int max = 0;
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
}