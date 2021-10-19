package it.prova.gestioneordinijpamaven.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "ordine")
public class Ordine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nomeDestinatario")
	private String nomeDestinatario;
	@Column(name = "indirizzoSpedizione")
	private String indirizzoSpedizione;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordine")
	private Set<Articolo> articoli = new HashSet<>();
	
	public Ordine() {
		// TODO Auto-generated constructor stub
	}

	public Ordine(Long id, String nomeDestinatario, String indirizzoSpedizione, Set<Articolo> articoli) {
		super();
		this.id = id;
		this.nomeDestinatario = nomeDestinatario;
		this.indirizzoSpedizione = indirizzoSpedizione;
		this.articoli = articoli;
	}

	public Ordine(String nomeDestinatario, String indirizzoSpedizione, Set<Articolo> articoli) {
		super();
		this.nomeDestinatario = nomeDestinatario;
		this.indirizzoSpedizione = indirizzoSpedizione;
		this.articoli = articoli;
	}

	public Ordine(String nomeDestinatario, String indirizzoSpedizione) {
		super();
		this.nomeDestinatario = nomeDestinatario;
		this.indirizzoSpedizione = indirizzoSpedizione;
	}

	public Long getId() {
		return id;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public String getIndirizzoSpedizione() {
		return indirizzoSpedizione;
	}

	public Set<Articolo> getArticoli() {
		return articoli;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	public void setIndirizzoSpedizione(String indirizzoSpedizione) {
		this.indirizzoSpedizione = indirizzoSpedizione;
	}

	public void setArticoli(Set<Articolo> articoli) {
		this.articoli = articoli;
	}

	@Override
	public String toString() {
		return "Ordine [id=" + id + ", nomeDestinatario=" + nomeDestinatario + ", indirizzoSpedizione="
				+ indirizzoSpedizione + ", articoli=" + articoli + "]";
	}
	
}
