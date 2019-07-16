/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author Tiago
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Calculo_Bobinagem {

    private String enrolamento;
    private String passo;
    private String espiras;
    private String fio;
    private String seccao;

    public Calculo_Bobinagem() {
    }

    public String getEnrolamento() {
        return enrolamento;
    }

    public void setEnrolamento(String enrolamento) {
        this.enrolamento = enrolamento;
    }

    public String getPasso() {
        return passo;
    }

    public void setPasso(String passo) {
        this.passo = passo;
    }

    public String getEspiras() {
        return espiras;
    }

    public void setEspiras(String espiras) {
        this.espiras = espiras;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSeccao() {
        return seccao;
    }

    public void setSeccao(String seccao) {
        this.seccao = seccao;
    }

    @Override
    public String toString() {
        return "Calculo_Bobinagem{" + "enrolamento=" + enrolamento + ", passo=" + passo + ", espiras=" + espiras + ", fio=" + fio + ", seccao=" + seccao + '}';
    }

}
