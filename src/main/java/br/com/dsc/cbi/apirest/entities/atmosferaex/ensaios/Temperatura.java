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
@Component("ensaio_temperatura")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Temperatura {

    private String temperatura_ambiente;
    private String equip_temp_ambiente;
    private String temperatura_estator;
    private String equip_temp_estator;

    public Temperatura() {
    }

    public String getTemperatura_ambiente() {
        return temperatura_ambiente;
    }

    public void setTemperatura_ambiente(String temperatura_ambiente) {
        this.temperatura_ambiente = temperatura_ambiente;
    }

    public String getEquip_temp_ambiente() {
        return equip_temp_ambiente;
    }

    public void setEquip_temp_ambiente(String equip_temp_ambiente) {
        this.equip_temp_ambiente = equip_temp_ambiente;
    }

    public String getTemperatura_estator() {
        return temperatura_estator;
    }

    public void setTemperatura_estator(String temperatura_estator) {
        this.temperatura_estator = temperatura_estator;
    }

    public String getEquip_temp_estator() {
        return equip_temp_estator;
    }

    public void setEquip_temp_estator(String equip_temp_estator) {
        this.equip_temp_estator = equip_temp_estator;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.temperatura_ambiente);
        hash = 83 * hash + Objects.hashCode(this.equip_temp_ambiente);
        hash = 83 * hash + Objects.hashCode(this.temperatura_estator);
        hash = 83 * hash + Objects.hashCode(this.equip_temp_estator);
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
        final Temperatura other = (Temperatura) obj;
        if (!Objects.equals(this.temperatura_ambiente, other.temperatura_ambiente)) {
            return false;
        }
        if (!Objects.equals(this.equip_temp_ambiente, other.equip_temp_ambiente)) {
            return false;
        }
        if (!Objects.equals(this.temperatura_estator, other.temperatura_estator)) {
            return false;
        }
        if (!Objects.equals(this.equip_temp_estator, other.equip_temp_estator)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "temperatura_ambiente=" + temperatura_ambiente + ", equip_temp_ambiente=" + equip_temp_ambiente + ", temperatura_estator=" + temperatura_estator + ", equip_temp_estator=" + equip_temp_estator + '}';
    }

}
