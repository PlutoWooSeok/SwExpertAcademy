package D1;

import java.util.Scanner;

public class YeaMonthDayCalendar {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int lastDay[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i=0; i<testCase; i++) {
            int ymd = sc.nextInt();
            int year = ymd/10000 ;
            int month = (ymd-year*10000)/100;
            int day = ymd%100;

            if ((month < 1 || month > 12) || (day < 1 || day > lastDay[month - 1]))
                System.out.printf("# %d-1\n", i + 1);
            else
                System.out.printf("# %d %04d/%02d/%02d\n",i+1,year,month,day);

        }
        sc.close();
    }
}