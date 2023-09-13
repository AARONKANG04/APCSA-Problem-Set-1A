import java.util.Scanner;

public class MySolutions
{
    Scanner scanner = new Scanner(System.in);
    
    public void CelsiusToFahrenheit() {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius*1.8 + 32;
        System.out.println("Temperature Celsius: " + celsius + " | Temperature in Farenheit: " + fahrenheit);
    }
    
    public void ElapsedTime() {
        System.out.print("Current Time (Format H:M:S)?: ");
        String input = scanner.next();
        String[] strings = input.split("[:]", 0);
        int[] currentTime = new int[3];
        for (int i = 0; i < currentTime.length; i++) {
            currentTime[i] = Integer.parseInt(strings[i]);
        }
        int currentSecond = currentTime[0] * 3600 + currentTime[1] * 60 + currentTime[2];
        int total = 24*3600;
        double percentage = ((double)currentSecond / (double)total)*100;
        System.out.println("It has been " + currentSecond + " seconds since the day began.");
        System.out.println("There are " + (total - currentSecond) + " seconds left in the day.");
        System.out.println("The day is " + percentage + "% done.");
    }
    
    public void SecondToHMS() {
        System.out.print("What is the current time in seconds?: ");
        int currentSecond = scanner.nextInt();
        int hour = currentSecond / 3600;
        int remainingSeconds = currentSecond%3600;
        int minute = remainingSeconds / 60;
        int second = remainingSeconds % 60;
        System.out.println(hour + " hours, " + minute + " minutes, and " + second + " seconds.");
    }

}
