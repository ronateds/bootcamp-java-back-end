void main() {
    // mensagem();
    areaQuadrado();
}

/**
 *  1. Escreva um código que receba o nome e o ano de nascimento de alguém
 *  e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
 */
public static void mensagem() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Digite o seu nome: ");
    String name = scanner.next();

    IO.print("Digite sua idade: ");
    byte age = scanner.nextByte();

    System.out.printf("Olá %s você tem %s anos", name, age);
}

/**
 * Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
 */
public static void areaQuadrado() {
    Scanner scanner = new Scanner(System.in);

    IO.print("Digite o tamanho de um lado do quadrado: ");
    byte size = scanner.nextByte();
    int area = size * size;

    System.out.printf("A área do quadrado é %s", area);
}
