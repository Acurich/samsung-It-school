//Равный X
//Дана последовательность целых чисел из N элементов и целое число X. 
//Определите номер элемента массива равного X. Если таких элементов несколько, выведите меньший номер. 
//Нумерация элементов начинается с 1.
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int length = in.nextInt();
    int[] a = new int[length];
    for (int i = 0; i < a.length; i++) {
        a[i] = in.nextInt();
    }
    int x = in.nextInt();
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
            System.out.print(i + 1);
            return;
        }
    }
        System.out.println("NO");
}
}

//Сумма чётных
//Дана последовательность целых чисел из N элементов. Найдите сумму чётных элементов последовательности.
import java.util.Scanner;

public class Tema_1_5_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int [] a = new int[A];
        for(int i=0; i<A; i++){
            a[i] = in.nextInt();}

        int sum = 0;
        boolean summed = false;
        for (int i=0; i<A; i++) {
            if (a[i] % 2 == 0) {
                sum += a[i];
                summed = true;
            }
        }
        if (!summed)
            System.out.println("NO");
        else
            System.out.println(sum);
    }
}

//Среднее нечётных
//Дана последовательность целых чисел из N элементов.
//Найдите среднее арифметическое элементов последовательности, имеющих нечетное значение.
import java.util.Scanner;
public class Tema_1_2_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int [] B = new int[A];
        for(int i = 0; i<A; i++){
            B[i] = in.nextInt();
        }
        boolean C = true;
        int h = 0;
        int k=0;
        for(int i = 0; i<A; i++){
            if(B[i]%2 != 0){
                h+=B[i];
                k++;
                C = false;
            }
        }
        if(C == true){System.out.println("NO");}
        else{System.out.printf("%.2f", h/(k*1.0));}
    }
}

//В этой задаче не нужно вводить с клавиатуры значения элементов массива.
//Нужно заполнить значения элементов массива числами последовательности:
//4, 7, 10, 13, 16, ,,,
//и вывести получившийся массив на экран.
//Не будет считаться верным решение, в котором элементы последовательности просто выводятся на экран, не попадая в массив.



//Развернуть массив в обратную сторону ("задом наперед").
//Последний элемент должен находится на месте начального и наоборот.
//Не разрешается использовать дополнительный массив.
//Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя в памяти значение элементов массива.
import java.util.Scanner;
 
public class Main {
public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int a[] = new int[num];
    for (int i = 0; i < num; i++) {
        a[i] = s.nextInt();
    }
    for (int i = num - 1; i >= 0; i--) {
        System.out.print(a[i] + " ");
    }
}
}

//Самый популярный
//Дана последовательность целых чисел из N элементов. Найдите значение самого часто повторяющегося элемента массива.
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int arr[][] = new int[2][a];
        for(int i = 0; i < a; i++){
            arr[0][i] = in.nextInt();
        }
        for(int i = 0; i < a; i++){
            int counter = 1;
            for(int j = i; j < a; j++){
                if(arr[0][i] == arr[0][j] && i != j){
                    counter++;
                }
            }
            arr[1][i] = counter;
        }
        int max = -1;
        for(int i = 0; i < a; i++){
            if(arr[1][i] > max) max = arr[1][i];
        }
        for(int i = 0; i < a; i++){
            if(arr[1][i] == max) {
                System.out.println(arr[0][i]);
                break;
            }
        }
    }
}

//Отрицательные - налево!
//Дан массив целых чисел из N элементов. Переместить в начало массива все отрицательные значения массива, не меняя их относительного положения. То есть, каждый отрицательный элемент должен оказаться в том же порядке относительно всех отрицательных элементов, а каждый неотрицательный элемент - в том же порядке относительно всех неотрицательных элементов.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] list = new int[N];
        for(int i = 0; i<N; i++){
            list[i] = in.nextInt();
        }
        int i = 0;
        for(i = 0; i<N; i++){
            if(list[i]<0){System.out.print(list[i]+" ");}
        }
        for(int j = 0; j<N; j++){
            if(list[j]>=0&&i==N){System.out.print(list[j]+" ");}

        }
    }
}
