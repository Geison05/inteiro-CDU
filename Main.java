import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Variavel
    int numero = 0,
        C = 0,
        D = 0,
        U = 0;
  //Entrada
  System.out.println("Digite um numero : ");
  numero = input.nextInt();
  //Processamento
  U = numero % 10;
  numero = numero - U;
  numero = numero /10;
  D = numero % 10;
  numero = numero - D;
  numero = numero /10;
  C = numero % 10;
  numero = numero /10;
  numero = numero - C;
  //saida
  System.out.println("Seu numero ao contrario é : "+ U + D + C);

  }
}