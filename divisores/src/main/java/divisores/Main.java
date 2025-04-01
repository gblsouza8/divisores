package divisores;

import java.util.ArrayList;
import java.util.Scanner;
// programa que calcula e exibe os divisores de um número
public class Main {
    public static void main(String[] args) {
        // inicializa a variavel em que será armazenada o numero do usuário
        int num;

        // inicializa o scanner e armazena o numero do usuario na variavel num
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num = input.nextInt();

        // fecha o scanner
        input.close();

        // cria a arraylist lista contendo os numeros que obtivemos no metódo
        ArrayList<Integer> lista = calcularDivisores(num);

        // exibe uma mensagem
        System.out.println("Divisores de " + num + ":");

        // laço percorre toda a lista e existe os numeros
        for (Integer lista1 : lista) {
            System.out.println(lista1);
        }


    }

    // metódo que faz o cálculo
    public static ArrayList<Integer> calcularDivisores(int num)
    {
        // inicializa a arraylist em que será armazenado os divisores
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 1; i <= num; i++)
        {
            // verifica se o resto da divisão entre o numero e o atual i é 0
            if (num%i == 0)
            {
                // se for, adiciona o numero na lista
                lista.add(i);
            }
        }

        // retorna a lista
        return lista;
    }
}