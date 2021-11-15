package Hotel;
import java.util.Scanner;


public class Cliente {

	private	String nome;
	private String cognome;
	private String cdf; 
	public  int ncliente;
	
	public Cliente visualizzaCliente(Cliente cliente) {            
	return cliente;                                                  
	}
	public void visualizza1() {
		System.out.println( nome + cognome + cdf + ncliente);
	}
	
	public void modifica(String nome, String cognome, String cdf) {          //modifica
		setNome(nome);
		setCognome(cognome);
		setCdf(cdf);
		
	}
	
	public Cliente(String nome, String cognome, String cdf){
		this.cognome=nome;
		this.cognome=cognome;
		this.cdf=cdf;
	    ncliente++;
	}
	
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCdf() {
		return cdf;
	}
	public void setCdf(String cdf) {
		this.cdf = cdf;
	}
	
	
	
}
