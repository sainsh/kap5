package eight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name="";
        double score=0;
        Scanner in = new Scanner(System.in);

        System.out.print("How many students?");

        Student[] students = new Student[in.nextInt()];

        double highscore=0;
        Student highscorer = null;

        for(int i =0; i<students.length; i++){
            System.out.println("enter first name and score of student");
            name = in.next();

            score = in.nextDouble();

            students[i] = new Student(name, score);

        }
        for(int j =0; j<students.length; j++){

            if(highscore< students[j].getScore()){
                highscore = students[j].getScore();
                highscorer = students[j];
            }

        }

        System.out.println("the student with highest score is " + highscorer.getName() + " with a score of " + highscorer.getScore() );

    }
}
