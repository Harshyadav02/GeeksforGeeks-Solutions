class Equilibrium_Point{

        //Function to find equilibrium point in the array.
        
        public static int Finding_Equilibrium_Point(long array[], int size_of_array) {

        // leftSum will track left side sum of array    
        long leftSum = 0;
        long totalSum = 0;  // Total sum of array
        
        for(long new_array: array){
            totalSum += new_array;
        }

        for(int i = 0; i < array.length; i++){

            long rightSum = totalSum - leftSum - array[i];

            if(leftSum == rightSum){

                return i+1;
            }
            else{

                leftSum = leftSum +array[i];
            }
        }
        return -1;
       
    }

    public static void main(String[] args) {
        
        long arr[] = {1,3,5,2,2};
        int size_of_array = 5;
        System.out.println(Finding_Equilibrium_Point(arr,size_of_array));  // output 3 (5 is the equ point)
    }
}
