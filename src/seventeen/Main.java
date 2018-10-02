package seventeen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter # of rows: ");
        int rows = in.nextInt();
        int currentRow=1;
        String output = "";

        for(int i = 1; i < rows+1; i++){

            for(int j = 0; j<(rows-i)*2; j++){
                output += " ";
            }
            for(int k = i; k > 0 ; k--){
                output += k + " ";
            }
            for(int m = 2; m < i+1 ; m++){
                output += m + " ";
            }
            for(int j = 0; j<(rows-i)*2; j++){
                output += " ";
            }

            currentRow++;
            System.out.println(output);
            output = "";
        }

    }

}
