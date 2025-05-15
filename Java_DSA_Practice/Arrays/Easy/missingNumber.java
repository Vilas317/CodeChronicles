package Java_DSA_Practice.Arrays;
import java.util.*;

public class missingNumber {
    public static int missing(int []a, int N) {
        //Brute Force
        /*for(int i = 1; i < N; i++) {
            int flag = 0;

            for(int j = 0; j < N - 1; j++) {
                if(a[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return -1;
    }*/
    //Better Approach - Using hashing
    /*int hash[] = new int[N + 1];
    for(int i = 0; i < N - 1; i++){
        hash[a[i]]++;
    }

        for (int i = 1; i <= N; i++) {
            if(hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }*/
    //Optimal Approach
    int sum = (N*(N+1))/2;
    int s2 = 0;
    for(int i = 0; i < N - 1; i++) {
        s2 += a[i];
    }
    int missingNum = sum - s2;
    return missingNum;
}
public static void main(String args[]) {
    int N = 5;
    int a[] = {1, 2, 4, 5};

    int ans = missing(a, N);
    System.out.println("The missing number is: " + ans);
}
}
