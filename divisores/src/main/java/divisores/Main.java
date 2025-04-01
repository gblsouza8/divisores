package divisores;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = input.nextInt();

        ArrayList<Integer> lista = calcularDivisores(num);
        System.out.println("Divisores de " + num + ":");
        for (Integer lista1 : lista) {
            System.out.println(lista1);
        }


    }

    public static ArrayList<Integer> calcularDivisores(int num)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++)
        {
            if (num%i == 0)
            {
                lista.add(i);
            }
        }

        return lista;
    }
}