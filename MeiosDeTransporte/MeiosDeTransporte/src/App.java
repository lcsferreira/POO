import pacote.CadastroDeVeiculos;
import pacote.Carro;
import pacote.Moto;
import pacote.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo celta = new Carro("Chevrolet", "celta", 4, 300, 4);
        Veiculo uno = new Carro("Fiat", "uno", 4, 100, 4);
        Veiculo fatboy = new Moto("Harley", "Fat Boy", 2, 500, true);
        CadastroDeVeiculos cadastros = new CadastroDeVeiculos(2);
        cadastros.inserir(fatboy);
        cadastros.inserir(uno);
        cadastros.inserir(celta);
        System.out.println(cadastros.tamanho());
        cadastros.imprimir();
    }
}
