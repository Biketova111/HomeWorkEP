//Реализуйте метод, который запрашивает у пользователя ввод дробного числа
//(типа float), и возвращает введенное значение. Ввод текста вместо числа не должно
//приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public record Task1() {
    public static void main(String[] args) {
        float number = 0;
        Scanner in = new Scanner(System.in );
        System.out.print("Введите число: ");
        String str = in.next();
        checkNumber(str, number);

}

    public static boolean isNumber (String str) {
        try {
            Float.parseFloat(str);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public static void checkNumber (String str, float number) {
        while (!isNumber(str)){
            System.out.print("Вы ввели не число!!!");
            Scanner in = new Scanner(System.in );
            System.out.print("Введите число: ");
            str = in.next();
        }
        number = Float.parseFloat(str);
        System.out.println("Вы ввели число: " +number);
       }

}



