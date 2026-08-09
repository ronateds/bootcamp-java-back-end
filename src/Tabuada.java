void main() {
    System.out.print("Escolha um número: ");
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt();

    for (var i = 1;i <=10;i++) {
        int multiplo = numero * i;
        System.out.printf("%s x %s = %s\n", numero, i, multiplo);
    }
}