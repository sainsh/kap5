package six;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.format("%10s%15s     | %15s%15s \n","Miles", "Kilometers", "Kilometers", "Miles");
        DecimalFormat df = new DecimalFormat("#.###");


        int first= 1;
        int second= 20;

        for(; first <11; first ++){

            System.out.format("%10d%15s     | %15d%15s \n",first, df.format(first*1.609), second, df.format(second/1.609));


            second += 5;
        }
    }
}
