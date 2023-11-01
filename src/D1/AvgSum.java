package D1;

import java.util.Scanner;

public class AvgSum {
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 1 ; i<= testCase ; i++){
            int avg = 0 ;
            double sum = 0;
            for (int j = 0 ; j < 10 ; j++){
                int number = sc.nextInt();
                sum += number;
                avg = (int) Math.round(sum/10);
            }
            System.out.println("#" + i + " " + avg);
        }

    }
}
