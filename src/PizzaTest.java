import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PizzaTest {

    Pizza pizza;

    @BeforeEach
    public void setUp () {
        //Arrenge
        pizza = new Pizza();
        pizza.adicionarIngredientes(2);

    }

    @Test
    public void adicionaIngredientesCorretamente(){
        //Act
        int quantos = 
            pizza.adicionarIngredientes(4);

        //Assert
        assertEquals(6, quantos);
    }
    
        @Test
        public void naoadicionaIngredientesCorretamente(){
        //Act
        int quantidade = 
            pizza.adicionarIngredientes(-5);

        //Assert
        assertEquals(2, quantidade);
    }

    @Test 
    public void naoUltrapassarMaximoDeIngredientes (){
        //Act
        int quantidde = pizza.adicionarIngredientes(7);
        //Assert
        assertEquals(2, quantidde);
    }

    @Test
    public void calcularOPrecoCorretamente(){
         //Act
         double preco = pizza.calcularValorFinal();
         //Assert
         assertEquals(39, preco, 0.01);
        
    }
}
