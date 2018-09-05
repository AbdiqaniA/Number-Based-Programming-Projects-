package NumbersProjects;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PiCalc {
    public static void main(String[] args) {

        final int MAX_NUM = 999999999;
        double pi = 0;
        double denominator = 1;

        for (int i = 0; i < MAX_NUM; i++) {
            if (i % 2 == 0) pi = pi + (1 / denominator);
            else pi = pi - (1 / denominator);
            denominator = denominator + 2;
        }
        pi = pi * 4;

       Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Number of decimal places between 1-16");

        int num = keyboard.nextInt();

        DecimalFormat decimals = new DecimalFormat();
        decimals.setMaximumFractionDigits(num);
        System.out.println(decimals.format(pi));

    }
}
