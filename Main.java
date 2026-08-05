/*
public class Main{
    public static void main(String[] args){
        System.out.println("Hello Bro!");
    }
}
*/

/* 
public class Main{
    public static void main(String[] args) {
        int age = 18;
        System.out.println("age = "+ age);
    }
}
*/


/*
public class Main{
    public static void main(String[] args) {
        int a = 18,b=20;
        int sum = a+b;
        System.out.println("sum of "+ a +" and " + b + " = " + sum);
    }
}
*/





/* 
public class Main{
    public static void main(String[] args) {
        System.out.println("1" + 1 + 2 + (8+2));
    }
}
*/





/* 
public class Main{
    public static void main(String[] args) {
        byte b = 100;
        short s = 200;
        int i = 5_72_369;
        long l = 1_34_54_65_345;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        
        
        float f = 1.5f;
        double d = 90.43;

        System.out.println(f);
        System.out.println(d);


        boolean a = true;
        System.out.println(a);

    }
}
*/



/* 
public class Main{
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(010);        //8
    }
}
*/



/* 
public class Main{
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println(010);        //8--octal
        System.out.println(0b10);       //2 --binary
        System.out.println(017);        //15--octal
        System.out.println(0x15);       //21--hexadec
        System.out.println(0x15A);      //346---hexadec
    }
}
*/


/* 
public class Main{
    public static void main(String[] args){
        // Implicit type conversion
        short s = 54;
        int a = s;
        System.out.println(a);


        // Explicit type conversion
        long l = 45;
        int b = (int)l;
        System.out.println(b);

        long l2 = 12345678902L;
        System.out.println(l2);
        int c = (int)l2;
        System.out.println(c);


    }
}
*/


/*
public class Main{
    public static void main(String[] args){
        System.out.println(9/2);
        System.out.println((float)9/2);
    }
}
*/


/* 
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("a is equal to: "+ a);

        System.out.print("Enter the value of b: ");
        float b = sc.nextFloat();
        System.out.println("a is equal to: "+ b);

        System.out.print("Enter the character: ");
        char c = sc.next().charAt(0);
        System.out.println("character is: "+ c);


        sc.nextLine();

        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("name is: "+ name);
    }
}
*/




/* 
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a,b,c: ");
        int a = sc.nextInt();
        
        float b = sc.nextFloat();

        char c = sc.next().charAt(0);

        System.out.println("a is "+a + " \nb is " + b +" \nc is "+ c);
    }
}
*/



/* 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("The sum of " + num1 + " and " + num2 +" is " + sum);
    }
}
*/







// Operators
/* 
public class Main{
    public static void main(String[] args) {
        int a = 100;
        int b = 22;

        System.out.println("addition is :" + (a+b));
        System.out.println("Subtraction is :" + (a-b));
        System.out.println("Multiplication is :" + (a*b));
        System.out.println("Division is :" + ((float)a/b));
        System.out.println("Remainder is :" + (a%b));
    }
}
*/



/* 
public class Main{
    public static void main(String[] args) {
        int a = 100;
       

        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(--a);
    }
}
*/



/* 
public class Main{
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println(ch++);
        System.out.println(++ch);
    }
}
*/


/* 
public class Main{
    public static void main(String[] args) {
        int ch = 'a';
        System.out.println(ch++);
        System.out.println(++ch);
    }
}
*/



/* 
public class Main{
    public static void main(String[] args) {
        System.out.println(10>9);
        System.out.println(10>=9);
        System.out.println(10<9);
        System.out.println(10<=9);
        System.out.println(10==9);
        System.out.println(10!=9);
    }
}
*/



/* 
public class Main {
    public static void main(String[] args) {
        System.out.println(10>5 && 1>2);
        System.out.println(10<5 && 1<2);
        System.out.println(10>5 && 1<2);

        System.out.println();
        System.out.println(10>5 || 1>2);
        System.out.println(10<5 || 1<2);
        System.out.println(10<5 || 1>2);
    }
}
*/




/* 
public class Main{
    public static void main(String[] args) {
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);

        System.out.println(~5);
        System.out.println(~12);
        System.out.println(~99);

        System.out.println(5 << 1);
        System.out.println(5 << 2);
        System.out.println(5<<6);

        System.out.println(16 >> 1);
        System.out.println(16 >> 2);
        System.out.println(16 >> 4);
    }
}
*/







//Math Class
/* 
public class Main {
    public static void main(String[] args) {
        int a=10, b=43;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.abs(-7));
        System.out.println(Math.floor(7.6));
        System.out.println(Math.ceil(7.6));
        System.out.println(Math.round(7.6));
        System.out.println(Math.round(7.5));
        System.out.println(Math.round(7.3));

        System.out.println();


        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(8));
        System.out.println(Math.cbrt(16));
    }
}
*/




