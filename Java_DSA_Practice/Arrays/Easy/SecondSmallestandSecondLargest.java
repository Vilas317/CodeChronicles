package Java_DSA_Practice.Arrays.Easy;
public class SecondSmallestandSecondLargest {
    //Better Approach
    /*static private void getElements(int[] arr, int n) {
        if(n == 0 || n ==1) {
            System.out.println(-1);
            System.out.println(" ");
            System.out.println(-1);
            System.out.println("\n");
        }
        int small = Integer.MAX_VALUE;
        int s_Small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int s_Large = Integer.MIN_VALUE;
        int i;
        for(i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for(i = 0; i < n; i++) {
            if(arr[i] < s_Small && arr[i] != small) {
                s_Small = arr[i];
            }
            if(arr[i] > s_Large && arr[i] != large) {
                s_Large = arr[i];
            }
        }
        System.out.println("Second smallest is "+ s_Small);
        System.out.println("Second largest is "+ s_Large);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getElements(arr, n);
    }*/
    //Optimal Approach
    static private int secondSmallest(int[] arr, int n) {
        if(n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int s_Small = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] < small) {
                s_Small = small;
                small = arr[i];
            } else if(arr[i] < s_Small && arr[i] != small) {
                s_Small = arr[i];
            }
        }
        return s_Small;
    }
    static private int secondLargest(int[] arr, int n) {
        if(n < 2) {
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int s_Large = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > large) {
                s_Large = large;
                large = arr[i];
            } else if(arr[i] > s_Large && arr[i] != large) {
                s_Large = arr[i];
            }
        }
        return s_Large;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        int s_Small = secondSmallest(arr, n);
        int s_Large = secondLargest(arr, n);
        System.out.println("Second Smallest is "+ s_Small);
        System.out.println("Second Largest is "+ s_Large);
    }
    
}
