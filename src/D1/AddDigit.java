package D1;

import java.util.Scanner;

public class AddDigit {
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        String num = scan.nextLine();
        String[] digit = num.split("");
        int[] digitNumber = new int[digit.length];
        int sum = 0;

        for (int i = 0 ; i < num.length() ; i++){
            digitNumber[i] = Integer.parseInt(digit[i]);
            sum+=digitNumber[i];
        }
        System.out.println(sum);
    }
}
