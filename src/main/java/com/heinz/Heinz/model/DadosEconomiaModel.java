package com.heinz.Heinz.model;

import io.swagger.v3.oas.annotations.info.Info;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_DADOS_ECON")
public class DadosEconomiaModel {

    @Id
    private long id;
    private String tipo;
    private int percentualEconomia;
    private int valorEconomia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPercentualEconomia() {
        return percentualEconomia;
    }

    public void setPercentualEconomia(int percentualEconomia) {
        this.percentualEconomia = percentualEconomia;
    }

    public int getValorEconomia() {
        return valorEconomia;
    }

    public void setValorEconomia(int valorEconomia) {
        this.valorEconomia = valorEconomia;
    }
}
