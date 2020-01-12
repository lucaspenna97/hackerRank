package Exercises;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Java {

    public static void javaStdinStdout() {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[3];

        for (int i=0; i<3; i++) {
            a[i] = scan.nextInt();
        }

        for (int i=0; i<3; i++) {
            System.out.println(a[i]);
        }

        scan.nextLine();
        scan.nextDouble();
    }

    public static void javaStdinStdout2() {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();

        scan.useDelimiter("\n");
        String s = scan.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }

    public static void javaOutputFormatting() {

        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for (int i=0; i<3 ; i++) {

            String s1=sc.next();
            int x=sc.nextInt();

            int result = 15 - s1.length();

            StringBuilder whiteSpace = new StringBuilder();
            for (int y=0; y<result; y++) whiteSpace.append(" ");

            String intFormatted = String.format("%03d", x);
            System.out.println(s1 + whiteSpace + intFormatted);

        }

        System.out.println("================================");
    }

    public static void javaLoops() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i=1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N*i));
        }

        scanner.close();
    }

    public static void javaLoops2() {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for (int i=0; i<t ; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int resultado = 0;
            StringBuilder string = new StringBuilder();

            int cont = 1;
            for (int y=1; cont<=n; y=(y*2)){

                resultado = ((y * b) + resultado);
                string.append(resultado + a).append(" ");
                cont++;
            }

            System.out.println(string);

        }
        in.close();
    }

    public static void javaDataTypes() {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x>=-128 && x<=127) System.out.println("* byte");

                boolean fitInSomething = false;

                try {
                    Short.parseShort(String.valueOf(x));
                    System.out.println("* short");
                    fitInSomething = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


                try {
                    Integer.parseInt(String.valueOf(x));
                    System.out.println("* int");
                    fitInSomething = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


                try {
                    Long.parseLong(String.valueOf(x));
                    System.out.println("* long");
                    fitInSomething = true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                if (!fitInSomething) {
                    System.out.println(x + " can't be fitted anywhere.");
                }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

    }

    public static void javaEndOfFile() {

        Scanner scanner = new Scanner(System.in);

        int cont = 0;

        while (scanner.hasNext()) {
            cont++;
            System.out.println(cont + " " + scanner.nextLine());
        }

    }

    public static void javaStaticInitializerBlock(int B, int H) {

        boolean flag = false;

        try {

            if (B > 0 && H > 0) {
                flag = true;
                System.out.println(B * H);

            } else {

                throw new Exception("Breadth and height must be positive");
            }

        } catch (Exception e) {

            System.out.println("java.lang.Exception: " + e.getMessage());

        }




    }

    public static void javaDateAndTime(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);

        Date date = calendar.getTime();

        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
        System.out.println(simpleDateformat.format(date));

    }

    public static void javaCurrencyFormatter() {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = numberFormatUS.format(payment);

        //NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(new Locale("en"));
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance();
        String india = numberFormatIndia.format(payment);

        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = numberFormatChina.format(payment);

        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = numberFormatFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india.replace("¤", "Rs."));
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

    public static void javaReview() {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String s = scanner.nextLine();
            System.out.println("\n");

            char[] c = s.toCharArray();

            for (int i=0; i < c.length; i+=2) {
                System.out.print(c[i]);
            }

            System.out.print(" ");

            for (int i=1; i < c.length; i+=2) {
                System.out.println(c[i]);
            }

        }


    }

    public static void javaStringIntroduction() {


        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) System.out.println("Yes");
        else System.out.println("No");

        String Ax = A.substring(0,1).toUpperCase() +  A.substring(1);
        String Bx = B.substring(0,1).toUpperCase() +  B.substring(1);

        System.out.println(Ax + " " + Bx);


    }

    public static void javaSubstringComparisons(String s, int k) {

        String smallest = "";
        String largest = "";

        smallest = largest = s.substring(0, k);


        for (int i=1; i<s.length()-k+1; i++) {

            String substr = s.substring(i, i+k);

            if (smallest.compareTo(substr) > 0) smallest = substr;

            if (largest.compareTo(substr) < 0) largest = substr;
        }

        System.out.println(smallest + "\n" + largest);


    }

    public static void javaStringReverse(String s) {

        boolean palindromo = true;
        int resultado = s.length()/2;

        for (int i=0; i < resultado; i++) {

            String x = String.valueOf(s.charAt(i));
            String z = String.valueOf(s.charAt((s.length()-1) - i));

            if (!x.equalsIgnoreCase(z)) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) System.out.println("Yes");
        else System.out.println("No");

    }

    public static void javaSubstring() {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String x = S.substring(start, end);
        System.out.println(x);
}

    public static void javaIsAnagram(String a, String b) {

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        if (arrayA.length != arrayB.length) System.out.println("Not Anagram");

        for (char c : arrayA) {

            int countA = 0;
            int countB = 0;

            for (char value : arrayA) {
                if (String.valueOf(c).equalsIgnoreCase(String.valueOf(value))) countA++;
            }

            for (char value : arrayB) {
                if (String.valueOf(c).equalsIgnoreCase(String.valueOf(value))) countB++;
            }

            if (countA != countB) System.out.println("Not Anagram");
        }

        System.out.println("Is Anagram");

    }

    public static void javaStringTokens() {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.trim();

        if (s.isEmpty()) {
            System.out.println("0");
            return;
        }

        String delims = "[ .,?!_'@]+";
        String[] tokens = s.split(delims);

        System.out.println(tokens.length);
        for (String s1: tokens) System.out.println(s1);

        scanner.close();

//        s = s.replace("!", "-")
//             .replace(",", "-")
//             .replace("?", "-")
//             .replace(".", "-")
//             .replace("_", "-")
//             .replace("'", "-")
//             .replace("@", "-")
//             .replace(" ", "-");
//
//
//        char[] charArray = s.toCharArray();
//        int count = 0;
//        int highCount = 0;
//
//        for (char c: charArray) {
//            if (String.valueOf(c).equals("-")) {
//                count ++;
//                if (count > highCount) highCount = count;
//            }
//            else count = 0;
//        }
//
//        for (int i=highCount; i >= 0; i--) {
//
//            String s1 = "";
//            for (int j=0; j <= i; j++) {
//                s1 = s1 + "-";
//            }
//            s = s.replace(s1, "-");
//        }
//
//
//        String[] array = s.split("-");
//        System.out.println(array.length);
//        for (String string: array) System.out.println(string);



    }




}

