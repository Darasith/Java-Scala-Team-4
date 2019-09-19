package GroupExercise;

import java.util.Scanner;

public class task4b {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Money per hour, Enter Hour");
        double money = inp.nextDouble();
        double hour = inp.nextDouble();

        double grosspay = money * hour;
        System.out.println("Gross money = "+grosspay);

        if(grosspay>500){
            double netpay = (grosspay*(100-20))/100;
            System.out.println("netpay = "+netpay);
        }
        if (grosspay >= 400.01 && grosspay > 500){
            double netpay = (grosspay*(100-15))/100;
            System.out.println("netpay = "+netpay);
        }
        if (grosspay >= 300.01 && grosspay > 400){
            double netpay = (grosspay*(100-12))/100;
            System.out.println("netpay = "+netpay);
        }
        if (grosspay > 300){
            double netpay = (grosspay*(100-10))/100;
            System.out.println("netpay = "+netpay);
        }
    }
}
