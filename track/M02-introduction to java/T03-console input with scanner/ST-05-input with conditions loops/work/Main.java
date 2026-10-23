import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int days = scanner.nextInt();
int totalSolved = 0;
for (int i = 0; i < days; i++) {
int problemSolved = scanner.nextInt();
totalSolved += problemSolved;
}
String status =
if (totalSolved >= 20) {
status = "Strong progress";
} else if (totalSolved >= 10) {
status = "Keep improving";
} else {
status = "Needs more practice";
}
System.out.println("Total solved: + totalSolved);
System.out.println("Status: + status);

scanner.close();
}
}
