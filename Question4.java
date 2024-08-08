import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your birthdate (yyyy-mm-dd): ");
        String date = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate today = LocalDate.now();
        Period age = Period.between(birthDate,today);
        System.out.println("Your age is: " + age.getYears() + " Years, " + age.getMonths() + " months, " + age.getDays() + " Days " );



    }
}
