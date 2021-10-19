package it.prova.gestioneordinijpamaven.service.articolo;

import java.util.List;

import it.prova.gestioneordinijpamaven.dao.articolo.ArticoloDAO;
import it.prova.gestioneordinijpamaven.model.Articolo;
import it.prova.gestioneordinijpamaven.model.Categoria;

public interface ArticoloService {
	public List<Articolo> listAll() throws Exception;

	public Articolo caricaSingoloElemento(Long id) throws Exception;
	
	public Articolo caricaSingoloElementoEagerCategorie(Long id) throws Exception;

	public void aggiorna(Articolo articoloInstance) throws Exception;

	public void inserisciNuovo(Articolo articoloInstance) throws Exception;

	public void rimuovi(Articolo articoloInstance) throws Exception;

	public void aggiungiCategoria(Articolo articoloInstance, Categoria categoriaInstance) throws Exception;
	
	public void creaECollegaArticoloECategoria(Articolo articoloInstance, Categoria categoriaInstance) throws Exception;
	
	public Long calcolaSommaByArticoloDiCategoria (Categoria categoriaInstance) throws Exception;

	// per injection
	public void setArticoloDAO(ArticoloDAO articoloDAO);
}
