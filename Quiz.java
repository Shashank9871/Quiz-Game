import java.util.Scanner;
public class Quiz {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String[] questions = {
            "What is the capital of Telangana?",
            "What is the national language of India?",
            "Which is the biggest planet in our solar system?"
        };
        String[][] options = {
            {"A. Rangareddy", "B. Hyderabad", "C. Warangal", "D. Adilabad"},
            {"A. Hindi", "B. Telugu", "C. Tamil", "D. kannada"},
            {"A. Jupitor", "B. Venus", "C. Mars", "D. Earth"}
        };
        char[] answers = {'B', 'A', 'A'};
        
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0);
            
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + answers[i]);
            }
            System.out.println();
        }
        System.out.println("Quiz completed!");
        System.out.println("Your score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
