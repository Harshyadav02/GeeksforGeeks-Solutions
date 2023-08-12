class Cyclically_Rotate_An_Array_By_One{
    
    public void rotate(int arr[], int n)
    {   int i = 0;
        int j = n-1;
        while(i<n){
            
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            
        }
    }
}
