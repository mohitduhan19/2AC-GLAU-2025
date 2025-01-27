package AC.Lec5_Theory;

public class Print_Number {
    public static void printNumbers(int current, int n) {
        if (current > n) {
            return;
        }
        System.out.println(current);
        printNumbers(current + 1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        printNumbers(1, n);
    }
}
