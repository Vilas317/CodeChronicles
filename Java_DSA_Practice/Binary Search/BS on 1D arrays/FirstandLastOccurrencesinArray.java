public class FirstandLastOccurrencesinArray {
    public static int solve(int n, int key, int[] v) {
        //Last Occurence brute force
    //     int res = -1;
    //     for(int i = n - 1; i >= 0; i--) {
    //         if(v[i] ==  key) {
    //             res = i;
    //             break;
    //         }
    //     }
    //     return res;
    // }
    //First occurence brute force
//     int res = -1;
//     for(int i = 0; i <= n; i++) {
//         if(v[i] ==  key) {
//             res = i;
//             break;
//         }
//     }
//     return res;
// }

//optimal approach
int start = 0, end = n - 1;
int res = -1;
while(start <= end) {
    int mid = start + (end - start)/2;
    if(v[mid] == key) {
        res = mid;
        start = mid+ 1;
    } else if (key < v[mid]) {
        end = mid - 1;
    } else {
        start = mid + 1;
    }
}
return res;
    }
    public static void main(String args[]) {
        int n = 7;
        int key = 13;
        int[] v = {3,4,13,13,13,20,40};

        System.out.println(solve(n, key, v));
      }
    }