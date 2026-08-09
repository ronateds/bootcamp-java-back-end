void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Escreva sua altura (ex. 1,80): ");
    float altura = scanner.nextFloat();

    System.out.print("Escreva seu peso (ex. 80): ");
    float peso = scanner.nextInt();

    float imc = peso/(altura * altura);

    String msg;
    if(imc <= 18.5) {
        msg = "Abaixo do peso";
    } else if (imc <= 24.9) {
        msg = "Peso ideal";
    } else if (imc <= 29.9) {
        msg = "Levemente acima do peso";
    } else if (imc <= 34.9) {
        msg = "Obesidade Grau I";
    } else if (imc <= 39.9) {
        msg = "Obesidade Grau II (Severa)";
    } else {
        msg = "Obesidade III (Mórbida)";
    }

    System.out.println(msg);
}