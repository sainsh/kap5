package seven;



public class Main {

    public static void main(String[] args) {
        int rate = 5;
        double tuition10 = 10000.0;
        double cost;

        for(int i=0; i<10; i++){



            tuition10 += tuition10/100*rate;

        }
        System.out.println("Tuition after 10 years: " + tuition10);
        cost = tuition10;
        for (int j=0; j<4; j++){


            cost += tuition10 + tuition10/100*rate;

        }


        System.out.println("Total cost for 4 years after 10 years: " + cost );

    }

}
