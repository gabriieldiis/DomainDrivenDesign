// Nome: Gabriel Dias RM: 550969
// Nome: Luiz Felipe Biazzola RM: 99250
//

package MonitoramentoTemperaturas;

public class InstanciandoSistema {
	public static void main(String[] args) {
		Sistema sm = new Sistema();
		int [] v = sm.periodoMapeado();
		double [][] m = sm.criarMatriz(v);
		sm.temperaturaMinEMax(m);
		sm.temperaturaNegativa(m);
		sm.gerarMedia(m);
		
	}
}