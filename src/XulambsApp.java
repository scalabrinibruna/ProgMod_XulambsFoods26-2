public class XulambsApp {
    void main() {
        do {
            opcao = menuPrincipal();
            switch (opcao) {
                case 1 -> comprarPizza();
                case 2 -> mostrarPizzas();
                case 0 -> IO.println("Encerrando!!");
                default -> IO.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    
    private void comprarPizza() {
        cabecalho ()
        int adicionais = escolherIngredientes ();
        Pizza novaPizza = new Pizza(adicionais)
        IO.println("2- Comprar uma pizza");
        IO.println("1- Comprar uma pizza");

        
        
    }

    private int menuPrincipal() {
        IO.println("XULAMBS PIZZA v0.1");
        IO.println("=====================");
        IO.println("1- Comprar uma pizza");
        IO.println("2- Ver pizzas vendidas");
        IO.println("3- Finalizar");

        return Integer.parseInt(IO.readln("Digite sua opção: "));
    }
}
