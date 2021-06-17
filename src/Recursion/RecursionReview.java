package Recursion;

public class RecursionReview {
    public static void main(String[] args) {
        new RecursionReview().tail(10);
    }

    void tail(int n) {
        if (n > 0) {
            tail (n - 1);
            System.out.print(n + "");
        }
    }
}
