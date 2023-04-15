import java.util.Scanner;

public class Repeticao1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean senhaCorreta = false;

    System.out.println("Digite a senha:");

    while (!senhaCorreta) {
      String senha = scanner.nextLine();

      if (senha.equals("1")) {
        senhaCorreta = true;
      } else {
        System.out.println("Senha incorreta. Digite novamente:");
      }
    }

    System.out.println("Senha correta. Acesso liberado!");
  }
}