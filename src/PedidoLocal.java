public class PedidoLocal {
    private static final double TAXA_SERVICO = 1;

    @Override 
    public double precoAPagar() {
        return valorPizzas() + valorServico();
    }

    private double valorServico(){
        return valorPizzas() * TAXA_SERVICO;
    }

    @Override 
    public String toString(){
        StringBuilder cupom = new StringBuilder(cabecalho);
        cupom.append("PEDIDO LOCAL \n");
        cupom.append(detalhesPedido() + "\n");

        cupom.append(String.format());
    }

}
