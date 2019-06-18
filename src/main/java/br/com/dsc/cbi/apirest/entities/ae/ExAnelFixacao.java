/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.ae;

import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Tiago
 */
@Document("ex_anel_fixacao")
public class ExAnelFixacao {

    @Id
    private String anel_fixacao;
    private Integer carcaca;
    private String linha;
    private Integer polos;
    private String w_dianteiro;
    private String w1_dianteiro;
    private String w2_dianteiro;
    private String w3_dianteiro;
    private String w_traseiro;
    private String w1_traseiro;
    private String w2_traseiro;
    private String w3_traseiro;
    private String comprimento_passagem_chama_L;
    private String diametro_passagem_chama_dianteiro;
    private String diametro_passagem_chama_traseiro;
    private String diametro_passagem_chama_eixoE_dianteiro;
    private String diametro_passagem_chama_eixoE_traseiro;
    private String folga_maxima_dianteira;
    private String folga_maxima_traseira;

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

    public String getW_dianteiro() {
        return w_dianteiro;
    }

    public void setW_dianteiro(String w_dianteiro) {
        this.w_dianteiro = w_dianteiro;
    }

    public String getW1_dianteiro() {
        return w1_dianteiro;
    }

    public void setW1_dianteiro(String w1_dianteiro) {
        this.w1_dianteiro = w1_dianteiro;
    }

    public String getW2_dianteiro() {
        return w2_dianteiro;
    }

    public void setW2_dianteiro(String w2_dianteiro) {
        this.w2_dianteiro = w2_dianteiro;
    }

    public String getW3_dianteiro() {
        return w3_dianteiro;
    }

    public void setW3_dianteiro(String w3_dianteiro) {
        this.w3_dianteiro = w3_dianteiro;
    }

    public String getW_traseiro() {
        return w_traseiro;
    }

    public void setW_traseiro(String w_traseiro) {
        this.w_traseiro = w_traseiro;
    }

    public String getW1_traseiro() {
        return w1_traseiro;
    }

    public void setW1_traseiro(String w1_traseiro) {
        this.w1_traseiro = w1_traseiro;
    }

    public String getW2_traseiro() {
        return w2_traseiro;
    }

    public void setW2_traseiro(String w2_traseiro) {
        this.w2_traseiro = w2_traseiro;
    }

    public String getW3_traseiro() {
        return w3_traseiro;
    }

    public void setW3_traseiro(String w3_traseiro) {
        this.w3_traseiro = w3_traseiro;
    }

    public String getComprimento_passagem_chama_L() {
        return comprimento_passagem_chama_L;
    }

    public void setComprimento_passagem_chama_L(String comprimento_passagem_chama_L) {
        this.comprimento_passagem_chama_L = comprimento_passagem_chama_L;
    }

    public String getDiametro_passagem_chama_dianteiro() {
        return diametro_passagem_chama_dianteiro;
    }

    public void setDiametro_passagem_chama_dianteiro(String diametro_passagem_chama_dianteiro) {
        this.diametro_passagem_chama_dianteiro = diametro_passagem_chama_dianteiro;
    }

    public String getDiametro_passagem_chama_traseiro() {
        return diametro_passagem_chama_traseiro;
    }

    public void setDiametro_passagem_chama_traseiro(String diametro_passagem_chama_traseiro) {
        this.diametro_passagem_chama_traseiro = diametro_passagem_chama_traseiro;
    }

    public String getDiametro_passagem_chama_eixoE_dianteiro() {
        return diametro_passagem_chama_eixoE_dianteiro;
    }

    public void setDiametro_passagem_chama_eixoE_dianteiro(String diametro_passagem_chama_eixoE_dianteiro) {
        this.diametro_passagem_chama_eixoE_dianteiro = diametro_passagem_chama_eixoE_dianteiro;
    }

    public String getDiametro_passagem_chama_eixoE_traseiro() {
        return diametro_passagem_chama_eixoE_traseiro;
    }

    public void setDiametro_passagem_chama_eixoE_traseiro(String diametro_passagem_chama_eixoE_traseiro) {
        this.diametro_passagem_chama_eixoE_traseiro = diametro_passagem_chama_eixoE_traseiro;
    }

    public String getFolga_maxima_dianteira() {
        return folga_maxima_dianteira;
    }

    public void setFolga_maxima_dianteira(String folga_maxima_dianteira) {
        this.folga_maxima_dianteira = folga_maxima_dianteira;
    }

    public String getFolga_maxima_traseira() {
        return folga_maxima_traseira;
    }

    public void setFolga_maxima_traseira(String folga_maxima_traseira) {
        this.folga_maxima_traseira = folga_maxima_traseira;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.anel_fixacao);
        hash = 79 * hash + Objects.hashCode(this.carcaca);
        hash = 79 * hash + Objects.hashCode(this.linha);
        hash = 79 * hash + Objects.hashCode(this.polos);
        hash = 79 * hash + Objects.hashCode(this.w_dianteiro);
        hash = 79 * hash + Objects.hashCode(this.w1_dianteiro);
        hash = 79 * hash + Objects.hashCode(this.w2_dianteiro);
        hash = 79 * hash + Objects.hashCode(this.w3_dianteiro);
        hash = 79 * hash + Objects.hashCode(this.w_traseiro);
        hash = 79 * hash + Objects.hashCode(this.w1_traseiro);
        hash = 79 * hash + Objects.hashCode(this.w2_traseiro);
        hash = 79 * hash + Objects.hashCode(this.w3_traseiro);
        hash = 79 * hash + Objects.hashCode(this.comprimento_passagem_chama_L);
        hash = 79 * hash + Objects.hashCode(this.diametro_passagem_chama_dianteiro);
        hash = 79 * hash + Objects.hashCode(this.diametro_passagem_chama_traseiro);
        hash = 79 * hash + Objects.hashCode(this.diametro_passagem_chama_eixoE_dianteiro);
        hash = 79 * hash + Objects.hashCode(this.diametro_passagem_chama_eixoE_traseiro);
        hash = 79 * hash + Objects.hashCode(this.folga_maxima_dianteira);
        hash = 79 * hash + Objects.hashCode(this.folga_maxima_traseira);
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
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.polos, other.polos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExAnelFixacao{" + "anel_fixacao=" + anel_fixacao + ", carcaca=" + carcaca + ", linha=" + linha + ", polos=" + polos + ", w_dianteiro=" + w_dianteiro + ", w1_dianteiro=" + w1_dianteiro + ", w2_dianteiro=" + w2_dianteiro + ", w3_dianteiro=" + w3_dianteiro + ", w_traseiro=" + w_traseiro + ", w1_traseiro=" + w1_traseiro + ", w2_traseiro=" + w2_traseiro + ", w3_traseiro=" + w3_traseiro + ", comprimento_passagem_chama_L=" + comprimento_passagem_chama_L + ", diametro_passagem_chama_dianteiro=" + diametro_passagem_chama_dianteiro + ", diametro_passagem_chama_traseiro=" + diametro_passagem_chama_traseiro + ", diametro_passagem_chama_eixoE_dianteiro=" + diametro_passagem_chama_eixoE_dianteiro + ", diametro_passagem_chama_eixoE_traseiro=" + diametro_passagem_chama_eixoE_traseiro + ", folga_maxima_dianteira=" + folga_maxima_dianteira + ", folga_maxima_traseira=" + folga_maxima_traseira + '}';
    }

}
