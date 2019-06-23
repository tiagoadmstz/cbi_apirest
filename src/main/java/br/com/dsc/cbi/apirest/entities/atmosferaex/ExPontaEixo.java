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
@Document("ex_ponta_eixo")
public class ExPontaEixo implements Serializable {

    @Id
    private String id;
    @Indexed
    private Integer carcaca;
    @Indexed
    private Integer polos;
    @Indexed
    private String linha;
    private BigDecimal minimo2;
    private BigDecimal diametro_ponta_eixo;
    private BigDecimal maximo2;
    private String rd_eixo;
    private String minimo;
    private String maximo;
    private BigDecimal batimento;
    private String diametro_colo_ventilador;
    private String rd_colo_ventilador;
    private BigDecimal colo_ventilador_minimo;
    private BigDecimal colo_ventilador_minimo2;
    private BigDecimal colo_ventilador_maximo;
    private BigDecimal colo_ventilador_maximo2;

    public ExPontaEixo() {
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

    public BigDecimal getMinimo2() {
        return minimo2;
    }

    public void setMinimo2(BigDecimal minimo2) {
        this.minimo2 = minimo2;
    }

    public BigDecimal getDiametro_ponta_eixo() {
        return diametro_ponta_eixo;
    }

    public void setDiametro_ponta_eixo(BigDecimal diametro_ponta_eixo) {
        this.diametro_ponta_eixo = diametro_ponta_eixo;
    }

    public BigDecimal getMaximo2() {
        return maximo2;
    }

    public void setMaximo2(BigDecimal maximo2) {
        this.maximo2 = maximo2;
    }

    public String getRd_eixo() {
        return rd_eixo;
    }

    public void setRd_eixo(String rd_eixo) {
        this.rd_eixo = rd_eixo;
    }

    public String getMinimo() {
        return minimo;
    }

    public void setMinimo(String minimo) {
        this.minimo = minimo;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    public BigDecimal getBatimento() {
        return batimento;
    }

    public void setBatimento(BigDecimal batimento) {
        this.batimento = batimento;
    }

    public String getDiametro_colo_ventilador() {
        return diametro_colo_ventilador;
    }

    public void setDiametro_colo_ventilador(String diametro_colo_ventilador) {
        this.diametro_colo_ventilador = diametro_colo_ventilador;
    }

    public String getRd_colo_ventilador() {
        return rd_colo_ventilador;
    }

    public void setRd_colo_ventilador(String rd_colo_ventilador) {
        this.rd_colo_ventilador = rd_colo_ventilador;
    }

    public BigDecimal getColo_ventilador_minimo() {
        return colo_ventilador_minimo;
    }

    public void setColo_ventilador_minimo(BigDecimal colo_ventilador_minimo) {
        this.colo_ventilador_minimo = colo_ventilador_minimo;
    }

    public BigDecimal getColo_ventilador_minimo2() {
        return colo_ventilador_minimo2;
    }

    public void setColo_ventilador_minimo2(BigDecimal colo_ventilador_minimo2) {
        this.colo_ventilador_minimo2 = colo_ventilador_minimo2;
    }

    public BigDecimal getColo_ventilador_maximo() {
        return colo_ventilador_maximo;
    }

    public void setColo_ventilador_maximo(BigDecimal colo_ventilador_maximo) {
        this.colo_ventilador_maximo = colo_ventilador_maximo;
    }

    public BigDecimal getColo_ventilador_maximo2() {
        return colo_ventilador_maximo2;
    }

    public void setColo_ventilador_maximo2(BigDecimal colo_ventilador_maximo2) {
        this.colo_ventilador_maximo2 = colo_ventilador_maximo2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
        hash = 17 * hash + Objects.hashCode(this.carcaca);
        hash = 17 * hash + Objects.hashCode(this.polos);
        hash = 17 * hash + Objects.hashCode(this.linha);
        hash = 17 * hash + Objects.hashCode(this.minimo2);
        hash = 17 * hash + Objects.hashCode(this.diametro_ponta_eixo);
        hash = 17 * hash + Objects.hashCode(this.maximo2);
        hash = 17 * hash + Objects.hashCode(this.rd_eixo);
        hash = 17 * hash + Objects.hashCode(this.minimo);
        hash = 17 * hash + Objects.hashCode(this.maximo);
        hash = 17 * hash + Objects.hashCode(this.batimento);
        hash = 17 * hash + Objects.hashCode(this.diametro_colo_ventilador);
        hash = 17 * hash + Objects.hashCode(this.rd_colo_ventilador);
        hash = 17 * hash + Objects.hashCode(this.colo_ventilador_minimo);
        hash = 17 * hash + Objects.hashCode(this.colo_ventilador_minimo2);
        hash = 17 * hash + Objects.hashCode(this.colo_ventilador_maximo);
        hash = 17 * hash + Objects.hashCode(this.colo_ventilador_maximo2);
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
        final ExPontaEixo other = (ExPontaEixo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.rd_eixo, other.rd_eixo)) {
            return false;
        }
        if (!Objects.equals(this.minimo, other.minimo)) {
            return false;
        }
        if (!Objects.equals(this.maximo, other.maximo)) {
            return false;
        }
        if (!Objects.equals(this.diametro_colo_ventilador, other.diametro_colo_ventilador)) {
            return false;
        }
        if (!Objects.equals(this.rd_colo_ventilador, other.rd_colo_ventilador)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.polos, other.polos)) {
            return false;
        }
        if (!Objects.equals(this.minimo2, other.minimo2)) {
            return false;
        }
        if (!Objects.equals(this.diametro_ponta_eixo, other.diametro_ponta_eixo)) {
            return false;
        }
        if (!Objects.equals(this.maximo2, other.maximo2)) {
            return false;
        }
        if (!Objects.equals(this.batimento, other.batimento)) {
            return false;
        }
        if (!Objects.equals(this.colo_ventilador_minimo, other.colo_ventilador_minimo)) {
            return false;
        }
        if (!Objects.equals(this.colo_ventilador_minimo2, other.colo_ventilador_minimo2)) {
            return false;
        }
        if (!Objects.equals(this.colo_ventilador_maximo, other.colo_ventilador_maximo)) {
            return false;
        }
        if (!Objects.equals(this.colo_ventilador_maximo2, other.colo_ventilador_maximo2)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExPontaEixo{" + "id=" + id + ", carcaca=" + carcaca + ", polos=" + polos + ", linha=" + linha + ", minimo2=" + minimo2 + ", diametro_ponta_eixo=" + diametro_ponta_eixo + ", maximo2=" + maximo2 + ", rd_eixo=" + rd_eixo + ", minimo=" + minimo + ", maximo=" + maximo + ", batimento=" + batimento + ", diametro_colo_ventilador=" + diametro_colo_ventilador + ", rd_colo_ventilador=" + rd_colo_ventilador + ", colo_ventilador_minimo=" + colo_ventilador_minimo + ", colo_ventilador_minimo2=" + colo_ventilador_minimo2 + ", colo_ventilador_maximo=" + colo_ventilador_maximo + ", colo_ventilador_maximo2=" + colo_ventilador_maximo2 + '}';
    }

}
