

/*
import java.io.*;

//import static jdk.internal.org.jline.utils.Colors.s;
// https://pas1.ru/taskarray
// https://javarush.ru/groups/posts/cikly-jav
// https://javarush.ru/groups/posts/1876-operator-while

public class JavaSyntaxLoops {
        public static void main(String[] args) throws IOException {
/*
Давай напишем программу, в которой нужно будет вводить числа с клавиатуры, и как только будет введено -1, вывести на экран сумму всех чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи - использовать конструкцию:
while (true) {
int number = считываем число;
if (проверяем, что number -1)
break;
}

            // вариант 1

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                {
                    int num = Integer.parseInt(reader.readLine());
                    if (num == -1) {
                        sum += num;
                        break;
                    }
                    sum += num;
                }
            }
            System.out.println(sum);
        }
    }

        /*
// Решение javaRush
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        if ((number1 >= number2 && number1 <= number3) || (number1 <= number2 && number1 >= number3)) {
            System.out.println(number1);
        } else if ((number2 >= number1 && number2 <= number3) || (number2 <= number1 && number2 >= number3)) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }
// Мое решение

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());

        int[] numbers = {num1, num2, num3};
       //  avr = 0;
        if (num1 == num2 && num2 == num3 && num1==num3){
            System.out.println(num1);
        }
       else if ( num1 == num2 ) {
            System.out.println(num1);
        }
        else if ( num2 == num3 ){
            System.out.println(num2);
        }
        else if ( num1 == num3 ) {
            System.out.println(num3);
        }
if (num1 < num2 && num2 < num3){
    System.out.println(num2);
}
else if (num1 > num2 && num2 > num3){
    System.out.println(num2);
}
else if (num1 > num3 && num3 > num2){
    System.out.println(num3);
}
else if (num1 < num3 && num3 < num2){
    System.out.println(num3);
}
else if (num3 < num1 && num1 < num2){
    System.out.println(num1);
}
else if (num3 > num1 && num1 > num2){
    System.out.println(num1);
}
        }
        }

*/



 /*int count = 1;
                while (true) {
                    System.out.println("Строка №" + count);
                    if (count > 3) {
                        break;
                    }
                    count++; // Без наращивания цикл будет выполняться вечно
                }
*/



        /*
        // Введи с клавиатуры имя и, используя цикл for, 10 раз выведи: <имя> любит меня.
        //Пример вывода на экран для имени Света:
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.
        //Света любит меня.


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(s +" любит меня.");
        }
    */











/*
// Используя цикл for, выведи на экран:
//
//горизонтальную линию из 10 восьмёрок;
//вертикальную линию из 10 восьмёрок (символ из горизонтальной линии не учитывается).

Для чего  System.out.println(); между циклами?

чтобы первая восьмёрка со второго цикла не вывелась в первой строчке, если такое произойдёт,
то будет в верхней строчке 11 восьмерок, а в горизонтальном столбце 9 восьмерок.
Нужно чтобы выполнился первый фор, System.out.println();
эта строка коде создаст пустую строку и 2 фор начинает отрабатывать свои 10 строк


Не совсем понятно, почему пришлось записать условие для горизонтальной линии:
i = 0; i < 9
для вертикальной:
i = 0; i > 11

при первой итерации второго цикла 8-ка сперва записывается println-ом в строку, только потом уже строка переносится


        for (int i = 0; i < 10; i++) {
        System.out.printf("8");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
        System.out.printf("8");
        System.out.println();
        }

*/



/*
// Используя цикл for, выведи на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
// Пример вывода на экран:
// 8
// 88
// 888
// 8888
// 88888
// 888888
// 8888888
// 88888888
// 888888888
// 8888888888

        for (int i = 1 ; i <= 10; i++){
            for (int j = 1 ; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
        System.out.println("final"); */


       /*
       // Введи с клавиатуры два числа - m и n.
       // Используя цикл for, выведи на экран прямоугольник размером m на n из восьмёрок.
       // Рисуем прямоугольник
       // Пример: m=2, n=4
       // 8888
       // 8888
       throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int m = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print('8');
                }

                System.out.println();
            }
        }
        */

        /*
        //Используя цикл for, выведи на экран чётные числа от 1 до 100 включительно.
        //Каждое значение выведи с новой строки.
        for (int i = 1; i <=100; i++ ){
            if (i%2 == 0)
                System.out.println(i);
        }
         */
/*
for (int i = 1; i <= 10; i++){
    for (int j = 1; j <= 10; j++){
        int sum = i*j;
        System.out.print(" " + sum);
    }
    System.out.println();
}
 */
       /* BufferedWriter buffer = new BufferedWriter(readLine);
        boolean isExit = false;
        while (!isExit)
        {
            String s = buffer.readLine();
            isExit = s.equals("exit");
        }
        */





    //напишите тут ваш
      /*  int n = 10;
            while (n > 0) {
                System.out.print("SSSSSSSSSS");
                System.out.println();
                n--;

          */

