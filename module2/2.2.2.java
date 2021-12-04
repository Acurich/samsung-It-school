//Напишите класс Vector2D (вектор на плоскости).

//В классе необходимо предусмотреть:

//Два публичных дробных поля (double) vX и vY - значения проекций вектора на оси.

//Конструктор без параметров, который инициализирует вектор значениями (1,1).

//Конструктор с двумя параметрами (проекция на ось X, проекция на ось Y).

//Конструктор с параметром Vector2D (такие конструкторы в литературе принято называть конструкторами копирования).

//Метод print(), который выводит вектор на экран в виде: (vX, vY), при этом значения проекций округлить до двух знаков после запятой. Разделитель в дробных числах - точка. Например, при печати вектора с проекциями vX = 1.2374 и vY = 2.2334, на экране должно появиться (1.24, 2.23).

//Для организации форматного вывода можно воспользоваться методом format класса String. После выполнения следующей строки

import java.util.Locale;

public class Vector2D {

    double vX, vY;
    static int count = 0;
    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D v) {
        this(v.vX, v.vY);
    }

    public void print() {
        System.out.println(String.format(Locale.US,"(%.2f, %.2f)", this.vX, this.vY));
    }
    public double  length()
    {
        return  Math.sqrt(this.vX * this.vX  + this.vY * this.vY);
    }
    public void add(Vector2D v)
    {
        this.vX += v.vX;
        this.vY += v.vY;
    }
    public void sub(Vector2D v)
    {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }
    public void scale(double scaleFactor)
    {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
    public void normalized()
    {
        double len = this.length();
        this.vX /= len;
        this.vY /= len;
    }
    public double dotProduct(Vector2D v)
    {
        return  this.vX * v.vX + this.vY * v.vY;
    }
}


//Необходимо дополнить класс из предыдущего задания следующими методами:
//Метод вычисления длины вектора length().
//Метод add(Vector2D v), прибавляющий вектор, указанный в аргументе, к текущему.
//Метод sub(Vector2D v), вычитающий вектор, указанный в аргументе, из текущего.
//Метод scale(double scaleFactor), умножающий текущий вектор на scaleFactor.

import java.util.Locale;

public class Vector2D {

    double vX, vY;
    static int count = 0;
    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D v) {
        this(v.vX, v.vY);
    }

    public void print() {
        System.out.println(String.format(Locale.US,"(%.2f, %.2f)", this.vX, this.vY));
    }
    public double  length()
    {
        return  Math.sqrt(this.vX * this.vX  + this.vY * this.vY);
    }
    public void add(Vector2D v)
    {
        this.vX += v.vX;
        this.vY += v.vY;
    }
    public void sub(Vector2D v)
    {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }
    public void scale(double scaleFactor)
    {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
    public void normalized()
    {
        double len = this.length();
        this.vX /= len;
        this.vY /= len;
    }
    public double dotProduct(Vector2D v)
    {
        return  this.vX * v.vX + this.vY * v.vY;
    }
}


//Необходимо дополнить класс из предыдущего задания следующим:

//Метод normalized(), нормализующий текущий вектор. Нормализация вектора — это преобразование заданного вектора в вектор в том же направлении, но с единичной длиной.

//Метод dotProduct(Vector2D v), возвращающий скалярное произведение вектора, указанного в аргументе, и текущего вектора. Скалярным произведением двух векторов a и b будет скалярная величина, равная сумме попарного произведения координат векторов a и b.

//Статическое поле count для подсчета количества созданных векторов.
import java.util.Locale;

public class Vector2D {

    double vX, vY;
    static int count = 0;
    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
        count++;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D v) {
        this(v.vX, v.vY);
    }

    public void print() {
        System.out.println(String.format(Locale.US,"(%.2f, %.2f)", this.vX, this.vY));
    }
    public double  length()
    {
        return  Math.sqrt(this.vX * this.vX  + this.vY * this.vY);
    }
    public void add(Vector2D v)
    {
        this.vX += v.vX;
        this.vY += v.vY;
    }
    public void sub(Vector2D v)
    {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }
    public void scale(double scaleFactor)
    {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
    public void normalized()
    {
        double len = this.length();
        this.vX /= len;
        this.vY /= len;
    }
    public double dotProduct(Vector2D v)
    {
        return  this.vX * v.vX + this.vY * v.vY;
    }
}
