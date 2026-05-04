// Write a code print hello world
// void main(){
//     System.out.print("Hello World!" + "- ");
//     System.out.println("Welcome to Java programming.");
//     System.out.println("4+3");
//     System.out.println(4+3);
// }


// public class Basic {
//     public static void main(String[] args){
//         System.out.print("Hello World!" + "- ");
//         System.out.println("Welcome to Java programming.");
//         System.out.println("4+3");
//         System.out.println(4+3);
//     }
// }




//Understanding variables and data types
// public class Basic {
//     public static void main(String[] args){
//         int age = 4;
//         int Age = 3;
//         System.out.println("age = " + age);
//         System.out.println("Age = " + Age);
//     }
// }   
 

// public class Basic {
//     public static void main(String[] args){
//         int age = 14;
//         float percentage = 88.7f;
//         char grade = 'A';
//         boolean isPassed = true;
//         System.out.println("age = " + age);
//         System.out.println("percentage = " + percentage + "%");
//         System.out.println("grade = " + grade);
//         System.out.println("isPassed = " + isPassed);
//     }
// }


// ASCII values of characters
// public class Basic {
//     public static void main(String[] args){
//         char letterA = 'A';
//         char letterb = 'b';
//         char digit_9 = '9';
//         System.out.println("ASCII value of " + letterA + " = " + (int)letterA);
//         System.out.println("ASCII value of " + letterb + " = " + (int)letterb);
//         System.out.println("ASCII value of " + digit_9 + " = " + (int)digit_9);
//     }
// }






// Type casting and conversion
// public class Basic {
//     public static void main(String[] args){  
//         int num1 = 10;
//         double num2 = num1; // Implicit type casting
//         System.out.println(num2);

//         double num3 = 7.8;
//         int num4 = (int)num3; // Explicit type casting
//         System.out.println(num4);

//         char letter = 'A';
//         int letterValue = letter; // Implicit type casting
//         System.out.println("Value of letter A is: " + letterValue);


//         int num5 = 65;
//         char char_value = (char)num5; // Explicit type casting
//         System.out.println("Character representation of 65 is: " + char_value);
//     }
// }
    




// Basic arithmetic operations
// public class Basic {
//     public static void main(String[] args){
//         int num1 = 120;
//         int num2 = 38;
//         int sum = num1 + num2;
//         int difference = num1 - num2;
//         int product = num1 * num2;
//         int quotient = num1 / num2;
//         int remainder = num1 % num2;

//         System.out.println("num1 = " + num1);
//         System.out.println("num2 = " + num2);
//         System.out.println("sum = " + sum);
//         System.out.println("difference = " + difference);
//         System.out.println("product = " + product);
//         System.out.println("quotient = " + quotient);
//         System.out.println("remainder = " + remainder);
//     }
// }




// relational operators
// public class Basic {
//     public static void main(String[] args){
//         int num1 = 20;
//         int num2 = 10;

//         System.out.println("num1 = " + num1);
//         System.out.println("num2 = " + num2);
//         System.out.println("num1 > num2: " + (num1 > num2));
//         System.out.println("num1 < num2: " + (num1 < num2));
//         System.out.println("num1 == num2: " + (num1 == num2));
//         System.out.println("num1 != num2: " + (num1 != num2));
//         System.out.println("num1 >= num2: " + (num1 >= num2));
//         System.out.println("num1 <= num2: " + (num1 <= num2));
//     }
// }





// logical operators
// public class Basic {
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;

//         System.out.println((a+b>=30) && (b+a>=30));
//         System.out.println((a+b>=30) || (b+a<=30));
//         System.out.println(!(a+b ==30));
//     }
// }


// public class Basic {
//     public static void main(String[] args){
//         int a = 10;
//         int b = 20;

//         System.out.println("value of a = " + a);
//         System.out.println("value of b = " + b);
//         System.out.println("a == 10 && b == 30: " + ((a==10) && (b==30)));
//         System.out.println("a == 10 || b == 30: " + ((a==10) || (b==30)));
//         System.out.println("!(a == 10): " + (!(a==10)));
//         System.out.println("!(a == 20): " + (!(a==20)));
//     }
// }







// Assignment operators
// public class Basic {
//     public static void main(String[] args){
//         int num = 10;
//         System.out.println("Initial value of num: " + num);

