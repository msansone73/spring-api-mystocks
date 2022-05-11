package br.com.msansone.springapimystocks.model;

import br.com.msansone.springapimystocks.model.rest.AbstractResponse;

import javax.persistence.*;

@Entity
public class Stock extends AbstractResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String sigla;
    private String descricao;
    @Enumerated(EnumType.ORDINAL)
    private StockType tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StockType getTipo() {
        return tipo;
    }

    public void setTipo(StockType tipo) {
        this.tipo = tipo;
    }
}
