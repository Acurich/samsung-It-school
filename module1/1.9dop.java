//Периметр треугольника
//Разработайте два метода
//метод segmentLength, который принимает в качестве аргументов четыре целых числа x1,y1,x2,y2(−30000≤x1,y1,x2,y2≤30000, и возвращает вещественное число типа double - длину отрезка с концами в точках (x1;y1) и (x2;y2);
//метод trianglePerimetr, который принимает в качестве аргументов шесть целых чисел x1,y1,x2,y2,x3,y3(−30000≤x1,y1,x2,y2,x3,y3≤30000, и возвращает вещественное число типа double - периметр треугольника с вершинами в точках (x1;y1), (x2;y2) и (x3;y3). При разработке метода trianglePerimetr используйте уже разработанный метод segmentLength.
//Гарантируется, что данный треугольник существует.
//Методы segmentLength и trianglePerimetr должны:
//быть членами класса Geom;
//иметь спецификатор доступа public;
//быть статическими.
public class Geom {
       public static double segmentLength(long x_1, long y_1, long x_2, long y_2){
        double d;
        long i = Math.abs(x_1-x_2);
        long j = Math.abs(y_1-y_2);
        d = Math.sqrt(i*i+j*j);
        return d;
    }
    public static double trianglePerimetr(long x_1, long y_1, long x_2, long y_2, long x_3, long y_3){
        long i_1 = Math.abs(x_1-x_2);
        long j_1 = Math.abs(y_1-y_2);
        double d_1 = Math.sqrt(i_1*i_1+j_1*j_1);
        long i_2 = Math.abs(x_2-x_3);
        long j_2 = Math.abs(y_2-y_3);
        double d_2 = Math.sqrt(i_2*i_2+j_2*j_2);
        long i_3 = Math.abs(x_3-x_1);
        long j_3 = Math.abs(y_3-y_1);
        double d_3 = Math.sqrt(i_3*i_3+j_3*j_3);
        double answer = d_1+d_2+d_3;
        return answer;

    }
    
}


//Минимум 4 чисел
//Разработайте метод min, который который принимает в качестве аргумента четыре целых числа и возвращает наименьшее из четырех данных чисел. Данные числа по абсолютной величине не превосходят 109.
//Метод min должен:
//быть членом класса MyMath;
//иметь спецификатор доступа public;
//быть статическим.
public class MyMath {
public static int min(int a, int b)
{
if(a <= b) return a;
return b;
}
public static int min(int a, int b, int c, int d)
{
return min(min(a, b), min(c, d));
}  
}
