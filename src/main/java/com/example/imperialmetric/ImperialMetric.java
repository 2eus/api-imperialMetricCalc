package com.example.imperialmetric;

import java.io.*;
import java.util.*;


public class ImperialMetric {

    class OuncetoGrams {
        public static void main(String[] args) throws Exception {

            BufferedReader bf = new BufferedReader(new
                    InputStreamReader(System.in));
            System.out.println("Enter the Ounce:");
            int Ounce = Integer.parseInt(bf.readLine());
            double Grams = Ounce * 28.35;
            System.out.println("Grams:" + Grams);
        }


          class StonetoKilo {
            public static void main(String[] args) throws Exception {

                BufferedReader bf = new BufferedReader(new
                        InputStreamReader(System.in));
                System.out.println("Enter the Stone:");
                int Stone = Integer.parseInt(bf.readLine());
                double Kilo = Stone * 6.35;
                System.out.println("Kilo:" + Kilo);
            }
        }


    }
}