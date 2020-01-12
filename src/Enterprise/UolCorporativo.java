package Enterprise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class UolCorporativo {

    public static void main(String[] args) {

        //fizzBuzz(15);

        //String[] values = {"{}[]()", "{[}]"};
        //braces(values);


        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(3);
        ints.add(46);
        ints.add(1);
        ints.add(3);
        ints.add(9);

        //countPairs(ints, 47);

    }

    private static void fizzBuzz(int n) {

        for(int i=1; i <= n; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 3 == 0) && !(i % 5 == 0)) {
                System.out.println("Fizz");
            } else if (!(i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }

    }

    static String[] braces(String[] values) {

        Stack<Character> stack  = new Stack<>();
        String[] response = new String[values.length];
        int count = 0;

        for (String valor: values) {

            boolean balanced = true;

            for(int i = 0; i < valor.length(); i++) {

                char valorPosition = valor.charAt(i);

                if (valorPosition == '{' || valorPosition == '[' || valorPosition == '(' ) {

                    stack.push(valorPosition);

                } else if (valorPosition == '}') {

                    if (stack.isEmpty() || stack.pop() != '{') balanced = false;

                } else if (valorPosition == ']') {

                    if (stack.isEmpty() || stack.pop() != '[')  balanced = false;

                } else if (valorPosition == ')') {

                    if (stack.isEmpty() || stack.pop() != '(') balanced = false;
                }
            }

            if (balanced) response[count] = "YES";
            else response[count] = "NO";

            count++;
        }

        return response;
    }

    private static int countPairs(List<Integer> arr, long k) {
        List<Integer> arrayListIntOne = new ArrayList<>(arr);
        List<Integer> arrayListIntTwo = new ArrayList<>(arr);

        HashSet<String> hashSet = new HashSet<>();

        for (int x: arrayListIntOne) {

            for (int y: arrayListIntTwo){

                if ((x + y) == k) {

                    System.out.println( x  + " + " + y + " = " + k);

                    if (!hashSet.contains(String.valueOf(x) + String.valueOf(y)) && !hashSet.contains(String.valueOf(y) + String.valueOf(x) )){
                        hashSet.add(String.valueOf(x) + String.valueOf(y));
                    }

                }
            }
        }

        return hashSet.size();
    }

}
