// import java.util.*;

// public class Calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your first number:= ");
//         int a = sc.nextInt();
//         System.out.print("Enter your operator:= ");
//         char b = sc.next().charAt(0);
//         System.out.print("Enter your second number:= ");
//         int c = sc.nextInt();
//         int d;
//         switch (b) {
//             case '+':
//                 d = (a + c);
//                 System.out.print(a + "+" + c + " = " + d);
//                 break;
//             case '-':
//                 d = (a - c);
//                 System.out.print(a + " - " + c + " = " + d);
//                 break;
//             case '*':
//                 d = (a * c);
//                 System.out.print(a + "*" + c + "=" + d);
//                 break;
//             case '/':
//                 if (c != 0) {
//                     d = a / c;
//                     System.out.print(a + "/" + c + "=" + d);
//                 } else {
//                     System.out.print("Cannot devide by zero");
//                 }
//                 break;

//             default:
//                 System.out.print("Invalid operator.");
//         }
//     }
// }

                         //Object as parameter

// import java.util.*;

// class Sam {
//     int x, z, m;
//     char n;

//     void set_data(int d, int f, char g) {
//         x = d;
//         z = f;
//         n = g;
//     }

//     void check() {
//         switch (n) {
//             case '+':
//                 m = x + z;
//                 System.out.print(x + " + " + z + " = " + m);
//                 break;
//             case '-':
//                 m = x - z;
//                 System.out.print(x + " - " + z + " = " + m);
//                 break;
//             case '*':
//                 m = x * z;
//                 System.out.print(x + " * " + z + " = " + m);
//                 break;
//             case '/':
//                 if (z == 0) {
//                     System.out.print("Cannot divide by zero.");
//                 } else {
//                     m = x / z;
//                     System.out.print(x + " / " + z + " = " + m);
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid operator. Please check your operator.");
//         }
//     }
// }

// class Calculator {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter your operator (+,-,*,/): ");
//         char b = sc.next().charAt(0);
//         System.out.print("Enter your second number: ");
//         int c = sc.nextInt();
        
//         Sam s1 = new Sam();
//         s1.set_data(a, c, b);
//         s1.check();
//     }
// }


                      //return type with object

import java.util.*;

class Sam {
    int g, x, p;
    char z;

    void set_data(int d, int e, char f) {
        g = d;
        x = e;
        z = f;
    }

    int check(Sam ob) {
        switch (ob.z) {
            case '+':
                p = ob.g + ob.x;
                break;
            case '-':
                p = ob.g - ob.x;
                break;
            case '*':
                p = ob.g * ob.x;
                break;
            case '/':
                if (ob.x == 0) {
                    System.out.print("Cannot divide by zero.");
                    return 0;
                } else {
                    
                    p = ob.g / ob.x;
                }
                break;
            default:
                System.out.println("Invalid operator.Please check operator.");
                return 0;
        }
        return p;
    }
}

public class Calculator {
    public static void main(String[] args) {
        int a, b;
        char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number:= ");
        a = sc.nextInt();
        System.out.print("Enter your operator (+,-,*,/):= ");
        c = sc.next().charAt(0);
        System.out.print("Enter your second number:= ");
        b = sc.nextInt();
        Sam s1 = new Sam();
        s1.set_data(a, b, c);
        int m = s1.check(s1);
        System.out.println("Result is = " + m);
    }
}