package controlflow;

/**
 * Demonstrates switch-case statements.
 * Used as an alternative to long if-else-if ladders.
 */
public class SwitchDemo {
    public static void main(String[] args) {
        // Switch with int
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        // Switch with String
        String month = "March";
        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println(month + " is in Q1");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println(month + " is in Q2");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println(month + " is in Q3");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println(month + " is in Q4");
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
