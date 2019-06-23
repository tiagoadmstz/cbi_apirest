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
@Document("ex_referencia_encosto_rolamento")
public class ExReferenciaEncostoRolamento implements Serializable {

    @Id
    private String id;
    @Indexed
    private Integer carcaca;
    @Indexed
    private Integer polos;
    @Indexed
    private String linha;
    @Indexed
    private String furacao_pe;
    private BigDecimal referencia;
    private String minimo;
    private BigDecimal minimo2;
    private String maximo;
    private BigDecimal maximo2;
    private BigDecimal referencia_entre_colos;
    private String minimo_entre_colos;
    private BigDecimal minimo2_entre_colos;
    private String maximo_entre_colos;
    private BigDecimal maximo2_entre_colos;

    public ExReferenciaEncostoRolamento() {
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

    public String getFuracao_pe() {
        return furacao_pe;
    }

    public void setFuracao_pe(String furacao_pe) {
        this.furacao_pe = furacao_pe;
    }

    public BigDecimal getReferencia() {
        return referencia;
    }

    public void setReferencia(BigDecimal referencia) {
        this.referencia = referencia;
    }

    public String getMinimo() {
        return minimo;
    }

    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }

    public BigDecimal getMinimo2() {
        return minimo2;
    }

    public void setMinimo2(BigDecimal minimo2) {
        this.minimo2 = minimo2;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    public BigDecimal getMaximo2() {
        return maximo2;
    }

    public void setMaximo2(BigDecimal maximo2) {
        this.maximo2 = maximo2;
    }

    public BigDecimal getReferencia_entre_colos() {
        return referencia_entre_colos;
    }

    public void setReferencia_entre_colos(BigDecimal referencia_entre_colos) {
        this.referencia_entre_colos = referencia_entre_colos;
    }

    public String getMinimo_entre_colos() {
        return minimo_entre_colos;
    }

    public void setMinimo_entre_colos(String minimo_entre_colos) {
        this.minimo_entre_colos = minimo_entre_colos;
    }

    public BigDecimal getMinimo2_entre_colos() {
        return minimo2_entre_colos;
    }

    public void setMinimo2_entre_colos(BigDecimal minimo2_entre_colos) {
        this.minimo2_entre_colos = minimo2_entre_colos;
    }

    public String getMaximo_entre_colos() {
        return maximo_entre_colos;
    }

    public void setMaximo_entre_colos(String maximo_entre_colos) {
        this.maximo_entre_colos = maximo_entre_colos;
    }

    public BigDecimal getMaximo2_entre_colos() {
        return maximo2_entre_colos;
    }

    public void setMaximo2_entre_colos(BigDecimal maximo2_entre_colos) {
        this.maximo2_entre_colos = maximo2_entre_colos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.carcaca);
        hash = 59 * hash + Objects.hashCode(this.polos);
        hash = 59 * hash + Objects.hashCode(this.linha);
        hash = 59 * hash + Objects.hashCode(this.furacao_pe);
        hash = 59 * hash + Objects.hashCode(this.referencia);
        hash = 59 * hash + Objects.hashCode(this.minimo);
        hash = 59 * hash + Objects.hashCode(this.minimo2);
        hash = 59 * hash + Objects.hashCode(this.maximo);
        hash = 59 * hash + Objects.hashCode(this.maximo2);
        hash = 59 * hash + Objects.hashCode(this.referencia_entre_colos);
        hash = 59 * hash + Objects.hashCode(this.minimo_entre_colos);
        hash = 59 * hash + Objects.hashCode(this.minimo2_entre_colos);
        hash = 59 * hash + Objects.hashCode(this.maximo_entre_colos);
        hash = 59 * hash + Objects.hashCode(this.maximo2_entre_colos);
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
        final ExReferenciaEncostoRolamento other = (ExReferenciaEncostoRolamento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.furacao_pe, other.furacao_pe)) {
            return false;
        }
        if (!Objects.equals(this.minimo, other.minimo)) {
            return false;
        }
        if (!Objects.equals(this.maximo, other.maximo)) {
            return false;
        }
        if (!Objects.equals(this.minimo_entre_colos, other.minimo_entre_colos)) {
            return false;
        }
        if (!Objects.equals(this.maximo_entre_colos, other.maximo_entre_colos)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.polos, other.polos)) {
            return false;
        }
        if (!Objects.equals(this.referencia, other.referencia)) {
            return false;
        }
        if (!Objects.equals(this.minimo2, other.minimo2)) {
            return false;
        }
        if (!Objects.equals(this.maximo2, other.maximo2)) {
            return false;
        }
        if (!Objects.equals(this.referencia_entre_colos, other.referencia_entre_colos)) {
            return false;
        }
        if (!Objects.equals(this.minimo2_entre_colos, other.minimo2_entre_colos)) {
            return false;
        }
        if (!Objects.equals(this.maximo2_entre_colos, other.maximo2_entre_colos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExReferenciaEncostoRolamento{" + "id=" + id + ", carcaca=" + carcaca + ", polos=" + polos + ", linha=" + linha + ", furacao_pe=" + furacao_pe + ", referencia=" + referencia + ", minimo=" + minimo + ", minimo2=" + minimo2 + ", maximo=" + maximo + ", maximo2=" + maximo2 + ", referencia_entre_colos=" + referencia_entre_colos + ", minimo_entre_colos=" + minimo_entre_colos + ", minimo2_entre_colos=" + minimo2_entre_colos + ", maximo_entre_colos=" + maximo_entre_colos + ", maximo2_entre_colos=" + maximo2_entre_colos + '}';
    }

}
