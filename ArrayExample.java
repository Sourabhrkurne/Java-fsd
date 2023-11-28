public class ArrayExample {

    public static void main(String[] args) {
        // Declaration and initialization of an array of integers
        int[] intArray = {1, 2, 3, 4, 5};

        // Accessing and printing elements of the array
        System.out.println("Array Elements:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Element at index " + i + ": " + intArray[i]);
        }

        // Declaration and initialization of a string array
        String[] stringArray = {"Java", "C", "Python"};

        // Accessing and printing elements of the string array using an enhanced for loop
        System.out.println("\nString Array Elements:");
        for (String language : stringArray) {
            System.out.println(language);
        }

        // Declaration and initialization of a 2D array
        int[][] twoDArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Accessing and printing elements of the 2D array
        System.out.println("\n2D Array Elements:");
        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                System.out.print(twoDArray[row][col] + " ");
            }
            System.out.println();
        }
    }
}