/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.daviaro.punto2;

/**
 *
 * @author daviaro
 * Cuantas veces se imprime TRUE
 * A. true is printed out exactly once.
 * B. true is printed out exactly twice.
 * C. true is printed out exactly three times.
 * D. true is printed out exactly four times.
 * E. The code does not compile.
 * 
 */
public class CompareString {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3;
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));
    }
}
