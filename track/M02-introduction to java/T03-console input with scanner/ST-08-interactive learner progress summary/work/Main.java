import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String fullName = scanner.nextLine();
int days = scanner.nextInt();
int totalsolved = 0;
for (int i = 0; i < days; i++) {
int solved = scanner.nextInt();
totalsolved += solved;
}
double average = (double) totalsolved / days;
String status = average >= 5.0 ? "Consistent": "Needs consistency";
System.out.println("Learner: + fullName);
System.out.println("Total solved: " + totalsolved);
System.out.println("Daily average: + average);
System.out.println("Status: "+status);
scanner.close();
}
}