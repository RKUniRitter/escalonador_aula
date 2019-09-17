import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		//Cria lista de processos
		ArrayList<PCB> processos = new ArrayList<PCB>();
		
		//Carrega dados do arquivo para a lista de processos
		try (BufferedReader br = new BufferedReader(new FileReader("jobs.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		    	if (!line.contains("#")) {
			        String[] values = line.split(",");
			        //processos.add(Arrays.asList(values));
			        PCB pcb = new PCB(Integer.parseInt(values[0]), 
			        				  Integer.parseInt(values[1]), 
			        			      Integer.parseInt(values[2]), 
			        			      Integer.parseInt(values[3]));
			        processos.add(pcb);
		    	}
		    }
		}
		
		//Lista processos
		processos.forEach(p -> System.out.println(p.toString()));
				
		
		FCFS fcfs = new FCFS(processos);
		fcfs.run();
		fcfs.printStats();
		
		
		
	}

}
