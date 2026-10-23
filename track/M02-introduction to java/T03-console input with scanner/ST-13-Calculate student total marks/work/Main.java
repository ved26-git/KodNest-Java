import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String studentname = scanner.next();
int javamarks = scanner.nextInt();
int sqlmarks = scanner.nextInt();
int total = javamarks + sqlmarks;
System.out.println("Student: + studentname);
System.out.println("Total: + total);
scanner.close();
}
}