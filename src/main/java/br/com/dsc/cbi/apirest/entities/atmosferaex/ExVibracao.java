/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Tiago
 */
@Document("ex_vibracao")
public class ExVibracao implements Serializable {
    
    @Id
    private String id;
    @Indexed
    private Integer carcaca;
    @Indexed
    private String linha;
    private BigDecimal padrao;
    private BigDecimal especial;

    public ExVibracao() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCarcaca() {
        return carcaca;
    }

    public void setCarcaca(Integer carcaca) {
        this.carcaca = carcaca;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public BigDecimal getPadrao() {
        return padrao;
    }

    public void setPadrao(BigDecimal padrao) {
        this.padrao = padrao;
    }

    public BigDecimal getEspecial() {
        return especial;
    }

    public void setEspecial(BigDecimal especial) {
        this.especial = especial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.carcaca);
        hash = 79 * hash + Objects.hashCode(this.linha);
        hash = 79 * hash + Objects.hashCode(this.padrao);
        hash = 79 * hash + Objects.hashCode(this.especial);
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
        final ExVibracao other = (ExVibracao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.padrao, other.padrao)) {
            return false;
        }
        if (!Objects.equals(this.especial, other.especial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExVibracao{" + "id=" + id + ", carcaca=" + carcaca + ", linha=" + linha + ", padrao=" + padrao + ", especial=" + especial + '}';
    }
    
}
