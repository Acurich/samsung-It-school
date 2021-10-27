//Проверить, является ли символ цифрой
//102 на informatics
//Напишите функцию boolean IsDigit(char c) (Java), function IsDigit(c:char):boolean (Pascal), bool IsDigit(unsigned char c) (C/C++), определяющую, является ли данный символ цифрой или нет.
//Естественно, программа должна считывать данные, вызывать эту функцию и выдавать ответ.
import java.util.Scanner;

public class Main{
    static boolean IsDijit(char c) {
        if(c >= '0' && c <= '9')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c = in.next().charAt(0);
        if(IsDijit(c))
            System.out.print("yes");
        else
            System.out.print("no");
        in.close();
    }
}

//Изменить регистр символа
//Дан символ C из таблицы кодировки ASCII. Измените регистр символа, если он был латинской буквой: сделайте его заглавным, если он был строчной буквой и наоборот. Для этого напишите отдельную функцию, меняющую регистр символа.
import java.util.*;
public class Main
{ 
    public static void main(String[] args)
    { 
        Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] s = str.toCharArray();
        String t = "";
        for (int x = 0; x < str.length(); x++)
        {  
            char c = str.charAt(x);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                t = t + Character.toLowerCase(c);
            else
                t = t + Character.toUpperCase(c);
        }
        System.out.println (t);
    }
}

//Количество слов
//Дана строка s, содержащая буквы латинского алфавита в верхнем и нижнем регистре, а также пробелы. Найдите, количество слов в строке s. Словом считается последовательность непробельных символов.
import java.util.Scanner;
 
public class Main {
 
        public static void main(String[] args) {
 
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int count = 0;
            if(input.length() != 0){
                count++;
                for (int i = 0; i < input.length(); i++) {
                    if(input.charAt(i) == ' '){
                        count++;
                    }
                }
            }
 
            System.out.println(count);
        }
}

//Самое длинное слово
//Дана строка s, содержащая буквы латинского алфавита в верхнем и нижнем регистре, а также пробелы. Найдите самое длинное слово в строке s, выведите это слово и его длину. Если таких слов несколько, выведите первое из них.
//Словом считается последовательность непробельных символов.
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;

public class Main
{
  static String max(String par)
  {
    String[]words=par.split(" ");
    String resstring="";
    for(String word: words)
    {
      if(word.length()>resstring.length())
        resstring=word;
    }
    return(resstring);
  }
 
  static public void main(String args[])
  {
    Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] s = str.toCharArray();
    System.out.println(max(str));
    System.out.println(max(str).length());
  }
}

//Является ли слово палиндромом?
//По данной строке s определите, является ли она палиндромом (то есть, можно ли прочесть ее наоборот, как, например, слово "топот").
import java.util.*;
import java.io.*;
 
public class Main
{
	public static void main(String[] args){
    Scanner console = new Scanner (System.in);
    String n = console.next(); 
    Printpalindrome(n);
}

public static void Printpalindrome(String n){
    String reverse = "";
    for ( int i = n.length() - 1; i >= 0; i-- ) {
        reverse = reverse + n.charAt(i);
    }
    if (n.equals(reverse))
        System.out.println("yes"); 
    else
        System.out.println("no"); 
}
}

//Две одинаковые буквы
//Дана строка S. Известно, что она содержит ровно две одинаковые буквы. Найдите эти буквы. Гарантируется, что повторяются буквы только одного вида.
import java.util.*;
    public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] s = str.toCharArray();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}


//Капитан Флинт
//Капитан Флинт зарыл клад на Острове сокровищ. Он оставил описание, как найти клад. Описание состоит из строк вида: "Direction n", где Direction – одно из слов "North", "South", "East", "West" – задает направление движения, а n – количество шагов, которое необходимо пройти в этом направлении.
//Напишите программу, которая по описанию пути к кладу определяет точные координаты клада, считая, что начало координат находится в начале пути, ось OX направлена на восток, ось OY – на север.



//Является ли строка палиндромом?
//Дана строка s, состоящая из строчных латинских букв и пробелов. Проверьте, является ли она палиндромом без учета пробелов (например, Лёша на полке клопа нашёл).
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        char[] arr = console.nextLine().toCharArray();
        boolean result = true;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            if (arr[i] == ' ' && arr[len - 1 - i] == ' ') {
            }
            else if (arr[i] == ' ') {
                len++;
            }
            else if (arr[len - 1 - i] == ' ') {
                i--;
                len--;
            }
            else if (arr[i] != arr[len - 1 - i]) {
                result = false;
                break;
            }
        }
        System.out.println(result ? "yes" : "no");
    }
}

//Шифр Юлия
//Юлий Цезарь использовал свой способ шифрования текста. Каждая буква заменялась на следующую по алфавиту через K позиций по кругу. Необходимо по заданной шифровке определить исходный текст.
import java.util.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] s = str.toCharArray();
		int ABC_SIZE = 26; 
		int k = in.nextInt();
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] s1 = str1.toCharArray();
		for(int i = 0; i < s.length; i++){
			int find = s[i] - 'A';
			if(find - k < 0) s[i] = s1[ABC_SIZE - (k - find)];
			else s[i] = s1[find-k];
 
		}
	System.out.println(s);
	}
}

//Удали пробелы
//Дана строка s, требуется преобразовать все идущие подряд пробелы в один.
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
                char[] arr = console.nextLine().toCharArray();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                if (flag) {
                    continue;
                }
                else {
                    flag = true;
                }
            }
            else {
                flag = false;
            }
            System.out.print(arr[i]);
        }

        console.close();
    }
}
