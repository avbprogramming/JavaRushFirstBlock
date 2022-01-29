import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
// https://javarush.ru/groups/posts/massivy-java
// https://javarush.ru/quests/lectures/questsyntax.level07.lecture03
// https://javarush.ru/groups/posts/1876-operator-while Оператор while
// https://javarush.ru/groups/posts/for-v-java Как используют цикл for в Java
// https://javarush.ru/groups/posts/cikly-java Циклы в Java
// https://javarush.ru/groups/posts/1997-algoritmih-sortirovki-v-teorii-i-na-praktike  Алгоритмы сортировки в теории и на практике
// https://javarush.ru/groups/posts/634-realizacija-puzihrjhkovoy-sortirovki-na-java Реализация пузырьковой сортировки на Java
// https://skillbox.ru/media/base/massivy_v_java_sozdayem_zapolnyaem_ispolzuem/
// https://javarush.ru/help/72631
// https://www.educba.com/2d-arrays-in-java/


public class JavaSyntaxMassive {

}
//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

/*
Восьмеричный конвертер
Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве
входящего параметра, из десятичной системы счисления в восьмеричную. А публичный статический
метод toDecimal(int) наоборот — из восьмеричной в десятичную.
Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
i равно 0
while(десятичное число не равно 0) {
восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
десятичное число = десятичное число / 8
i увеличиваем на 1
}

Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
i равно 0
while(восьмеричное число не равно 0) {
десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
восьмеричное число = восьмеричное число / 10
i увеличиваем на 1
}

Метод main() не принимает участие в тестировании.

Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).

        public static void main(String[] args) {
            int decimalNumber = 21;
            System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
            int octalNumber = 25;
            System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
        }

        public static int toOctal(int decimalNumber) {

            if (decimalNumber <= 0){
                return 0;
            }
            int i = 0;
            int octalNum = 0;
            while (decimalNumber != 0){
                octalNum = (int) (octalNum + (decimalNumber%8)*Math.pow(10,i));
                decimalNumber = decimalNumber / 8;
                i++;
            }
            return octalNum;
        }


        public static int toDecimal(int octalNumber) {
            if (octalNumber <= 0){
                return 0;
            }
            int decimalNum = 0;
            int i = 0;
            while (octalNumber != 0){
                decimalNum = (int) (decimalNum + (octalNumber%10)*Math.pow(8,i));
                octalNumber = octalNumber / 10;
                i++;
            }
            return decimalNum;
        }
    }
}

 */
//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

