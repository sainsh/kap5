package three;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kilograms   " + "   pounds");
        DecimalFormat df = new DecimalFormat("#.#");
        for(int i = 1; i <200; i+=2 ){

            System.out.println(i + "        " + df.format(i*2.2));

        }
    }
}
