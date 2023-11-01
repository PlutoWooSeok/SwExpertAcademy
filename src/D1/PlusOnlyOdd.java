package D1;

import java.util.Scanner;

public class PlusOnlyOdd {
    public static void main(String ars[]){
        Scanner sc = new Scanner(System.in);
        int Count = sc.nextInt();   //실행횟수 입력

        for (int i = 1 ; i <= Count ; i++){
            int result = 0 ;       //홀수만 더한 결과값
            for (int j = 0 ; j < 10 ; j++){ //10개의 숫자 입력받기
                int number = sc.nextInt();
                if( number % 2 == 1){
                    result += number;
                }
            }
            System.out.println("#" + i + " " +result);

        }
    }
}