/*
 Двоичный конвертер
Публичный статический метод toBinary(int) должен переводить целое число,
полученное в качестве входящего параметра, из десятичной системы счисления в двоичную и возвращать его
строковое представление. А публичный статический метод toDecimal(String) наоборот — из строкового представления
двоичного числа в десятичное число.
Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0,
метод toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода десятичного числа в представление двоичного числа следующий:
while(десятичное число не равно 0) {
двоичное представление = остаток от деления десятичного числа на 2 + двоичное представление
десятичное число = десятичное число / 2
}

Один из алгоритмов перевода представления двоичного числа в десятичное число следующий:
for (int i = 0; i < длины двоичного представления; i++) {
десятичное число = десятичное число + число из двоичного представления * на 2 в степени i
}

Изначально берется крайнее правое число из двоичного представления. С каждой итерацией цикла берется следующее число ближе к началу двоичного представления.

Подсказка: чтобы возвести число к степени можно использовать метод Math.pow(число, степень).
Метод main() не принимает участие в тестировании.


Requirements:
1. Нужно, чтобы метод toBinary(int) был реализован согласно условию.
2. Нужно, чтобы метод toDecimal(String) был реализован согласно условию.
3. Методы Integer.toBinaryString(int) и Long.toBinaryString(int) использовать нельзя.
4. Методы Integer.parseInt(String, int) и Long.parseLong(String, int) использовать нельзя.
5. Методы Integer.toString(int, int) и Long.toString(long, int) использовать нельзя.
6. Объект типа BigInteger использовать нельзя.
7. Объект типа BigDecimal использовать нельзя.


       public static void main(String[] args) {

        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) {
            String a = "";
            return a;
        }
        int biNum;
        String tempBi = "";
        while (decimalNumber != 0) {
            biNum = (decimalNumber % 2);
            tempBi = biNum + tempBi;
            decimalNumber = decimalNumber / 2;
        }
        return tempBi;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return 0;
        }
        int decimalNum = 0;

        char[] binaryNumberChar = binaryNumber.toCharArray();
        int dlinaChar = binaryNumberChar.length;
        for (int i = 0; i < dlinaChar - 1; i++) {
            if (binaryNumberChar[i] == '1') {
                decimalNum = (int) (decimalNum + Math.pow(2, (dlinaChar - i - 1)));

            } else {
                decimalNum = (int) (decimalNum + Math.pow(0, i));
            }
        }
        if (binaryNumberChar[binaryNumberChar.length - 1] == '1') {
            decimalNum += 1;
        }
        return decimalNum;
    }
}

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
Шестнадцатеричный конвертер
Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра,
из десятичной системы счисления в шестнадцатеричную и возвращать его строковое представление.
А публичный статический метод toDecimal(String) наоборот — из строкового представления шестнадцатеричного числа в десятичное число.


Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или
равен 0, метод toHex(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.

Твоя задача реализовать эти методы.

Также в классе Solution есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной системе.

Один из алгоритмов перевода десятичного числа в шестнадцатеричное следующий:
while(десятичное число не равно 0) {
представление шестнадцатеричного числа = символ из строки HEX с индексом, равным остатку от деления десятичного числа на 16
+ представление шестнадцатеричного числа
десятичное число = десятичное число / 16
}

Один из алгоритмов перевода шестнадцатеричного числа в десятичное следующий:
for (int i = 0; i < длина входящей строки; i++) {
десятичное число = 16 * десятичное число + индекс символа из строки HEX, равного символу из входящей строки с индексом i
}

Метод main() не принимает участие в тестировании.

    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        String hexNum = "";
        if (decimalNumber <= 0) {
            return hexNum;
        } else {
            while (decimalNumber != 0) {
                //    System.out.println(HEX.charAt(decimalNumber % 16));
                hexNum = (HEX.charAt(decimalNumber % 16) + hexNum);
                decimalNumber = decimalNumber / 16;
            }

        }
        return hexNum;
    }

    public static int toDecimal(String hexNumber) {
        int toDecimalNum = 0;
        if (hexNumber == null || hexNumber.equals("")) {
            return 0;
        } else {
            for (int i = 0; i < hexNumber.length(); i++) {
                char j = hexNumber.charAt(i);
                int n = HEX.indexOf(j);
                toDecimalNum = (16 * toDecimalNum + (n));
            }
        }
        return toDecimalNum;
    }
}

}
//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
Двоично-шестнадцатеричный конвертер
Публичный статический метод toHex(String) должен переводить строковое представление двоичного числа,
полученное в качестве входящего параметра, из двоичной системы счисления в шестнадцатеричную и возвращать
его строковое представление. А публичный статический метод toBinary(String) наоборот — из строкового
представления шестнадцатеричного числа в строковое представление двоичного числа.

Методы работают только с не пустыми строками.
Если входящий параметр — пустая строка или null, то оба метода возвращают пустую строку.
Если входящий параметр метода toHex(String) содержит любой символ, кроме 0 или 1, то метод возвращает пустую строку.
Если входящий параметр метода toBinary(String) содержит любой символ, кроме цифр от 0 до 9 или латинскую букву от a до f (в нижнем регистре), то метод возвращает пустую строку.
Твоя задача — реализовать эти методы.

Один из алгоритмов перевода строкового представления двоичного числа в строковое представление шестнадцатеричного числа следующий:
    Проверяем длину строки, полученной входящим параметром. Она должна быть кратна 4.
    Если это не так, то добавляем нужное количество 0 в начало строки.
    Берем каждые четыре символа (бита) и проверяем, какому символу шестнадцатеричной кодировки он соответствует.
Например:
    двоичное представление — "100111010000", где "1001" — "9", "1101" — "d", "0000" — "0",
    шестнадцатеричное представление — "9d0".

Один из алгоритмов перевода строкового представления шестнадцатеричного числа в строковое представление двоичного числа следующий:
Берем каждый символ и проверяем какому двоичному числу (4 бита) он соответствует.
Например:
    шестнадцатеричное представление — "9d0", где "9" — "1001", "d" — "1101", "0" — "0000",
    двоичное представление — "100111010000".
Метод main() не принимает участие в тестировании.


   public static void main(String[] args) {
        String binaryNumber = "100111010000";
        // String binaryNumber = "10010";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        //String hexNumber = "9z0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String emptySting = "";
        // проверка входной строки
        if (binaryNumber == null) {
            return emptySting;
        }
        // перевод входной строки в массив симоволов
        char[] numInChar = binaryNumber.toCharArray();
        int block = 4;
        // проверка входной строки на содердание только 0 и 1
        for (int i = 0; i < numInChar.length; i++) {
            char num = numInChar[i];
            if (num != '0' && num != '1') {
                return emptySting;
            }
        }
        // создание массива для доведния общей длины массивы кратности 4, согласно рекомендации
        char[] numInCharAdd = new char[numInChar.length];
        // Проверяю длину строки, полученной входящим параметром. Она должна быть кратна 4.
        int checkLengthOfString = (numInChar.length % block);
        // если это правда, то перезаписываем массив способом ниже
        if (checkLengthOfString == 0) {
            //  checkLengthOfString = (numInChar.length / block);
            System.arraycopy(numInChar, 0, numInCharAdd, 0, numInChar.length);
        }
        // если длина массива не кратна 4, то копируем входящий массив во вновь созданный предварительно доведя длину массива до кратности 4;
        if ((numInChar.length % block) != 0) {
            checkLengthOfString = (block - numInChar.length % block);
            numInCharAdd = new char[numInChar.length + checkLengthOfString];
            for (int j = 0; j < checkLengthOfString; j++) {
                numInCharAdd[j] = '0';
            }
            System.arraycopy(numInChar, 0, numInCharAdd, checkLengthOfString, numInChar.length);
        }
        //  System.arraycopy(numInChar, 0, numInCharAdd, checkLengthOfString, numInChar.length);
        // System.arraycopy(откуда \ с какой позиции \ куда \ начиная с какой позиции \ кол-во элементов);

        // выясняю необходимое кол-во блоков
        int blocksOfHex = (numInCharAdd.length / block);
        int count = 0;
        // создаю двумерный массив для записи блоков
        char[][] numHexChar = new char[blocksOfHex][block];
        if (count < blocksOfHex) {
            for (int i = 0; i < blocksOfHex; i++) {
                for (int j = 0; j < block; j++) {
                    //2d [кол-во блоков] [значения в блоках] = одномерный массив [значение в 1d + блок(4)*литерацию]
                    numHexChar[count][j] = numInCharAdd[j + count * block];
                }
                count++;
            }
        }
        //перевожу из 2d в 1d
        String answer = "";
        String[] temp = new String[blocksOfHex];
        for (int i = 0; i < blocksOfHex; i++) {
            temp[i] = String.valueOf(numHexChar[i]);
        }

        // собираю строку
        for (int i = 0; i < temp.length; i++) {
            if (temp[0].equals("0000")) {
                answer = answer + "";
            }
            if (temp[i].equals("0000")) {
                answer = (answer + "0");
            } else if (temp[i].equals("0001")) {
                answer = answer + "1";
            } else if (temp[i].equals("0010")) {
                answer = answer + "2";
            } else if (temp[i].equals("0011")) {
                answer = answer + "3";
            } else if (temp[i].equals("0100")) {
                answer = answer + "4";
            } else if (temp[i].equals("0101")) {
                answer = answer + "5";
            } else if (temp[i].equals("0110")) {
                answer = answer + "6";
            } else if (temp[i].equals("0111")) {
                answer = answer + "7";
            } else if (temp[i].equals("1000")) {
                answer = answer + "8";
            } else if (temp[i].equals("1001")) {
                answer = answer + "9";
            } else if (temp[i].equals("1010")) {
                answer = answer + "a";
            } else if (temp[i].equals("1011")) {
                answer = answer + "b";
            } else if (temp[i].equals("1100")) {
                answer = answer + "c";
            } else if (temp[i].equals("1101")) {
                answer = answer + "d";
            } else if (temp[i].equals("1110")) {
                answer = answer + "e";
            } else if (temp[i].equals("1111")) {
                answer = answer + "f";
            }
        }
        return answer;
    }


    public static String toBinary(String hexNumber) {
        String HEX = "0123456789abcdef";
        String answer = "";
        char[] hexNumberChar = hexNumber.toCharArray();
        char[] HEXString = HEX.toCharArray();
        int count = 0;


        if (hexNumber == null) {
            return answer;
        }


        // Сравниваю 2 массива, чтобы понять сколько совпадений символов получится, если совпадений меньше, чем кол-во символов в приходящей строке, то в приходящей строке есть чужие символы
        for (int i = 0; i < hexNumberChar.length; i++) {
            for (int j = 0; j < HEXString.length; j++) {
                if (hexNumberChar[i] == HEXString[j]) {
                    count++;
                }
            }
        }
        if (count != hexNumberChar.length) {
            return answer;
        }

        // собираю строку
        for (int i = 0; i < hexNumberChar.length; i++) {
            if (hexNumberChar[i] == '0') {
                answer = answer + "0000";
            }
            if (hexNumberChar[i] == '1') {
                answer = answer + "0001";
            }
            if (hexNumberChar[i] == '2') {
                answer = answer + "0010";
            }
            if (hexNumberChar[i] == '3') {
                answer = answer + "0011";
            }
            if (hexNumberChar[i] == '4') {
                answer = answer + "0100";
            }
            if (hexNumberChar[i] == '5') {
                answer = answer + "0101";
            }
            if (hexNumberChar[i] == '6') {
                answer = answer + "0110";
            }
            if (hexNumberChar[i] == '7') {
                answer = answer + "0111";
            }
            if (hexNumberChar[i] == '8') {
                answer = answer + "1000";
            }
            if (hexNumberChar[i] == '9') {
                answer = answer + "1001";
            }
            if (hexNumberChar[i] == 'a') {
                answer = answer + "1010";
            }
            if (hexNumberChar[i] == 'b') {
                answer = answer + "1011";
            }
            if (hexNumberChar[i] == 'c') {
                answer = answer + "1100";
            }
            if (hexNumberChar[i] == 'd') {
                answer = answer + "1101";
            }
            if (hexNumberChar[i] == 'e') {
                answer = answer + "1110";
            }
            if (hexNumberChar[i] == 'f') {
                answer = answer + "1111";
            }

        }
        return answer;
    }

*/


