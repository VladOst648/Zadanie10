package com.company;
import javafx.geometry.Pos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner Scan = new Scanner(System.in);
        int n = Scan.nextInt();
        int[] Posledovatelnost = new int[n];
        Posledovatelnost[0] = 0;
        Posledovatelnost[1] = 1;
        for (int i = 2; i < n;++i){
            Posledovatelnost[i] = Posledovatelnost[i-2]+Posledovatelnost[i-1];
        }
        for (int j = 0; j < n; j++){
            System.out.print(Posledovatelnost[j] + " ");
        }
    }
}
