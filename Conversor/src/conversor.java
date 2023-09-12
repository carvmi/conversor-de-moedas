
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] opcoes = { "Reais para Euros", "Reais para Dolares", "Reais para Libras Esterlinas", "Reais para Peso Argentino",
            "Reais para Peso Chileno", "Euros para Reais", "Dolares para Reais", "Libras Esterlinas para Reais", "Peso Argentino para Reais",
            "Peso Chileno para Reais"};
            String escolha = (String) JOptionPane.showInputDialog(null, "Escolha:",
                    "Conversor de Moeda", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            String input = JOptionPane.showInputDialog("Insira um valor: ");
            double valor;
            try {
                valor = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor invalido");
                return;
            }
            

            if (escolha.equals("Reais para Dólares")) {
                double dolares = valor * 0.16;
                JOptionPane.showMessageDialog(null,
                        valor + " reais equivalem a " + dolares + " dólares.");
            } else if (escolha.equals("Reais para Euros")) {
                double euros = valor * 0.19;
                JOptionPane.showMessageDialog(null, valor + " reais equivalem a " + euros + " euros.");
            } else if (escolha.equals("Reais para Libras Esterlinas")) {
                double libras = valor * 0.23;
                JOptionPane.showMessageDialog(null, valor + " reais equivalem a " + libras + " libras esterlinas.");
            } else if (escolha.equals("Reais para Peso Argentino")) {
                double argentinos = valor * 0.08;
                JOptionPane.showMessageDialog(null, valor + " reais equivalem a " + argentinos + " pesos argentinos.");
            } else if (escolha.equals("Reais para Peso Chileno")) {
                double chilenos = valor * 0.07;
                JOptionPane.showMessageDialog(null, valor + " reais equivalem a " + chilenos + " pesos chilenos.");
            }
            else if (escolha.equals("Dolares para Reais")) {
                double dolarreais = valor / 0.16;
                JOptionPane.showMessageDialog(null, valor + " dolares equivalem a " + dolarreais + " reais.");
            }
            else if (escolha.equals("Euros para Reais")) {
                double euroreais = valor / 0.19;
                JOptionPane.showMessageDialog(null, valor + " euros equivalem a " + euroreais + " reais.");
            }
            else if (escolha.equals("Libras Esterlinas para Reais")) {
                double librareais = valor /  0.23;
                JOptionPane.showMessageDialog(null, valor + " libras esterlinas equivalem a " + librareais + " reais.");
            }
            else if (escolha.equals("Peso Argentino para Reais")) {
                double argentinosreais = valor / 0.08;
                JOptionPane.showMessageDialog(null, valor + " pesos argentinos equivalem a " + argentinosreais + " reais.");
            }
            else if (escolha.equals("Peso Chileno para Reais")) {
                double chilenosreais = valor /  0.07;
                JOptionPane.showMessageDialog(null, valor + " pesos chilenos equivalem a " + chilenosreais + " reais.");
            }

            

            int confirm = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa finalizado");
            }
        }

    }
}
