package it.prova.gestioneordinijpamaven.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "descrizione")
	private String descrizione;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "categorie")
	private Set<Articolo> articoli = new HashSet<Articolo>();
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}

	public Categoria(String descrizione) {
		super();
		this.descrizione = descrizione;
	}

	public Categoria(String descrizione, Set<Articolo> articoli) {
		super();
		this.descrizione = descrizione;
		this.articoli = articoli;
	}

	public Long getId() {
		return id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Set<Articolo> getArticoli() {
		return articoli;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setArticoli(Set<Articolo> articoli) {
		this.articoli = articoli;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", descrizione=" + descrizione + ", articoli=" + articoli + "]";
	}
}
