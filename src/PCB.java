
public class PCB {
	
	int pid;		// PID
	char estado;	// E, P, B, T
	int tamanho;	// tamanho em MB; máquina tem 20 MB
	int io_percent; // probabilidade de fazer IO durante execução
	int t_execucao; // tempo total de execução do processo
	int t_admissao; // momento em que o job foi admitido
	int t_espera;   // tempo em que o job ficou no estado P
	int t_termino;  // momento em que o job terminou de executar
	int t_bloqueio; // tempo em que o job ficou bloqueado 
	int t_falta;    // tempo de CPU que falta para o processo terminar a execução


	public PCB(int p, int t, int io, int e) {
		pid = p;
		tamanho = t;
		io_percent = io;
		t_execucao = e;
		estado = 'P';
		t_admissao = 0;
		t_espera = 0;
		t_termino = 0;
		t_bloqueio = 0;
		t_falta = t_execucao;
	}

	public String toString() {
		return pid +", " +estado +", " +tamanho +", " +
			   io_percent +", " +t_execucao +", " +
			   t_admissao +", " +t_espera +", " +
			   t_termino +", " +t_bloqueio +", " +
			   t_falta;
	}
	
}
