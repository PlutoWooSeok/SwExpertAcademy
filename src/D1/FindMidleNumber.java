package D1;

import java.util.Arrays;
import java.util.Scanner;

public class FindMidleNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] middle = new int[N];
        for (int i = 0 ; i<N ; i++){
            middle[i] = sc.nextInt();
        }
        Arrays.sort(middle);
        System.out.println(middle[N/2]);
    }
}
