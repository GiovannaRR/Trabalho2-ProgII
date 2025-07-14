import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaControlador {
    
    @FXML
    private TextField campoEstoque;
    @FXML
    private TextField campoVenderVarias;
    @FXML
    private TextField campoTotal;
    private MaquinaCoxinha maquina;
    
    @FXML 
    private void initialize(){
        maquina = new MaquinaCoxinha();
        campoEstoque.setText("0");
        campoTotal.setText("0");
    }
    
    @FXML
    private void abastecer(){
        String texto = campoEstoque.getText(); 
        int quantidade = Integer.parseInt(texto);
        maquina.abastecer(quantidade);
        campoEstoque.setText("" + maquina.getQuantidade());
        campoTotal.setText("" + maquina.getQuantidade());
    }
    
    @FXML
    private void vender(){
         if (maquina.getQuantidade() > 0) {
            maquina.venderCoxinhas();
        }
        campoEstoque.setText("" + maquina.getQuantidade());
        campoTotal.setText("" + maquina.getQuantidade());
    }
    
    @FXML
    private void venderVarias(){
        int quantidade = Integer.parseInt(campoVenderVarias.getText());
            maquina.venderCoxinhas(quantidade);
            campoEstoque.setText("" + maquina.getQuantidade());
            campoTotal.setText("" + maquina.getQuantidade());
    }
    
    @FXML
    private void zerar(){
        maquina.zerarMaquina();
        campoEstoque.setText("0");
        campoTotal.setText("0");
    }
}