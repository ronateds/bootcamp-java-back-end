/**
 *  1. Escreva um código que receba o nome e o ano de nascimento de alguém
 *  e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */
void main() {
    Scanner scanner = new Scanner(System.in);

    IO.println("Digite o seu nome: ");
    String name = scanner.next();

    IO.println("Digite sua idade: ");
    byte age = scanner.nextByte();

    System.out.printf("Olá %s você tem %s anos", name, age);
}