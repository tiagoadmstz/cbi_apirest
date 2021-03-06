/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import br.com.dsc.cbi.apirest.rest.converters.LocalDateTimeDerialiazer;
import br.com.dsc.cbi.apirest.rest.converters.LocalDateTimeSerialiazer;
import java.time.LocalDateTime;
import java.util.List;
import br.com.dsc.cbi.apirest.interfaces.Equipamento;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.math.BigDecimal;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("equipamento_eletrico")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Equipamento_Eletrico implements Equipamento {

    private String placa_rastreabilidade;
    private String categoria;
    private String numero_serie;
    private String marca;
    private String potencia;
    private String modelo;
    private LocalDateTime data_fabricacao;
    private String rpm;
    private String tensao;
    private String corrente;
    private String frequencia;
    private BigDecimal fator_servico;
    private String indice_protecao;
    private String classe_isolacao;
    private BigDecimal IpIn;
    private String regime;
    private String certificado;
    private Boolean enrolamento_fabrica;
    private String patrimonio;
    private String forma_construtiva;
    private String caixa_ligacao;
    private Boolean acoplamento;
    private String descricao_acoplamento;
    private String quantidade_cabos;
    private String fechamento;
    private List<Dados_Bobinagem> dados_bobinagem;
    private String causa_queima;
    private Boolean vibracao;

    public Equipamento_Eletrico() {
    }

    public Equipamento_Eletrico(String placa_rastreabilidade, String categoria, String numero_serie, String marca, String potencia, String modelo, LocalDateTime data_fabricacao, String rpm, String tensao, String corrente, Boolean enrolamento_fabrica, String patrimonio, String forma_construtiva, String caixa_ligacao, Boolean acoplamento, String descricao_acoplamento, String quantidade_cabos, String fechamento, List<Dados_Bobinagem> dados_bobinagem, String causa_queima, Boolean vibracao) {
        this.placa_rastreabilidade = placa_rastreabilidade;
        this.categoria = categoria;
        this.numero_serie = numero_serie;
        this.marca = marca;
        this.potencia = potencia;
        this.modelo = modelo;
        this.data_fabricacao = data_fabricacao;
        this.rpm = rpm;
        this.tensao = tensao;
        this.corrente = corrente;
        this.enrolamento_fabrica = enrolamento_fabrica;
        this.patrimonio = patrimonio;
        this.forma_construtiva = forma_construtiva;
        this.caixa_ligacao = caixa_ligacao;
        this.acoplamento = acoplamento;
        this.descricao_acoplamento = descricao_acoplamento;
        this.quantidade_cabos = quantidade_cabos;
        this.fechamento = fechamento;
        this.dados_bobinagem = dados_bobinagem;
        this.causa_queima = causa_queima;
        this.vibracao = vibracao;
    }

    public String getPlaca_rastreabilidade() {
        return placa_rastreabilidade;
    }

    public void setPlaca_rastreabilidade(String placa_rastreabilidade) {
        this.placa_rastreabilidade = placa_rastreabilidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @JsonSerialize(using = LocalDateTimeSerialiazer.class)
    @JsonDeserialize(using = LocalDateTimeDerialiazer.class)
    public LocalDateTime getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(LocalDateTime data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getCorrente() {
        return corrente;
    }

    public void setCorrente(String corrente) {
        this.corrente = corrente;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public BigDecimal getFator_servico() {
        return fator_servico;
    }

    public void setFator_servico(BigDecimal fator_servico) {
        this.fator_servico = fator_servico;
    }

    public String getIndice_protecao() {
        return indice_protecao;
    }

    public void setIndice_protecao(String indice_protecao) {
        this.indice_protecao = indice_protecao;
    }

    public String getClasse_isolacao() {
        return classe_isolacao;
    }

    public void setClasse_isolacao(String classe_isolacao) {
        this.classe_isolacao = classe_isolacao;
    }

    public BigDecimal getIpIn() {
        return IpIn;
    }

    public void setIpIn(BigDecimal IpIn) {
        this.IpIn = IpIn;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public Boolean getEnrolamento_fabrica() {
        return enrolamento_fabrica;
    }

    public void setEnrolamento_fabrica(Boolean enrolamento_fabrica) {
        this.enrolamento_fabrica = enrolamento_fabrica;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getForma_construtiva() {
        return forma_construtiva;
    }

    public void setForma_construtiva(String forma_construtiva) {
        this.forma_construtiva = forma_construtiva;
    }

    public String getCaixa_ligacao() {
        return caixa_ligacao;
    }

    public void setCaixa_ligacao(String caixa_ligacao) {
        this.caixa_ligacao = caixa_ligacao;
    }

    public Boolean getAcoplamento() {
        return acoplamento;
    }

    public void setAcoplamento(Boolean acoplamento) {
        this.acoplamento = acoplamento;
    }

    public String getDescricao_acoplamento() {
        return descricao_acoplamento;
    }

    public void setDescricao_acoplamento(String descricao_acoplamento) {
        this.descricao_acoplamento = descricao_acoplamento;
    }

    public String getQuantidade_cabos() {
        return quantidade_cabos;
    }

    public void setQuantidade_cabos(String quantidade_cabos) {
        this.quantidade_cabos = quantidade_cabos;
    }

    public String getFechamento() {
        return fechamento;
    }

    public void setFechamento(String fechamento) {
        this.fechamento = fechamento;
    }

    public List<Dados_Bobinagem> getDados_bobinagem() {
        return dados_bobinagem;
    }

    public void setDados_bobinagem(List<Dados_Bobinagem> dados_bobinagem) {
        this.dados_bobinagem = dados_bobinagem;
    }

    public String getCausa_queima() {
        return causa_queima;
    }

    public void setCausa_queima(String causa_queima) {
        this.causa_queima = causa_queima;
    }

    public Boolean getVibracao() {
        return vibracao;
    }

    public void setVibracao(Boolean vibracao) {
        this.vibracao = vibracao;
    }

    @Override
    public String toString() {
        return "Equipamento_Eletrico{" + "placa_rastreabilidade=" + placa_rastreabilidade + ", categoria=" + categoria + ", numero_serie=" + numero_serie + ", marca=" + marca + ", potencia=" + potencia + ", modelo=" + modelo + ", data_fabricacao=" + data_fabricacao + ", rpm=" + rpm + ", tensao=" + tensao + ", corrente=" + corrente + ", frequencia=" + frequencia + ", fator_servico=" + fator_servico + ", indice_protecao=" + indice_protecao + ", classe_isolacao=" + classe_isolacao + ", IpIn=" + IpIn + ", regime=" + regime + ", certificado=" + certificado + ", enrolamento_fabrica=" + enrolamento_fabrica + ", patrimonio=" + patrimonio + ", forma_construtiva=" + forma_construtiva + ", caixa_ligacao=" + caixa_ligacao + ", acoplamento=" + acoplamento + ", descricao_acoplamento=" + descricao_acoplamento + ", quantidade_cabos=" + quantidade_cabos + ", fechamento=" + fechamento + ", dados_bobinagem=" + dados_bobinagem + ", causa_queima=" + causa_queima + ", vibracao=" + vibracao + '}';
    }

}
