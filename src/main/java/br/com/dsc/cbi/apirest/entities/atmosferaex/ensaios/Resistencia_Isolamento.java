/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_resist_isolamento")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resistencia_Isolamento {

    private String tensao_aplicada;
    private String rst_x_massa;
    private String equip_verif_rstMassa;
    private String rst_x_fase;
    private String equip_verif_rstFase;
    private String tensao_aplicada_Hipot;
    private String rst_x_Hipot;
    private String equip_verif_rstHipot;

    public Resistencia_Isolamento() {
    }

    public String getTensao_aplicada() {
        return tensao_aplicada;
    }

    public void setTensao_aplicada(String tensao_aplicada) {
        this.tensao_aplicada = tensao_aplicada;
    }

    public String getRst_x_massa() {
        return rst_x_massa;
    }

    public void setRst_x_massa(String rst_x_massa) {
        this.rst_x_massa = rst_x_massa;
    }

    public String getEquip_verif_rstMassa() {
        return equip_verif_rstMassa;
    }

    public void setEquip_verif_rstMassa(String equip_verif_rstMassa) {
        this.equip_verif_rstMassa = equip_verif_rstMassa;
    }

    public String getRst_x_fase() {
        return rst_x_fase;
    }

    public void setRst_x_fase(String rst_x_fase) {
        this.rst_x_fase = rst_x_fase;
    }

    public String getEquip_verif_rstFase() {
        return equip_verif_rstFase;
    }

    public void setEquip_verif_rstFase(String equip_verif_rstFase) {
        this.equip_verif_rstFase = equip_verif_rstFase;
    }

    public String getTensao_aplicada_Hipot() {
        return tensao_aplicada_Hipot;
    }

    public void setTensao_aplicada_Hipot(String tensao_aplicada_Hipot) {
        this.tensao_aplicada_Hipot = tensao_aplicada_Hipot;
    }

    public String getRst_x_Hipot() {
        return rst_x_Hipot;
    }

    public void setRst_x_Hipot(String rst_x_Hipot) {
        this.rst_x_Hipot = rst_x_Hipot;
    }

    public String getEquip_verif_rstHipot() {
        return equip_verif_rstHipot;
    }

    public void setEquip_verif_rstHipot(String equip_verif_rstHipot) {
        this.equip_verif_rstHipot = equip_verif_rstHipot;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.tensao_aplicada);
        hash = 11 * hash + Objects.hashCode(this.rst_x_massa);
        hash = 11 * hash + Objects.hashCode(this.equip_verif_rstMassa);
        hash = 11 * hash + Objects.hashCode(this.rst_x_fase);
        hash = 11 * hash + Objects.hashCode(this.equip_verif_rstFase);
        hash = 11 * hash + Objects.hashCode(this.tensao_aplicada_Hipot);
        hash = 11 * hash + Objects.hashCode(this.rst_x_Hipot);
        hash = 11 * hash + Objects.hashCode(this.equip_verif_rstHipot);
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
        final Resistencia_Isolamento other = (Resistencia_Isolamento) obj;
        if (!Objects.equals(this.tensao_aplicada, other.tensao_aplicada)) {
            return false;
        }
        if (!Objects.equals(this.rst_x_massa, other.rst_x_massa)) {
            return false;
        }
        if (!Objects.equals(this.equip_verif_rstMassa, other.equip_verif_rstMassa)) {
            return false;
        }
        if (!Objects.equals(this.rst_x_fase, other.rst_x_fase)) {
            return false;
        }
        if (!Objects.equals(this.equip_verif_rstFase, other.equip_verif_rstFase)) {
            return false;
        }
        if (!Objects.equals(this.tensao_aplicada_Hipot, other.tensao_aplicada_Hipot)) {
            return false;
        }
        if (!Objects.equals(this.rst_x_Hipot, other.rst_x_Hipot)) {
            return false;
        }
        if (!Objects.equals(this.equip_verif_rstHipot, other.equip_verif_rstHipot)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resistencia_Isolamento{" + "tensao_aplicada=" + tensao_aplicada + ", rst_x_massa=" + rst_x_massa + ", equip_verif_rstMassa=" + equip_verif_rstMassa + ", rst_x_fase=" + rst_x_fase + ", equip_verif_rstFase=" + equip_verif_rstFase + ", tensao_aplicada_Hipot=" + tensao_aplicada_Hipot + ", rst_x_Hipot=" + rst_x_Hipot + ", equip_verif_rstHipot=" + equip_verif_rstHipot + '}';
    }

}