//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
// Правильный порядок

//    Напишем утилиту для работы с массивами. Основная часть функционала готова: метод printArray() выводит в консоли все элементы массива.
//    Тебе осталась мелочь: реализовать метод reverseArray(). Он должен менять порядок элементов массива на обратный.
//    Метод должен работать только с массивами целочисленных значений (int[]).
//
//    Пример:
//    Если массив содержал элементы:
//            1, 2, 3, 4, 5, 6, 7, 8, 9, 0
//    то после вызова метода reverseArray() должен содержать:
//            0, 9, 8, 7, 6, 5, 4, 3, 2, 1

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array){
        int[] tempArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            int temp = tempArray[(array.length -1 - i)];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
//    Есть ли кто?

//    Реализуй метод main(String[]), который выводит в консоль true, если элемент
//    содержится в переданном массиве, иначе — false.
//    Массив array не должен изменять расположение своих элементов.
//
//    Для поиска элемента в массиве нужен бинарный поиск.
//    Чтобы это сделать, используй статический метод Arrays.binarySearch(int[], int) класса Arrays.
//    Первым параметром нужно передать отсортированный массив, в котором выполнить поиск,
//    вторым параметром — искомый элемент. Метод Arrays.binarySearch(int[], int) возвращает индекс искомого элемента,
//    если такой элемент есть в массиве.

//    Для сортировки массива можно использовать метод Arrays.sort(int[]).
//    При тестировании значения переменных класса Solution будут разными.

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 9;

    public static void main(String[] args) {
        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray); // зачем тут сортирвка массива?
        int index = Arrays.binarySearch(copyArray, element);
        System.out.println(index >=0);
    }
}






