package dio.orangetech.orangetech.desafio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Long numero;
    private String imovelBuscado;
    @ManyToOne
    private Endereco endereco;
    @ManyToOne
    private Corretor corretor;
    
    
    
    public Long getNumero() {
        return numero;
    }
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    public Corretor getCorretor() {
        return corretor;
    }
    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getImovelBuscado() {
        return imovelBuscado;
    }
    public void setImovelBuscado(String imovelBuscado) {
        this.imovelBuscado = imovelBuscado;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    


}
