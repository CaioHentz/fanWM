import java.util.HashMap;
import java.util.Map;
public class Tests {


    public static class MinhaClasse {

        // Atributo do tipo Map (dicionário) que mapeia uma chave String para um valor Integer
        private Map<String, Integer> meuDicionario;

        // Construtor
        public MinhaClasse() {
            // Inicializa o dicionário
            meuDicionario = new HashMap<>();
        }

        // Método para adicionar um item ao dicionário
        public void adicionarItem(String chave, Integer valor) {
            meuDicionario.put(chave, valor);
        }

        // Método para obter um item do dicionário
        public Integer obterItem(String chave) {
            return meuDicionario.get(chave);
        }

        // Método para exibir todo o conteúdo do dicionário
        public void exibirDicionario() {
            for (Map.Entry<String, Integer> entry : meuDicionario.entrySet()) {
                System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
            }
        }

        public static void main(String[] args) {
            // Testando a classe e o dicionário
            MinhaClasse obj = new MinhaClasse();

            obj.adicionarItem("um", 1);
            obj.adicionarItem("dois", 2);
            obj.adicionarItem("três", 3);

            // Exibindo o conteúdo do dicionário
            obj.exibirDicionario();

            // Obtendo um valor específico
            System.out.println("Valor associado à chave 'dois': " + obj.obterItem("dois"));
        }
    }
}
