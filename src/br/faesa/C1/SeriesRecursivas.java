package br.faesa.C1;
public class SeriesRecursivas {

    /**
     * Calcula a soma da série 1: S = 1/4 - 2/7 + 3/10 - 4/13 + ...
     * A função calcula a soma dos n primeiros termos.
     *
     * @param n O número de termos a serem somados.
     * @return A soma da série com n termos.
     */
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
}
