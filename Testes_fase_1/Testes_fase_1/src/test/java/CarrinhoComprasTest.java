import org.example.CarrinhoCompras;
import org.example.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarrinhoComprasTest {
    @Test
    void deveAdicionarItemCarrinho() {
        //Arrange
        CarrinhoCompras carrinho = new CarrinhoCompras();
        Item item = new Item("Livro", 40.50, 2);

        //Act
        carrinho.adicionarItem(item);

        //Assert
        Assertions.assertEquals(1, carrinho.quantidadeItens());

        //assert carrinho.quantidadeItens() == 1;
    }

    @Test
    void deveAdicionarDoisItensCarrinho() {
        //Arrange
        CarrinhoCompras carrinho = new CarrinhoCompras();
        Item itemA = new Item("Livro", 40.50, 2);
        Item itemB = new Item("Lápis", 10.50, 4);

        //Act
        carrinho.adicionarItem(itemA);
        carrinho.adicionarItem(itemB);

        //Assert
        Assertions.assertEquals(2, carrinho.quantidadeItens());

        //assert carrinho.quantidadeItens() == 1;
    }

    @Test
    void deveRetornar100ParaUmCarrinhoComDoisItensDe50(){
        CarrinhoCompras carrinho = new CarrinhoCompras();
        Item item = new Item("Livro", 50, 2);

        carrinho.adicionarItem(item);

        double total = carrinho.calcularTotal();

        Assertions.assertEquals(100, total);


    }
}
