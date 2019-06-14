/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Tiago
 */
public class Dados_Bobinagem implements Serializable {
    
    private String comprimento;
    private String diamentro;
    private String ranhuras;
    private String camada;
    private List<Calculo_Bobinagem> calculos;
    private String peso;
    private String ligacao;
    private String informacoes_adicionais;
    private String numero_forma;
    private String comprimento_calco;

    public Dados_Bobinagem() {
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getDiamentro() {
        return diamentro;
    }

    public void setDiamentro(String diamentro) {
        this.diamentro = diamentro;
    }

    public String getRanhuras() {
        return ranhuras;
    }

    public void setRanhuras(String ranhuras) {
        this.ranhuras = ranhuras;
    }

    public String getCamada() {
        return camada;
    }

    public void setCamada(String camada) {
        this.camada = camada;
    }

    public List<Calculo_Bobinagem> getCalculos() {
        return calculos;
    }

    public void setCalculos(List<Calculo_Bobinagem> calculos) {
        this.calculos = calculos;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getLigacao() {
        return ligacao;
    }

    public void setLigacao(String ligacao) {
        this.ligacao = ligacao;
    }

    public String getInformacoes_adicionais() {
        return informacoes_adicionais;
    }

    public void setInformacoes_adicionais(String informacoes_adicionais) {
        this.informacoes_adicionais = informacoes_adicionais;
    }

    public String getNumero_forma() {
        return numero_forma;
    }

    public void setNumero_forma(String numero_forma) {
        this.numero_forma = numero_forma;
    }

    public String getComprimento_calco() {
        return comprimento_calco;
    }

    public void setComprimento_calco(String comprimento_calco) {
        this.comprimento_calco = comprimento_calco;
    }

    @Override
    public String toString() {
        return "Dados_Bobinagem{" + "comprimento=" + comprimento + ", diamentro=" + diamentro + ", ranhuras=" + ranhuras + ", camada=" + camada + ", calculos=" + calculos + ", peso=" + peso + ", ligacao=" + ligacao + ", informacoes_adicionais=" + informacoes_adicionais + ", numero_forma=" + numero_forma + ", comprimento_calco=" + comprimento_calco + '}';
    }
    
}