//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
//    Делим массив
//    Реализуй метод main(String[]), который делит массив array на два подмассива
//    и заполняет ими двумерный массив result. Если длина массива нечетная,
//    то большую часть нужно скопировать в первый подмассив.
//    Для разделения массива используй метод Arrays.copyOfRange(int[], int, int).
//    Порядок элементов не меняй.
//    При тестировании значения полей класса Solution будут разными, учти это.

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        if(array.length % 2 == 0) {
            result[0] = Arrays.copyOfRange(array, 0, array.length / 2);
            result[1] = Arrays.copyOfRange(array, array.length / 2, array.length);
        }
        else{
            result[0] = Arrays.copyOfRange(array, 0, ((array.length / 2) + 1 ));
            result[1] = Arrays.copyOfRange(array, ((array.length / 2) + 1 ), array.length);
        }
                System.out.println(Arrays.deepToString(result));
    }
}

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
    // Заполняем массив
    public static int[] array = new int[20];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        if(array.length % 2 == 0) {
            Arrays.fill(array, 0, ((array.length / 2) + 1), valueStart);
            Arrays.fill(array, ((array.length / 2)), (array.length), valueEnd);
        }else{
            Arrays.fill(array, 0, ((array.length / 2) + 1), valueStart);
            Arrays.fill(array, ((array.length / 2)+1), (array.length), valueEnd);
        }

        System.out.println(Arrays.toString(array));
    }
}

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
//Сравнение двумерных массивов

    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(arrayFirst, arraySecond));
       // System.out.println(arrayFirst == arraySecond);
    }
}



