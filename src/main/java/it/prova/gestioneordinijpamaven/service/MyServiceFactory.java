package it.prova.gestioneordinijpamaven.service;

import it.prova.gestioneordinijpamaven.dao.MyDaoFactory;
import it.prova.gestioneordinijpamaven.service.articolo.ArticoloService;
import it.prova.gestioneordinijpamaven.service.articolo.ArticoloServiceImpl;
import it.prova.gestioneordinijpamaven.service.categoria.CategoriaService;
import it.prova.gestioneordinijpamaven.service.categoria.CategoriaServiceImpl;
import it.prova.gestioneordinijpamaven.service.ordine.OrdineService;
import it.prova.gestioneordinijpamaven.service.ordine.OrdineServiceImpl;


public class MyServiceFactory {
	private static ArticoloService articoloServiceInstance = null;
	private static CategoriaService categoriaServiceInstance = null;
	private static OrdineService ordineServiceInstance = null;

	public static ArticoloService getArticoloServiceInstance() {
		if (articoloServiceInstance == null)
			articoloServiceInstance = new ArticoloServiceImpl();

		articoloServiceInstance.setArticoloDAO(MyDaoFactory.getArticoloDAOInstance());

		return articoloServiceInstance;
	}

	public static CategoriaService getCategoriaServiceInstance() {
		if (categoriaServiceInstance == null)
			categoriaServiceInstance = new CategoriaServiceImpl();

		categoriaServiceInstance.setCategoriaDAO(MyDaoFactory.getCategoriaDAOInstance());

		return categoriaServiceInstance;
	}
	
	public static OrdineService getOrdineServiceInstance() {
		if (ordineServiceInstance == null)
			ordineServiceInstance = new OrdineServiceImpl();

		ordineServiceInstance.setOrdineDAO(MyDaoFactory.getOrdineDAOInstance());

		return ordineServiceInstance;
	}
}
