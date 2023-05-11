// Nome: Gabriel Dias RM: 550969
// Nome: Luiz Felipe Biazzola RM: 99250



package MonitoramentoTemperaturas;
import java.util.Scanner;

public class Sistema {
	
    public int[] periodoMapeado() {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[2];
        System.out.print("Digite o numero de semanas que deseja mapear: ");
        vetor[0] = input.nextInt();
        vetor[1] = 7;
        return vetor;
    }

    public double[][] criarMatriz(int[] v) {
        Scanner input = new Scanner(System.in);
        double[][] matriz = new double[v[0]][v[1]];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe a temperatura do dia [%d] da semana [%d]: ", j + 1, i + 1);
                matriz[i][j] = input.nextDouble();
            }
        }
        return matriz;
    }

    public void temperaturaMinEMax(double[][] m) {
        double maxTemp = 0;
        double minTemp = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maxTemp) {
                    maxTemp = m[i][j];
                }
                if (m[i][j] < minTemp) {
                    minTemp = m[i][j];
                }
            }
        }
        System.out.println("A maior temperatura registrada foi: " + maxTemp);
        System.out.println("A menor temperatura registrada foi: " + minTemp);
    }

    public void temperaturaNegativa(double[][] m) {
        int contadorNegativo = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    contadorNegativo++;
                }
            }
        }
        double[] negativas = new double[contadorNegativo];
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    negativas[contador] = m[i][j];
                    contador++;
                }
            }
        }
        System.out.println("Temperaturas negativas:");
        for (int i = 0; i < negativas.length; i++) {
            System.out.println(negativas[i]);
        }
    }
    
    public double gerarMedia(double[][] m) {
        int contador = 0;
        double media = 0;
        double soma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                soma += m[i][j];
                contador++;
            }
        }
        media = soma / contador;
        System.out.printf("A media das temperaturas do tempo informado foi de %.2f ", media);
        return media;
    }
}
