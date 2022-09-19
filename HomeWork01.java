/**
 * Java Basic. Home Work #1
 *
 * @author Vladislav
 * version 19.09.2022
 *
 */
 class HomeWork01 {
    public static void main(String[] args) {
		// Rectangle, side a, side b. Find perimeter P and area S
        int a = 10;
        int b = 5;
        int p = a + b + a + b;
        int s = a * b;
        System.out.println("Perimeter=" + p);
        System.out.println("Area=" + s);
        // c = 5, d = 3. Find sum of addition, subtraction, multiplication and division
        int c = 5;
        int d = 3;
        int e = c + d;
        int f = c - d;
        int g = c * d;
        float j = c / 3f;
        System.out.println("Addition=" + e);
        System.out.println("Subtraction=" + f);
        System.out.println("Multiplication=" + g);
        System.out.println("Division=" + j);
        // Declare an array of integers with a length of 5 elements
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        for (int i = 0; i < 5; i++)
        System.out.println(array[i]);
    }
}
