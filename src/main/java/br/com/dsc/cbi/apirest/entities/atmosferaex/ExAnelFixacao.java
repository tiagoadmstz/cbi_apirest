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
@Document("ex_anel_fixacao")
public class ExAnelFixacao implements Serializable {

    @Id
    private String anel_fixacao;
    private Integer carcaca;
    private String linha;
    private Integer polos;
    private BigDecimal w_dianteiro;
    private BigDecimal w1_dianteiro;
    private BigDecimal w2_dianteiro;
    private BigDecimal w3_dianteiro;
    private BigDecimal w_traseiro;
    private BigDecimal w1_traseiro;
    private BigDecimal w2_traseiro;
    private BigDecimal w3_traseiro;
    private BigDecimal comprimento_passagem_chama_L;
    private BigDecimal diametro_passagem_chama_dianteiro;
    private BigDecimal diametro_passagem_chama_traseiro;
    private BigDecimal diametro_passagem_chama_eixoE_dianteiro;
    private BigDecimal diametro_passagem_chama_eixoE_traseiro;
    private BigDecimal folga_maxima_dianteira;
    private BigDecimal folga_maxima_traseira;

    public ExAnelFixacao() {
    }

    public String getAnel_fixacao() {
        return anel_fixacao;
    }

    public void setAnel_fixacao(String anel_fixacao) {
        this.anel_fixacao = anel_fixacao;
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

    public BigDecimal getW_dianteiro() {
        return w_dianteiro;
    }

    public void setW_dianteiro(BigDecimal w_dianteiro) {
        this.w_dianteiro = w_dianteiro;
    }

    public BigDecimal getW1_dianteiro() {
        return w1_dianteiro;
    }

    public void setW1_dianteiro(BigDecimal w1_dianteiro) {
        this.w1_dianteiro = w1_dianteiro;
    }

    public BigDecimal getW2_dianteiro() {
        return w2_dianteiro;
    }

    public void setW2_dianteiro(BigDecimal w2_dianteiro) {
        this.w2_dianteiro = w2_dianteiro;
    }

    public BigDecimal getW3_dianteiro() {
        return w3_dianteiro;
    }

    public void setW3_dianteiro(BigDecimal w3_dianteiro) {
        this.w3_dianteiro = w3_dianteiro;
    }

    public BigDecimal getW_traseiro() {
        return w_traseiro;
    }

    public void setW_traseiro(BigDecimal w_traseiro) {
        this.w_traseiro = w_traseiro;
    }

    public BigDecimal getW1_traseiro() {
        return w1_traseiro;
    }

    public void setW1_traseiro(BigDecimal w1_traseiro) {
        this.w1_traseiro = w1_traseiro;
    }

    public BigDecimal getW2_traseiro() {
        return w2_traseiro;
    }

    public void setW2_traseiro(BigDecimal w2_traseiro) {
        this.w2_traseiro = w2_traseiro;
    }

    public BigDecimal getW3_traseiro() {
        return w3_traseiro;
    }

    public void setW3_traseiro(BigDecimal w3_traseiro) {
        this.w3_traseiro = w3_traseiro;
    }

    public BigDecimal getComprimento_passagem_chama_L() {
        return comprimento_passagem_chama_L;
    }

    public void setComprimento_passagem_chama_L(BigDecimal comprimento_passagem_chama_L) {
        this.comprimento_passagem_chama_L = comprimento_passagem_chama_L;
    }

    public BigDecimal getDiametro_passagem_chama_dianteiro() {
        return diametro_passagem_chama_dianteiro;
    }

    public void setDiametro_passagem_chama_dianteiro(BigDecimal diametro_passagem_chama_dianteiro) {
        this.diametro_passagem_chama_dianteiro = diametro_passagem_chama_dianteiro;
    }

    public BigDecimal getDiametro_passagem_chama_traseiro() {
        return diametro_passagem_chama_traseiro;
    }

    public void setDiametro_passagem_chama_traseiro(BigDecimal diametro_passagem_chama_traseiro) {
        this.diametro_passagem_chama_traseiro = diametro_passagem_chama_traseiro;
    }

    public BigDecimal getDiametro_passagem_chama_eixoE_dianteiro() {
        return diametro_passagem_chama_eixoE_dianteiro;
    }

    public void setDiametro_passagem_chama_eixoE_dianteiro(BigDecimal diametro_passagem_chama_eixoE_dianteiro) {
        this.diametro_passagem_chama_eixoE_dianteiro = diametro_passagem_chama_eixoE_dianteiro;
    }

    public BigDecimal getDiametro_passagem_chama_eixoE_traseiro() {
        return diametro_passagem_chama_eixoE_traseiro;
    }

    public void setDiametro_passagem_chama_eixoE_traseiro(BigDecimal diametro_passagem_chama_eixoE_traseiro) {
        this.diametro_passagem_chama_eixoE_traseiro = diametro_passagem_chama_eixoE_traseiro;
    }

    public BigDecimal getFolga_maxima_dianteira() {
        return folga_maxima_dianteira;
    }

    public void setFolga_maxima_dianteira(BigDecimal folga_maxima_dianteira) {
        this.folga_maxima_dianteira = folga_maxima_dianteira;
    }

    public BigDecimal getFolga_maxima_traseira() {
        return folga_maxima_traseira;
    }

    public void setFolga_maxima_traseira(BigDecimal folga_maxima_traseira) {
        this.folga_maxima_traseira = folga_maxima_traseira;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.anel_fixacao);
        hash = 53 * hash + Objects.hashCode(this.carcaca);
        hash = 53 * hash + Objects.hashCode(this.linha);
        hash = 53 * hash + Objects.hashCode(this.polos);
        hash = 53 * hash + Objects.hashCode(this.w_dianteiro);
        hash = 53 * hash + Objects.hashCode(this.w1_dianteiro);
        hash = 53 * hash + Objects.hashCode(this.w2_dianteiro);
        hash = 53 * hash + Objects.hashCode(this.w3_dianteiro);
        hash = 53 * hash + Objects.hashCode(this.w_traseiro);
        hash = 53 * hash + Objects.hashCode(this.w1_traseiro);
        hash = 53 * hash + Objects.hashCode(this.w2_traseiro);
        hash = 53 * hash + Objects.hashCode(this.w3_traseiro);
        hash = 53 * hash + Objects.hashCode(this.comprimento_passagem_chama_L);
        hash = 53 * hash + Objects.hashCode(this.diametro_passagem_chama_dianteiro);
        hash = 53 * hash + Objects.hashCode(this.diametro_passagem_chama_traseiro);
        hash = 53 * hash + Objects.hashCode(this.diametro_passagem_chama_eixoE_dianteiro);
        hash = 53 * hash + Objects.hashCode(this.diametro_passagem_chama_eixoE_traseiro);
        hash = 53 * hash + Objects.hashCode(this.folga_maxima_dianteira);
        hash = 53 * hash + Objects.hashCode(this.folga_maxima_traseira);
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
        final ExAnelFixacao other = (ExAnelFixacao) obj;
        if (!Objects.equals(this.anel_fixacao, other.anel_fixacao)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.polos, other.polos)) {
            return false;
        }
        if (!Objects.equals(this.w_dianteiro, other.w_dianteiro)) {
            return false;
        }
        if (!Objects.equals(this.w1_dianteiro, other.w1_dianteiro)) {
            return false;
        }
        if (!Objects.equals(this.w2_dianteiro, other.w2_dianteiro)) {
            return false;
        }
        if (!Objects.equals(this.w3_dianteiro, other.w3_dianteiro)) {
            return false;
        }
        if (!Objects.equals(this.w_traseiro, other.w_traseiro)) {
            return false;
        }
        if (!Objects.equals(this.w1_traseiro, other.w1_traseiro)) {
            return false;
        }
        if (!Objects.equals(this.w2_traseiro, other.w2_traseiro)) {
            return false;
        }
        if (!Objects.equals(this.w3_traseiro, other.w3_traseiro)) {
            return false;
        }
        if (!Objects.equals(this.comprimento_passagem_chama_L, other.comprimento_passagem_chama_L)) {
            return false;
        }
        if (!Objects.equals(this.diametro_passagem_chama_dianteiro, other.diametro_passagem_chama_dianteiro)) {
            return false;
        }
        if (!Objects.equals(this.diametro_passagem_chama_traseiro, other.diametro_passagem_chama_traseiro)) {
            return false;
        }
        if (!Objects.equals(this.diametro_passagem_chama_eixoE_dianteiro, other.diametro_passagem_chama_eixoE_dianteiro)) {
            return false;
        }
        if (!Objects.equals(this.diametro_passagem_chama_eixoE_traseiro, other.diametro_passagem_chama_eixoE_traseiro)) {
            return false;
        }
        if (!Objects.equals(this.folga_maxima_dianteira, other.folga_maxima_dianteira)) {
            return false;
        }
        if (!Objects.equals(this.folga_maxima_traseira, other.folga_maxima_traseira)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExAnelFixacao{" + "anel_fixacao=" + anel_fixacao + ", carcaca=" + carcaca + ", linha=" + linha + ", polos=" + polos + ", w_dianteiro=" + w_dianteiro + ", w1_dianteiro=" + w1_dianteiro + ", w2_dianteiro=" + w2_dianteiro + ", w3_dianteiro=" + w3_dianteiro + ", w_traseiro=" + w_traseiro + ", w1_traseiro=" + w1_traseiro + ", w2_traseiro=" + w2_traseiro + ", w3_traseiro=" + w3_traseiro + ", comprimento_passagem_chama_L=" + comprimento_passagem_chama_L + ", diametro_passagem_chama_dianteiro=" + diametro_passagem_chama_dianteiro + ", diametro_passagem_chama_traseiro=" + diametro_passagem_chama_traseiro + ", diametro_passagem_chama_eixoE_dianteiro=" + diametro_passagem_chama_eixoE_dianteiro + ", diametro_passagem_chama_eixoE_traseiro=" + diametro_passagem_chama_eixoE_traseiro + ", folga_maxima_dianteira=" + folga_maxima_dianteira + ", folga_maxima_traseira=" + folga_maxima_traseira + '}';
    }

}
