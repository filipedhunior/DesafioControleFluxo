public class ParametrosInvalidosExcepttion extends Exception {
    public ParametrosInvalidosExcepttion(String mensagem){
        super("O PARAMETRO DOIS TEM QUE SER MAIOR QUE O PARAMETRO UM");
    }
}
