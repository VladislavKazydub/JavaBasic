/**
 * Java Basic. Home Work #1
 *
 * @author Vladislav
 * @todo 05.09.2022
 * @date 20.09.2022
 */
 class HomeWork01 {
    public static void main(String[] args) {
		// task 1
        int a = 10;
        int b = 5;
        int p = a + b + a + b;
        int s = a * b;
        System.out.println("Perimeter=" + p);
        System.out.println("Area=" + s);
        
        // task 2
        a = 5;
        b = 3;
        int c = a + b;
        int d = a - b;
        int i = a * b;
        System.out.println("Addition=" + c);
        System.out.println("Subtraction=" + d);
        System.out.println("Multiplication=" + i);
        System.out.println("Division=" + (float) a / b);
        
        // task 3
        int[] array = new int[5];
        array[0] = 2;
        array[1] = 4;
        array[2] = 6;
        array[3] = 8;
        array[4] = 10;
        System.out.printf("[%d, %d, %d, %d, %d]\n", array[0], array[1], array[2], array[3], array[4]);
        
        // task 4
        int pizzaDiametr = 33;
        float pizzaRadius = pizzaDiametr / 2f;
        double pizzaArea = Math.PI * pizzaRadius * pizzaRadius;
        double pizzaCallories = pizzaArea * 40;
        System.out.println("Pizza 33 cm diameter has " + pizzaCallories + " Calories");
    }
}
