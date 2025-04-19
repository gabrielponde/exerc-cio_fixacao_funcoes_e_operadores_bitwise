package src;

import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        System.out.println(n1 & n2);
//        System.out.println(n1 | n2);
//        System.out.println(n1 ^ n2);
//
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int mask = 0b100000;
//        int n = sc.nextInt();
//        if ((n & mask) != 0) {
//            System.out.println("6th bit is true!");
//        }
//        else {
//            System.out.println("6th bit is false");
//        }
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        String original = "abcde FGHIJ ABC abc DEFG ";
//
//        String s01 = original.toLowerCase();
//        String s02 = original.toUpperCase();
//        String s03 = original.trim();
//        String s04 = original.substring(2);
//        String s05 = original.substring(2, 9);
//        String s06 = original.replace('a', 'x');
//        String s07 = original.replace("abc","xy");
//        int i = original.indexOf("bc");
//        int j = original.lastIndexOf("bc");
//
//        System.out.println("Original: - " + original + " - ");
//        System.out.println("toLowerCase: - " + s01 + " - ");
//        System.out.println("toUpperCase: - " + s02 + " - ");
//        System.out.println("trim: - " + s03 + " - ");
//        System.out.println("substring(2): - " + s04 + " - ");
//        System.out.println("substring(2, 9): - " + s05 + " - ");
//        System.out.println("replace('a', 'x'): - " + s06 + " - ");
//        System.out.println("replace('abc', 'xy'): - " + s07 + " - ");
//        System.out.println("Index of 'bc': " + i);
//        System.out.println("Last index of 'bc': " + j);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String s = "potato apple lemon";
//
//        String[] vect = s.split(" ");
//
//        System.out.println(vect[0]);
//        System.out.println(vect[1]);
//        System.out.println(vect[2]);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter three numbers:");
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a > b && a > c) {
//            System.out.println("Higher = " + a);
//        } else if (b > c) {
//            System.out.println("Higher = " + b);
//        } else {
//            System.out.println("Higher = " + c);
//        }
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int higher = max(a, b, c);

        showResult(higher);
        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
    public static void showResult(int value) {
        System.out.println("Higher = " + value);
        }
    }
