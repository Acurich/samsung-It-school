//Две одинаковые цифры
//Дано цело положительное число N. Определите верно ли, что введённое число содержит по крайней мере две одинаковых цифры, возможно, не стоящие рядом.
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a, b, c, q;
        c = s.nextInt();

        do {
            a = c % 10;
            c = c / 10;
            q = c;
            while (q > 0) {
                b = q % 10;
                q = q / 10;
            if (a == b) {
                System.out.print( "YES");
                a = 77;
                break;
                
            }
            }
            if (a == 77)
            break;
            
        } while (c != 0);
        if (a != 77)
        System.out.print("NO" );
        }
}


//Алгоритм Евклида
//Алгоритм Евклида для вычисления наибольшего общего делителя двух натуральных чисел, формулируется так: нужно заменять большее число на разность большего и меньшего до тех пор, пока одно из них не станет равно нулю; тогда второе и есть НОД. Напишите программу, которая реализует этот алгоритм.
import java.util.*;

public class Main 
{
    public static void main(String args[]){   

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int nod, k = 0;
        while (a*b != 0){
             if (a>b) a -=b;
             else b -= a;
             k++;
        }
        nod = a+b;
System.out.print(nod + " " + k);
     
    } 
}

//Простые числа
//Даны целые положительные числа a и b. Найдите все простые числа в диапазоне от a до b.



//Мастика
//В магазине продается мастика в ящиках по a кг (тип 1), b кг (тип 2) и c кг (тип 3). Как купить ровно N кг мастики, не вскрывая ящики? Сколькими способами можно это сделать?
import java.util.*;

public class Main 
{
    public static void main(String args[]){   

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();
        int s = 0;
        for (int na = 0; na <= n / a; na++) {

       for (int nb = 0; nb <= (n - a * na) / b; nb++) {

           int kk = n - na * a - nb * b;

           if (kk >= 0 && kk % c == 0) s++;        

       }

   }
   System.out.print(s+"\n");
   
    for (int na = 0; na <= n / a; na++) {

       for (int nb = 0; nb <= (n - a * na) / b; nb++) {

           int ll = n - na * a - nb * b;

           if (ll >= 0 && ll % c == 0)

               System.out.print( na + " " + nb + " " + ll / c + "\n");

       }

   }       
    } 
}


//Количество элементов, равных максимуму
//Дана последовательность целых положительных чисел, завершающаяся числом 0. Число 0 не является элементов последовательности. Количество чисел последовательности не превосходит 10000 (не считая завершающего числа 0). Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
//Числа, следующие за числом 0, считывать не нужно.
import java.util.*;

public class Main 
{
    public static void main(String args[]){   

        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int max=x;
        int len=1;
        while (x!=0){
            x=in.nextInt();
            if (x>max){
                 max=x;
                 len=1;
            }
            else if (x==max){
                 len+=1;
            }
                
            }
            System.out.print(len);
    } 
}


//Максимальная длина монотонного фрагмента
//Дана последовательность целых положительных чисел, завершающаяся число 0. Число 0 не является элементом последовательности. Определите наибольшую длину монотонного фрагмента последовательности (то есть такого фрагмента, где все элементы либо больше предыдущего, либо меньше).
