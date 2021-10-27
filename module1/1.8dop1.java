//Двоичная запись
//Дано целое неотрицательное число N. Выведите цифры в двоичной записи числа N в обратном порядке.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while(a > 0) {
            if(a%2 == 0) result.append("0");
            else result.append("1");
            a = a/2;
        }
        System.out.println(result);
    }
}

//Потерянная карточка
//Для настольной игры используются карточки с номерами от 1 до N. Одна карточка потерялась. Найдите ее.
import java.util.Scanner;
 
public class q1 {
    public static void main(String[] args){
    Scanner f = new Scanner(System.in);
    int N = f.nextInt();
    int M = N*(N+1)/2;
    int K = 0;
    for(int i = 0; i<N-1; i++){
        K+=f.nextInt();}
    System.out.println(M-K);
    f.close();
 
}}

//Квадратные таблицы
//Вася записывает в клетки квадратной таблицы NxN целые неотрицательные числа по порядку, сначала заполняя первую строку слева направо, затем вторую и т.д. (см. рисунок слева). Петя заполняет такую же таблицу, расставляя числа сначала в первый столбец сверху вниз, затем во второй столбец и т.д.
//При этом оказалось, что некоторые числа и Вася, и Петя записали в одну и ту же клетку (например, число 6 записано во вторую строку второго столбца обеих таблиц).
//Вам требуется написать программу, выводящую все числа, которые в обеих таблицах записаны в одних и тех же клетках.
import java.util.Scanner;
 
public class Test {
    public static void main(String args[]) {
        int n = 0;
        try (Scanner in = new Scanner(System.in)) {
            do {
                n = in.nextInt();
            } while (n < 1 || n > 100);
        }
 
        for (int i = 1; i <= n * n; i++) {
            if (i / n == i % n - 1 || i == n * n) {
                System.out.print(String.valueOf(i).concat(" "));
            }
        }
    }
}

//Факториал
//Найдите факториал данного целого неотрицательного числа n.
import java.util.Scanner;
 
public class Factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