//         num += 5; // num = num + 5
//         System.out.println("After += 5: " + num);

//         num -= 3; // num = num - 3
//         System.out.println("After -= 3: " + num);

//         num *= 2; // num = num * 2
//         System.out.println("After *= 2: " + num);

//         num /= 4; // num = num / 4
//         System.out.println("After /= 4: " + num);

//         num %= 3; // num = num % 3
//         System.out.println("After %= 3: " + num);
//     }
// }





//Unary Increment and Decrement Operators
// public class Basic {
//     public static void main(String[] args){
//         int num = 5;
//         System.out.println("Initial value of num: " + num);

//         // Post-increment
//         System.out.println("Post-increment (num++): " + (num++)); // prints 5, then num becomes 6
//         System.out.println("Value of num after post-increment: " + num); // prints 6

//         // Pre-increment
//         System.out.println("Pre-increment (++num): " + (++num)); // num becomes 7, then prints 7
//         System.out.println("Value of num after pre-increment: " + num); // prints 7

//         // Post-decrement
//         System.out.println("Post-decrement (num--): " + (num--)); // prints 7, then num becomes 6
//         System.out.println("Value of num after post-decrement: " + num); // prints 6

//         // // Pre-decrement
//         System.out.println("Pre-decrement (--num): " + (--num)); // num becomes 5, then prints 5
//         System.out.println("Value of num after pre-decrement: " + num); // prints 5
//     }
// }   





//Ternary Operator
// public class Basic {
//     public static void main(String[] args){
//         int num1 = 10;
//         int num2 = 20;

//         // Using ternary operator to find the maximum of two numbers
//         int max = (num1 > num2) ? num1 : num2;
//         System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);

//         // Using ternary operator to check if a number is even or odd
//         int number = 16;
//         String result = (number % 2 == 0) ? "Even" : "Odd";
//         System.out.println(number + " is an " + result);
//     }
// }





// InstanceOf Operator- Intanceof work only with objects and not with primitive data types
// public class Basic {
//     public static void main(String[] args){
//         Integer num = 10;

//         System.out.println(num instanceof Integer); // true
//         System.out.println(num instanceof Object);  // true
//     }
// }



//Taking Input from user
// import java.util.Scanner;
// public class Basic {
//     public static void main(String[] args){
//         Scanner sc= new Scanner(System.in);
//         int num1, num2;
//         System.out.print("Enter first number: ");
//         num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         num2 = sc.nextInt();
//         System.out.println("first value: " + num1 + " " + "Second value: " + num2);
//         System.out.println("Sum: " + (num1 + num2));
//         System.out.println("Difference: " + (num1 - num2));

//         sc.nextLine();
//         System.out.print("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.println("My name is " + name);
//     }
// }





//conditional statements
//if statement
// public class Basic {
//     public static void main(String[] args){
//         int num = 15;
//         if(num > 0 ){
//             System.out.println(num);
//         }
//     }
// }   




// if-else statement
// public class Basic {
//     public static void main(String[] args){
//         int age = 18;
//         if(age >= 18 ){
//             System.out.println("You are eligible to vote.");
//         }else{
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }   




// if-else if statement
// import java.util.Scanner;
// public class Basic {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your marks: ");
//         int marks = sc.nextInt();
//         if(marks >= 90){
//             System.out.println("Grade: A");
//         }else if(marks >= 70){
//             System.out.println("Grade: B");
//         }else if(marks >= 50){
//             System.out.println("Grade: C");
//         }else{
//             System.out.println("Fail");
//         }
//     }
// }





//if-else ladder
// import java.util.Scanner;
// public class Basic {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         if (age >= 18) {
//             System.out.print("Do you have ID? (true/false): ");
//             boolean Id = sc.nextBoolean();

//             if (Id) {
//                 System.out.println("You are eligible to vote");
//             } else {
//                 System.out.println("ID required");
//             }
//         } else {
//             System.out.println("Not Eligible");
//         }
//     }
// }





// nested if else
// public class Basic{
//     public static void main(String[] args) {
//         int age = 10;
//         boolean hasID = true;

//         if (age >= 18) {
//             if (hasID) {
//                 System.out.println("Allowed entry");
//             } else {
//                 System.out.println("ID required");
//             }
//         } else {
//             System.out.println("Not allowed");
//         }
//     }
// }





//Switch Statement
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day");
        }
    }
}




