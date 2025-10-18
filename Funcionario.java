public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        double aumento = salario * porcentagem / 100;
        salario += aumento;
        System.out.println("Salário aumentado em " + porcentagem + "%. Novo salário: R$" + salario);
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
    }
}
