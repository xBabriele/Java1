/**
 * @author Gabriel Madiotto 4A
 * Esercizi Advent of Code @see https://adventofcode.com/2024/day/1
 */

class Xmas {
    public static void main(String [] args) {
        int [] array1 = {3,4,2,1,3,3};
        int [] array2 = {4,3,5,3,9,3};

        sorta(array1);
        sorta(array2);
        
        int sott=0;
        for (int i=0; i<array1.length; i++) {
            if (array1[i] > array2[i]) {
                sott = array1[i] - array2[i];
            } else {
                sott = array2[i] - array1[i];
            }
            System.out.println(sott);
        }
    }

    public static void sorta(int [] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}