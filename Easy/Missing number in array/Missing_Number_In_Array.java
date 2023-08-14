class Solution {
int missingNumber(int array[], int n) {
        int index_sum = 0;
        for (int i = 1; i <= n; i++) {
            index_sum += i;
        }
        
        int ele_sum = 0;
        for (int i = 0; i < n - 1; i++) {
            ele_sum += array[i]; // Changed 'arr' to 'array'
        }
        
        int result = index_sum - ele_sum;
        return result;
    }

}
