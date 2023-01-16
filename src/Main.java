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

    }
}