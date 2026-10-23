import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Read the product name and price
String name = scanner.nextLine();
double price = scanner.nextDouble();
// Print both values
System.out.println("Product: "+name);
System.out.println("Price: "+price);
scanner.close();
}
}