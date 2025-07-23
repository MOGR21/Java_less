package EPOUI_classes;

class App {
    public static void main(String[] args) {

        // Создаем телевизор со случайными параметрами
        Televizor tv1 = Televizor.создатьСлучайныйТелевизор();
        tv1.информация();

        // Создаем телевизор с параметрами с клавиатуры
        Televizor tv2 = Televizor.создатьТелевизорСКлавиатуры();
        tv2.информация();
    }
}