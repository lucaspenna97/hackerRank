package Enterprise;

import java.util.ArrayList;
import java.util.List;

public class PagSeguro {

    public static void main(String[] args) {
        //minNum(3,5,1);
        //perfectTeam("pcmbzpcmbz");
        //isPossible(1,4,5,9);
    }

    private static int minNum(int A, int K, int P) {
        int contador = 1;

        while (true) {

            int kellyResults = K * contador;

            int ashaResults = (A * contador) + P;

            System.out.println("Kelly: " + kellyResults + " Asha: " + ashaResults);

            if (kellyResults > ashaResults) {
                return contador;
            }

            contador++;
        }
    }

    private static int perfectTeam(String skills) {

        int contadorP = 0;
        int contadorC = 0;
        int contadorM = 0;
        int contadorB = 0;
        int contadorZ = 0;

        for(int i = 0; i < skills.length(); i++) {

            char position = skills.charAt(i);

            if (Character.toString(position).equals("p")) contadorP++;
            if (Character.toString(position).equals("c")) contadorC++;
            if (Character.toString(position).equals("m")) contadorM++;
            if (Character.toString(position).equals("b")) contadorB++;
            if (Character.toString(position).equals("z")) contadorZ++;

        }

        System.out.println("P:" + contadorP + " C:" + contadorC + " M:" + contadorM + " B:" + contadorB + " Z:" + contadorZ);

        List<Integer> integers = new ArrayList<>();
        integers.add(contadorP);
        integers.add(contadorC);
        integers.add(contadorM);
        integers.add(contadorB);
        integers.add(contadorZ);

        int aux = 999999999;
        for (Integer integer : integers) {
            if (integer < aux) aux = integer;
        }

        return aux;
    }

    private static String isPossible(int a, int b, int c, int d) {

        int auxA;
        int auxB;
        int auxC;
        int auxD;

        while (true) {

            int result = (a + b);

            if (result == c) auxC = result;
            if (result == d) auxD = result;
        }

    }


}