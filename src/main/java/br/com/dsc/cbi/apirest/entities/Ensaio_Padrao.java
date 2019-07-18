/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities;

import br.com.dsc.cbi.apirest.interfaces.Ensaio;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_padrao")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ensaio_Padrao implements Ensaio {
    
    private String tensao;
    private String rst;
    private String rst_resultado;
    private String resitencia_enrolamento;
    private String resultado_miliohmimetro;
    private String isolacao;
    private String resistencia;
    private Boolean vibracao;
    private String vibracao_dianteira;
    private String vibracao_traseira;
    private String campainha;
    private String rpm;
    private List<Etapa_Servico> etapas;
    private LocalDateTime impregnacao_hora_final;
    private String cor_pintura;
    private String equipamentos_utilizados;
    private Etapa_Servico ensaio_final;

    public Ensaio_Padrao() {
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public String getRst() {
        return rst;
    }

    public void setRst(String rst) {
        this.rst = rst;
    }

    public String getRst_resultado() {
        return rst_resultado;
    }

    public void setRst_resultado(String rst_resultado) {
        this.rst_resultado = rst_resultado;
    }

    public String getResitencia_enrolamento() {
        return resitencia_enrolamento;
    }

    public void setResitencia_enrolamento(String resitencia_enrolamento) {
        this.resitencia_enrolamento = resitencia_enrolamento;
    }

    public String getResultado_miliohmimetro() {
        return resultado_miliohmimetro;
    }

    public void setResultado_miliohmimetro(String resultado_miliohmimetro) {
        this.resultado_miliohmimetro = resultado_miliohmimetro;
    }

    public String getIsolacao() {
        return isolacao;
    }

    public void setIsolacao(String isolacao) {
        this.isolacao = isolacao;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public Boolean getVibracao() {
        return vibracao;
    }

    public void setVibracao(Boolean vibracao) {
        this.vibracao = vibracao;
    }

    public String getVibracao_dianteira() {
        return vibracao_dianteira;
    }

    public void setVibracao_dianteira(String vibracao_dianteira) {
        this.vibracao_dianteira = vibracao_dianteira;
    }

    public String getVibracao_traseira() {
        return vibracao_traseira;
    }

    public void setVibracao_traseira(String vibracao_traseira) {
        this.vibracao_traseira = vibracao_traseira;
    }

    public String getCampainha() {
        return campainha;
    }

    public void setCampainha(String campainha) {
        this.campainha = campainha;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public List<Etapa_Servico> getEtapas() {
        return etapas;
    }

    public void setEtapas(List<Etapa_Servico> etapas) {
        this.etapas = etapas;
    }

    public LocalDateTime getImpregnacao_hora_final() {
        return impregnacao_hora_final;
    }

    public void setImpregnacao_hora_final(LocalDateTime impregnacao_hora_final) {
        this.impregnacao_hora_final = impregnacao_hora_final;
    }

    public String getCor_pintura() {
        return cor_pintura;
    }

    public void setCor_pintura(String cor_pintura) {
        this.cor_pintura = cor_pintura;
    }

    public String getEquipamentos_utilizados() {
        return equipamentos_utilizados;
    }

    public void setEquipamentos_utilizados(String equipamentos_utilizados) {
        this.equipamentos_utilizados = equipamentos_utilizados;
    }

    public Etapa_Servico getEnsaio_final() {
        return ensaio_final;
    }

    public void setEnsaio_final(Etapa_Servico ensaio_final) {
        this.ensaio_final = ensaio_final;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.tensao);
        hash = 89 * hash + Objects.hashCode(this.rst);
        hash = 89 * hash + Objects.hashCode(this.rst_resultado);
        hash = 89 * hash + Objects.hashCode(this.resitencia_enrolamento);
        hash = 89 * hash + Objects.hashCode(this.resultado_miliohmimetro);
        hash = 89 * hash + Objects.hashCode(this.isolacao);
        hash = 89 * hash + Objects.hashCode(this.resistencia);
        hash = 89 * hash + Objects.hashCode(this.vibracao);
        hash = 89 * hash + Objects.hashCode(this.vibracao_dianteira);
        hash = 89 * hash + Objects.hashCode(this.vibracao_traseira);
        hash = 89 * hash + Objects.hashCode(this.campainha);
        hash = 89 * hash + Objects.hashCode(this.rpm);
        hash = 89 * hash + Objects.hashCode(this.etapas);
        hash = 89 * hash + Objects.hashCode(this.impregnacao_hora_final);
        hash = 89 * hash + Objects.hashCode(this.cor_pintura);
        hash = 89 * hash + Objects.hashCode(this.equipamentos_utilizados);
        hash = 89 * hash + Objects.hashCode(this.ensaio_final);
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
        final Ensaio_Padrao other = (Ensaio_Padrao) obj;
        if (!Objects.equals(this.tensao, other.tensao)) {
            return false;
        }
        if (!Objects.equals(this.rst, other.rst)) {
            return false;
        }
        if (!Objects.equals(this.rst_resultado, other.rst_resultado)) {
            return false;
        }
        if (!Objects.equals(this.resitencia_enrolamento, other.resitencia_enrolamento)) {
            return false;
        }
        if (!Objects.equals(this.resultado_miliohmimetro, other.resultado_miliohmimetro)) {
            return false;
        }
        if (!Objects.equals(this.isolacao, other.isolacao)) {
            return false;
        }
        if (!Objects.equals(this.resistencia, other.resistencia)) {
            return false;
        }
        if (!Objects.equals(this.vibracao_dianteira, other.vibracao_dianteira)) {
            return false;
        }
        if (!Objects.equals(this.vibracao_traseira, other.vibracao_traseira)) {
            return false;
        }
        if (!Objects.equals(this.campainha, other.campainha)) {
            return false;
        }
        if (!Objects.equals(this.rpm, other.rpm)) {
            return false;
        }
        if (!Objects.equals(this.cor_pintura, other.cor_pintura)) {
            return false;
        }
        if (!Objects.equals(this.equipamentos_utilizados, other.equipamentos_utilizados)) {
            return false;
        }
        if (!Objects.equals(this.vibracao, other.vibracao)) {
            return false;
        }
        if (!Objects.equals(this.etapas, other.etapas)) {
            return false;
        }
        if (!Objects.equals(this.impregnacao_hora_final, other.impregnacao_hora_final)) {
            return false;
        }
        if (!Objects.equals(this.ensaio_final, other.ensaio_final)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Teste{" + "tensao=" + tensao + ", rst=" + rst + ", rst_resultado=" + rst_resultado + ", resitencia_enrolamento=" + resitencia_enrolamento + ", resultado_miliohmimetro=" + resultado_miliohmimetro + ", isolacao=" + isolacao + ", resistencia=" + resistencia + ", vibracao=" + vibracao + ", vibracao_dianteira=" + vibracao_dianteira + ", vibracao_traseira=" + vibracao_traseira + ", campainha=" + campainha + ", rpm=" + rpm + ", etapas=" + etapas + ", impregnacao_hora_final=" + impregnacao_hora_final + ", cor_pintura=" + cor_pintura + ", equipamentos_utilizados=" + equipamentos_utilizados + ", ensaio_final=" + ensaio_final + '}';
    }
    
}
