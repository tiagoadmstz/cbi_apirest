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
@Document("ex_tampa")
public class ExTampa implements Serializable {

    @Id
    private String id;
    @Indexed
    private Integer carcaca;
    @Indexed
    private String linha;
    @Indexed
    private Integer polos;
    private BigDecimal tp_diant_diametro;
    private String tp_diant_rd;
    private String tp_diant_minimo;
    private BigDecimal tp_diant_minimo2;
    private String tp_diant_maximo;
    private BigDecimal tp_diant_maximo2;
    private BigDecimal tp_tras_diametro;
    private String tp_tras_rd;
    private String tp_tras_minimo;
    private BigDecimal tp_tras_minimo2;
    private String tp_tras_maximo;
    private BigDecimal tp_tras_maximo2;

    public ExTampa() {
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

    public Integer getPolos() {
        return polos;
    }

    public void setPolos(Integer polos) {
        this.polos = polos;
    }

    public BigDecimal getTp_diant_diametro() {
        return tp_diant_diametro;
    }

    public void setTp_diant_diametro(BigDecimal tp_diant_diametro) {
        this.tp_diant_diametro = tp_diant_diametro;
    }

    public String getTp_diant_rd() {
        return tp_diant_rd;
    }

    public void setTp_diant_rd(String tp_diant_rd) {
        this.tp_diant_rd = tp_diant_rd;
    }

    public String getTp_diant_minimo() {
        return tp_diant_minimo;
    }

    public void setTp_diant_minimo(String tp_diant_minimo) {
        this.tp_diant_minimo = tp_diant_minimo;
    }

    public BigDecimal getTp_diant_minimo2() {
        return tp_diant_minimo2;
    }

    public void setTp_diant_minimo2(BigDecimal tp_diant_minimo2) {
        this.tp_diant_minimo2 = tp_diant_minimo2;
    }

    public String getTp_diant_maximo() {
        return tp_diant_maximo;
    }

    public void setTp_diant_maximo(String tp_diant_maximo) {
        this.tp_diant_maximo = tp_diant_maximo;
    }

    public BigDecimal getTp_diant_maximo2() {
        return tp_diant_maximo2;
    }

    public void setTp_diant_maximo2(BigDecimal tp_diant_maximo2) {
        this.tp_diant_maximo2 = tp_diant_maximo2;
    }

    public BigDecimal getTp_tras_diametro() {
        return tp_tras_diametro;
    }

    public void setTp_tras_diametro(BigDecimal tp_tras_diametro) {
        this.tp_tras_diametro = tp_tras_diametro;
    }

    public String getTp_tras_rd() {
        return tp_tras_rd;
    }

    public void setTp_tras_rd(String tp_tras_rd) {
        this.tp_tras_rd = tp_tras_rd;
    }

    public String getTp_tras_minimo() {
        return tp_tras_minimo;
    }

    public void setTp_tras_minimo(String tp_tras_minimo) {
        this.tp_tras_minimo = tp_tras_minimo;
    }

    public BigDecimal getTp_tras_minimo2() {
        return tp_tras_minimo2;
    }

    public void setTp_tras_minimo2(BigDecimal tp_tras_minimo2) {
        this.tp_tras_minimo2 = tp_tras_minimo2;
    }

    public String getTp_tras_maximo() {
        return tp_tras_maximo;
    }

    public void setTp_tras_maximo(String tp_tras_maximo) {
        this.tp_tras_maximo = tp_tras_maximo;
    }

    public BigDecimal getTp_tras_maximo2() {
        return tp_tras_maximo2;
    }

    public void setTp_tras_maximo2(BigDecimal tp_tras_maximo2) {
        this.tp_tras_maximo2 = tp_tras_maximo2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.carcaca);
        hash = 59 * hash + Objects.hashCode(this.linha);
        hash = 59 * hash + Objects.hashCode(this.polos);
        hash = 59 * hash + Objects.hashCode(this.tp_diant_diametro);
        hash = 59 * hash + Objects.hashCode(this.tp_diant_rd);
        hash = 59 * hash + Objects.hashCode(this.tp_diant_minimo);
        hash = 59 * hash + Objects.hashCode(this.tp_diant_minimo2);
        hash = 59 * hash + Objects.hashCode(this.tp_diant_maximo);
        hash = 59 * hash + Objects.hashCode(this.tp_diant_maximo2);
        hash = 59 * hash + Objects.hashCode(this.tp_tras_diametro);
        hash = 59 * hash + Objects.hashCode(this.tp_tras_rd);
        hash = 59 * hash + Objects.hashCode(this.tp_tras_minimo);
        hash = 59 * hash + Objects.hashCode(this.tp_tras_minimo2);
        hash = 59 * hash + Objects.hashCode(this.tp_tras_maximo);
        hash = 59 * hash + Objects.hashCode(this.tp_tras_maximo2);
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
        final ExTampa other = (ExTampa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.tp_diant_rd, other.tp_diant_rd)) {
            return false;
        }
        if (!Objects.equals(this.tp_diant_minimo, other.tp_diant_minimo)) {
            return false;
        }
        if (!Objects.equals(this.tp_diant_maximo, other.tp_diant_maximo)) {
            return false;
        }
        if (!Objects.equals(this.tp_tras_rd, other.tp_tras_rd)) {
            return false;
        }
        if (!Objects.equals(this.tp_tras_minimo, other.tp_tras_minimo)) {
            return false;
        }
        if (!Objects.equals(this.tp_tras_maximo, other.tp_tras_maximo)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.polos, other.polos)) {
            return false;
        }
        if (!Objects.equals(this.tp_diant_diametro, other.tp_diant_diametro)) {
            return false;
        }
        if (!Objects.equals(this.tp_diant_minimo2, other.tp_diant_minimo2)) {
            return false;
        }
        if (!Objects.equals(this.tp_diant_maximo2, other.tp_diant_maximo2)) {
            return false;
        }
        if (!Objects.equals(this.tp_tras_diametro, other.tp_tras_diametro)) {
            return false;
        }
        if (!Objects.equals(this.tp_tras_minimo2, other.tp_tras_minimo2)) {
            return false;
        }
        if (!Objects.equals(this.tp_tras_maximo2, other.tp_tras_maximo2)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExTampa{" + "id=" + id + ", carcaca=" + carcaca + ", linha=" + linha + ", polos=" + polos + ", tp_diant_diametro=" + tp_diant_diametro + ", tp_diant_rd=" + tp_diant_rd + ", tp_diant_minimo=" + tp_diant_minimo + ", tp_diant_minimo2=" + tp_diant_minimo2 + ", tp_diant_maximo=" + tp_diant_maximo + ", tp_diant_maximo2=" + tp_diant_maximo2 + ", tp_tras_diametro=" + tp_tras_diametro + ", tp_tras_rd=" + tp_tras_rd + ", tp_tras_minimo=" + tp_tras_minimo + ", tp_tras_minimo2=" + tp_tras_minimo2 + ", tp_tras_maximo=" + tp_tras_maximo + ", tp_tras_maximo2=" + tp_tras_maximo2 + '}';
    }

}
