import java.util.Arrays;

public class Vector {
    private Aluno[] alunos = new Aluno[100];

    /**
     * The main idea is add a new student here in a null position.
     * That is, the method will traverse the array until it finds a null position.
     *
     * WHAT IS THE MAIN PROBLEM?
     * The complexity is O(n), why? Because - the bigger the array is, the longer will be space in memory to traverse(percorrer).
     *
     * Maybe for constant time O(n) is a good solution....
     *
     * COMPLEXITY?
     * O(n)
     *
     * @param aluno
     */
    public void adiciona (Aluno aluno){
        for (int i = 0; i<alunos.length; i++){
            if (alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }
    }

    public Aluno pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
    }

    public boolean contem(Aluno aluno) {
        return false;
    }

    public int tamanho() {
        return 0;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}
