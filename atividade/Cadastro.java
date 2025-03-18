import java.util.ArrayList;
import java.util.HashMap;

public class Cadastro {
    private ArrayList<Produtos> listaProdutos;
    private HashMap<Integer, Produtos> mapaProdutos;

    public Cadastro() {
        listaProdutos = new ArrayList<>();
        mapaProdutos = new HashMap<>();
    }

    public void cadastrarProduto(int codigo, String nome, double preco) {
        Produtos produto = new Produtos(codigo, nome, preco);
        listaProdutos.add(produto);
        mapaProdutos.put(codigo, produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    public Produtos buscarProdutoPorCodigo(int codigo) {
        return mapaProdutos.get(codigo);
    }
}
