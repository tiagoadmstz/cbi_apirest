/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author Tiago
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Etapa_Servico implements Serializable {
    
    private String nome_etapa;
    private LocalDateTime data_etapa;
    private String responsavel_etapa;

    public Etapa_Servico() {
    }

    public Etapa_Servico(String nome_etapa, LocalDateTime data_etapa, String responsavel_etapa) {
        this.nome_etapa = nome_etapa;
        this.data_etapa = data_etapa;
        this.responsavel_etapa = responsavel_etapa;
    }

    public String getNome_etapa() {
        return nome_etapa;
    }

    public void setNome_etapa(String nome_etapa) {
        this.nome_etapa = nome_etapa;
    }

    public LocalDateTime getData_etapa() {
        return data_etapa;
    }

    public void setData_etapa(LocalDateTime data_etapa) {
        this.data_etapa = data_etapa;
    }

    public String getResponsavel_etapa() {
        return responsavel_etapa;
    }

    public void setResponsavel_etapa(String responsavel_etapa) {
        this.responsavel_etapa = responsavel_etapa;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.nome_etapa);
        hash = 41 * hash + Objects.hashCode(this.data_etapa);
        hash = 41 * hash + Objects.hashCode(this.responsavel_etapa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etapa_Servico other = (Etapa_Servico) obj;
        if (!Objects.equals(this.nome_etapa, other.nome_etapa)) {
            return false;
        }
        if (!Objects.equals(this.responsavel_etapa, other.responsavel_etapa)) {
            return false;
        }
        if (!Objects.equals(this.data_etapa, other.data_etapa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etapa_Servico{" + "nome_etapa=" + nome_etapa + ", data_etapa=" + data_etapa + ", responsavel_etapa=" + responsavel_etapa + '}';
    }
    
}
