package EPOUI;
import java.util.Scanner;

public class Less2Home {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем имя пользователя
        System.out.print("Пожалуйста, введите ваше имя: ");
        String userName = scanner.nextLine();

        // Выводим приветствие с именем пользователя
        System.out.println("Привет, " + userName + "!");

        // Закрываем Scanner
        scanner.close();
    }
}
