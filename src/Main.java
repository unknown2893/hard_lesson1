public class Main {
    public static void main(String[] args) {
        byte a = 10;
        short b = 15;
        int c = 20;
        long d = 25;
        long e = 30;
        int mnoj = a * b;
        int sum = b + c;
        double del = (double) c / d;
        long raz = d - e;

        String str1 = "кек ";
        String str2 = "лол ";

        System.out.println("умножение: " + a + " * " + b + " = " + mnoj);
        System.out.println("сумма: " + b + " + " + c + " = " + sum);
        System.out.println("деление: " + c + " / " + d + " = " + del);
        System.out.println("разность: " + d + " - " + e + " = " + raz);

        System.out.println(str1 + "омг " + str2);
        System.out.println(str1 + 10 + 10);
        System.out.println(10 + 10 + " " + str1);
        System.out.println(str1 + (10 + 10));
    }
}