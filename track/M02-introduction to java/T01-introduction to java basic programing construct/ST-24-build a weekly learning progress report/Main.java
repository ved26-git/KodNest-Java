public class Main{
public static void main(String[] args) {

int completedtopics = 17;
int totaltopics = 20;
int dailylearningHours = 3;
int learningdays = 5;

int remainingtopics = totaltopics completedtopics;
int weeklylearningHours = dailylearningHours learningdays;
double progressPercentage = (double) completedtopics 100/ totaltopics;


System.out.println("Completed Topics: "+completedtopics);
System.out.println("Remaining Topics: "+remainingtopics);
System.out.println("Weekly Learning Hours: "+weeklylearningHours);
System.out.println("Progress Percentage: "+progressPercentage);



    }

}