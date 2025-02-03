package aula.pkg5;

import java.util.Scanner;

public class Aula5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, fat, c;
        String cont;
        do {
            fat=1;
            System.out.println("\nF A T O R I A L");
            System.out.println("---------------\n");
            do {
                System.out.print("Digite um número para o Fatorial: ");
                n = ler.nextInt();
            } while(n<0||n>16);
            for(c=n;c>=1;c--) {
                fat=fat*c;
        }
            System.out.println("O fatorial de "+n+" é "+fat);
            System.out.print("Deseja continuar (S/N) ?");
            cont = ler.next();
    } while(cont.equals("S") || cont.equals("s"));
        System.out.print("\nFim de Programa");
    }
}