package aplicacao;

import entidade.Peso;
import java.util.Scanner;

public class Programa {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Peso peso = new Peso();

    System.out.print("Informe Seu Peso: ");
    peso.setPesoTerra(sc.nextDouble());
    System.out.println();
    System.out.println("    AGORA ESCOLHA UM PLANETA    ");
    System.out.println("PARA SABER QUAL O SEU PESO NELE");
    System.out.println();
    System.out.println("     MERCÚRIO Digite [1]     ");
    System.out.println("     VÊNUS    Digite [2]     ");
    System.out.println("     MARTE    Digite [3]     ");
    System.out.println("     JÚPITER  Digite [4]     ");
    System.out.println("     SATURNO  Digite [5]     ");
    System.out.println("     URANO    Digite [6]     ");
    System.out.println("_________________________________");
    System.out.print("Digite Aqui: ");
    int escolha = sc.nextInt();

    peso.pesar(escolha);
    System.out.println(peso);
    sc.close();
  }
}
