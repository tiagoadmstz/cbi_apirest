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
@Document("ex_eixo")
public class ExEixo implements Serializable {

    @Id
    private String id;
    @Indexed
    private Integer carcaca;
    @Indexed
    private Integer polos;
    @Indexed
    private String linha;
    private Integer colo_diant_diametro;
    private String colo_diant_rd;
    private String colo_diant_minimo;
    private BigDecimal colo_diant_minimo2;
    private String colo_diant_maximo;
    private BigDecimal colo_diant_maximo2;
    private Integer colo_tras_diametro;
    private String colo_tras_rd;
    private String colo_tras_minimo;
    private BigDecimal colo_tras_minimo2;
    private String colo_tras_maximo;
    private BigDecimal colo_tras_maximo2;

    public ExEixo() {
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

    public Integer getPolos() {
        return polos;
    }

    public void setPolos(Integer polos) {
        this.polos = polos;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public Integer getColo_diant_diametro() {
        return colo_diant_diametro;
    }

    public void setColo_diant_diametro(Integer colo_diant_diametro) {
        this.colo_diant_diametro = colo_diant_diametro;
    }

    public String getColo_diant_rd() {
        return colo_diant_rd;
    }

    public void setColo_diant_rd(String colo_diant_rd) {
        this.colo_diant_rd = colo_diant_rd;
    }

    public String getColo_diant_minimo() {
        return colo_diant_minimo;
    }

    public void setColo_diant_minimo(String colo_diant_minimo) {
        this.colo_diant_minimo = colo_diant_minimo;
    }

    public BigDecimal getColo_diant_minimo2() {
        return colo_diant_minimo2;
    }

    public void setColo_diant_minimo2(BigDecimal colo_diant_minimo2) {
        this.colo_diant_minimo2 = colo_diant_minimo2;
    }

    public String getColo_diant_maximo() {
        return colo_diant_maximo;
    }

    public void setColo_diant_maximo(String colo_diant_maximo) {
        this.colo_diant_maximo = colo_diant_maximo;
    }

    public BigDecimal getColo_diant_maximo2() {
        return colo_diant_maximo2;
    }

    public void setColo_diant_maximo2(BigDecimal colo_diant_maximo2) {
        this.colo_diant_maximo2 = colo_diant_maximo2;
    }

    public Integer getColo_tras_diametro() {
        return colo_tras_diametro;
    }

    public void setColo_tras_diametro(Integer colo_tras_diametro) {
        this.colo_tras_diametro = colo_tras_diametro;
    }

    public String getColo_tras_rd() {
        return colo_tras_rd;
    }

    public void setColo_tras_rd(String colo_tras_rd) {
        this.colo_tras_rd = colo_tras_rd;
    }

    public String getColo_tras_minimo() {
        return colo_tras_minimo;
    }

    public void setColo_tras_minimo(String colo_tras_minimo) {
        this.colo_tras_minimo = colo_tras_minimo;
    }

    public BigDecimal getColo_tras_minimo2() {
        return colo_tras_minimo2;
    }

    public void setColo_tras_minimo2(BigDecimal colo_tras_minimo2) {
        this.colo_tras_minimo2 = colo_tras_minimo2;
    }

    public String getColo_tras_maximo() {
        return colo_tras_maximo;
    }

    public void setColo_tras_maximo(String colo_tras_maximo) {
        this.colo_tras_maximo = colo_tras_maximo;
    }

    public BigDecimal getColo_tras_maximo2() {
        return colo_tras_maximo2;
    }

    public void setColo_tras_maximo2(BigDecimal colo_tras_maximo2) {
        this.colo_tras_maximo2 = colo_tras_maximo2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.carcaca);
        hash = 29 * hash + Objects.hashCode(this.polos);
        hash = 29 * hash + Objects.hashCode(this.linha);
        hash = 29 * hash + Objects.hashCode(this.colo_diant_diametro);
        hash = 29 * hash + Objects.hashCode(this.colo_diant_rd);
        hash = 29 * hash + Objects.hashCode(this.colo_diant_minimo);
        hash = 29 * hash + Objects.hashCode(this.colo_diant_minimo2);
        hash = 29 * hash + Objects.hashCode(this.colo_diant_maximo);
        hash = 29 * hash + Objects.hashCode(this.colo_diant_maximo2);
        hash = 29 * hash + Objects.hashCode(this.colo_tras_diametro);
        hash = 29 * hash + Objects.hashCode(this.colo_tras_rd);
        hash = 29 * hash + Objects.hashCode(this.colo_tras_minimo);
        hash = 29 * hash + Objects.hashCode(this.colo_tras_minimo2);
        hash = 29 * hash + Objects.hashCode(this.colo_tras_maximo);
        hash = 29 * hash + Objects.hashCode(this.colo_tras_maximo2);
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
        final ExEixo other = (ExEixo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.colo_diant_rd, other.colo_diant_rd)) {
            return false;
        }
        if (!Objects.equals(this.colo_diant_minimo, other.colo_diant_minimo)) {
            return false;
        }
        if (!Objects.equals(this.colo_diant_maximo, other.colo_diant_maximo)) {
            return false;
        }
        if (!Objects.equals(this.colo_tras_rd, other.colo_tras_rd)) {
            return false;
        }
        if (!Objects.equals(this.colo_tras_minimo, other.colo_tras_minimo)) {
            return false;
        }
        if (!Objects.equals(this.colo_tras_maximo, other.colo_tras_maximo)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.polos, other.polos)) {
            return false;
        }
        if (!Objects.equals(this.colo_diant_diametro, other.colo_diant_diametro)) {
            return false;
        }
        if (!Objects.equals(this.colo_diant_minimo2, other.colo_diant_minimo2)) {
            return false;
        }
        if (!Objects.equals(this.colo_diant_maximo2, other.colo_diant_maximo2)) {
            return false;
        }
        if (!Objects.equals(this.colo_tras_diametro, other.colo_tras_diametro)) {
            return false;
        }
        if (!Objects.equals(this.colo_tras_minimo2, other.colo_tras_minimo2)) {
            return false;
        }
        if (!Objects.equals(this.colo_tras_maximo2, other.colo_tras_maximo2)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExEixo{" + "id=" + id + ", carcaca=" + carcaca + ", polos=" + polos + ", linha=" + linha + ", colo_diant_diametro=" + colo_diant_diametro + ", colo_diant_rd=" + colo_diant_rd + ", colo_diant_minimo=" + colo_diant_minimo + ", colo_diant_minimo2=" + colo_diant_minimo2 + ", colo_diant_maximo=" + colo_diant_maximo + ", colo_diant_maximo2=" + colo_diant_maximo2 + ", colo_tras_diametro=" + colo_tras_diametro + ", colo_tras_rd=" + colo_tras_rd + ", colo_tras_minimo=" + colo_tras_minimo + ", colo_tras_minimo2=" + colo_tras_minimo2 + ", colo_tras_maximo=" + colo_tras_maximo + ", colo_tras_maximo2=" + colo_tras_maximo2 + '}';
    }

}
