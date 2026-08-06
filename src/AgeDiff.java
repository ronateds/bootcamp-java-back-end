/**
 * 4. Escreva um código que receba o nome e a idade de 2 pessoas e imprima a
 * diferença de idade entre elas
 */
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um nome: ");
    String name1 = scanner.next();

    System.out.print("Digite a idade: ");
    byte age1 = scanner.nextByte();

    System.out.print("Digite outro nome: ");
    String name2 = scanner.next();

    System.out.print("Digite outra idade: ");
    byte age2 = scanner.nextByte();

    int _ageDiff = Math.abs(age1 - age2);

    System.out.printf("A diferença de idade entre %s e %s é de %s anos", name1, name2, _ageDiff);
}