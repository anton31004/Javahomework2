import java.util.Scanner;
import java.util.regex.*;

public class task1 {
public static void main(String[] args){
    int day;
    int month;
    int year;
    int flag = 0;
    Scanner scan = new Scanner(System.in);
    String pattern = "\\d{2}\\/\\d{2}\\/\\d{4}";
    while (flag!=1) {
        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        String date = scan.next();
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(date);
        if (m.matches() == true) {
            day = date.charAt(0) - '0';
            day = day * 10;
            int num = date.charAt(1) - '0';
            day = day + num;
            month = date.charAt(3) - '0';
            month = month * 10;
            num = date.charAt(4) - '0';
            month = month + num;
            year = date.charAt(6) - '0';
            year = year * 1000;
            num = date.charAt(7) - '0';
            year = year + num * 100;
            num = date.charAt(8) - '0';
            year = year + num * 10;
            num = date.charAt(9) - '0';
            year = year + num;
            if (year < 1900 || year > 9999) {
                System.out.print("Введенное выражение не является датой");
                flag+=1;
            } else if (day < 1 || day > 31) {
                System.out.print("Введенное выражение не является датой");
                flag+=1;

            } else if (month < 1 || month > 12) {
                System.out.print("Введенное выражение не является датой");
                flag+=1;
            } else if (month == 2 && day > 29) {
                System.out.print("Введенное выражение не является датой");
                flag+=1;
            } else {
                System.out.print("Введенное выражение является датой");
                flag+=1;
            }

        } else {
            System.out.print("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy\n");
        }
    }


}
}
