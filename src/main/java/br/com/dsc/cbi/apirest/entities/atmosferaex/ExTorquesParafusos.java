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
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Tiago
 */
@Document("ex_torques_parafusos")
public class ExTorquesParafusos implements Serializable {

    @Id
    private String id;
    private Integer carcaca;
    private String linha;
    private String tampas;
    private BigDecimal tampa_minimo;
    private BigDecimal tampa_maximo;
    private String aneis_fixacao;
    private BigDecimal anel_minimo;
    private BigDecimal anel_maximo;
    private String base_caixa_ligacao;
    private BigDecimal base_cx_minimo;
    private BigDecimal base_cx_maximo;
    private String caixa_ligacao;
    private String saida_cabos;
    private BigDecimal caixa_lig_minimo;
    private BigDecimal caixa_lig_maximo;

    public ExTorquesParafusos() {
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

    public String getTampas() {
        return tampas;
    }

    public void setTampas(String tampas) {
        this.tampas = tampas;
    }

    public BigDecimal getTampa_minimo() {
        return tampa_minimo;
    }

    public void setTampa_minimo(BigDecimal tampa_minimo) {
        this.tampa_minimo = tampa_minimo;
    }

    public BigDecimal getTampa_maximo() {
        return tampa_maximo;
    }

    public void setTampa_maximo(BigDecimal tampa_maximo) {
        this.tampa_maximo = tampa_maximo;
    }

    public String getAneis_fixacao() {
        return aneis_fixacao;
    }

    public void setAneis_fixacao(String aneis_fixacao) {
        this.aneis_fixacao = aneis_fixacao;
    }

    public BigDecimal getAnel_minimo() {
        return anel_minimo;
    }

    public void setAnel_minimo(BigDecimal anel_minimo) {
        this.anel_minimo = anel_minimo;
    }

    public BigDecimal getAnel_maximo() {
        return anel_maximo;
    }

    public void setAnel_maximo(BigDecimal anel_maximo) {
        this.anel_maximo = anel_maximo;
    }

    public String getBase_caixa_ligacao() {
        return base_caixa_ligacao;
    }

    public void setBase_caixa_ligacao(String base_caixa_ligacao) {
        this.base_caixa_ligacao = base_caixa_ligacao;
    }

    public BigDecimal getBase_cx_minimo() {
        return base_cx_minimo;
    }

    public void setBase_cx_minimo(BigDecimal base_cx_minimo) {
        this.base_cx_minimo = base_cx_minimo;
    }

    public BigDecimal getBase_cx_maximo() {
        return base_cx_maximo;
    }

    public void setBase_cx_maximo(BigDecimal base_cx_maximo) {
        this.base_cx_maximo = base_cx_maximo;
    }

    public String getCaixa_ligacao() {
        return caixa_ligacao;
    }

    public void setCaixa_ligacao(String caixa_ligacao) {
        this.caixa_ligacao = caixa_ligacao;
    }

    public String getSaida_cabos() {
        return saida_cabos;
    }

    public void setSaida_cabos(String saida_cabos) {
        this.saida_cabos = saida_cabos;
    }

    public BigDecimal getCaixa_lig_minimo() {
        return caixa_lig_minimo;
    }

    public void setCaixa_lig_minimo(BigDecimal caixa_lig_minimo) {
        this.caixa_lig_minimo = caixa_lig_minimo;
    }

    public BigDecimal getCaixa_lig_maximo() {
        return caixa_lig_maximo;
    }

    public void setCaixa_lig_maximo(BigDecimal caixa_lig_maximo) {
        this.caixa_lig_maximo = caixa_lig_maximo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.id);
        hash = 43 * hash + Objects.hashCode(this.carcaca);
        hash = 43 * hash + Objects.hashCode(this.linha);
        hash = 43 * hash + Objects.hashCode(this.tampas);
        hash = 43 * hash + Objects.hashCode(this.tampa_minimo);
        hash = 43 * hash + Objects.hashCode(this.tampa_maximo);
        hash = 43 * hash + Objects.hashCode(this.aneis_fixacao);
        hash = 43 * hash + Objects.hashCode(this.anel_minimo);
        hash = 43 * hash + Objects.hashCode(this.anel_maximo);
        hash = 43 * hash + Objects.hashCode(this.base_caixa_ligacao);
        hash = 43 * hash + Objects.hashCode(this.base_cx_minimo);
        hash = 43 * hash + Objects.hashCode(this.base_cx_maximo);
        hash = 43 * hash + Objects.hashCode(this.caixa_ligacao);
        hash = 43 * hash + Objects.hashCode(this.saida_cabos);
        hash = 43 * hash + Objects.hashCode(this.caixa_lig_minimo);
        hash = 43 * hash + Objects.hashCode(this.caixa_lig_maximo);
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
        final ExTorquesParafusos other = (ExTorquesParafusos) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.tampas, other.tampas)) {
            return false;
        }
        if (!Objects.equals(this.aneis_fixacao, other.aneis_fixacao)) {
            return false;
        }
        if (!Objects.equals(this.base_caixa_ligacao, other.base_caixa_ligacao)) {
            return false;
        }
        if (!Objects.equals(this.caixa_ligacao, other.caixa_ligacao)) {
            return false;
        }
        if (!Objects.equals(this.saida_cabos, other.saida_cabos)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.tampa_minimo, other.tampa_minimo)) {
            return false;
        }
        if (!Objects.equals(this.tampa_maximo, other.tampa_maximo)) {
            return false;
        }
        if (!Objects.equals(this.anel_minimo, other.anel_minimo)) {
            return false;
        }
        if (!Objects.equals(this.anel_maximo, other.anel_maximo)) {
            return false;
        }
        if (!Objects.equals(this.base_cx_minimo, other.base_cx_minimo)) {
            return false;
        }
        if (!Objects.equals(this.base_cx_maximo, other.base_cx_maximo)) {
            return false;
        }
        if (!Objects.equals(this.caixa_lig_minimo, other.caixa_lig_minimo)) {
            return false;
        }
        if (!Objects.equals(this.caixa_lig_maximo, other.caixa_lig_maximo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExTorquesParafusos{" + "id=" + id + ", carcaca=" + carcaca + ", linha=" + linha + ", tampas=" + tampas + ", tampa_minimo=" + tampa_minimo + ", tampa_maximo=" + tampa_maximo + ", aneis_fixacao=" + aneis_fixacao + ", anel_minimo=" + anel_minimo + ", anel_maximo=" + anel_maximo + ", base_caixa_ligacao=" + base_caixa_ligacao + ", base_cx_minimo=" + base_cx_minimo + ", base_cx_maximo=" + base_cx_maximo + ", caixa_ligacao=" + caixa_ligacao + ", saida_cabos=" + saida_cabos + ", caixa_lig_minimo=" + caixa_lig_minimo + ", caixa_lig_maximo=" + caixa_lig_maximo + '}';
    }

}
