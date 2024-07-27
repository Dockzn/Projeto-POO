package models.entity;
import java.util.Date;

public class Relatorio {
    //ATRIBUTOS//
    public enum Tipo {
        BIA,
        PREX
    }

    private Tipo tipo; // Enum Tipo
    private String observacoes;
    private String campoAnexo;
    private Date dataLimite;

    // Construtor
    public Relatorio(Tipo tipo, String observacoes, String campoAnexo, Date dataLimite) {
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.campoAnexo = campoAnexo;
        this.dataLimite = dataLimite;
    }

    // Getters e Setters
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getCampoAnexo() {
        return campoAnexo;
    }

    public void setCampoAnexo(String campoAnexo) {
        this.campoAnexo = campoAnexo;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }
}