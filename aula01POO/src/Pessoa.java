public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }

    boolean ehMaiorDeIdade() {
        return idade >= 18;
    }
}
