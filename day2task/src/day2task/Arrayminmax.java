package day2task;

public class Arrayminmax {
	  public static void main(String[] args) {
			 
	 int[] numbers = new int[]{25,32,43,53,54,32,65,63,98,100,43,23,150};
	 
	    //assign first element of an array to largest and smallest
	    int smallest = numbers[0];
	    int largetst = numbers[0];
	 
	    for(int i=1; i< numbers.length; i++)
	    {
	        if(numbers[i] > largetst)
	            largetst = numbers[i];
	        else if (numbers[i] < smallest)
	            smallest = numbers[i];
	    }
	 
	    System.out.println("Largest Number is : " + largetst);
	    System.out.println("Smallest Number is : " + smallest);
	  }
	}


