/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_tampa")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Tampa {

    private BigDecimal sede_rolamento;
    private String equip_sedeRolamento;
    private BigDecimal encaixe;
    private String equip_encaixe;
    private BigDecimal comp_encaixe_x;
    private BigDecimal comp_encaixe_y;
    private String equip_compEncaixe;
    private BigDecimal largura_face_anel;
    private String equip_LarguraFaceAnel;
    private BigDecimal largura_entre_furo_diametro_ext_anel;
    private String equip_LarguraFuroDiamAnel;
    private BigDecimal planicidade_face_assento_anel;
    private String equip_PlanicidadeAnel;
    private BigDecimal rugosidade_encaixe_tampa;
    private String equip_RugosidadeEncaixe;
    private BigDecimal rugosidade_face_assento_anel;
    private String equip_RugosidadeAssentoAnel;
    private Anel anel_fixacao;

    public Tampa() {
    }

    public BigDecimal getSede_rolamento() {
        return sede_rolamento;
    }

    public void setSede_rolamento(BigDecimal sede_rolamento) {
        this.sede_rolamento = sede_rolamento;
    }

    public String getEquip_sedeRolamento() {
        return equip_sedeRolamento;
    }

    public void setEquip_sedeRolamento(String equip_sedeRolamento) {
        this.equip_sedeRolamento = equip_sedeRolamento;
    }

    public BigDecimal getEncaixe() {
        return encaixe;
    }

    public void setEncaixe(BigDecimal encaixe) {
        this.encaixe = encaixe;
    }

    public String getEquip_encaixe() {
        return equip_encaixe;
    }

    public void setEquip_encaixe(String equip_encaixe) {
        this.equip_encaixe = equip_encaixe;
    }

    public BigDecimal getComp_encaixe_x() {
        return comp_encaixe_x;
    }

    public void setComp_encaixe_x(BigDecimal comp_encaixe_x) {
        this.comp_encaixe_x = comp_encaixe_x;
    }

    public BigDecimal getComp_encaixe_y() {
        return comp_encaixe_y;
    }

    public void setComp_encaixe_y(BigDecimal comp_encaixe_y) {
        this.comp_encaixe_y = comp_encaixe_y;
    }

    public String getEquip_compEncaixe() {
        return equip_compEncaixe;
    }

    public void setEquip_compEncaixe(String equip_compEncaixe) {
        this.equip_compEncaixe = equip_compEncaixe;
    }

    public BigDecimal getLargura_face_anel() {
        return largura_face_anel;
    }

    public void setLargura_face_anel(BigDecimal largura_face_anel) {
        this.largura_face_anel = largura_face_anel;
    }

    public String getEquip_LarguraFaceAnel() {
        return equip_LarguraFaceAnel;
    }

    public void setEquip_LarguraFaceAnel(String equip_LarguraFaceAnel) {
        this.equip_LarguraFaceAnel = equip_LarguraFaceAnel;
    }

    public BigDecimal getLargura_entre_furo_diametro_ext_anel() {
        return largura_entre_furo_diametro_ext_anel;
    }

    public void setLargura_entre_furo_diametro_ext_anel(BigDecimal largura_entre_furo_diametro_ext_anel) {
        this.largura_entre_furo_diametro_ext_anel = largura_entre_furo_diametro_ext_anel;
    }

    public String getEquip_LarguraFuroDiamAnel() {
        return equip_LarguraFuroDiamAnel;
    }

    public void setEquip_LarguraFuroDiamAnel(String equip_LarguraFuroDiamAnel) {
        this.equip_LarguraFuroDiamAnel = equip_LarguraFuroDiamAnel;
    }

    public BigDecimal getPlanicidade_face_assento_anel() {
        return planicidade_face_assento_anel;
    }

    public void setPlanicidade_face_assento_anel(BigDecimal planicidade_face_assento_anel) {
        this.planicidade_face_assento_anel = planicidade_face_assento_anel;
    }

    public String getEquip_PlanicidadeAnel() {
        return equip_PlanicidadeAnel;
    }

    public void setEquip_PlanicidadeAnel(String equip_PlanicidadeAnel) {
        this.equip_PlanicidadeAnel = equip_PlanicidadeAnel;
    }

    public BigDecimal getRugosidade_encaixe_tampa() {
        return rugosidade_encaixe_tampa;
    }

    public void setRugosidade_encaixe_tampa(BigDecimal rugosidade_encaixe_tampa) {
        this.rugosidade_encaixe_tampa = rugosidade_encaixe_tampa;
    }

    public String getEquip_RugosidadeEncaixe() {
        return equip_RugosidadeEncaixe;
    }

    public void setEquip_RugosidadeEncaixe(String equip_RugosidadeEncaixe) {
        this.equip_RugosidadeEncaixe = equip_RugosidadeEncaixe;
    }

    public BigDecimal getRugosidade_face_assento_anel() {
        return rugosidade_face_assento_anel;
    }

    public void setRugosidade_face_assento_anel(BigDecimal rugosidade_face_assento_anel) {
        this.rugosidade_face_assento_anel = rugosidade_face_assento_anel;
    }

    public String getEquip_RugosidadeAssentoAnel() {
        return equip_RugosidadeAssentoAnel;
    }

    public void setEquip_RugosidadeAssentoAnel(String equip_RugosidadeAssentoAnel) {
        this.equip_RugosidadeAssentoAnel = equip_RugosidadeAssentoAnel;
    }

    public Anel getAnel_fixacao() {
        return anel_fixacao;
    }

    public void setAnel_fixacao(Anel anel_fixacao) {
        this.anel_fixacao = anel_fixacao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.sede_rolamento);
        hash = 97 * hash + Objects.hashCode(this.equip_sedeRolamento);
        hash = 97 * hash + Objects.hashCode(this.encaixe);
        hash = 97 * hash + Objects.hashCode(this.equip_encaixe);
        hash = 97 * hash + Objects.hashCode(this.comp_encaixe_x);
        hash = 97 * hash + Objects.hashCode(this.comp_encaixe_y);
        hash = 97 * hash + Objects.hashCode(this.equip_compEncaixe);
        hash = 97 * hash + Objects.hashCode(this.largura_face_anel);
        hash = 97 * hash + Objects.hashCode(this.equip_LarguraFaceAnel);
        hash = 97 * hash + Objects.hashCode(this.largura_entre_furo_diametro_ext_anel);
        hash = 97 * hash + Objects.hashCode(this.equip_LarguraFuroDiamAnel);
        hash = 97 * hash + Objects.hashCode(this.planicidade_face_assento_anel);
        hash = 97 * hash + Objects.hashCode(this.equip_PlanicidadeAnel);
        hash = 97 * hash + Objects.hashCode(this.rugosidade_encaixe_tampa);
        hash = 97 * hash + Objects.hashCode(this.equip_RugosidadeEncaixe);
        hash = 97 * hash + Objects.hashCode(this.rugosidade_face_assento_anel);
        hash = 97 * hash + Objects.hashCode(this.equip_RugosidadeAssentoAnel);
        hash = 97 * hash + Objects.hashCode(this.anel_fixacao);
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
        final Tampa other = (Tampa) obj;
        if (!Objects.equals(this.equip_sedeRolamento, other.equip_sedeRolamento)) {
            return false;
        }
        if (!Objects.equals(this.equip_encaixe, other.equip_encaixe)) {
            return false;
        }
        if (!Objects.equals(this.equip_compEncaixe, other.equip_compEncaixe)) {
            return false;
        }
        if (!Objects.equals(this.equip_LarguraFaceAnel, other.equip_LarguraFaceAnel)) {
            return false;
        }
        if (!Objects.equals(this.equip_LarguraFuroDiamAnel, other.equip_LarguraFuroDiamAnel)) {
            return false;
        }
        if (!Objects.equals(this.equip_PlanicidadeAnel, other.equip_PlanicidadeAnel)) {
            return false;
        }
        if (!Objects.equals(this.equip_RugosidadeEncaixe, other.equip_RugosidadeEncaixe)) {
            return false;
        }
        if (!Objects.equals(this.equip_RugosidadeAssentoAnel, other.equip_RugosidadeAssentoAnel)) {
            return false;
        }
        if (!Objects.equals(this.sede_rolamento, other.sede_rolamento)) {
            return false;
        }
        if (!Objects.equals(this.encaixe, other.encaixe)) {
            return false;
        }
        if (!Objects.equals(this.comp_encaixe_x, other.comp_encaixe_x)) {
            return false;
        }
        if (!Objects.equals(this.comp_encaixe_y, other.comp_encaixe_y)) {
            return false;
        }
        if (!Objects.equals(this.largura_face_anel, other.largura_face_anel)) {
            return false;
        }
        if (!Objects.equals(this.largura_entre_furo_diametro_ext_anel, other.largura_entre_furo_diametro_ext_anel)) {
            return false;
        }
        if (!Objects.equals(this.planicidade_face_assento_anel, other.planicidade_face_assento_anel)) {
            return false;
        }
        if (!Objects.equals(this.rugosidade_encaixe_tampa, other.rugosidade_encaixe_tampa)) {
            return false;
        }
        if (!Objects.equals(this.rugosidade_face_assento_anel, other.rugosidade_face_assento_anel)) {
            return false;
        }
        if (!Objects.equals(this.anel_fixacao, other.anel_fixacao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tampa{" + "sede_rolamento=" + sede_rolamento + ", equip_sedeRolamento=" + equip_sedeRolamento + ", encaixe=" + encaixe + ", equip_encaixe=" + equip_encaixe + ", comp_encaixe_x=" + comp_encaixe_x + ", comp_encaixe_y=" + comp_encaixe_y + ", equip_compEncaixe=" + equip_compEncaixe + ", largura_face_anel=" + largura_face_anel + ", equip_LarguraFaceAnel=" + equip_LarguraFaceAnel + ", largura_entre_furo_diametro_ext_anel=" + largura_entre_furo_diametro_ext_anel + ", equip_LarguraFuroDiamAnel=" + equip_LarguraFuroDiamAnel + ", planicidade_face_assento_anel=" + planicidade_face_assento_anel + ", equip_PlanicidadeAnel=" + equip_PlanicidadeAnel + ", rugosidade_encaixe_tampa=" + rugosidade_encaixe_tampa + ", equip_RugosidadeEncaixe=" + equip_RugosidadeEncaixe + ", rugosidade_face_assento_anel=" + rugosidade_face_assento_anel + ", equip_RugosidadeAssentoAnel=" + equip_RugosidadeAssentoAnel + ", anel_fixacao=" + anel_fixacao + '}';
    }

}
