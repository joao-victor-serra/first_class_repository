import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        // SWITCH CASE
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um DDD:");

        String ddd = scanner. nextLine();

        switch (ddd) {
            case "62":
                System.out.println("Goiás");
                break;
               case"61":
                System.out.println("Brasília");
            default:
                System.out.println("DDD não disponivel");
                break;
        }
    }
}
