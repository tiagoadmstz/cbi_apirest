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
@Component("ensaio_corrente")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Corrente {

    private String tensao_rst;
    private String fase_R;
    private String fase_S;
    private String fase_T;
    private String equip_rst;

    public Corrente() {
    }

    public String getTensao_rst() {
        return tensao_rst;
    }

    public void setTensao_rst(String tensao_rst) {
        this.tensao_rst = tensao_rst;
    }

    public String getFase_R() {
        return fase_R;
    }

    public void setFase_R(String fase_R) {
        this.fase_R = fase_R;
    }

    public String getFase_S() {
        return fase_S;
    }

    public void setFase_S(String fase_S) {
        this.fase_S = fase_S;
    }

    public String getFase_T() {
        return fase_T;
    }

    public void setFase_T(String fase_T) {
        this.fase_T = fase_T;
    }

    public String getEquip_rst() {
        return equip_rst;
    }

    public void setEquip_rst(String equip_rst) {
        this.equip_rst = equip_rst;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.tensao_rst);
        hash = 17 * hash + Objects.hashCode(this.fase_R);
        hash = 17 * hash + Objects.hashCode(this.fase_S);
        hash = 17 * hash + Objects.hashCode(this.fase_T);
        hash = 17 * hash + Objects.hashCode(this.equip_rst);
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
        final Corrente other = (Corrente) obj;
        if (!Objects.equals(this.tensao_rst, other.tensao_rst)) {
            return false;
        }
        if (!Objects.equals(this.fase_R, other.fase_R)) {
            return false;
        }
        if (!Objects.equals(this.fase_S, other.fase_S)) {
            return false;
        }
        if (!Objects.equals(this.fase_T, other.fase_T)) {
            return false;
        }
        if (!Objects.equals(this.equip_rst, other.equip_rst)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ensaio_Corrente{" + "tensao_rst=" + tensao_rst + ", fase_R=" + fase_R + ", fase_S=" + fase_S + ", fase_T=" + fase_T + ", equip_rst=" + equip_rst + '}';
    }

}
