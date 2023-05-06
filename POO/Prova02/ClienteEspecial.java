public class ClienteEspecial extends Cliente {
    private int pontos;
    private double saldoCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente, Item[] carrinhoDeCompras) {
        super(nome, idade, cpf, endereco, bomCliente, carrinhoDeCompras);
        pontos = 0;
        saldoCompras = 0;
    }

    public int getPontos() {
        return pontos;
    }

    public double getSaldoCompras() {
        return saldoCompras;
    }

    public void comprar(Item item, int pontos) {
        if (pontos > this.pontos) {
            System.out.println("Pontos insuficientes.");
            return;
        }
        this.pontos -= pontos;
        System.out.println("Item " + item.getNome() + " comprado com sucesso usando " + pontos + " pontos.");
    }

    @Override
    public double comprar() {
        double totalGasto = 0;
        int totalItens = 0;
        for (Item item : carrinhoDeCompras) {
            if (item != null) {
                totalGasto += item.getValor();
                totalItens++;
                item.setQtdEstoque(item.getQtdEstoque() - 1);
                saldoCompras += item.getValor();
                if (saldoCompras >= 100) {
                    int novosPontos = (int)(saldoCompras / 100) * 5;
                    pontos += novosPontos;
                    saldoCompras -= novosPontos * 20;
                }
            }
        }
        double mediaGasto = totalItens == 0 ? 0 : totalGasto / totalItens;
        carrinhoDeCompras = new Item[100];
        System.out.println("Média de gasto: " + mediaGasto);
        return totalGasto + (bomCliente ? totalGasto * 0.05 : 0);
    }
}
