public class Circulo {

    private double raio;
    private double circunferencia;
    private double area;
    private double diametro;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            System.out.println("O raio deve ser um valor positivo.");
            raio = 0;
            diametro = 0;
            circunferencia = 0;
        }
    }

    public void calcularArea() {
        if (raio < 0) {
            return;
        }
        area = Math.PI * Math.pow(raio, 2);
    }

    public void calcularCircunferencia() {
        if (raio < 0) {
            return;
        }
        circunferencia = 2 * Math.PI * raio;
    }

    public void calculaDiametro() {
        if (raio < 0) {
            return;
        }
        diametro = 2 * raio;
    }

    public void imprimirDiametro() {
        System.out.println("Diâmetro do circulo: " + String.format("%.2f", diametro));
    }

    public void imprimirArea() {
        System.out.println("Área do círculo: " + String.format("%.2f", area));
    }

    public void imprimirCircunferencia() {
        System.out.println("Circunferência do círculo: " + String.format("%.2f", circunferencia));
    }

      @Override
    public String toString() {
        return String.format("O círculo tem raio de %.2f, área de %.2f, circunferência de %.2f e diametro de %.2f\n", raio, area, circunferencia, diametro);
    }
}