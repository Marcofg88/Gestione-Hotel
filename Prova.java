package Hotel;
import java.util.Scanner;
import java.util.*;

public class Prova{
	
   public static void main(String[] args) {

	Scanner tastiera = new Scanner(System.in);
		
		Stanza[] stanze =new Stanza[2];
		Cliente[] clienti=new Cliente[2];
		
		
          for (int i=0; i < clienti.length; i++) {
			String nome;
			String cognome;
			String cdf;
			
			System.out.println("inserisci il nome");
			nome = tastiera.nextLine();
			
			System.out.println("inserisci il cognome");
			cognome = tastiera.nextLine();
			
			System.out.println("inserisci il codice fiscale");
			cdf = tastiera.nextLine();
			
			Cliente cliente = new Cliente(nome,cognome,cdf);
			clienti[i]= cliente;
			
		}
          Stanza stanza = new Stanza(16, true , 2);
          stanze[0]= stanza;
          
Prenotazione prenotazione1=new Prenotazione(stanze[0], clienti[0], "12","31");
		
   prenotazione1.visualizza();

	}


}


