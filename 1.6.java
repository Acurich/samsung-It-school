//Классификатор
//Дано целое число N. Определите, к какой категории оно относится:
//"DIGIT", если это однозначное неотрицательное целое число;
//"NUM", если это двузначное целое положительное число;
//"OTHER", если оно не относится к первым двум категориям.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 0 && x <10) {
            System.out.print("DIGIT");
        }
        else if (x >9 && x <100){
            System.out.print("NUM");
        }
        else { System.out.print("OTHER");}


    }
}
//В порядке возрастания
//Даны три различных целых числа. Требуется вывести их в стандартный поток вывода в порядке возрастания.

//Не разрешается пользоваться функциями min/max и подобным им, а также оператором присваивания (за исключением ввода исходных чисел).
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int[] numbers = new int[3];
for (int i = 0; i < numbers.length; i++) {
numbers[i] = scanner.nextInt();
}

if (numbers[0] > numbers[1]) swap(numbers, 0, 1);
if (numbers[1] > numbers[2]) swap(numbers, 1, 2);
if (numbers[0] > numbers[1]) swap(numbers, 0, 1);

for (int number : numbers) {
System.out.print(number +" ");
}
}

public static void swap(int[] numbers, int i, int j) {
int temp = numbers[i];
numbers[i] = numbers[j];
numbers[j] = temp;
}
}
//Склонения
//Дано целое неотрицательное число N - количество тортов, которые гости принесли на день рождения Чебурашки. Помогите Чебурашке правильно сказать, сколько тортов у него на праздничном столе.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int x1;
        int x2;
        x1 = x % 10;
        x2 = x /10 % 10;
        if ( x2 == 1){
            System.out.print(x + " TORTOV");
        }
        else if (x1 == 1){
            System.out.print(x + " TORT");
        }
        else if (x1 > 1 && x1  <= 4){
            System.out.print(x + " TORTA");
        }
        else {System.out.print(x + " TORTOV");}


    }
}
//Линейное неравенство с модулем
//Даны два целых числа A и B. Решите неравенство A|x|+B>0.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double x = -b / a;
        x = (double)Math.round(x * 10) /10;
        if ( a <= 0 && b <= 0){
            System.out.print("no such x");
        }
        else if (a >= 0 && b > 0){
            System.out.print("any x");
        }
        else if ( a > 0 && b < 0){
            System.out.print("x<" + -x +" or" + " x>" + x);
        }
        else { System.out.print(-x + "<" + "x" + "<" + x);}
    }
}
//Сколько дней в месяце
//Напишите программу, которая вводит с клавиатуры номер месяца и определяет, сколько дней в этом месяце. При вводе неверного номера месяца должно быть выведено сообщение об ошибке. Считается, что год невисокосный.
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int a = in.nextInt ();
    int countday = 0;
    if (a == 1)
      {
	countday = 31;
      }
    if (a == 2)
      {
	countday = 28;
      }
    if (a == 3)
      {
	countday = 31;
      }
    if (a == 4)
      {
	countday = 30;
      }
    if (a == 5)
      {
	countday = 31;
      }
    if (a == 6)
      {
	countday = 30;
      }
    if (a == 7)
      {
	countday = 31;
      }
    if (a == 8)
      {
	countday = 31;
      }
    if (a == 9)
      {
	countday = 30;
      }
    if (a == 10)
      {
	countday = 31;
      }
    if (a == 11)
      {
	countday = 30;
      }
    if (a == 12)
      {
	countday = 31;
      }
      System.out.print(countday);
  }
}
//Новый год
//Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось до Нового года. При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год невисокосный.

import java.util.Scanner;

