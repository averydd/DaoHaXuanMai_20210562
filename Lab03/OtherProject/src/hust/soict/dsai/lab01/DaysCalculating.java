import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysCalculating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = -1;
        String monthStr = "";
        int month = -1;
        boolean valid = false;
        
        while (!valid) {
            System.out.print("Enter a year (non-negative): ");
            String yearStr = input.nextLine();
            try {
                year = Integer.parseInt(yearStr);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for year. Please enter a non-negative integer.");
                continue;
            }
            if (year < 0) {
                System.out.println("Invalid input for year. Please enter a non-negative integer.");
                continue;
            }
            
            System.out.print("Enter a month (full name, abbreviation, 3 letters, or number): ");
            monthStr = input.nextLine().toLowerCase();
            switch (monthStr) {
                case "january":
                case "jan":
                case "1":
                    month = 1;
                    break;
                case "february":
                case "feb":
                case "2":
                    month = 2;
                    break;
                case "march":
                case "mar":
                case "3":
                    month = 3;
                    break;
                case "april":
                case "apr":
                case "4":
                    month = 4;
                    break;
                case "may":
                case "5":
                    month = 5;
                    break;
                case "june":
                case "jun":
                case "6":
                    month = 6;
                    break;
                case "july":
                case "jul":
                case "7":
                    month = 7;
                    break;
                case "august":
                case "aug":
                case "8":
                    month = 8;
                    break;
                case "september":
                case "sep":
                case "9":
                    month = 9;
                    break;
                case "october":
                case "oct":
                case "10":
                    month = 10;
                    break;
                case "november":
                case "nov":
                case "11":
                    month = 11;
                    break;
                case "december":
                case "dec":
                case "12":
                    month = 12;
                    break;
                default:
                    System.out.println("Invalid input for month. Please enter a valid month.");
                    continue;
            }
            
            valid = true;
        }
        
        LocalDate date = LocalDate.of(year, month, 1);
        int daysInMonth = date.lengthOfMonth();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        String monthYear = date.format(formatter);
        System.out.println("There are " + daysInMonth + " days in " + monthYear + ".");
        
        input.close();
    }
}
