package com.akila.belajar_junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


// Kelas untuk pengujian fungsi pada Calculator
public class CalculatorTest {

    // Inisialisasi objek Calculator untuk pengujian
    private Calculator calculator = new Calculator();

    // Metod pengujian untuk menguji fungsi add pada Calculator
    @Test
    public void testAddSuccess(){
        // Memanggil fungsi add dengan menambahkan parameter 10 dan 10
        int result = calculator.add(10, 10);
        // Memeriksa apakah hasil penambahan sesuai dengan nilai yang diharapkan.
       assertEquals(20, result);
    }
}
