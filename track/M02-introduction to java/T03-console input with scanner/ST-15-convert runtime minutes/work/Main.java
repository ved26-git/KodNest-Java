import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int totalminutes = scanner.nextInt();
int hours = totalminutes / 60;
int minutes = totalminutes % 60;

System.out.println("Hours: "  + hours);
System.out.println("Minutes: " + minutes);

// Calculate hours and remaining minutes
// Print both results

scanner.close();
}
}