# DesafioControleFluxo

Desafio para exercitar a logica de programação básica de controle e manipulação de fluxo dentro da linguagem Java proposta pela DIO.

## Ações tomadas
- Usar o método `scanner` para receber os parametros por terminal
    - O método `scanner` recebe valores externos (do terminal por exemplo) e permite armazena-los em um variável correspondente ao tipo recebido, seja ele Int, Double, String e etc utilizando `nextInt()`, `nextDouble()`
- Estender `Exception` para dentro do ParametrosInvalidosExcepttion e configurar a mensagem a ser recebida caso os valores não correspondessem a logica esperada.
- `Catch` usa essa mensagem toda vez que os parâmetros são diferentes do esperado e imprime no console
- Estender o método contar para ParametrosInvalidosExcepttion
- Adicionar uma condicional que instancia um novo objeto de exceção com uma mensagem pré configurada