package servicetest;

import model.Produto;  
import repository.ProdutoRepository;  
import org.junit.jupiter.api.Test;  
import org.mockito.InjectMocks;  
import org.mockito.Mock;  
import org.mockito.junit.jupiter.MockitoExtension;  

import static org.mockito.Mockito.*;  

@ExtendWith(MockitoExtension.class)  
public class ProdutoServiceTest {  

    @Mock  
    private ProdutoRepository produtoRepository;  

    @InjectMocks  
    private ProdutoService produtoService;  

    @Test  
    public void testAdicionarProduto() {  
        Produto produto = new Produto();  
        // Defina os atributos do produto aqui.  

        when(produtoRepository.save(any(Produto.class))).thenReturn(produto);  

        Produto resultado = produtoService.adicionar(produto);  
        assertNotNull(resultado);  
        // Outros asserts.  
    }  
}  