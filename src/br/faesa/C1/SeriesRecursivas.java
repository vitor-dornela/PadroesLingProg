package br.faesa.C1;
public class SeriesRecursivas {

    public static void main(String[] args) {
        int numeroDeTermos = 4;

        double resultadoSerie1 = calcularSerie1(numeroDeTermos);
        System.out.println("Resultado da Série 1: " + resultadoSerie1);

        double resultadoSerie2 = calcularSerie2(numeroDeTermos);
        System.out.println("Resultado da Série 2: " + resultadoSerie2);

        long resultadoSerie3 = calcularSerie3(numeroDeTermos);
        System.out.println("Resultado da Série 3: " + resultadoSerie3);

    }

    // Calcula a soma da série 1: S = 1/4 - 2/7 + 3/10 - 4/13 + ...
    public static double calcularSerie1(int n) {
        // Caso base: se não há termos para somar, a soma é 0.
        if (n <= 0) {
            return 0;
        } else {
            // Calcula o n-ésimo termo (numerador/denominador).
            double termo = (double) n / (3 * n + 1);

            // Verifica se o termo n é par ou ímpar para definir o sinal.
            if (n % 2 == 0) {
                // Se n é par, o termo é negativo.
                return -termo + calcularSerie1(n - 1);
            } else {
                // Se n é ímpar, o termo é positivo.
                return termo + calcularSerie1(n - 1);
            }

        }
    }

    // Calcula a soma da série 2: S = 1 + 1/6 + 1/11 + 1/16 + ...
    public static double calcularSerie2(int n) {
        // Caso base: se não há termos, a soma é 0.
        if (n <= 0) {
            return 0;
        } else {
            // Calcula o n-ésimo termo.
            double termo = 1.0 / (5 * n - 4);
            // Soma o termo atual com a soma dos (n-1) termos anteriores.
            return termo + calcularSerie2(n - 1);
        }
    }

    // Calcula a soma da série 3: S = 1 + 4 + 9 + 16 + ...
    public static long calcularSerie3(int n) {
        // Caso base: se não há termos, a soma é 0.
        if (n <= 0) {
            return 0;
        } else {
            // Soma o quadrado de n com a soma dos quadrados dos (n-1) números anteriores.
            return (long) n * n + calcularSerie3(n - 1);
        }
    }
}
