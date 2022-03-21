import java.util.Arrays;

public class Vector {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    /**
     * The main idea is add a new student here in a null position.
     * That is, the method will traverse the array until it finds a null position.
     * <p>
     * WHAT IS THE MAIN PROBLEM?
     * The complexity is O(n), why? Because - the bigger the array is,
     * the longer will be space in memory to traverse(percorrer).
     * <p>
     * Maybe for constant time O(n) is a good solution....
     * <p>
     * COMPLEXITY?
     * O(n)
     *
     * @param aluno
     */
    @Deprecated
    public void adicionaOld(Aluno aluno) {
        /* BAD CASE
       for (int i = 0; i<alunos.length; i++){
            if (alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }*/
    }

    /**
     * With this new implementation we can see a constant time to add on a new position.
     * Because not is necessary to traverse all spaces of the array to find a next null position.
     *
     * @param aluno
     */
    public void adiciona(Aluno aluno) {
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adicionaNaPosicao(int posicao, Aluno aluno) {
        if (!(posicao >= 0 && posicao <= totalDeAlunos)) {
            throw new IllegalArgumentException("posicao invalida");
        }
        for (int i = totalDeAlunos - 1; i >= posicao; i -= 1) {
            alunos[i + 1] = alunos[i];
        }
        alunos[posicao] = aluno;
        totalDeAlunos++;
    }

    public Aluno pega(int posicao) {
        if (posicao >= 0 && posicao < totalDeAlunos) {
            return alunos[posicao];
        }
        throw new IllegalArgumentException("Invalid Position to find, sorry bro ;)");
    }

    public void remove2(int posicao) {
        for (int i = posicao; i < this.totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        totalDeAlunos--;
    }

    public void remove(int posicao) {
        for (int i = posicao; i < this.totalDeAlunos; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }
        totalDeAlunos--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < totalDeAlunos; i++) {
            if (aluno.equals(alunos[i])) {
                return true;
            }
            return false;
        }

        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    public String toString() {
        return Arrays.toString(alunos);
    }
}
