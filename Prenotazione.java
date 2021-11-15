package Hotel;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.serializer.ToStream;
public class Prenotazione {
	

	Stanza stanza;
	Cliente cliente;
	String datainzio;
	String datafinie;
	int nprenotazione;
	
	public Prenotazione( Stanza stanza, Cliente cliente, String i, String j) {
		this.cliente=cliente;
		this.stanza=stanza;
		this.datainzio=i;
		this.datafinie=j;
		nprenotazione++;
		
	}
	public String visualizza() {
		System.out.println( getStanza());
		System.out.println( getCliente());	
		System.out.println( getDatainzio());	
		System.out.println( getDatafinie());
		
		}
	
	public Stanza getStanza() {
		return stanza;
	}
	public void setStanza(Stanza stanza) {
		this.stanza = stanza;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDatainzio() {
		return datainzio;
	}
	public void setDatainzio(String datainzio) {
		this.datainzio = datainzio;
	}
	public String getDatafinie() {
		return datafinie;
	}
	public void setDatafinie(String datafinie) {
		this.datafinie = datafinie;
	}

	
	
	
}
