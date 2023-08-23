import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ConsultaCEP consulta = new ConsultaCEP();

        String cep = JOptionPane.showInputDialog(null,"Informe um CEP");

        try {
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            JOptionPane.showMessageDialog(null, novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage() +
                    "\nFinalizando Aplicação...");
        }
    }
}