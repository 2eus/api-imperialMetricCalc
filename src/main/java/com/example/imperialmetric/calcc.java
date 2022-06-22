package com.example.imperialmetric;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class calc {

    static class OunceGrams {
        public static void main(String[] args) throws Exception {

            BufferedReader bf = new BufferedReader(new
                    InputStreamReader(System.in));
            System.out.println("Enter the Ounce:");
            int Ounce = Integer.parseInt(bf.readLine());
            double Grams = Ounce * 28.35;
            System.out.println("Grams:" + Grams);
        }


    }
}