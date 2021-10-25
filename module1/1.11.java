//Переворот
//Дан массив N×M. Требуется повернуть его по часовой стрелке на 90 градусов
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		int m;
		n = in.nextInt();
		m = in.nextInt();
		int t = 0;
		int c = 0;
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int k = 0; k < m; k++)
				arr[i][k] = in.nextInt();
		System.out.println("" + m + " " + n);
		for (int i = 0; i < m; i++)
		{
			for (int k = n - 1; k >= 0; k--)
				System.out.print("" + arr[k][i] + " ");
			System.out.println();
		}
	}	
}

//Побочная диагональ
//Дано число n. Создайте квадратную матрицу размером n элементов и заполните её по следующему правилу:
//числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
//числа, стоящие выше этой диагонали, равны 0;
//числа, стоящие ниже этой диагонали, равны 2.
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		n = in.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++)
		{
			for (int k = 0; k < n; k++)
			{
				if ((i + k) == (n - 1))
					System.out.print("1 ");
				if ((i + k) > (n - 1))
					System.out.print("2 ");
				if ((i + k) < (n - 1))
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}


//Симметричная ли матрица?
//Проверьте, является ли двумерный массив симметричным относительно главной диагонали. Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static Scanner in = new Scanner(System.in); 
	
	public static void main (String[] argc)
	{
		int n;
		n = in.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int k = 0; k < n; k++)
				arr[i][k] = in.nextInt();
		boolean flag = true;
		for (int i = 0; i < n; i++)
			for (int k = 0; k < n; k++)
				if (arr[i][k] != arr[k][i])
					flag = false;
		System.out.println(flag ? "yes" : "no");
	}	
}


//Таблица умножения
//Даны два числа n и m. Создайте двумерный массив размером nm, заполните его таблицей умножения, т.е. чтобы элемент, находящийся в i строке и j столбце имел значение i∗j. Нумерация строк и столбцов начинается с нуля. При этом нельзя использовать вложенные циклы, все заполнение массива должно производиться одним циклом.




//Заполнение змейкой
//Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).




//Заполнение спиралью
//Дано число n. Создайте массив A[2*n+1][2*n+1] и заполните его по спирали, начиная с числа 0 в центральной клетке A[n][n]. Спираль выходит вверх, далее закручивается против часовой стрелки.

