/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_protetor_termico")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Protetor_Termico {

    private String tipo_termico;
    private Map<Integer, String> termicos;
    private String equip_termico;

    public Protetor_Termico() {
    }

    public String getTipo_termico() {
        return tipo_termico;
    }

    public void setTipo_termico(String tipo_termico) {
        this.tipo_termico = tipo_termico;
    }

    public Map<Integer, String> getTermicos() {
        return termicos;
    }

    public void setTermicos(Map<Integer, String> termicos) {
        this.termicos = termicos;
    }

    public String getEquip_termico() {
        return equip_termico;
    }

    public void setEquip_termico(String equip_termico) {
        this.equip_termico = equip_termico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.tipo_termico);
        hash = 89 * hash + Objects.hashCode(this.termicos);
        hash = 89 * hash + Objects.hashCode(this.equip_termico);
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
        final Protetor_Termico other = (Protetor_Termico) obj;
        if (!Objects.equals(this.tipo_termico, other.tipo_termico)) {
            return false;
        }
        if (!Objects.equals(this.equip_termico, other.equip_termico)) {
            return false;
        }
        if (!Objects.equals(this.termicos, other.termicos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Protetor_Termico{" + "tipo_termico=" + tipo_termico + ", termicos=" + termicos + ", equip_termico=" + equip_termico + '}';
    }

}
