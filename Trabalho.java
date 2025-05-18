// importação das bibliotecas
import java.util.Calendar; 
import javax.swing.JOptionPane;

/*
===============================================================================
alunos: Davi Henrique Garcia Araujo                              data(04/04/2025)
        Layla Pimenta de Melo
Professor: Alessandro
Desc: 
===============================================================================
 */
public class Trabalho {

    public static void main(String[] args) {
        String nome, entrada;
        Calendar dataAtual = Calendar.getInstance();
        // Define as variaveis do dia atual e o nome do usuario
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        int d = dataAtual.get(Calendar.DAY_OF_MONTH);
        int m = dataAtual.get(Calendar.MONTH) + 1; // +1 porque janeiro é 0
        int a = dataAtual.get(Calendar.YEAR);
        // formata a senha para o padrao "nomeDDMMAAAA"
        String senha = nome + (d < 10 ? "0" : "") + d + (m < 10 ? "0" : "") + m + a;
        
        do {
            entrada = JOptionPane.showInputDialog("Digite a sua senha:");
            if (!senha.equals(entrada)) {
                int cont = Integer.parseInt(JOptionPane.showInputDialog("Você digitou sua senha incorretamente.\nDeseja continuar tentando?\nSim [1] | Não [0]"));
                switch (cont) {
                    case 1:
                        continue;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Digite um valor válido (0 ou 1).");
                        break;
                }
            }
        } while (!senha.equals(entrada));
    }
}
