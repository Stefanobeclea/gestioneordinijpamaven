package it.prova.gestioneordinijpamaven.dao.categoria;

import java.util.List;

import it.prova.gestioneordinijpamaven.dao.IBaseDAO;
import it.prova.gestioneordinijpamaven.model.Categoria;
import it.prova.gestioneordinijpamaven.model.Ordine;

public interface CategoriaDAO extends IBaseDAO<Categoria>{
	public Categoria findByDescrizione(String descrizioneInput) throws Exception;
	
	public List<Categoria> findAllByOrdineArticolo (Ordine ordineInstance) throws Exception;
}
