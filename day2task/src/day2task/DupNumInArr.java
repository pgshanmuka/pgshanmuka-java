package day2task;

public class DupNumInArr {
	 public static void main(String[] args) {

	        //Given array
	        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

	        //Find duplicates and count
	        System.out.println("Duplicate elements in given array: ");
	        for(int i = 0; i < arr.length; i++) {
	            for(int j = i + 1; j < arr.length; j++) {
	                if(arr[i] == arr[j])
	                    System.out.println(arr[j]);
	            }
	        }

	        //Delete duplicates
	        System.out.println("Array after removing duplicates: ");
	        for (int i = 0; i < arr.length-1; i++)
	        {
	            for (int j = i+1; j < arr.length; j++)
	            {
	                if ((arr[i] == arr[j]) && (i != j))
	                {
	                    arr[j] = 0;
	                }
	            }
	        }
	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] != 0)
	                System.out.print(arr[i] + " ");
	        }
	    }

}
