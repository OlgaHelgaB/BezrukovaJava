public class Task2 {

    public static void main(String[] args) {
        calc(1, 2);
        compare("строка 1", "Строка_2");
        parity();
    }

    public static void calc(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

    public static void compare(String str1, String str2) {
        int val;
        val = str1.compareTo(str2);
        if (val == 0) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void parity() {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
