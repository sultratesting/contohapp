package com.example;


/**
 * Kelas kalkulator.
 */
public class Calculator {

    /**
     * Method untuk penjumlahan.
     * @param a nilai pertama
     * @param b nilai kedua
     * @return hasil
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Method untuk penngurangan.
     * @param a nilai pertama
     * @param b nilai kedua
     * @return hasil
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Method untuk perkalian.
     * @param a nilai pertama
     * @param b nilai kedua
     * @return hasil
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Method untuk pembagian.
     * @param a nilai pertama
     * @param b nilai kedua
     * @return hasil
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    // Main method untuk menjalankan aplikasi kalkulator
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
