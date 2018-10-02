package eightteen;


import java.util.Scanner;

public class Main {

   static String output ="";

    public static void main(String[] args) {

        System.out.println("choose A, B, C, or D");
        Scanner in = new Scanner(System.in);

        String choice = in.next();

        switch(choice){
            case "a": patternA(); break;
            case "b": patternB(); break;
            case "c": patternC(); break;
            case "d": patternD(); break;
            default:
                System.out.println("wrong input");
        }

    }

    static void patternA(){

        for(int i = 0; i<7; i++){
            for(int j = 1; j<i+1; j++){
                output += j + " ";
            }

            System.out.println(output);
            output = "";
        }

    }
    static void patternB(){

        for(int i = 6; i>0; i--){
            for(int j = 1; j<i+1; j++){
                output += j + " ";
            }

            System.out.println(output);
            output = "";
        }


    }
    static void patternC(){
        for(int i = 0; i<6; i++){
            for(int j=i*2; j<10;j++){
                output += " ";
            }
            for(int m = 0; m<i+1; m++){

                output += m+1 + " ";
            }
            System.out.println(output);
            output = "";
        }

    }
    static void patternD(){

        for(int i = 0; i<6; i++){
            for(int m = 0; m<i*2; m++){
                output += " ";
            }
            for(int j = i+1; j<7; j++){
                output += j + " ";
            }
            System.out.println(output);
            output = "";
        }


    }
}
