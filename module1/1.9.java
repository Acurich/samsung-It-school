//Разработайте метод SumOfDigits, который принимает в качестве аргумента целое неотрицательное число n(0≤n≤109) и возвращает сумму его цифр.
//Метод SumOfDigits должен:
//быть членом класса NumberDigits;
//иметь спецификатор доступа public;
//быть статическим.
public class NumberDigits {
  public static int SumOfDigits(int x) {
    var result = 0;
    while (x > 0) {
      result += x % 10;
      x /= 10;
    }
    return result;
  }
}
 
//Разработайте метод SumOfSeven, который который принимает в качестве аргументов два целых неотрицательных числа a,b(0≤a,b≤109) и возвращает сумму цифр во всех двузначных натуральных числах, кратных 7 на отрезке [a;b].
//Метод SumOfSeven должен:
//быть членом класса NumberDigits;
//иметь спецификатор доступа public;
//быть статическим.
import java.util.Scanner;
public class NumberDigits {
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        System.out.println(SumOfSeven(a ,b));
    }
    
        public static int SumOfSeven(int a, int b){
           int sum = 0;
            for(int i = a; i<=b; i++){
                    if (i%7==0&&i<100&&i>9){sum += i%10+i/10;}}
            return sum;

    }
}


//Разработайте метод SumOfThirteen, который который принимает в качестве аргумента целое неотрицательное число n(0≤n≤104) и возвращает количество целых неотрицательных чисел, меньших n, сумма цифр которых кратна 13.
//Метод SumOfThirteenдолжен:
//быть членом класса NumberDigits;
//иметь спецификатор доступа public;
//быть статическим
import java.util.Scanner;
public class NumberDigits {
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        System.out.println(SumOfThirteen(a));
    }

        public static int SumOfThirteen(int a){
            int sum = 0;
            for(int i = 0;  i<a; i++){
                int i_2 = i;
                int N = 0;
                int summa_zifr = 0;
                while (i_2!=0){
                    i_2 = i_2/10;
                    N++;
                }
                int g = 1;
                for(int j = 1; j<=N; j++){
                    summa_zifr += (i/g)%10;
                    g*=10;
                }
                if (summa_zifr % 13 == 0){sum++;}
            }
            return sum;

    }
    
}

//Разработайте метод BinFraction, который который принимает в качестве аргументов вещественное число x(0<x≤20) и целое положительное число n(0<n≤10) и выводит на экран n первых двоичных разрядов дробной части числа x.
//Метод BinFraction должен:
//быть членом класса NumberDigits;
//иметь спецификатор доступа public;
//быть статическим.



//Разработайте метод avgOf4Digit, который который принимает в качестве аргумента массив целых чисел и возвращает вещественное число типа double - среднее арифметическое элементов массива, которые являются четырехзначными натуральными числами. Элементы массива по абсолютной величине не превосходят 109. Количество элементов массива не превосходит 104.
//Если в массиве нет таких чисел, метод должен вернуть число -1.
//Метод avgOf4Digit должен:
//быть членом класса MyArrays;
//иметь спецификатор доступа public;
//быть статическим.




//Разработайте метод minToBegin, который принимает в качестве аргумента массив целых чисел, находит наименьший элемент массива и переставляет его в начало массива (под индексом 0). Остальные элементы сдвигаются, соответственно, вправо, на одну позицию. Если в массиве несколько одинаковых наименьших элементов, переставлять нужно тот из них, который имеет наименьший номер. Элементы массива по абсолютной величине не превосходят 109. Количество элементов массива не превосходит 104.
//Метод minToBegin должен:
//быть членом класса MyArrays;
//иметь спецификатор доступа public;
//быть статическим.
public class MyArrays {
    public static void minToBegin(int [] arr)
    {
        int min=arr[0],imin=0;
        int i_f,i_t;
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                imin=i;
                min=arr[i];
            }
        }
        i_t=imin;
        i_f=i_t-1;
        while(i_f>=0)
        {
            arr[i_t--]=arr[i_f--];
        }
        arr[0]=min;     
    }
    
}

