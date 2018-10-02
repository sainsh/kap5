package eleven;

public class Main {
    public static void main(String[] args) {
        int count=0;
        String output = "";

        for(int i = 100; i<1001; i++){

            if(!((i % 5 == 0) && (i % 6 == 0))){
                if(i % 5 == 0){
                    output += i + " ";
                    count++;
                    if(count % 10 == 0){
                        output += "\n";
                    }
                }
                else if(i % 6 == 0){
                    output += i + " ";
                    count++;
                    if(count % 10 == 0){
                        output += "\n";
                    }
                }
            }

        }
        System.out.println(output);

    }
}
