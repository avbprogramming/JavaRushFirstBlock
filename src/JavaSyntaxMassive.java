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


    public static void main(String[] args) {
        int[] A = new int[100];
        Arrays.fill(A, 50);
        System.out.println(A[99]);
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
