import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String firstName = "Asha";
int solvedProblems = 25;
double assessmentPercentage = 82.5;
System.out.println("Learner: + firstName);
firstName = scanner.next();
System.out.println("Problems solved: + solvedProblems);
solvedProblems = scanner.nextInt();
System.out.println("Assessment: + assessmentPercentage);
assessmentPercentage = scanner.nextDouble();
scanner.close();
}
}