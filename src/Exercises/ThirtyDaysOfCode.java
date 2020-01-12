package Exercises;

import java .util.*;

public class ThirtyDaysOfCode {

    public static void thirtyDaysOfCodeDataTypes(int i, double d, String s) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();
        scanner.nextLine();
        String z = scanner.nextLine();

        System.out.println(x + i);
        System.out.println(y + d);
        System.out.println(z + s);
    }

    public static void thirtyDaysOfCodeOperators(double meal_cost, int tip_percent, int tax_percent) {

        double resultado1 = (meal_cost * tax_percent)/100;
        double resultado2 = (meal_cost * tip_percent)/100;
        double resultado3 = meal_cost + resultado1 + resultado2;

        int i = (int) Math.round(resultado3);
        System.out.println(i);
    }

    public static void thirtyDaysOfCodeConditionalStatements() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 1) {

            System.out.println("Weird");

        } else {

            if (N >= 2 && N <= 5) System.out.println("Not Weird");

            if (N >= 6 && N <= 20) System.out.println("Weird");

            if ( N > 20) System.out.println("Not Weird");
        }

        scanner.close();
    }

    public static void thirtyDaysOfCodeArrays() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for (int j=arr.length; 0 < j; j--) {
            System.out.print(arr[j-1]);
            System.out.print(" ");
        }

        scanner.close();
    }

    private static int thirtyDaysOfCodeRecursion(int value) {

        if (value == 0) {
            return 1;
        } else {
            return value * thirtyDaysOfCodeRecursion(value-1);
        }

    }

    public static void thirtyDaysOfCodeDictionariesAndMaps() {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> phoneNumbers = new HashMap<>();

        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            phoneNumbers.put(name, phone);
        }

        while(in.hasNext()){

            String s = in.next();

            if (phoneNumbers.containsKey(s)){
                int value = phoneNumbers.get(s);
                System.out.println(s + "=" + value);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();

    }

    public static void thirtyDaysOfCodeAbstractClasses() {

        abstract class Book {
            String title;
            String author;

            public Book(String title, String author) {
                this.title = title;
                this.author = author;
            }

            public abstract void display();
        }

        class MyBook extends Book {
            int price;

            MyBook(String title, String author, int price) {
                super(title, author);
                this.price = price;
            }

            public void display() {
                System.out.println("Title: " + title);
                System.out.println("Author: " + author);
                System.out.println("Price: " + price);
            }
        }

        Book book = new MyBook("titulo", "autor", 100);
        book.display();
    }

    public static void thirtyDaysOfCodeScope () {
        int[] elements = {1,2,5};
        int maximumDifference = 0;

        for (int element : elements) {
            for (int i : elements) {

                int resultado = element - i;
                if (resultado > maximumDifference) maximumDifference = resultado;

            }
        }

        System.out.println(maximumDifference);
    }

    private static void thirtyDaysOfCodeBinaryNumbers() {

        int n;
        int a;
        int count = 0;
        int maxOnes = 0;
        String x = "";

        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();

        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
                if (count > maxOnes) maxOnes = count;
            } else {
                count = 0;
            }

            x = a + "" + x;
            n = n / 2;
        }

        System.out.println("Binary number:" + x);
        System.out.println("Max ones in sequence: " + maxOnes);
    }

    public static void thirtyDaysOfCodeExceptions() {

        class Calculator {
            public int power(int n, int p) throws Exception {

                int value = 1;

                if(n < 0 || p < 0) throw new Exception("n and p should be non-negative");
                for (int i=0; i < p; i++) { value = n * value; }

                return value;
            }
        }

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();

    }

    private static void thirtyDaysOfCode2DArrays() {

        int[][] arr = new int[6][6];
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                arr[i][j] = random.nextInt(10);
                System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + " ");
            }

            System.out.print("\n");
        }

        //----------------------
        System.out.print("\n");
        //---------------------


        int sum = 0;
        int maiorValor = -99;

        for (int k = 0; k < 4; k++ ) {
            for (int z = 0; z < 4; z++) {

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        if (i==1 && j==0 || i==1 && j==2) System.out.print(" ");
                        else {
                            System.out.print(arr[i+k][j+z] + " ");
                            sum = sum + arr[i+k][j+z];
                        }

                    }
                    System.out.print("\n");
                }

                if (maiorValor == -99) maiorValor = sum;
                if (sum > maiorValor) maiorValor = sum;
                sum=0;

                System.out.print("\n");
            }
        }

        System.out.println("Maior valor: " + maiorValor);

    }

    private static void thirtyDaysOfCodeInheritance() {

        class Student {

            private String firstName;
            private String lastName;
            private String id;
            private int[] testScores;

            public Student(String firstName, String lastName, String id, int[] testScores) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.id = id;
                this.testScores = testScores;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int[] getTestScores() {
                return testScores;
            }

            public void setTestScores(int[] testScores) {
                this.testScores = testScores;
            }

            public void printPerson() {
                System.out.println("Name: " + lastName + ", " + firstName);
                System.out.println("ID: " + id);
            }

            public void calculate() {

                float score = 0;

                for (int testScore : testScores) {
                    score = testScore + score;
                }

                score = score / testScores.length;

                if (score >= 90 && score <= 100) System.out.println("Grade: O");
                if (score >= 80 && score <= 90) System.out.println("Grade: E");
                if (score >= 70 && score <= 80) System.out.println("Grade: A");
                if (score >= 55 && score <= 70) System.out.println("Grade: P");
                if (score >= 40 && score <= 55) System.out.println("Grade: D");
                if (score < 40) System.out.println("Grade: T");

            }

        }

        int[] testScores = {80, 100, 50};
        Student student = new Student("Lucas", "Penna", "123", testScores);
        student.printPerson();
        student.calculate();

    }

    public static void thirtyDaysOfCodeQueuesAndStacks() {

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();


        for(Character c: chars){
            stack.push(c);
            queue.add(c);
        }

        System.out.println(stack);
        System.out.println(queue);
    }

    public static void thirtyDaysOfCodeInterfaces(int n) {

        int soma = 0;

        for (int i=1; i <= n; i++) {
            if (n % i == 0) {
                soma = i + soma;
            }
        }

        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(soma);

    }

    public static void thirtyDaysOfCodeBubbleSort() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int numberOfSwaps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {

                    int auxA = a[j];
                    int auxB = a[j+1];

                    a[j] = auxB;
                    a[j+1] = auxA;
                    numberOfSwaps++;
                }
            }

            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: "  + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);

    }

    public static void thirtyDaysOfCodeGenerics(List<?> list) {

        for (Object object: list) {
            System.out.println(object.toString());
        }
    }



}
