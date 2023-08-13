import java.util.Arrays;

class  Minimize_The_Heights{

   static int  getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);

        int minEle, maxEle;
        // min difference before adding or substrating k 
        
       int result = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] >= k) {
                
                maxEle = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                minEle = Math.min(arr[0] + k, arr[i] - k);

                result = Math.min(result, maxEle - minEle);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {3, 9, 12, 16, 20};
       int min_diff = getMinDiff(arr, arr.length,3);

      
        System.out.println(min_diff);
    }
}
