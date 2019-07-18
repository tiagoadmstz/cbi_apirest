/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_resist_ohmica")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resistencia_Ohmica {

    private List<String> medicoes;
    private Map<Integer, String> quantidade_cabos;
    private String equip_verif;

    public Resistencia_Ohmica() {
    }

    public List<String> getMedicoes() {
        return medicoes;
    }

    public void setMedicoes(List<String> medicoes) {
        this.medicoes = medicoes;
    }

    public Map<Integer, String> getQuantidade_cabos() {
        return quantidade_cabos;
    }

    public void setQuantidade_cabos(Map<Integer, String> quantidade_cabos) {
        this.quantidade_cabos = quantidade_cabos;
    }

    public String getEquip_verif() {
        return equip_verif;
    }

    public void setEquip_verif(String equip_verif) {
        this.equip_verif = equip_verif;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.medicoes);
        hash = 41 * hash + Objects.hashCode(this.quantidade_cabos);
        hash = 41 * hash + Objects.hashCode(this.equip_verif);
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
        final Resistencia_Ohmica other = (Resistencia_Ohmica) obj;
        if (!Objects.equals(this.quantidade_cabos, other.quantidade_cabos)) {
            return false;
        }
        if (!Objects.equals(this.equip_verif, other.equip_verif)) {
            return false;
        }
        if (!Objects.equals(this.medicoes, other.medicoes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Resistencia_Ohmica{" + "medicoes=" + medicoes + ", quantidade_cabos=" + quantidade_cabos + ", equip_verif=" + equip_verif + '}';
    }
    
}
