import java.util.Scanner;

public class Condicianal {
    public static void main(String[] args) {
        // Criar um letor de entrada do console
        Scanner ln  = new Scanner(System.in);

        System.out.println("Digite sua nota: ");

        // Converte string pra double
        double nota = Double.parseDouble(ln.nextLine());

        if (nota <= 40.0) {
          // Só excutar se a nota for igual ou menor que 40
          System.out.println("Reprovado");
        } else if (nota > 40 && nota < 70) {
            //Só executar se a nota estiver entre 40 e 70
            System.out.println("Recuperação");
        } else {
            //Esecutar se nunhuma das condições for atendida
            System.out.println("Aprovado");
        }
    }
}
