import javax.management.PersistentMBean;
import java.util.Scanner;

public class ExemploDeMatrizes {

    public int[] tamanhoMatriz(){
        System.out.println("Tamanho da Matriz");
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[2];

        System.out.println("Linhas: ");
        int linhas = input.nextInt();
        System.out.println("Colunas: ");
        vetor[1] = input.nextInt();

        return  vetor;
    }

    public int [][] criarMatriz(int[]v){
        System.out.println("Criar Matriz");
        Scanner input = new Scanner(System.in);
    }
}
