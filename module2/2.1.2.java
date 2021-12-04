//Введите с клавиатуры целое число X (|X|≤109).

//В первых трех строках выведите это число на экран в двоичной, восьмеричной, 16-ричной системах счисления.

//В следующих двух строках выведите, поместится ли это число в ячейке типа byte и ячейке типа short ("YES"/"NO").

//Запрещается использовать циклы и знания о том, сколько именно байт/бит памяти занимают переменные типа int, byte, short.


import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
        Byte bt = Byte.valueOf((byte)num);
        System.out.println(bt == num ? "YES" : "NO");
        Short sh = Short.valueOf((short)num);
        System.out.println(sh == num ? "YES" : "NO");
    }
}
