package Java_DSA_Practice.Arrays.Hard;

public class MaximumProductSubarray {
    static int maxProductSubArray(int arr[]) {
        //Brute force
	//     int result = Integer.MIN_VALUE;
	//     for(int i=0;i<arr.length-1;i++) 
	//         for(int j=i+1;j<arr.length;j++) {
	//             int prod = 1;
	//             for(int k=i;k<=j;k++) 
	//                 prod *= arr[k];
	//             result = Math.max(result,prod);
	//         }
	//    return result;     
	// }

    //Bettter Approach
//     int n = arr.length;
//     int result = arr[0];
//     for(int i = 0; i < n; i++) {
//         int p = arr[i];
//         for(int j = i + 1; j < n; j++) {
//             result = Math.max(result, p);
//             p *= arr[j];
//         }
//         result = Math.max(result, p);
//     }
//     return result;
// }

//Optimal Approach
int n = arr.length;
int pre = 1, suff = 1;
int ans = Integer.MIN_VALUE;
for(int i = 0; i < n; i++) {
    if(pre == 0) pre = 1;
    if(suff == 0) suff =  1;
    pre *= arr[i];
    suff *= arr[n - i - 1];
    ans = Math.max(ans, Math.max(pre, suff));
}
return ans;
    }
	public static void main(String[] args) {
		int nums[] = {1,2,-3,0,-4,-5};
		int answer = maxProductSubArray(nums);
		System.out.print("The maximum product subarray is: "+answer);
	}
}