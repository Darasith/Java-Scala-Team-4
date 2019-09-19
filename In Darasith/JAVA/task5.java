package GroupExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task5 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter number of line");
        int n = Integer.parseInt(inp.nextLine());

        while (n --> 0){
            System.out.println("Enter the String");
            String string = inp.nextLine();

            boolean match = false;
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(string);

            while (m.find()){
                System.out.println(m.group(2));
                match = true;
            }
            if (!match){
                System.out.println("None");
            }

        }

    }
}
