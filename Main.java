public class Main {
    public static void main(String[] args) {
        System.out.println("===== TESTE DAS CLASSES =====\n");

        Circulo c = new Circulo(5);
        c.exibirInfo();

        Pessoa p = new Pessoa("Vitória", 22);
        p.cumprimentar();

        Livro l = new Livro("Clean Code", "Robert C. Martin", 450);
        l.exibirDetalhes();

        Retangulo r = new Retangulo(10, 5);
        r.exibirInfo();

        Animal a = new Animal("Leão", "Carnívoro");
        a.emitirSom();

        Produto prod = new Produto("Caneca", 35.00);
        prod.exibirInfo();
        System.out.println("Preço com desconto: R$" + prod.calcularPrecoComDesconto(10));

        Triangulo t = new Triangulo(8, 4);
        t.exibirInfo();

        ContaBancaria conta = new ContaBancaria("12345-6", 1000);
        conta.depositar(500);
        conta.sacar(300);

        Carro carro = new Carro("Toyota", "Corolla", 2022);
        carro.ligar();
        carro.acelerar();
        carro.desligar();

        Funcionario f = new Funcionario("Vitória Mendes", "Desenvolvedora Jr.", 2500);
        f.exibirInfo();
        f.aumentarSalario(10);
    }
}
