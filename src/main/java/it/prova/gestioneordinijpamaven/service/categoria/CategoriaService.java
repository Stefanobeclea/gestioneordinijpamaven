package it.prova.gestioneordinijpamaven.service.categoria;

import java.util.List;

import it.prova.gestioneordinijpamaven.dao.categoria.CategoriaDAO;
import it.prova.gestioneordinijpamaven.model.Articolo;
import it.prova.gestioneordinijpamaven.model.Categoria;
import it.prova.gestioneordinijpamaven.model.Ordine;

public interface CategoriaService {
	public List<Categoria> listAll() throws Exception;

	public Categoria caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Categoria categoriaInstance) throws Exception;

	public void inserisciNuovo(Categoria categoriaInstance) throws Exception;

	public void rimuovi(Categoria categoriaInstance) throws Exception;

	public void aggiungiCd(Categoria categoriaInstance, Articolo articoloInstance) throws Exception;
	
	public Categoria cercaPerDescrizione(String descrizione) throws Exception;
	
	public List<Categoria> cercaTuttiByOrdineArticolo(Ordine ordineInstance) throws Exception;

	// per injection
	public void setCategoriaDAO(CategoriaDAO categoriaDAO);
}
