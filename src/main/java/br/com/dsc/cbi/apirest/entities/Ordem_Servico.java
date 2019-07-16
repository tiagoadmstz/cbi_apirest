/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import br.com.dsc.cbi.apirest.interfaces.Ensaio;
import br.com.dsc.cbi.apirest.rest.converters.LocalDateTimeDerialiazer;
import br.com.dsc.cbi.apirest.rest.converters.LocalDateTimeSerialiazer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Tiago
 */
@Document("mov_ordem_servico")
public class Ordem_Servico implements Serializable {

    @Id
    private String id;
    @Indexed
    private String os;
    private String equipamento;
    @Indexed
    private LocalDateTime data_realizacao;
    @Indexed
    private String nome_cliente;
    @Indexed
    private LocalDateTime prazo_finalizacao;
    @Indexed
    private LocalDateTime prazo_rebobinamento;
    @Indexed
    private LocalDateTime prazo_montagem;
    private Equipamento_Eletrico dados_equipamento;
    private String observacoes;
    private String nota_fiscal;
    private String palete;
    private String status;
    private List<Ensaio> testes;
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

    @JsonSerialize(using = LocalDateTimeSerialiazer.class)
    @JsonDeserialize(using = LocalDateTimeDerialiazer.class)
    public LocalDateTime getData_realizacao() {
        return data_realizacao;
    }

    public void setData_realizacao(LocalDateTime data_realizacao) {
        this.data_realizacao = data_realizacao;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    @JsonSerialize(using = LocalDateTimeSerialiazer.class)
    @JsonDeserialize(using = LocalDateTimeDerialiazer.class)
    public LocalDateTime getPrazo_finalizacao() {
        return prazo_finalizacao;
    }

    public void setPrazo_finalizacao(LocalDateTime prazo_finalizacao) {
        this.prazo_finalizacao = prazo_finalizacao;
    }

    @JsonSerialize(using = LocalDateTimeSerialiazer.class)
    @JsonDeserialize(using = LocalDateTimeDerialiazer.class)
    public LocalDateTime getPrazo_rebobinamento() {
        return prazo_rebobinamento;
    }

    public void setPrazo_rebobinamento(LocalDateTime prazo_rebobinamento) {
        this.prazo_rebobinamento = prazo_rebobinamento;
    }

    @JsonSerialize(using = LocalDateTimeSerialiazer.class)
    @JsonDeserialize(using = LocalDateTimeDerialiazer.class)
    public LocalDateTime getPrazo_montagem() {
        return prazo_montagem;
    }

    public void setPrazo_montagem(LocalDateTime prazo_montagem) {
        this.prazo_montagem = prazo_montagem;
    }

    public Equipamento_Eletrico getDados_equipamento() {
        return dados_equipamento;
    }

    public void setDados_equipamento(Equipamento_Eletrico dados_equipamento) {
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

    public List<Ensaio> getTestes() {
        return testes;
    }

    public void setTestes(List<Ensaio> testes) {
        this.testes = testes;
    }

    public List<String> getAnexos() {
        return anexos;
    }

    public void setAnexos(List<String> anexos) {
        this.anexos = anexos;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.os);
        hash = 47 * hash + Objects.hashCode(this.equipamento);
        hash = 47 * hash + Objects.hashCode(this.data_realizacao);
        hash = 47 * hash + Objects.hashCode(this.nome_cliente);
        hash = 47 * hash + Objects.hashCode(this.prazo_finalizacao);
        hash = 47 * hash + Objects.hashCode(this.prazo_rebobinamento);
        hash = 47 * hash + Objects.hashCode(this.prazo_montagem);
        hash = 47 * hash + Objects.hashCode(this.dados_equipamento);
        hash = 47 * hash + Objects.hashCode(this.observacoes);
        hash = 47 * hash + Objects.hashCode(this.nota_fiscal);
        hash = 47 * hash + Objects.hashCode(this.palete);
        hash = 47 * hash + Objects.hashCode(this.status);
        hash = 47 * hash + Objects.hashCode(this.testes);
        hash = 47 * hash + Objects.hashCode(this.anexos);
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
        final Ordem_Servico other = (Ordem_Servico) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.os, other.os)) {
            return false;
        }
        if (!Objects.equals(this.equipamento, other.equipamento)) {
            return false;
        }
        if (!Objects.equals(this.nome_cliente, other.nome_cliente)) {
            return false;
        }
        if (!Objects.equals(this.observacoes, other.observacoes)) {
            return false;
        }
        if (!Objects.equals(this.nota_fiscal, other.nota_fiscal)) {
            return false;
        }
        if (!Objects.equals(this.palete, other.palete)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.data_realizacao, other.data_realizacao)) {
            return false;
        }
        if (!Objects.equals(this.prazo_finalizacao, other.prazo_finalizacao)) {
            return false;
        }
        if (!Objects.equals(this.prazo_rebobinamento, other.prazo_rebobinamento)) {
            return false;
        }
        if (!Objects.equals(this.prazo_montagem, other.prazo_montagem)) {
            return false;
        }
        if (!Objects.equals(this.dados_equipamento, other.dados_equipamento)) {
            return false;
        }
        if (!Objects.equals(this.testes, other.testes)) {
            return false;
        }
        if (!Objects.equals(this.anexos, other.anexos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ordem_Servico{" + "id=" + id + ", os=" + os + ", equipamento=" + equipamento + ", data_realizacao=" + data_realizacao + ", nome_cliente=" + nome_cliente + ", prazo_finalizacao=" + prazo_finalizacao + ", prazo_rebobinamento=" + prazo_rebobinamento + ", prazo_montagem=" + prazo_montagem + ", dados_equipamento=" + dados_equipamento + ", observacoes=" + observacoes + ", nota_fiscal=" + nota_fiscal + ", palete=" + palete + ", status=" + status + ", testes=" + testes + ", anexos=" + anexos + '}';
    }

}