//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
    /*
//    Выводим двумерные массивы
    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    public static void main(String[] args) {
        String str1 = Arrays.deepToString(strings);
        String str2 = Arrays.deepToString(ints);
        System.out.println(str1);
        System.out.println(str2);
    }
}
//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
    /*
//Выводим массивы
    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String str1 = Arrays.toString(strings);
        String str2 = Arrays.toString(ints);
        System.out.println(str1);
        System.out.println(str2);
    }
}


//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
    /*

//Создаем мультимассив
    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
    public static void main(String[] args) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k]);
                }
            }
        }
    }
}
//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
    /*
Создаем двумерный массив
    public static int[][] multiArray;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        multiArray = new int[num][];
        int[] sc = new int[num];
        for (int i = 0; i < num; i++) {
            sc[i] = scanner.nextInt();
        }
        for (int i = 0; i < multiArray.length; i++) {
                multiArray = new int[num][i];
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int n = 0; n < sc[i]; n++) {
                System.out.print("[]");
            }
            System.out.println();
        }
    }
}


//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
/*
    Треугольный массив


    public static int[][] result = new int[10][];
    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++){
        result[i] = new int[i + 1];
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
               result[i][j] = ( i + j );
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}


 /*
//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush
//  System.out.println("Enter second number ");
//   int variableSecond = scanner.nextInt();
    /*
    // Давай создадим программу для генерации квадратных шахматных досок с заданной размерностью. В классе Solution дан двумерный массив символов (поле array). Необходимо:
    // считать число с клавиатуры — это и будет размерность нашей будущей доски (длина стороны);
    // инициализировать массив array соответствующим значением;
    // "закрасить" массив так, чтобы получилась шахматная доска (черные клетки — '#', белые — ' '). Начинаем заполнять массив с '#' с верхнего левого угла;
    // вывести массив на экран в таком виде, как в примере (каждую строку отдельно).
    // Пример вывода для числа 5:
    // # # #
    //  # #
    // # # #
    //  # #
    // # # #



    public static char[][] array;
public class JavaSyntaxMassive {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        array = new char[size][size];
        ;
        for (int i = 0; i < array.length; i++) { // row
            for (int j = 0; j < array.length; j++) { //colomn
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        scanner.close();

    }
}
     */

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

    /*
    // Дан двумерный массив chars. Тебе нужно в методе main заменить все внутренние элементы на дефис (минус).
    // Для вывода содержимого массива на экран используй приватный метод printArray().
    // Пример массива:
    // a b c d e f
    // g h i j k l
    // m n o p q r
    // s t u v w x

    // После отработки программы массив должен содержать:
    // a b c d e f
    // g - - - - l
    // m - - - - r
    // s t u v w x
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

     public static void main(String[] args) {
       printArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
               if(i == 0 || j == 0 || i == (chars.length - 1) || j == chars[0].length - 1){
               }
             else{
                   chars[i][j]='-';
               }
            }
            System.out.println();
        }

      printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
*/

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

