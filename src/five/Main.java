package five;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.format("%10s%10s     | %10s%15s \n","Kilogram", "Pounds", "Pounds", "Kilograms");
        DecimalFormat df = new DecimalFormat("#.##");


        int first= 1;
        int second= 20;

        for(; first <200; first += 2){

            System.out.format("%10d%10s     | %10d%15s \n",first, df.format(first*2.2), second, df.format(second/2.2));


            second += 5;
        }



    }
}
