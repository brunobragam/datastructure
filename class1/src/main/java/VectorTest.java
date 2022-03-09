public class VectorTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao a1");
        Aluno a2 = new Aluno("Jose a2");


        Vector lista = new Vector();
        lista.adiciona(a1);
        lista.adiciona(a2);
        System.out.println(lista);
        System.out.println("length >> "+lista.tamanho());
    }

}