public class Main
{
        public static void main (String[]args)
    {
        Scanner in = new Scanner (System.in);
        int x = in.nextInt ();
        int y = in.nextInt();
        if ((x<0) | (x==0) | (x>12)){ System.out.print(-1);}

if ((x==1) && (y>31) && (y>=0)) {System.out.print(-1);}
if ((x==2) && (y>28) && (y>=0)) {System.out.print(-1);}
if ((x==3) && (y>31) && (y>=0)) {System.out.print(-1);}
if ((x==4) && (y>30) && (y>=0)) {System.out.print(-1);}
if ((x==5) && (y>31) && (y>=0)) {System.out.print(-1);}
if ((x==6) && (y>30) && (y>=0)) {System.out.print(-1);}
if ((x==7) && (y>31) && (y>=0)) {System.out.print(-1);}
if ((x==8) && (y>31) && (y>=0)) {System.out.print(-1);}
if ((x==9) && (y>30) && (y>=0)) {System.out.print(-1);}
if ((x==10) && (y>31) && (y>=0)) {System.out.print(-1);}
if ((x==11) && (y>30) && (y>=0)) {System.out.print(-1);}
if ((x==12) && (y>31) && (y>=0)) {System.out.print(-1);}
        if ((x==1) && (y<=31)){System.out.print(365-y);}
        if ((x==2) && (y<=28)){System.out.print(365-31-y);}
        if ((x==3) && (y<=31)){ System.out.print(365-28-31-y);}
        if ((x==4) && (y<=30)){ System.out.print(365-31-31-28-y);}
        if ((x==5) && (y<=31)){ System.out.print(365-30-31-31-28-y);}
        if ((x==6) && (y<=30)){System.out.print(365-31-30-31-31-28-y);}
        if ((x==7) && (y<=31)){System.out.print(365-30-31-30-31-31-28-y);}
        if ((x==8) && (y<=31)){System.out.print(365-31-30-31-30-31-31-28-y);}
        if ((x==9) && (y<=30)){ System.out.print(365-31-31-30-31-30-31-31-28-y);}
        if ((x==10) && (y<=31)){ System.out.print(365-30-31-31-30-31-30-31-31-28-y);}
        if ((x==11) && (y<=30)){ System.out.print(365-31-30-31-31-30-31-30-31-31-28-y);}
        if ((x==12) && (y<=31)){ System.out.print(365-30-31-30-31-31-30-31-30-31-31-28-y);}

    }
}

//Римская система счисления
//Дано целое неотрицательное число X. Требуется перевести это число в римскую систему счисления.
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    if(n == 100){
      System.out.print( "C");
    }
    else{
        switch(n / 10){
            case 1: System.out.print("X");break; 
            case 2: System.out.print("XX");break; 
            case 3: System.out.print("XXX");break; 
            case 4: System.out.print("XL"); break;
            case 5: System.out.print("L"); break;
            case 6: System.out.print("LX"); break;
            case 7: System.out.print("LXX"); break;
            case 8: System.out.print("LXXX"); break;
            case 9: System.out.print("XC"); break;
        }
        switch(n % 10){
            case 1: System.out.print("I"); break;
            case 2: System.out.print("II"); break;
            case 3: System.out.print("III"); break;
            case 4: System.out.print("IV"); break;
            case 5: System.out.print("V"); break;
            case 6: System.out.print("VI"); break;
            case 7: System.out.print("VII"); break;
            case 8: System.out.print("VIII");break;
            case 9: System.out.print("IX"); break;
        }
    }
  }
}
//Максимум из трех
//Даны три целых числа a, b, c. Определите значение наибольшего из этих чисел.
import java.util.Scanner;

public class Main
{
        public static void main (String[]args)
    {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt ();
        int b = in.nextInt();
        int c = in.nextInt();
        int max, min;
        float mid;

        if (a > b && a > c)
        {
            max = a;
            min = (b < c) ? b : c;
        }
        else if (b > a && b > c)
        {
            max = b;
            min = (a < c) ? a : c;
        }
        else if ( a == b && b >c) {
            max = a;
        }
        else if (b == c && c > a) {
            max = b;
        }
        else if (a == c && b  < c){
            max = a;
        }
        else
        {
            max = c;
            min = (b < a) ? b : a;
        }
        

        mid = (a + b + c) / 3f;
        System.out.print(max);
    }
}
//Упорядочить три числа
//Дано три числа, записанный в отдельных строках. Упорядочите их в порядке неубывания. Программа должна считывать три числа a, b, c, затем программа должна менять их значения так, чтобы стали выполнены условия a <= b <= c, затем программа выводит тройку a, b, c.
import java.util.Scanner;

public class Main
{

  public static void main(String args []){
      Scanner in = new Scanner (System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    int min = Math.min(Math.min(a,b),c);
    int max = Math.max(Math.max(a,b),c);
    b = (a + b + c) - min - max; a = min; c = max;

    System.out.println( + a  + " " + b + " " + c);
}
}
//Тип треугольника
//Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.
import java.util.Scanner;

public class Main
{

  public static void main (String args[])
  {
    Scanner in = new Scanner (System.in);
    int a = in.nextInt ();
    int b = in.nextInt ();
    int c = in.nextInt ();
    int res, maxVal;
    if (a < b + c && b < a + c && c < a + b)
      {

	if (a > b)
	  maxVal = a;
	else
	  maxVal = b;

	if (maxVal < c)
	  maxVal = c;
	res = a * a + b * b + c * c - 2 * (maxVal * maxVal);

	if (res > 0)
	  System.out.println ("acute");
	else if (res < 0)
	  System.out.println ("obtuse");
	else
	  System.out.println ("right");
      }
    else
        System.out.println ("impossible");

  }
}
