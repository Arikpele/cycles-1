public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("задача 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("итерация" + i);
        }
    }

    public static void task2() {
        System.out.println("задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("итерация" + i);

        }
    }

    public static void task3() {
        System.out.println("задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("итерация" + i);
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("итерация" + i);
        }
    }

    public static void task5() {
        System.out.println("задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високостным");
        }
    }

    public static void task6() {
        System.out.println("задача 6");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println("итерация" + i);
    }

}
    public static void task7() {
        System.out.println("задача 7");
        for (int i = 1; i <= 512; i = i * 2)
            System.out.println("итерция" + i);
    }
}
