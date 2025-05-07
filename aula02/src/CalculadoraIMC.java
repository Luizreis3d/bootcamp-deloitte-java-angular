public class CalculadoraIMC {

    // Método que calcula o IMC a partir do peso e altura
    public double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        CalculadoraIMC calc = new CalculadoraIMC();
        double imc = calc.calcularIMC(70, 1.75);
        System.out.println("O IMC é: " + imc);
    }
}
