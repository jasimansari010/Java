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




// Conditional Statements
/* public class Main {
    public static void main(String[] args) {
        char gender = 'M';
        if(gender=='F'){
            System.out.println("Good Morning, Sir");
        }else{
            System.out.println("Good Morning Ma'm");
        }
     }
} */






/* public class Main {
    public static void main(String[] args) {
        int age = 32;
        if(age>=18){
            System.out.println("Eligible for Vote");
        }else{
            System.out.println("Not ELigible");
        }
    }
} */




/* public class Main {
    public static void main(String[] args) {
        int marks = 65;
        if(marks >= 90){
            System.out.println("A");
        }else if(marks >= 80 && marks <= 90){
            System.out.println("B");
        }else if(marks >= 70 && marks <= 80){
            System.out.println("C");
        }else if(marks >= 60 && marks <= 70){
            System.out.println("D");
        }else if(marks >= 50 && marks <= 60){
            System.out.println("E");
        }else{
            System.out.println("Fail");
        }
    }
} */




/* public class Main {
    public static void main(String[] args) {
        int a=43,b=61,c=85;
        if(a>b){
            if(a>c){
                System.out.println(a);
            }
        }else if(b>a){
            if(b>c){
                System.out.println(b);
            }
        }else{
            System.out.println(c);
        }
    }
} */




//greatest between two number
/* import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Gretest number is " + num1);
        }else{
            System.out.println("Greatest number is " +num2);
        }
    }
} */




//check even odd
/* public class Main {
    public static void main(String[] args) {
        int num = 24;
        if(num%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
} */




/* public  class Main {
    public static void main(String[] args) {
        int day = 3;
        if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tueday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else if(day == 7){
            System.out.println("Sunday");
        }else{
            System.out.println("Invalid Day");
        }
    }
} */





/* public  class Main {
    public static void main(String[] args) {
        int day = 3;
        String dayName = "";
        if(day == 1){
            dayName = ("Monday");
        }else if(day == 2){
            dayName = ("Tueday");
        }else if(day == 3){
            dayName = ("Wednesday");
        }else if(day == 4){
            dayName = ("Thursday");
        }else if(day == 5){
            dayName = ("Friday");
        }else if(day == 6){
            dayName = ("Saturday");
        }else if(day == 7){
            dayName = ("Sunday");
        }else{
            dayName = ("Invalid Day");
        }
        System.out.println(dayName);
    }
} */





/* public class Main {
    public static void main(String[] args) {
        int year = 1900;
        if(year%100==0){
            if(year %400 == 0){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not leap year");
            }
        }else{
            if(year %4 == 0){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not leap year");
            }
        }
    }
} */




/* 
public class Main {
    public static void main(String[] args) {
        int year = 1700;
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
    }
} */




/* public class Main {
    public static void main(String[] args) {
        int amount = 12362;
        int discount=0;
        double bill=0;
        if(amount > 0 && amount <=5000){
            discount = 0;
            bill = amount;
        }else if(amount > 5000 && amount <=7000){
            discount = 5;
            bill = amount - (amount * 5 / 100.0);
        }else if(amount > 7000 && amount <= 9000){
            discount = 10;
            bill = amount - (amount * 10 / 100.0);
        }else if(amount > 9000){
            discount = 20;
            bill = amount - (amount * 20 / 100.0);
        }else{
            System.out.println("Invalid Amount");
            return;
        }
        System.out.println("Total Price = "+ amount);
        System.out.println("Price after " + discount  + " % discount = "+ bill);
    }
} */





// Switch Statement
/* public class Main {
    public static void main(String[] args) {
        int dayNum = 8;
        String dayName = "";
        switch(dayNum){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day Number";
                break;
        }
        System.out.println(dayName);
    }
} */



/* public class Main {
    public static void main(String[] args) {
        int dayNum = 5;

        String dayName = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day Number";
        };

        System.out.println(dayName);
    }
}

 */




//Control Flow Statement
/* public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.print(i  + ".hello! ");
        }
    }
} */




/* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number how many times you print hello: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            System.out.print(i  + ".hello! ");
        }
        sc.close();
    }
} */




/* public class Main {
    public static void main(String[] args) {
        int n = 20;
        for(int i=n;i>=1;i--){
            System.out.println(i);
        }
    }
} */




/* public class Main {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
} */






/* public class Main {
    public static void main(String[] args) {
        int n = 6;
        int fact = 1;
        for(int i = 1; i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
} 
 */






/* public class Main {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                System.out.print(" "  + i);
            }
        }
    }
} 
 */




/* public class Main {
    public static void main(String[] args) {
        int num = 108;
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println(count==2?"Prime":"Not Prime");
    }
} */






/* public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i=1;
        while(i<=n){
            System.out.println("hello");
            i++;
        }
    }
} */




/* public class Main {
    public static void main(String[] args) {
        int n = 370234;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit  + " ");
            n /= 10;
        }
    }
} */




//Sum of Digit
/* public class Main {
    public static void main(String[] args) {
        int n = 370234;
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println(sum);
    }
} */



//reverse of number
/* public class Main {
    public static void main(String[] args) {
        int n = 370234;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n /= 10;
        }
        System.out.print(rev);
    }
} */




// Palindrome or not
/* public class Main {
    public static void main(String[] args) {
        int n = 1221;
        int original = n;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }if(original==rev){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Plaindrome");
        }
    }
} */





// Palindrome or not
/* public class Main {
    public static void main(String[] args) {
        int n = 1221;
        int originalNum = n;
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(rev == originalNum ? "Palindrome":"Not Palindrome");
    }
} */




// Strong Number
/* public class Main{
    public static void main(String[] args) {
        int n = 146;
        int copy = n;
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            int fact = 1;
            for(int i=1;i<=lastDigit;i++){
                fact *= i;
            }
            sum+=fact;
            n/=10;
        }
        System.out.println(sum==copy?"Strong Number":"Not a Strong Number");
    }
} */





/* public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        do{
            System.out.println("hello");
            i++;
        }while(i<=n);
    }
} */



/* public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        do{
            System.out.println("hello");
            i++;
        }while(i>=n);          //wrong statement
    }
} */



