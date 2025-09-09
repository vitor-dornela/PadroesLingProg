package br.faesa.C1;

import static br.faesa.C1.SeriesRecursivas.calcularSerie1;

public class Principal {

    public static void main(String[] args) {
        int numeroDeTermos = 15;
        // --- Chamada e impressão do resultado da Série 1 ---
        System.out.println("Calculando: S = 1/4 - 2/7 + 3/10 - 4/13 + ...");
        double resultadoSerie1 = calcularSerie1(numeroDeTermos);
        System.out.println("Resultado da Série 1: " + resultadoSerie1);
    }
}
