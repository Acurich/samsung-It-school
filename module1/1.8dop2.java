//Двойной переворот
//Дана последовательность целых неотрицательных чисел 1,2,3,...,N. 
//Необходимо сначала расположить в обратном порядке часть этой последовательности от элемента с номером A до элемента с номером B, а затем от C до D.
import java.util.*;

 

class Array

{

  ArrayList<Integer> m;

 

  Array(int n)

  {

    m = new ArrayList<Integer>(Collections.nCopies(n, 0));

  }

 

  public void set(int index, int value)

  {

    m.set(index,value);    

  }


  public void Reverse(int i, int j)

  {

    while(i < j)

    {

      Collections.swap(m,i,j);

      i++; j--;

    }

  }


  public void Print()

  {

    for(int i = 1; i < m.size(); i++)

      System.out.print(m.get(i) + " ");

    System.out.println();

  }

};

 

public class Main

{

  public static void main(String[] args)

  {

    Scanner con = new Scanner(System.in);

    int n = con.nextInt();

    int a = con.nextInt();

    int b = con.nextInt();

    int c = con.nextInt();

    int d = con.nextInt();

   

    Array m = new Array(n+1);

    for(int i = 1; i <= n; i++)

      m.set(i,i);


    m.Reverse(a,b);

    m.Reverse(c,d);
    m.Print();

   

    con.close();

  }

}

//A[0], A[2], A[4], ...
//Дана последовательность из целых чисел. Нумерация элементов начинается с 0. Напишите программу, которая выведет элементы последовательности, номера которых четны.
import java.util.Scanner;



public class Main 
{
public static void main(String[] args)
{
    int number;


    Scanner key = new Scanner(System.in);
    number = key.nextInt();
    int [] array = new int [number];
for ( int index = 0; index < number; index ++) 
{
 array[index] = key.nextInt();



}

for ( int index = 0; index < number; index ++)  
{
    if (index % 2== 0)
    System.out.print(array[index] + " ");

}
}
}

//Вывести четные элементы
//Дана последовательноность, состоящая из целых чисел. Выведите те элементы массива, которые являются чётными числами.
import java.util.Scanner;



public class Main 
{
public static void main(String[] args)
{
    int number;


    Scanner key = new Scanner(System.in);
    number = key.nextInt();
    int [] array = new int [number];
for ( int index = 0; index < number; index ++) 
{
 array[index] = key.nextInt();



}

for ( int index = 0; index < number; index ++)  
{
    if (array[index] % 2== 0)
    System.out.print(array[index] + " ");

}
}
}

//Количество положительных элементов
//Дана последовательность, состоящая из целых чисел. Подсчитайте количество положительных чисел среди элементов последовательности.
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int numbers = Integer.valueOf(s.nextLine()).intValue();
        String line = s.nextLine();
        s.close();
        String [] all = line.split("\\s");
        int elements[] = new int [numbers];
        for(int i = 0; i<numbers; i++) 
            elements[i] = Integer.valueOf(all[i]).intValue();
        
        int count = 0;
        for(int i = 0; i<numbers; i++)
            if(elements[i] > 0)
                count++;
        System.out.println(count);
    }
}

//Количество элементов, больших предыдущего
//Дана последовательность, состоящая из целых чисел. Подсчитайте количество элементов последовательноси, больших предыдущего (элемента с предыдущим номером).
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int numbers = Integer.valueOf(s.nextLine()).intValue();
        String line = s.nextLine();
        s.close();
        String [] all = line.split("\\s");
        int elements[] = new int [numbers];
        for(int i = 0; i<numbers; i++) 
            elements[i] = Integer.valueOf(all[i]).intValue();
        
        int counter = 0;
        for( int i = 1; i < numbers; i++ )
        if( elements[ i - 1 ] < elements[ i ] ) counter++;
        System.out.println(counter);
    }
}

//Максимум в массиве
//Вводится массив, состоящий из целых чисел. Определите наибольший элемент последовательности.
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int i, min, max, n;
		int a[];
		Scanner keyboard = new Scanner(System.in);
		n = keyboard.nextInt();
		a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = keyboard.nextInt();
		}
		max = a[0];
		for (i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i]; 
		}
			System.out.print(max);
		
	}
}

//Количество различных элементов в монотонном массиве
//Дана последовательность, состоящая из целых чисел. Известно, что числа упорядочены по неубыванию (то есть каждый следующий элемент не меньше предыдущего). Определите количество различных чисел в этой последовательности.
import java.util.Scanner;

 
public class Main
{
  
public static void main (String[]args)
  {
    
int k=1, n;
    
int x[];
    
Scanner keyboard = new Scanner (System.in);
    
n = keyboard.nextInt ();
    
x = new int[n];
    
for (int i = 0; i < n; i++){
    x[i] = keyboard.nextInt ();
}
for(int i=1;i<n;i++){
            if(x[i]!= x[i-1]) k++;
        }
        
    
 
System.out.print (k);
  
 
}

}
