import java.util.Scanner;
public class QuizApplication 
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String[] questions = {
            "1. What is the capital of France?\n(a) Berlin\n(b) Madrid\n(c) Paris\n(d) Rome",
            "2. What is 5 + 3?\n(a) 5\n(b) 8\n(c) 10\n(d) 15",
            "3. Who wrote 'To Kill a Mockingbird'?\n(a) Harper Lee\n(b) Mark Twain\n(c) J.K. Rowling\n(d) Jane Austen"
};
char[] answers = {'c', 'b', 'a'}; // Correct answers
int score = 0;
System.out.println("Welcome to the Quiz Application!");
System.out.println("Please answer the following questions:");
for (int i = 0; i < questions.length; i++) {
System.out.println("\n" + questions[i]);
System.out.print("Enter your answer (a/b/c/d): ");
char userAnswer = scanner.next().toLowerCase().charAt(0);
if (userAnswer == answers[i]) {
System.out.println("Correct!");
score++;
} else 
{
System.out.println("Wrong! The correct answer was: " + answers[i]);
}
}
System.out.println("\n--- Quiz Over ---");
System.out.println("Your final score is: " + score + "/" + questions.length);
scanner.close();
}
}
