package Emanuele.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString


public class Postazione {
	

	private Long id;
	
	private String codice;
	private String descrizione;
	private Integer numeroMassimoOccupanti;
	

	
//	@OneToMany(mappedBy = "postazione")
//	@OrderBy(value = "dataPrenotata")
//	private List<Prenotazione> listaPrenotazioni;
}
