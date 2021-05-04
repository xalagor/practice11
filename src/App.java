public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----- Практическая работа №11");
        System.out.println("----- Вариант 12");
        System.out.println("----- Самостоятельное задание");
        System.out.println("----- Контрольный пример");
        System.out.println(
                "Программа получает N параметров вызова (аргументы командной стро-ки). Эти параметры –элементы вектора. Строится массив типа double, а на базе этого массива –объект класса DoubleVector. Далее программа выводит в кон-соль значения элементов вектора в виде: Вектор: 2.3  5.0  7.3.  ");
        System.out.println("");
        String[] program1args = new String[3];
        program1args[0] = "2.3";
        program1args[1] = "5.0";
        program1args[2] = "7.3";
        Program1.main(program1args);
    }
}
