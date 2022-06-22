package com.example.imperialmetric;

import java.io.*;
import java.util.*;


public class ImperialMetric {

    class KilotoStone{
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
