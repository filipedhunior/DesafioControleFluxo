import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Receber dois parametros via terminal
        Scanner receberParametros = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro");
        int parametroUm = receberParametros.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametroDois = receberParametros.nextInt();

        receberParametros.close();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosExcepttion e){
            // imprimir a mensagem: O segundo parãmetro deve ser maior que o primeiro
            System.err.println("[ERRO] " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExcepttion{
        // validar se o parametroUm é maior que o parametroDois e lançar a exceção
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosExcepttion("O segundo parâmetro deve ser maior que o primeiro.");
        }
        for (int indice = parametroUm; indice <= parametroDois; indice++){
            System.out.println(indice);
        }
    }
}
