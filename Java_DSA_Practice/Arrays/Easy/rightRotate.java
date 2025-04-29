package Java_DSA_Practice.Arrays.Easy;

public class rightRotate {
    public static void solve(int arr[], int n) {
        //Brute Force
        /*int temp[] = new int[n];
        temp[0] = arr[n - 1];
        for(int i = 0; i < n - 1; i++){
            temp[i + 1] = arr[i];
        }
        for(int i = 0; i < n; i++) {
            System.out.println(temp[i] + " ");
        }*/
        //Optimal Approach
        int temp = arr[n - 1];
        for(int i = n - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        solve(arr, n);
    }
}