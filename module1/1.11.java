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
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int k = 0; k < m; k++)
				arr[i][k] = i * k;
		
		for (int i = 0; i < n; i++)
		{
			for (int k = 0; k < m; k++)
				System.out.printf("%4d", arr[i][k]);
			System.out.println();
		}
	}
}



//Заполнение змейкой
//Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
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
			{
				if (i % 2 == 0)
				{
					arr[i][k] = c;
					c++;
				}
				else
				{
					arr[i][m - k - 1] = c;
					c++;
				}
			}
		
		for (int i = 0; i < n; i++)
		{
			for (int k = 0; k < m; k++)
				System.out.printf("%3d",arr[i][k]);
			System.out.println();
		}
	}	
}

//Заполнение спиралью
//Дано число n. Создайте массив A[2*n+1][2*n+1] и заполните его по спирали, начиная с числа 0 в центральной клетке A[n][n]. Спираль выходит вверх, далее закручивается против часовой стрелки.
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int lng = in.nextInt() * 2 + 1;
        int[][] tbl = new int[lng][lng];
        int x = lng - 1; 
        int y = lng - 1; 
        int sx = 0; 
        int sy = 0; 

        int ctr = lng * lng - 1;

        while (ctr >= 0) { 
            for (int i = 0; i < tbl.length; i++) {
                if(tbl[i][x] == 0) {
                    tbl[i][x] = ctr--; 
                }
            }
            for (int i = tbl.length - 1; i > 0; i--) {
                if(tbl[y][i] == 0) {
                    tbl[y][i] = ctr--;
                }
            }
            for (int i = tbl.length - 1; i > 0; i--) {
                if(tbl[i][sx] == 0) {
                    tbl[i][sx] = ctr--;
                }
            }
            for (int i = 0; i < tbl.length; i++) {
                if (tbl[sy][i] == 0) {
                    tbl[sy][i] = ctr--;
                }
            }

            sx++;sy++;
            x--;y--;
        }
        tbl[(lng-1) / 2][(lng-1) / 2] = 0; 
        for (int i = 0; i < tbl.length; i++) {
            for (int j = 0; j < tbl.length; j++) {
                if(tbl[i][j] < 10) {
                    System.out.print("  " + tbl[i][j]);
                } else if(tbl[i][j] < 100) {
                    System.out.print(" " + tbl[i][j]);
                } else {
                    System.out.print(tbl[i][j]);
                }
            }
            System.out.println();
        }
    }
}
