/**
 * 2. Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
 */
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho de um lado do quadrado: ");
    byte size = scanner.nextByte();
    int area = size * size;

    System.out.printf("A área do quadrado é %s", area);
}