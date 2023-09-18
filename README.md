# Conversor de moedas
- A classe Principal é operacional, criada para ter interação com o usuário
- Deve ser adicionada uma estrutura de repetição e uma de estrutura de decisão
![menuprincipal](./menu-principal.png)
## Sobre o desafio
O conversor de moeda deverá:
- Converter de Reais a Dólar
- Converter de Reais a Euro
- Converter de Reais a Libras Esterlinas
- Converter de Reais a Peso argentino
- Converter de Reais a Peso Chileno
Lembrando que deve ser possível também converter de forma inversa.
## Criar caixa de diálogo
  ## Menu Principal 
   - Deve permitir que o usuário escolha entre as opções de conversão. 
   - Utilizar a classe JOptionPane da biblioteca Javax.swing;
   - Utilizar o método showInputDialog como objeto para apresentar mais de uma opção;
  ## Input do Valor
   - Deve permitir que o usuário insira o valor ou quantia de dinheiro que deseja converter para a moeda previamente escolhida
   - Lembre-se de que esta entrada deve ser validada e não deve aceitar outro tipo de caractere que não seja o tipo numérico
   - Utilizar o método showInputDialog para o usuário inserir um valor
  ## Opções de moedas
   -  Deve permitir que o usuário escolha entre as diferentes moedas à qual ele quer converter seu dinheiro
   -  Utilizar a classe JOptionPane da biblioteca Javax;
   -  Utilizar o método showInputDialog como objeto para apresentar mais de uma opção para conversão;
  ## Mensagem do valor
   - Mostra para o usuário o valor da conversão realizada
   - Utilizar o método showMessageDialog para apresentar o valor da conversão
  ## Tratamento de erro
  - Caracteres que não são números não devem ser permitidos
  - Se o usuário digitar em letras ou caracteres especiais e pressionar OK deve ser mostrado uma mensagem apontando que o valor não é válido
  - Utilizar o método showMessageDialog para fazer validação no input para que não sejam aceitos caracteres
  ## Deseja Continuar?
  - Yes: deve trazer nosso usuário novamente para o menu principal
  - No: Você deve mostrar uma mensagem "Programa finalizado"
  - Cancel: Você deve mostrar uma mensagem de "Programa finalizado"
  - Utilizar o método showConfirmDialog para o usuário que deseja seguir no programa
  ## Extras
   - Após o usuário clicar em continuar no programa, apresente a caixa de opções de conversão para que possa verificar outro valor
   - Faça mais de um programa de conversão, além do de moedas, pode fazer de temperatura, quilometragem, anos-luz
  ## Documentações
  https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/javax/swing/JFrame.html
  https://docs.oracle.com/javase/8/docs/api/javax/swing/JMenu.html
  https://docs.oracle.com/javase/8/docs/api/javax/swing/JMenuBar.html
  https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/javax/swing/JMenuItem.html
  https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html
