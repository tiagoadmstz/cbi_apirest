/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex.ensaios;

import br.com.dsc.cbi.apirest.interfaces.Ensaio;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tiago
 */
@Component("ensaio_eletrico")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ensaio_Eletrico implements Ensaio {

    private Resistencia_Isolamento resistencia_isolamento;
    private Resistencia_Ohmica resistencia_ohmica;
    private Temperatura temperatura;
    private Corrente corrente_vazio;
    private Protetor_Termico termico_bobinado;
    private Protetor_Termico termico_massa;
    private Protetor_Termico termico_resist_ohmica;
    private Responsavel_Ensaio responsavel;

    public Ensaio_Eletrico() {
    }

    public Resistencia_Isolamento getResistencia_isolamento() {
        return resistencia_isolamento;
    }

    public void setResistencia_isolamento(Resistencia_Isolamento resistencia_isolamento) {
        this.resistencia_isolamento = resistencia_isolamento;
    }

    public Resistencia_Ohmica getResistencia_ohmica() {
        return resistencia_ohmica;
    }

    public void setResistencia_ohmica(Resistencia_Ohmica resistencia_ohmica) {
        this.resistencia_ohmica = resistencia_ohmica;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public Corrente getCorrente_vazio() {
        return corrente_vazio;
    }

    public void setCorrente_vazio(Corrente corrente_vazio) {
        this.corrente_vazio = corrente_vazio;
    }

    public Protetor_Termico getTermico_bobinado() {
        return termico_bobinado;
    }

    public void setTermico_bobinado(Protetor_Termico termico_bobinado) {
        this.termico_bobinado = termico_bobinado;
    }

    public Protetor_Termico getTermico_massa() {
        return termico_massa;
    }

    public void setTermico_massa(Protetor_Termico termico_massa) {
        this.termico_massa = termico_massa;
    }

    public Protetor_Termico getTermico_resist_ohmica() {
        return termico_resist_ohmica;
    }

    public void setTermico_resist_ohmica(Protetor_Termico termico_resist_ohmica) {
        this.termico_resist_ohmica = termico_resist_ohmica;
    }

    public Responsavel_Ensaio getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel_Ensaio responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.resistencia_isolamento);
        hash = 59 * hash + Objects.hashCode(this.resistencia_ohmica);
        hash = 59 * hash + Objects.hashCode(this.temperatura);
        hash = 59 * hash + Objects.hashCode(this.corrente_vazio);
        hash = 59 * hash + Objects.hashCode(this.termico_bobinado);
        hash = 59 * hash + Objects.hashCode(this.termico_massa);
        hash = 59 * hash + Objects.hashCode(this.termico_resist_ohmica);
        hash = 59 * hash + Objects.hashCode(this.responsavel);
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
        final Ensaio_Eletrico other = (Ensaio_Eletrico) obj;
        if (!Objects.equals(this.resistencia_isolamento, other.resistencia_isolamento)) {
            return false;
        }
        if (!Objects.equals(this.resistencia_ohmica, other.resistencia_ohmica)) {
            return false;
        }
        if (!Objects.equals(this.temperatura, other.temperatura)) {
            return false;
        }
        if (!Objects.equals(this.corrente_vazio, other.corrente_vazio)) {
            return false;
        }
        if (!Objects.equals(this.termico_bobinado, other.termico_bobinado)) {
            return false;
        }
        if (!Objects.equals(this.termico_massa, other.termico_massa)) {
            return false;
        }
        if (!Objects.equals(this.termico_resist_ohmica, other.termico_resist_ohmica)) {
            return false;
        }
        if (!Objects.equals(this.responsavel, other.responsavel)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ensaio_Eletrico{" + "resistencia_isolamento=" + resistencia_isolamento + ", resistencia_ohmica=" + resistencia_ohmica + ", temperatura=" + temperatura + ", corrente_vazio=" + corrente_vazio + ", termico_bobinado=" + termico_bobinado + ", termico_massa=" + termico_massa + ", termico_resist_ohmica=" + termico_resist_ohmica + ", responsavel=" + responsavel + '}';
    }

}
