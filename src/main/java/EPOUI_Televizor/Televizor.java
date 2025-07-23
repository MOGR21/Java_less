package EPOUI_Televizor;

import java.util.Scanner;
import java.util.Random;

public class Televizor {
    private String марка;
    private String цвет;
    private int диагональ;

    public Televizor(String марка, String цвет, int диагональ) {
        this.марка = марка;
        this.цвет = цвет;
        this.диагональ = диагональ;
    }

    // Геттеры и сеттеры
    public String getМарка() {
        return марка;
    }

    public void setМарка(String марка) {
        this.марка = марка;
    }

    public String getЦвет() {
        return цвет;
    }

    public void setЦвет(String цвет) {
        this.цвет = цвет;
    }

    public int getДиагональ() {
        return диагональ;
    }

    public void setДиагональ(int диагональ) {
        this.диагональ = диагональ;
    }

    // Метод возвращающий информацию о телевизоре
    public void информация() {
        System.out.println("Марка: " + марка);
        System.out.println("Цвет: " + цвет);
        System.out.println("Диагональ: " + диагональ + "\"");
    }

    // Метод для создания телевизора со случайными параметрами
    public static Televizor создатьСлучайныйТелевизор() {
        Random random = new Random();
        String[] марки = {"Samsung", "LG", "Sony", "Philips", "Panasonic"};
        String[] цвета = {"Черный", "Серый", "Белый", "Серебристый"};

        String случайнаяМарка = марки[random.nextInt(марки.length)];
        String случайныйЦвет = цвета[random.nextInt(цвета.length)];
        int случайнаяДиагональ = 20 + random.nextInt(61); // от 20 до 80 дюймов

        return new Televizor(случайнаяМарка, случайныйЦвет, случайнаяДиагональ);
    }

    // Метод для создания телевизора с параметрами с клавиатуры
    public static Televizor создатьТелевизорСКлавиатуры() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите марку телевизора: ");
        String марка = scanner.nextLine();

        System.out.print("Введите цвет телевизора: ");
        String цвет = scanner.nextLine();

        System.out.print("Введите диагональ телевизора (в дюймах): ");
        int диагональ = scanner.nextInt();

        return new Televizor(марка, цвет, диагональ);
    }
}