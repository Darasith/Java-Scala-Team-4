package GroupExercise;

import java.util.Scanner;

public class task4 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);


        System.out.println("Enter money per hour, hour");
        double money = inp.nextDouble();
        double hour = inp.nextDouble();
        double grosspay = money * hour;

        System.out.println("Gross pay = "+grosspay);

        if (grosspay <= 300){
            double netpay =(grosspay * (100-10))/100;
            System.out.println("Net pay = "+netpay);
        }
        else if (grosspay > 300){
            double netpay = (grosspay * (100-12))/100;
            System.out.println("Net pay = "+netpay);
        }

    }
}
