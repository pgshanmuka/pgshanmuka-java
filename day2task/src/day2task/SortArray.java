package day2task;

public class SortArray {
	public static void main(String[] args) {

        int[] array = {10, 9, 7, 5, 8, 6, 1, 4, 2};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

}
