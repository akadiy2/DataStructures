package Recursion;

public class Polynomial {

    private int [] arr;
    public Polynomial(int [] arr) {
        this.arr = arr;
    }

    public Polynomial calculateDerivative(Polynomial p) {
        // (4,5,6) 8,5

        int  [] arr = new int[p.arr.length - 1];
        return null;
    }

    public String toString() {
        int exp = arr.length - 1;
        int  nbr = 0;

        int i = 0;
        StringBuilder str = new StringBuilder();
        while (i < arr.length) {
            nbr = arr[i];

            str.append(nbr).append(exp > 0 ? "x^" + exp : "");
            if (i < arr.length - 1) {
                str.append("+");
            }


            i++;
            exp--;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        //System.out.println(generatePolynomial(new int[]{4,5,6}));
    }
}
