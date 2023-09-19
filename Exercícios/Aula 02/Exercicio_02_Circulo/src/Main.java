public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(4);
        Circulo circulo2 = new Circulo(3);
        Circulo circulo3 = new Circulo(2, 4, 4);

        circulo.calcularArea();
        circulo.calcularCircunferencia();
        circulo.calculaDiametro();
        circulo.imprimirArea();
        circulo.imprimirCircunferencia();
        circulo.imprimirDiametro();
        System.out.println(circulo);

        circulo.definirRaio(-1);
        circulo.calcularArea();
        circulo.calculaDiametro();
        circulo.imprimirArea();
        circulo.imprimirCircunferencia();
        circulo.imprimirDiametro();
        System.out.println(circulo);

        circulo2.calcularArea();
        circulo2.calcularCircunferencia();
        circulo2.calculaDiametro();
        circulo2.imprimirArea();
        circulo2.imprimirCircunferencia();
        circulo2.imprimirDiametro();
        System.out.println(circulo2);

        if (circulo.equals(circulo2)) {
            System.out.println("Os círculos são iguais.");
        } else {
            System.out.println("Os círculos são diferentes.");
        }

    }
}