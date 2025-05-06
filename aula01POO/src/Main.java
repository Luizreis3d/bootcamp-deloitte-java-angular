public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Luiz";
        p1.idade = 41;

        Pessoa p2 = new Pessoa();
        p2.nome = "Lígia";
        p2.idade = 17;

        p1.apresentar();
        p2.apresentar();

        if (p1.idade > p2.idade) {
            System.out.println(p1.nome + " é mais velha que " + p2.nome);
        } else if (p1.idade < p2.idade) {
            System.out.println(p2.nome + " é mais velho que " + p1.nome);
        } else {
            System.out.println(p1.nome + " e " + p2.nome + " têm a mesma idade.");
        }

        System.out.println(p1.nome + " é maior de idade? " + p1.ehMaiorDeIdade());
        System.out.println(p2.nome + " é maior de idade? " + p2.ehMaiorDeIdade());
    }
}
