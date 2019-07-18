/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex;

import br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios.Ensaio_Eletrico;
import br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios.Tampa;
import br.com.dsc.cbi.apirest.interfaces.Ensaio;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_ex_d")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ensaio_Ex_d implements Ensaio {

    private String tipo_motor_ex;
    private Map<String, Ensaio_Eletrico> ensaios_eletricos;
    private Map<String, Tampa> tampa_dianteira;
    private Map<String, Tampa> tampa_traseira;

    public Ensaio_Ex_d() {
    }

    public String getTipo_motor_ex() {
        return tipo_motor_ex;
    }

    public void setTipo_motor_ex(String tipo_motor_ex) {
        this.tipo_motor_ex = tipo_motor_ex;
    }

    public Map<String, Ensaio_Eletrico> getEnsaios_eletricos() {
        return ensaios_eletricos;
    }

    public void setEnsaios_eletricos(Map<String, Ensaio_Eletrico> ensaios_eletricos) {
        this.ensaios_eletricos = ensaios_eletricos;
    }

    public Map<String, Tampa> getTampa_dianteira() {
        return tampa_dianteira;
    }

    public void setTampa_dianteira(Map<String, Tampa> tampa_dianteira) {
        this.tampa_dianteira = tampa_dianteira;
    }

    public Map<String, Tampa> getTampa_traseira() {
        return tampa_traseira;
    }

    public void setTampa_traseira(Map<String, Tampa> tampa_traseira) {
        this.tampa_traseira = tampa_traseira;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.tipo_motor_ex);
        hash = 59 * hash + Objects.hashCode(this.ensaios_eletricos);
        hash = 59 * hash + Objects.hashCode(this.tampa_dianteira);
        hash = 59 * hash + Objects.hashCode(this.tampa_traseira);
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
        final Ensaio_Ex_d other = (Ensaio_Ex_d) obj;
        if (!Objects.equals(this.tipo_motor_ex, other.tipo_motor_ex)) {
            return false;
        }
        if (!Objects.equals(this.ensaios_eletricos, other.ensaios_eletricos)) {
            return false;
        }
        if (!Objects.equals(this.tampa_dianteira, other.tampa_dianteira)) {
            return false;
        }
        if (!Objects.equals(this.tampa_traseira, other.tampa_traseira)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ensaio_Ex_d{" + "tipo_motor_ex=" + tipo_motor_ex + ", ensaios_eletricos=" + ensaios_eletricos + ", tampa_dianteira=" + tampa_dianteira + ", tampa_traseira=" + tampa_traseira + '}';
    }

}
