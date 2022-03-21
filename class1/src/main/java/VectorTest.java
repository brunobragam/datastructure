public class VectorTest {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao a1");
        Aluno a2 = new Aluno("Jose a2");
        Aluno a3 = new Aluno("bruno a3");


        Vector lista = new Vector();
        //test method adiciona
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        System.out.println(lista);

        //test method tamanho
        System.out.println("length >> " + lista.tamanho());

        //test method contem
        System.out.println(lista.contem(a1));

        //test method pega
        System.out.println(lista.pega(2));


        lista.adicionaNaPosicao(2, a3);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

    }

}
