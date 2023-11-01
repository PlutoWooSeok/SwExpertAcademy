package D1;

import java.util.Scanner;

public class CompareNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for( int i = 1 ; i <= T ; i++){
            String compareSymbol = null;
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            if (firstNumber > secondNumber){
                compareSymbol = ">";
            }
            else if (firstNumber == secondNumber) {
                compareSymbol ="=";
            } else if (firstNumber < secondNumber) {
                compareSymbol = "<";
            }
            System.out.println("#"+i+" "+ compareSymbol);
        }
    }
}
