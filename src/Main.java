public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        //task 1
        System.out.println("Task 1");
        //task1/1
        int[] anIntegerArray = new int[]{1, 2, 3};
        for (int e : anIntegerArray) {
            System.out.print(e + " ");
        }//task1/2
        System.out.println();
        double[] fractionalArray = {1.57, 7.654, 9.986};
        for (double y : fractionalArray) {
            System.out.print(y + " ");
        }
        System.out.println();
        //task1/3
        long[] anArbitraryArray = {24, 21, 34, 75, 87, 54, 90, 0, 0, 0};
        for (long i : anArbitraryArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task 2
        System.out.println("Task 2");
        int[] anIntegerArray1 = {1, 2, 3};
        for (int i = 0; i < anIntegerArray1.length; i++) {
            if (i == anIntegerArray1.length - 1) {
                System.out.print(anIntegerArray1[i]);
                break;
            }
            System.out.print(anIntegerArray1[i] + ", ");
        }
        System.out.println(" ");
        double[] fractionalArray1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalArray1.length; i++) {
            if (i == fractionalArray1.length - 1) {
                System.out.print(fractionalArray1[i]);
                break;
            }
            System.out.print(fractionalArray1[i] + ", ");
        }
        System.out.println(" ");
        long[] anArbitraryArray1 = {24, 21, 34, 75, 87, 54, 90, 0, 0, 0};
        for (int i = 0; i < anArbitraryArray1.length; i++) {
            if (i == anArbitraryArray1.length - 1) {
                System.out.print(anArbitraryArray1[i]);
                break;
            }
            System.out.print(anArbitraryArray1[i] + ", ");
        }
        System.out.println();
        //task 3
        System.out.println("Task 3");
        int[] anIntegerArray2 = {3, 2, 1};
        for (int i = anIntegerArray2.length - 1; i >= 0; i--) {
            System.out.print(anIntegerArray2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] fractionalArray2 = {1.57, 7.654, 9.986};
        for (int i = fractionalArray2.length - 1; i >= 0; i--) {
            System.out.print(fractionalArray2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        long[] anArbitraryArray2 = {24, 21, 34, 75, 87, 54, 90, 0, 0, 0};
        for (int i = anArbitraryArray2.length - 1; i >= 0; i--) {
            System.out.print(anArbitraryArray2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //tesk 4
        System.out.println("Task 4");
        for (int i = 0; i < anArbitraryArray.length; i++) {
            if (anArbitraryArray[i] % 2 != 0) {
                anArbitraryArray[i]++;
            }
        }
        for (int i = 0; i < anArbitraryArray.length; i++) {
            System.out.print(anArbitraryArray[i]);
            if (i < anArbitraryArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}