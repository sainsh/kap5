package one;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int count = 0;
        int inputNumber= 0;
        int pos = 0;
        int neg = 0;
        double sum = 0;
        double avg= 0.0;

        System.out.print("Enter an integer, the input ends if it is 0: ");

        do{

            inputNumber = in.nextInt();
            sum += inputNumber;
            if(inputNumber > 0){
                pos++;
                count++;
            }else if(inputNumber < 0){
                neg++;
                count++;
            }



        }while(inputNumber != 0);

        if(sum == 0){
            System.out.println("No numbers entered except 0");
        }
        else{

            avg = (double)sum/count;

            System.out.println("The number of positives is: " + pos );
            System.out.println("The number of negatives is: " + neg );
            System.out.println("The total is: " + sum);
            System.out.println("the average is: " + avg);
        }

    }
}
