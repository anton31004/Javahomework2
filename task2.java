import java.util.Scanner;
import java.util.regex.*;

public class task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String pattern = "(?=.*[0-9])(?=.*[-_])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_-]{8,}";
        System.out.print("Введите пароль: ");
        int flag=0;
        while (flag!=1){
            String password = scan.next();
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(password);
            if (m.matches()==true){
                System.out.print("Пароль надежен");
                flag+=1;
            }else {
                System.out.print("Пароль ненадежен. Повторите ввод ");
            }
        }

    }
}