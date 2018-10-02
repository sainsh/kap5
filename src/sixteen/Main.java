package sixteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a number");

        int n = in.nextInt();
        for(int i = 2; i<n; i++){
            while(n % i == 0){
                System.out.println(i + " ");
                n = n/i;
            }

        }
        if(n > 2){
            System.out.println(n);
        }
    }
}
