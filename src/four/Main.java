package four;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        System.out.println("Miles   " + "   Kilometers");
        DecimalFormat df = new DecimalFormat("#.###");
        for(int i = 1; i <11; i++ ){

            System.out.println(i + "           " + df.format(i*1.609));

        }

    }
}
