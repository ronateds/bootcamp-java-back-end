/**
 * 3. Escreva um código que receba a base e a alturade um retângulo, calcule sua
 * área e exiba na tela
 */
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a base do retângulo: ");
    byte base = scanner.nextByte();

    System.out.print("Digite a altura do retângulo: ");
    byte heigth = scanner.nextByte();

    int area = base * heigth;
    System.out.printf("A área do retângulo é: %s", area);
}