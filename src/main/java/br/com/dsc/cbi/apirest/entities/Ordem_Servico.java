/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import br.com.dsc.cbi.apirest.interfaces.Equipamento;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Tiago
 */
@Document("mov_ordem_servico")
public class Ordem_Servico implements Serializable {
    
    @Id
    private String id;
    private String os;
    private String equipamento;
    private LocalDateTime data;
    private String nome_cliente;
    private LocalDateTime prazo_finalizacao;
    private LocalDateTime prazo_rebobinamento;
    private LocalDateTime prazo_montagem;
    private Equipamento dados_equipamento;
    private String observacoes;
    private String nota_fiscal;
    private String palete;
    private String status;
    private List<String> anexos;

    public Ordem_Servico() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public LocalDateTime getPrazo_finalizacao() {
        return prazo_finalizacao;
    }

    public void setPrazo_finalizacao(LocalDateTime prazo_finalizacao) {
        this.prazo_finalizacao = prazo_finalizacao;
    }

    public LocalDateTime getPrazo_rebobinamento() {
        return prazo_rebobinamento;
    }

    public void setPrazo_rebobinamento(LocalDateTime prazo_rebobinamento) {
        this.prazo_rebobinamento = prazo_rebobinamento;
    }

    public LocalDateTime getPrazo_montagem() {
        return prazo_montagem;
    }

    public void setPrazo_montagem(LocalDateTime prazo_montagem) {
        this.prazo_montagem = prazo_montagem;
    }

    public Equipamento getDados_equipamento() {
        return dados_equipamento;
    }

    public void setDados_equipamento(Equipamento dados_equipamento) {
        this.dados_equipamento = dados_equipamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getNota_fiscal() {
        return nota_fiscal;
    }

    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    public String getPalete() {
        return palete;
    }

    public void setPalete(String palete) {
        this.palete = palete;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getAnexos() {
        return anexos;
    }

    public void setAnexos(List<String> anexos) {
        this.anexos = anexos;
    }

    @Override
    public String toString() {
        return "Ordem_Servico{" + "id=" + id + ", os=" + os + ", equipamento=" + equipamento + ", data=" + data + ", nome_cliente=" + nome_cliente + ", prazo_finalizacao=" + prazo_finalizacao + ", prazo_rebobinamento=" + prazo_rebobinamento + ", prazo_montagem=" + prazo_montagem + ", dados_equipamento=" + dados_equipamento + ", observacoes=" + observacoes + ", nota_fiscal=" + nota_fiscal + ", palete=" + palete + ", status=" + status + ", anexos=" + anexos + '}';
    }
    
}