import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        if (nomeProduto == null || nomeProduto.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do produto inválido.");
        }
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        if (precoUnitario < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
        itens.add(new ItemPedido(nomeProduto, quantidade, precoUnitario));
    }

    public double valorTotal() {
        double soma = 0.0;
        for (ItemPedido it : itens) {
            soma += it.subtotal();
        }
        return soma;
    }

    public void mostrarResumo() {
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Resumo do Pedido:");
        for (ItemPedido it : itens) {
            System.out.printf("- %s x %d => subtotal: %s%n", it.getNomeProduto(), it.getQuantidade(), df.format(it.subtotal()));
        }
        System.out.println("Valor Total: " + df.format(valorTotal()));
    }
}
    
