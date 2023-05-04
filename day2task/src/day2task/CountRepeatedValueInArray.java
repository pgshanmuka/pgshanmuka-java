package day2task;

public class CountRepeatedValueInArray {
	  public static void main(String[] args) {

    int[] array = {5,4,3,5,4,3};

    int count = 0;

    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (array[i] == array[j])
                count++;
        }
        if (count > 1) {
            System.out.println("Value " + array[i] + " is repeated " + count + " times");
        }
        count = 0;
    }
}

}
