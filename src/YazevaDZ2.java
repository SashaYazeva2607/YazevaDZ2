import java.util.NoSuchElementException;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class YazevaDZ2 {



    public static void main(String[] args) {
        // 1. Функция для нахождения максимума
        //  System.out.println(MaxNum(4, 8));
        // 2. Калькулятор деления
        // System.out.println(DivNumber(3.0, 2));
        // 3. Конвертер строк в числа
        // System.out.println(StrInt("l"));
        // 4. Проверка возраста
        // System.out.println(Age(190));
        // 5. Нахождение корня + // 18. квадратный корень
        // System.out.println(Sqrt(-852));
        // 6. Факториал
        // System.out.println(Factorial(-741));
        // 7. Проверка массива на нули
        //int[] num = {1, 0, 14, 18};
        //System.out.println(Arr(num));
        // 8. Калькулятор возведения в степень
        //  System.out.println(Exp(4, -2));
        // 9. Обрезка строки
       // System.out.println(CutStr("12345678", 3));
        // 10. Поиск элемента в массиве
        //int[] num= {1, 111, 2, 222};
        // System.out.println(Element(num, 6));
        // 11. Конвертация в двоичную систему
        // System.out.println(convert(-23));
        // 12. Проверка делимости
        // System.out.println(CheckDiv(3.0, 0));
        // 13. Чтение элемента списка
        //List<Integer> Numbers = List.of(1, 2, 3);
        //System.out.println(getIndex(Numbers, 2));
        // 14. Парольная проверка
        //try {
        //     Password("12345");
        // } catch (WeakPasswordException e) {
        //    System.out.println(e.getMessage()); }
        // 15. Проверка даты
        // System.out.println(Date("26.07.2005"));
        // 16. Конкатенация строк
        //  System.out.println(concatenationStr("dvk", null));
        // 17. Остаток от деления
        //System.out.println(Del(52, 0));
        // 19. Конвертер температуры
        //  System.out.println(Temp(12));
        // 20. Проверка строки на пустоту
        // System.out.println(StringVer(null, "2"));

    }


    public static int MaxNum(int x, int y) { // 1. Функция для нахождения максимума
        if (x == y) {
            throw new IllegalArgumentException("Числа равны");
        }
        return Math.max(x, y);
    }

    public static double DivNumber(double num, double den) {  // 2. Калькулятор деления
        if (den == 0) throw new ArithmeticException("Нельзя делить на ноль");
        return num / den;
    }

    public static int StrInt(String string) {  // 3. Конвертер строк в числа
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Нельзя конвертировать строку в число");
        }
    }

    public static int Age(int age) {   // 4. Проверка возраста
        if (age > 150 || age < 0) throw new IllegalArgumentException("Этого возраста не бывает");
        return age;
    }

    public static double Sqrt(int num) {     // 5. Нахождение корня + // 18. квадратный корень
        if (num< 0) throw new IllegalArgumentException("Число отрицательное");
        return Math.sqrt(num);
    }

    public static int Factorial(int num) {     // 6. Факториал
        if (num < 0) throw new IllegalArgumentException("Число отрицательное");
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }

    public static boolean Arr(int[] arr) {    // 7. Проверка массива на нули
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                throw new IllegalArgumentException("В массиве есть нули");
            }
        }
        return true;
    }

    public static double Exp(double num, double exp) {     // 8. Калькулятор возведения в степень
        if (exp< 0) throw new IllegalArgumentException("Степень не может быть отрицательной");
        return Math.pow(num, exp);
    }

    public static String CutStr (String str, int length) {     // 9. Обрезка строки
        if (length > str.length()) {
            throw new IllegalArgumentException("Число символов больше длины строки");
        }
        return str.substring(0, length);
    }

    public static int Element(int[] arr, int element) {     // 10. Поиск элемента в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        throw new NoSuchElementException("Число не найдено в массиве");
    }

    public static String convert(int num) {     // 11. Конвертация в двоичную систему
        if (num < 0)
            throw new IllegalArgumentException("Отрицательные числа нельзя конвертировать в двоичную строку");
        return Integer.toBinaryString(num);
    }


    public static boolean CheckDiv(int x, int y) {    // 12. Проверка делимости
        if (y == 0) {
            throw new ArithmeticException("Нельзя делить на ноль");
        }
        return (x%y) == 0;
    }

    public static Integer getIndex(List<Integer> list, int index) {    // 13. Чтение элемента списка
        if (index < 0 || index > + list.size())
            throw new IndexOutOfBoundsException("Индекс выходит за границы массива");
        return list.get(index);
    }

    public static class PasswordException extends Exception {
        public PasswordException(String message) {
            super(message);
        }
    }
    public static void Password(String password) throws PasswordException {    // 14. Парольная проверка
        if (password.length() < 8) {
            throw new PasswordException("Пароль содержит меньше 8 символов");
        }
        System.out.println("Пароль длинный");
    }


    public static boolean Date(String Date) {    // 15. Проверка даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate date = LocalDate.parse(Date, formatter);
            return true;
        } catch (DateTimeParseException ex) {
            throw ex;
        }
    }

    public static String concatenationStr(String str1, String str2) {    // 16. Конкатенация строк
        if (str1 == null || str2 == null) throw new NullPointerException("Конкатенацию строк нельзя произвести");
        return str1 + str2;
    }

    public static double Del(double num, double den) {    // 17. Остаток от деления
        if (den == 0) throw new ArithmeticException("Делить на ноль нельзя");
        return num % den;
    }

    public static double Temp(double temp) {    // 19. Конвертер температуры
        if (temp < -273.15) throw new IllegalArgumentException("Температура меньше нуля");
        return temp * 9 / 5 + 32;
    }

    public static String StringVer(String str1, String str2) {    // 20. Проверка строки на пустоту
        if (str1 == null || str2 == null || str1 == "" || str2 == "")
            throw new NullPointerException("Конкатенацию строк нельзя произвести");
        return str1 + str2;
    }

}

