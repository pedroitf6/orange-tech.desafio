package dio.orangetech.orangetech.desafio.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Corretor {
    
    @Id
    private Long creci;
    private String nome;

    
    public Long getCreci() {
        return creci;
    }
    public void setCreci(Long creci) {
        this.creci = creci;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    


}
