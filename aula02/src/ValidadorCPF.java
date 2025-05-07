public class ValidadorCPF {

    public boolean validarCPF(String cpf) {
        if (cpf == null) {
            return false;
        }

        // Remove pontos e traços, se houver
        cpf = cpf.replaceAll("[^0-9]", "");

        return cpf.length() == 11;
    }

    public static void main(String[] args) {
        ValidadorCPF validador = new ValidadorCPF();
        System.out.println(validador.validarCPF("12345678901")); // true
        System.out.println(validador.validarCPF("123.456.789-0")); // false
    }
}
