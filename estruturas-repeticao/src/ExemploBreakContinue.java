public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                // break; // A execução imprime somente 1, 2
                continue; // No momento que em o i é igual a 3 ele pula o restante da iteração do for e inicia novamente

            System.out.println(i);
        }
    }
}
