import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        mensagem();
    }

    /**
     *  1. Escreva um código que receba o nome e o ano de nascimento de alguém
     *  e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
     */
    public static void mensagem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = scanner.next();

        System.out.print("Digite sua idade: ");
        byte age = scanner.nextByte();

        System.out.printf("Olá %s você tem %s anos", name, age);
    }
}
