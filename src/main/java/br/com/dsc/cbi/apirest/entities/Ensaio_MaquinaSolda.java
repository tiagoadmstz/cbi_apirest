/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import br.com.dsc.cbi.apirest.interfaces.Ensaio;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_maquinasolda")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ensaio_MaquinaSolda implements Ensaio {
    
    private String corrente_carga;
    private String corrente_vazio;
    private String tensao_borne;
    private List<Etapa_Servico> etapas;

    public Ensaio_MaquinaSolda() {
    }

    public String getCorrente_carga() {
        return corrente_carga;
    }

    public void setCorrente_carga(String corrente_carga) {
        this.corrente_carga = corrente_carga;
    }

    public String getCorrente_vazio() {
        return corrente_vazio;
    }

    public void setCorrente_vazio(String corrente_vazio) {
        this.corrente_vazio = corrente_vazio;
    }

    public String getTensao_borne() {
        return tensao_borne;
    }

    public void setTensao_borne(String tensao_borne) {
        this.tensao_borne = tensao_borne;
    }

    public List<Etapa_Servico> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<Etapa_Servico> etapas) {
        this.etapas = etapas;
    }

    @Override
    public String toString() {
        return "Ensaio_MaquinaSolda{" + "corrente_carga=" + corrente_carga + ", corrente_vazio=" + corrente_vazio + ", tensao_borne=" + tensao_borne + ", etapas=" + etapas + '}';
    }
    
}
