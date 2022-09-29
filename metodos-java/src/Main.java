public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício Calculadora");
        operacoes();

        System.out.println("\nExercício Mensagem");
        mensagem();

        System.out.println("\nExercício Emprestimo");
        emprestimos();

    }

    public static void operacoes() {
        Calculadora.soma(10, 5);
        Calculadora.subtracao(20, 12.5);
        Calculadora.multiplicacao(32, 5);
        Calculadora.divisao(50, 5.8);
    }

    public static void mensagem() {
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(25);
    }

    public static void emprestimos() {
        Emprestimo.calcular(1000.00, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000.00, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000.00, 5);
    }
}