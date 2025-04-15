package Java_DSA_Practice.Arrays.Easy;

public class leftRotate {
    static void solve(int[] arr, int n) {
        //Brute Force
        /*int temp[] =  new int[n];
        for(int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for(int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }*/
    //Optimal Approach
    int temp = arr[0];
    for(int i = 0; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }
    arr[n - 1] = temp;
    for(int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    }
    public static void main(String args[]) {
        int n=5;
        
        int arr[]= {1,2,3,4,5};
        solve(arr, n);
      }
      }
