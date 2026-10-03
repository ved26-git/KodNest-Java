public class Main {
    public static void main(String[] args) {

        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        int java = 68;
        int sql = 84;
        int aptitude = 69;
        int communication = 91;
        int web = 88;



double simpleinterest = principal rate time/ 100.0;
double totalAmount = principal + simpleinterest;
double bmi = weight / (height * height);
int totalmarks = java+sql+aptitude+communication+web;
double percentage = totalmarks * 100.0/ 500;



System.out.println("Simple Interest: "+simpleinterest);
System.out.println("Total Amount: "+totalAmount);
System.out.println("BMI: "+bmi);
System.out.println("Total Marks: "+totalmarks);
System.out.println("Percentage: "+percentage);

   }

}