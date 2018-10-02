package fourteen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input 2 numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int d;
        if(n1<n2){
            d=n2;
        }
        else{
            d=n1;
        }
        while(d!=0){
            if(n1 % d == 0 && n2 % d == 0){
                System.out.println(d);
                break;
            }
            else{
                d--;
            }
        }
        if(d==0) {
          System.out.println("no common divider");
        }

    }

}
