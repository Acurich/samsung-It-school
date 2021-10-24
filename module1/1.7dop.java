//Автобусная экскурсия
//Оргкомитет Московской городской олимпиады решил организовать обзорную экскурсию по Москве для участников олимпиады. 
//Для этого был заказан двухэтажный автобус (участников олимпиады достаточно много и в обычный они не умещаются) высотой 437 сантиметров. 
//На экскурсионном маршруте встречаются N мостов. Жюри и оргкомитет олимпиады очень обеспокоены тем, что высокий двухэтажный автобус может не проехать под одним из них. 
//Им удалось выяснить точную высоту каждого из мостов. Автобус может проехать под мостом тогда и только тогда, когда высота моста превосходит высоту автобуса. 
//Помогите организаторам узнать, закончится ли экскурсия благополучно, а если нет, то установить, где произойдет авария.
import java.util.Scanner;



public class Main
{
  public static void main (String[]args)
  {
      Scanner in = new Scanner(System.in);
    int n = in.nextInt ();
    int k = 0, i;
    for (i = 1; i <= n && k == 0; i++)
      {
	int h = in.nextInt ();
	if (h <= 437)
	    k = i;
      }
    if (k >0)
        System.out.println ("Crash " + k);
    else
      System.out.println ("No crash");
  }
}

//Произведение
//Дано два целых числа A и B. 
//Найдите произведение данных чисел, не используя операцию умножения. 
//Учтите, что числа могут быть отрицательными.
import java.util.Scanner;



public class Main
{
  public static void main (String[]args)
  {
      Scanner in = new Scanner(System.in);
    int n = in.nextInt ();
    int k = in.nextInt();
      System.out.println (n*k);
  }
}

//Первые N чётных
//Напишите программу, которая вводит целое неотрицательное число N и выводит первые N чётных положительных чисел.
import java.util.Scanner;



public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int temp = 0;
    for (int i = 0; i <n; ++i)
      {	temp += 2;
              System.out.print(temp+ " ");
      }

  }

}

//Остатки
//Даны четыре целых неотрицательных числа a, b, c и d. 
//Найдите все пятизначные числа, которые при делении на a дают в остатке b, а при делении на c дают в остатке d.
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int a, b, c, d;
		boolean flag = false;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		for (int i = 10000; i < 100000; i++)
			if ((i % a == b) && (i % c == d))
			{
				System.out.print("" + i + " ");
				flag = true;
			}
		if (!flag)
			System.out.println(-1);
	}
}

//Сумма цифр
//Дано целое неотрицательное число N. 
//Требуется определить сумму цифру в десятичной записи числа N.
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int sum =0;
    while(n != 0){
        sum += (n % 10);
        n/=10;
}
System.out.println(sum + " ");

  }

}

//Две одинаковые цифры рядом
//Дано целое неотрицательное число N.
//Определите, верно ли, что введённое число содержит две одинаковых цифры, стоящие рядом.
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		String s;
		s = in.nextLine();
		boolean flag = false;
		int sum = 0;
		for (int i = 0; i < s.length() - 1; i++)
			if (s.charAt(i) == s.charAt(i + 1))
				flag = true;
		System.out.println(flag ? "YES" : "NO");
	}
}

//Тест на простоту
//Дано целое неотрицательное число N.
//Определите, верно ли, что введённое число является простым.
import java.util.Scanner;
 
public class PrimeCheck {
   public static void main(String args[]) { 
 int temp;
 boolean isPrime=true;
 Scanner scan= new Scanner(System.in);
 int num=scan.nextInt();
        for (int i=2; i<=num/2; i++) {
           temp = num % i;
    if (temp == 0) {
       isPrime = false;
       break;
    }
 }
 if(isPrime) {
    System.out.println("prime");
 } else {
    System.out.println("composite");
        }
   }
}

//Быстрое возведение в степень
//Возводить число a в степень n можно гораздо быстрее, чем за n умножений!
//Для этого нужно воспользоваться следующими соотношениями:
//при четном n: an=(an/2)2
//при нечетном n: an=a⋅an−1
//Реализуйте алгоритм быстрого возведения в степень.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);
            double a=scan.nextDouble();
            int b= scan.nextInt();
            System.out.println( Math.pow(a, b));
        }
    }
