public class Main {
    public static void main(String[] args) {
        

        System.out.println("Exercício Empréstimo!");

        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,  5);
    }
}
