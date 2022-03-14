package com.example.chatonline.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Mensagens implements Serializable {
    private static final Long serialVersionUID = 1L;

    private Integer id;
    private String texto;
    private Date dataEnvio;

    //implementar - usuario

    public Mensagens() {
    }

    public Mensagens(Integer id, String texto, Date dataEnvio) {
        this.id = id;
        this.texto = texto;
        this.dataEnvio = dataEnvio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensagens chat = (Mensagens) o;
        return Objects.equals(id, chat.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
