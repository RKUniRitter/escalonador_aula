import java.util.ArrayList;

public abstract class AlgoritmoEscalonamento {

    /*
	 * Lista de processos a serem processados
	 */
	ArrayList<PCB> processos;	
	
	/*
	 * Tempo decorrido da simula��o
	 */
	int tempo;
	
	
	/*
	 * Lista de processos admitidos
	 */
	ArrayList<PCB> admitidos;	

	
	
	public AlgoritmoEscalonamento(ArrayList<PCB> p) {
		processos = p;
		admitidos = new ArrayList<PCB>();
		tempo = 0;
	}
	
	
	
	/*
      * Executa simula��o 
      */
	public abstract void run(); 
	

	/*
      * Imprime estat�sticas
      */
	public abstract void printStats(); 
	
	
}
