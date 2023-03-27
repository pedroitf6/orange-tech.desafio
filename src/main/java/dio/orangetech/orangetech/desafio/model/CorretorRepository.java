package dio.orangetech.orangetech.desafio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorretorRepository extends CrudRepository<Corretor, Long>{
    
}
