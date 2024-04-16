public class DesenhaMoldura {

    // Função para desenhar o retângulo
    public static void drawRectangle(int linhas, int colunas) {
        // Ajusta os valores para garantir que estejam dentro da faixa permitida
        linhas = Math.min(Math.max(linhas, 1), 20);
        colunas = Math.min(Math.max(colunas, 1), 20);

        // Desenha a linha superior do retângulo
        for (int i = 0; i < colunas; i++) {
            System.out.print("+");
        }
        System.out.println();

        // Desenha as linhas do meio do retângulo
        for (int i = 0; i < linhas - 2; i++) {
            System.out.print("|");
            for (int j = 0; j < colunas - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        // Desenha a linha inferior do retângulo
        if (linhas > 1) {
            for (int i = 0; i < colunas; i++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    // Função principal para testar a função drawRectangle
    public static void main(String[] args) {
        // Testando a função com diferentes valores de entrada
        drawRectangle(5, 10); // Teste com valores dentro da faixa permitida
        drawRectangle(2, 25); // Teste com valores fora da faixa permitida
    }
}

