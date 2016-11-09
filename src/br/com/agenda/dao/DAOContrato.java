package br.com.agenda.dao;

import java.util.List;

public interface DAOContrato<T, L> {

	void inserir(T obj);
	void alterar(T obj);
	void excluir(T obj);
	
	List<T> getAll();
	T getById(L id);
	
}
