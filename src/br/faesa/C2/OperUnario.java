package br.faesa.C2;

public class OperUnario {
    public static void main(String[] args) {
        unario();
        semUnario();
    }

    public static void unario() {
        int num1;
        double a, b;
        b = 2.0;
        num1 =  5;
        a = -num1 + -num1++;
        a *= ++b;
        a = -b++;
        System.out.println(a + " "+b);
    }
    public static void semUnario(){
        int num1;
        double a, b;
        b = 2.0;
        num1 =  5;
        a = (-1) * num1 + (-1) * num1;
        num1 = num1 + 1;
        b = b + 1;
        a = a * b;
        a = (-1) * b;
        b = b + 1;
        System.out.println(a + " "+b);
    }
}
