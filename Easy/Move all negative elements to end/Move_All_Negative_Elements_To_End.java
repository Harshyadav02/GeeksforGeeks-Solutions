import java.util.*;
import java.lang.*;
import java.io.*;

//User function Template for Java
// n represent the array length 
class Move_All_Negative_Elements_To_End {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        
        int extra_space [] = new int[n];
        int extra_space_pointer = 0 ;
        // for positive number
        
        for(int i=0; i<n;i++){
            
            if (arr[i] >= 0){
                
                extra_space[extra_space_pointer] = arr[i];
                extra_space_pointer ++;
                
            }
        }
        // if all element in array are postive or negative 
        if(extra_space_pointer == n || extra_space_pointer==0){
            return ;
        }
        
        // for negative number  
        
        for(int i=0; i<arr.length;i++){
            
            if (arr[i] < 0){
                
                extra_space[extra_space_pointer] = arr[i];
                extra_space_pointer ++;
                
            }
        }
        
        // Copying elements to original array
        
        for(int i = 0; i<n;i++){
            arr[i] = extra_space[i] ;
        }
    }
	public static void main(String[] args) {
	        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
	        segregateElements(arr, arr.length);
		
		// converting all array elemnts to string
        	System.out.println(Arrays.toString(arr));
    }
}
