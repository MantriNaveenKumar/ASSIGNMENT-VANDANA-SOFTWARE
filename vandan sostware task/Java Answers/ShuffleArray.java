
 // 1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

 import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        
        System.out.print("Shuffled array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            
            // Swap the elements at 'i' and 'index'
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}

/*
 * OUTPUT :
Shuffled array: 1 4 2 3 6 7 5 
 */

