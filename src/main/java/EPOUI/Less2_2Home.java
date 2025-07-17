package EPOUI;
import java.util.Random;

public class Less2_2Home {
    public static void main(String[] args){
        Random random = new Random();

        int vasya = random.nextInt(3) + 1; // 1=камень, 2=ножницы, 3=бумага
        int petya = random.nextInt(3) + 1; // 1=камень, 2=ножницы, 3=бумага

        switch (vasya){
            case 1:
                System.out.println("У Васи выпал: Камень");
                break;
            case 2:
                System.out.println("У Васи выпали: Ножницы");
                break;
            case 3:
                System.out.println("У Васи выпала: Бумага");
                break;
        }
        switch (petya){
            case 1:
                System.out.println("У Пети выпал: Камень");
                break;
            case 2:
                System.out.println("У Пети выпали: Ножницы");
                break;
            case 3:
                System.out.println("У Пети выпала: Бумага");
                break;
        }

        if (vasya == petya) {
            System.out.println("Ничья, победила дружба!!!");
        } else if (
                (vasya == 1 && petya == 2) || // камень > ножницы
                (vasya == 2 && petya == 3) || // ножницы > бумагу
                (vasya == 3 && petya == 1)    // бумага > камень
        ) {
            System.out.println("Победил Вася!!!");
        } else {
            System.out.println("Победил Петя!!!");
        }
    }
}
