
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {

        Object[] menu = { "Converter Moedas", "Converter Temperatura", "Sair" };
        int escolhaprincipal = JOptionPane.showOptionDialog(null, "O que deseja fazer?", "Conversor",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, menu, menu[0]);

        if (escolhaprincipal == 2) {
            JOptionPane.showMessageDialog(null, "Programa Concluido");
            System.exit(0);
        }
        if (escolhaprincipal == 0) {
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opcoes = { "Reais para Euros", "Reais para Dolares", "Reais para Libras Esterlinas", "Reais para Peso Argentino",
                        "Reais para Peso Chileno", "Euros para Reais", "Dolares para Reais", "Libras Esterlinas para Reais", "Reais para Peso Argentino",
                        "Peso Chileno para Reais" };
                String escolha = (String) JOptionPane.showInputDialog(null, "Escolha:",
                        "Conversor de moeda", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                String input = JOptionPane.showInputDialog("Insira o valor: ");
                double valor;
                try {
                    valor = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                    return;
                }

                if (escolha.equals("Reais para Dolares")) {
                    double dolares = valor * 0.16;
                    JOptionPane.showMessageDialog(null,
                            valor + " reais equivalem a " + dolares + " dolares.");
                } else if (escolha.equals("Reais para Euros")) {
                    double euros = valor * 0.19;
                    JOptionPane.showMessageDialog(null, valor + " reais equivalem a " + euros + " euros.");
                } else if (escolha.equals("Reais para Libras Esterlinas")) {
                    double libras = valor * 0.23;
                    JOptionPane.showMessageDialog(null,
                            valor + " reais equivalem a " + libras + " libras esterlinas.");
                } else if (escolha.equals("Reais para Peso Argentino")) {
                    double argentinos = valor * 0.08;
                    JOptionPane.showMessageDialog(null, valor + " reais equivalem a " + argentinos + " pesos argentinos.");
                } else if (escolha.equals("Reais para Peso Chileno")) {
                    double chilenos = valor * 0.07;
                    JOptionPane.showMessageDialog(null, valor + " reais equivalem a " + chilenos + " pesos chilenos.");
                }  else if (escolha.equals("Dolares para Reais")) {
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

                int confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }

        }
        if (escolhaprincipal == 1) {

            Boolean SeguirPrograma = true;
            while (SeguirPrograma) {

                String[] opcoes2 = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcao = JOptionPane.showOptionDialog(null, "Escolha:",
                        "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                        null, opcoes2, opcoes2[0]);

                String valorStr = JOptionPane.showInputDialog("Insira o valor a converter: ");

                double valor = 0;
                try {
                    valor = Double.parseDouble(valorStr);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcao == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " graus Celsius equivalem a " + resultado + " graus Fahrenheit");
                } else if (opcao == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " graus Fahrenheit equivalem a " + resultado + " graus Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    SeguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}