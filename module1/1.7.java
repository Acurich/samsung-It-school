//Количество чисел в последовательности
//С клавиатуры вводится последовательность целых чисел.
//Признаком окончания ввода является отрицательное число в потоке ввода.
//Определите количество чисел в введенной последовательности.
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
     int i, result = 0;
    do
    {
         i=in.nextInt ();
        result++;
    } while (i >=0);
      System.out.println (result);
  }
}

//Количество чисел в последовательности
//С клавиатуры вводится последовательность целых неотрицательных чисел.
//Признаком окончания ввода является число кратное 5 в потоке ввода.
//Определите сумму элементов последовательности больших 10.
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
	    int c = 0;
	    int i;
	    do
	    {
	        i = in.nextInt();
	        if (i > 10){
	            c+=i;
	        }
	    } while (i%5 != 0);
	    
		System.out.print(c);
	}
}

//Сумма цифр элементов последовательности
//С клавиатуры вводятся двузначные целые положительные числа. 
//Признаком окончания ввода является число, отличное от двузначного целого положительного.
//Найдите  сумму цифр во всех двузначных числах.
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int number = in.nextInt();
            if (number >= 100 || number <= 9) {
                break;
            } else {
                String str = "" + number;
                String numb1 = str.substring(0, 1);
                String numb2 = str.substring(1, 2);
                sum += Integer.parseInt(numb1);
                sum += Integer.parseInt(numb2);
            }
        }
        System.out.println(sum);
    }
}

//Остаток от деления
//Даны два целых положительных числа - A и B.
//Найдите частное и остаток от деления A на B, не используя операцию деления.
//Подсказка: нужно вычитать из первого числа второе и считать, сколько раз это получилось сделать.

import java.util.Scanner;

public class Main
{
        public static void main (String[]args)
    {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt ();
        int c = 0, d = 0;
        c = a/b;
        d = a%b;
        System.out.print(c + " "+ d);

    }
}

//Длина двоичного кода
//Дано целое положительное число N.
//Определите количество цифр в двоичном представлении числа N.
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int por=1, i = 0, a_bin = 0;
        while ( a!= 0){
            a_bin += (a%2)*por;
            a/= 2;
            por*=10;
            i++;
        }
        System.out.print(i);
   }
}
//Младшая цифра числа
//Дано натуральное нечетное число N.
//Найти сумму всех четных чисел в диапазоне от 25 до N.
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int N, sum = 0;
do {
    N = in.nextInt();
} while (N % 2 != 1 || N <= 25 || N >= 100);
for (int i = 25; i < N; i++) {
if (i % 2 == 0) sum += i;
}
System.out.print(sum);
}
}

//Количество цифр числа
//Дано целое неотрицательное число N.
//Определите количество цифр в десятичной записи числа N.
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int countOfNumbers = 0;
    for (; n != 0; n /= 10)
      ++countOfNumbers;
      System.out.println (countOfNumbers);
  }
}
//Младшая нечетная цифра
//Дано целое положительное число N. 
//Определите самую младшую нечетную цифру в десятичном представлении числа N.
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt ();
    for (; n != 0; n /= 10)
      if (n % 2 == 1)
	{
	  System.out.println (n % 10);
	  return;
	}
    System.out.println ("NO");
  }
}
//Наименьшая цифра
//Дано целое положительное число N.
//Определите минимальную отличную от нуля цифру в десятичном представлении числа N.
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        int A = a;
        while (A!=0){
            A/=10;
            sum++;
        }
        int k = 1;
        int [] b = new int[sum];
        for(int i = 0; i<sum; i++){
            b[i] = (a/k)%10;
            k*=10;
        }

        Arrays.sort(b);
        int answer =0;
        for(int i = 0; i<sum; i++) {
            if (b[i] != 0) {
                System.out.println(b[i]);
                break;
            }
        }
    }
}

//Простое рядом
//Дано целое положительное число N.
//Определите наименьшее простое число, которое больше чем N.
import java.util.Scanner;
 
public class Main {
    public static boolean isPrime(int n) {
        if ( ( n < 2 ) || ( ( n != 2 ) && ( ( n & 1 ) == 0 ) ) )
            return false;
        for ( int d = 3; d * d <= n; d += 2 )
            if ( n % d == 0 )
                return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while ( true ) {
            if ( ! scan.hasNextInt() )
                break;
            int n = scan.nextInt();
            for ( n += 1; ! isPrime(n); ++n )
                ;
            System.out.println(n);
        }
    }
}
