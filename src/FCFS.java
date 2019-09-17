import java.util.ArrayList;

public class FCFS extends AlgoritmoEscalonamento {

	public FCFS(ArrayList<PCB> p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		while (true) {
			//1. Fazer admissão de novos jobs
			admissao();
			
			//2. Escalonar processos no estado P
			//escalonar();
			
			//3. Trocar contexto, se for o caso
			//trocar_contexto();

			//4. Executar processo escolhido
			//executar()

			//5. Incrementar tempo de quem não executou
			//processa_nao_escalonados();
			
			//6. Condição de parada da simulação
			if (true)
				break;
					
			tempo++;
		}
		
	}

	private void admissao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printStats() {
		// TODO Auto-generated method stub
		
	}

}
