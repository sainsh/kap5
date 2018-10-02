package fifteen;

public class Main {

    public static void main(String[] args) {
        String output="";
        char outputChar;
        int count =0;
        do{

            outputChar = (char)count;

            output += outputChar + " ";
            count++;
            if(count % 10 == 0){
                output += "\n";
            }
        }
        while(outputChar != '~');

        System.out.println(output);
    }
}
