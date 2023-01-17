import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int quiz, firstExam, secondExam;
        double average;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your quiz score: ");
        quiz = input.nextInt();
        System.out.println("Enter your first exam score");
        firstExam = input.nextInt();
        System.out.println("Enter your second exam score");
        secondExam = input.nextInt();
        //If you have different percentage calculations for the exams, you can change them.
        average= (quiz*0.2) + (firstExam*0.3) + (secondExam*0.5);
        System.out.println("Your average score is : " + average);
        String score = (average >=50) ? "You Passed" : "You Failed";
        System.out.println(score);

        if (average <=29){
            System.out.println("Your Letter Grade DD");
        }
        else if (average <=39){
            System.out.println("Your Letter Grade FD");
        }
        else if (average <=49){
            System.out.println("Your Letter Grade DD");
        }
        else if (average <=59){
            System.out.println("Your Letter Grade DC");
        }
        else if (average <=69){
            System.out.println("Your Letter Grade CC");
        }
        else if (average <=74){
            System.out.println("Your Letter Grade CB");
        }
        else if (average <=79){
            System.out.println("Your Letter Grade BB");
        }
        else if (average <=89){
            System.out.println("Your Letter Grade BA");
        }
        else if (average >=90){
            System.out.println("Your Letter Grade AA");
        }
    }
}
