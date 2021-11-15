package Hotel;
import java.util.Scanner;

public class Stanza {
	
	private	int nstanza ;
	private boolean libera;
    private  int nposti;
	
	
	public Stanza(int nstanza, boolean libera, int nposti){
		this.nstanza=nstanza;
		this.libera=libera;
		this.nposti=nposti;
    }
	
	public void visualizza() {
		System.out.println( nstanza + nposti );
	}

	public void modifica(int nstanza, boolean libera, int nposti) {          //modifica
		setNstanza(nstanza);
		setLibera(libera);
		setNposti(nposti);
		}
	
		public int getNstanza() {
		return nstanza;
	}


	public void setNstanza(int nstanza) {
		this.nstanza = nstanza;
	}


	public boolean isLibera() {
		return libera;
	}


	public void setLibera(boolean libera) {
		this.libera = libera;
	}


	public int getNposti() {
		return nposti;
	}


	public void setNposti(int nposti) {
		this.nposti = nposti;
	}



		
		

		
		
		
	}