/*
        // Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10], заполни его таблицей умножения и выведи в консоли в следующем виде:
        // 1 2 3 4 …
        // 2 4 6 8 …
        // 3 6 9 12 …
        // 4 8 12 16 …
        // Числа в строке разделены пробелом.


        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
                System.out.print(" ");
            }
            System.out.println();
        }*/

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

/*
        //  Создать массив на 10 строк.
        //  Создать массив на 10 чисел.
        //  Ввести с клавиатуры 10 строк, заполнить ими массив строк.
        //  В каждую ячейку массива чисел записать длину строки из массива строк,
        //  индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
        //  Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
        String[] tenString = new String[10];
        int[] tenNum = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < tenString.length; i++) {
            tenString[i] = reader.readLine();
        }
        // int num = 0;
        //   System.out.println(Arrays.toString(tenString));
        for (int i = 0; i < tenString.length; i++) {
            tenNum[i] = tenString[i].length();
        }
        for (int i = 0; i < tenNum.length; i++) {
            System.out.println(tenNum[i]);
        }
*/

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

/*
//    Создать массив на 15 целых чисел.
//    Ввести в него значения с клавиатуры.
//    Пускай индекс элемента массива является номером дома, а значение — числом жителей, проживающих в доме.
//    Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
//    Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."



    int[] mainMassive = new int[15];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15 ; i++) {
        mainMassive[i] = Integer.parseInt(reader.readLine());
        }
        int even = 0;
        int odd = 0;
        for (int i = 0; i < 15 ; i++) {
        if (i % 2 == 0) {
        even += mainMassive[i];
        } else {
        odd += mainMassive[i];
        }
        }
        if (even > odd){
        System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else if (odd > even){
        System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

        */

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

      /*
        for (int i = 0; i < mainMassive.length; i++) {
            Arrays.binarySearch(mainMassive, (mainMassive[i%2]  == 0));
            //{
              //  evenMassive[i] = mainMassive[i];
            //}
            Arrays.binarySearch(mainMassive, (i % 2 != 0))
        //{
            //    oddMassive[i] = mainMassive[i];
          //  }

          или



        for (int i = 0; i < mainMassive.length; i++) {
if (mainMassive[i] % 2 == 0){
    chetniiMassive[i] = mainMassive[i];
}
else {
    neChetniiMassive[i] = mainMassive[i];
}
      }
        System.out.println(Arrays.toString(chetniiMassive));
        System.out.println(Arrays.toString(neChetniiMassive));


       */

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

      /*
      //  Создать массив на 20 чисел.
      //  Ввести в него значения с клавиатуры.
      //  Создать два массива на 10 чисел каждый.
      //  Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
      //  Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
        int[] firstMassive = new int[20];
        int[] secondMassive = new int[10];
        int[] thirdMassive = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < firstMassive.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            firstMassive[i] = num;
        }
        secondMassive = Arrays.copyOfRange(firstMassive, 0, firstMassive.length/2);
        thirdMassive = Arrays.copyOfRange(firstMassive, firstMassive.length/2, firstMassive.length);
        for (int i = 0; i < thirdMassive.length; i++) {
            System.out.println(thirdMassive[i]);
        }
       // System.out.println(Arrays.toString(thirdMassive));
         */

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

/*
//    Создать массив на 10 чисел.
//    Ввести с клавиатуры 10 чисел и записать их в массив.
//    Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
        int[] myArray = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //    int num = Integer.parseInt(reader.readLine());
        for (int i = 0; i < myArray.length; i++) {
            int num = Integer.parseInt(reader.readLine());
            myArray[i] = num;
        }
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }
 */

//Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush Java Rush

/*
    //    Создать массив на 10 строк.
    //    Ввести с клавиатуры 8 строк и сохранить их в массив.
    //    Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.
      String[] myArray = new String[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // String bufferedReader;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = bufferedReader.readLine();
        }
        for (int i = myArray.length-1; i >= 0; i--) {
            if(myArray[i].isEmpty()){
                System.out.println("");
                continue;
            }
            System.out.println(myArray[i]);
        }
        */
