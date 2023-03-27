package dio.orangetech.orangetech.desafio.service;

import dio.orangetech.orangetech.desafio.model.Corretor;

public interface CorretorService {
    
    Iterable<Corretor> buscarTodos();
    Corretor buscarPorId(Long creci);
    void inserir(Corretor corretor);
	void atualizar(Long creci, Corretor corretor);
	void deletar(Long creci);
    
}
