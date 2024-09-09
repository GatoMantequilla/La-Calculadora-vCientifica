package com.example;

public class ACT1 {
    public static void main(String[] args) {
    }

    public static double cualEsMayor(double n1, double n2) {
        return Math.max(n1, n2);
    }

    public static double cualEsMenor(double n1, double n2){
    return Math.min(n1 , n2);
    }

    public static double potenciaNumero(double n1, double n2){
        return Math.pow(n1,n2);
    }

    public static double calcularPorcentaje(double numero, double porcentaje) {
        return (porcentaje / 100) * numero;
    }
}