/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.entities.atmosferaex;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Tiago
 */
@Document("ex_carcaca")
public class ExCarcaca implements Serializable {
    
    @Id
    private String id;
    @Indexed
    private Integer carcaca;
    @Indexed
    private String linha;
    private BigDecimal carcaca_minimo;
    private BigDecimal tampa_maximo;
    private BigDecimal folga_maxima;
    private BigDecimal x_minimo;
    private BigDecimal y_minimo;
    private BigDecimal comprimento_passagem_chama_minimo;

    public ExCarcaca() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCarcaca() {
        return carcaca;
    }

    public void setCarcaca(Integer carcaca) {
        this.carcaca = carcaca;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public BigDecimal getCarcaca_minimo() {
        return carcaca_minimo;
    }

    public void setCarcaca_minimo(BigDecimal carcaca_minimo) {
        this.carcaca_minimo = carcaca_minimo;
    }

    public BigDecimal getTampa_maximo() {
        return tampa_maximo;
    }

    public void setTampa_maximo(BigDecimal tampa_maximo) {
        this.tampa_maximo = tampa_maximo;
    }

    public BigDecimal getFolga_maxima() {
        return folga_maxima;
    }

    public void setFolga_maxima(BigDecimal folga_maxima) {
        this.folga_maxima = folga_maxima;
    }

    public BigDecimal getX_minimo() {
        return x_minimo;
    }

    public void setX_minimo(BigDecimal x_minimo) {
        this.x_minimo = x_minimo;
    }

    public BigDecimal getY_minimo() {
        return y_minimo;
    }

    public void setY_minimo(BigDecimal y_minimo) {
        this.y_minimo = y_minimo;
    }

    public BigDecimal getComprimento_passagem_chama_minimo() {
        return comprimento_passagem_chama_minimo;
    }

    public void setComprimento_passagem_chama_minimo(BigDecimal comprimento_passagem_chama_minimo) {
        this.comprimento_passagem_chama_minimo = comprimento_passagem_chama_minimo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.carcaca);
        hash = 13 * hash + Objects.hashCode(this.linha);
        hash = 13 * hash + Objects.hashCode(this.carcaca_minimo);
        hash = 13 * hash + Objects.hashCode(this.tampa_maximo);
        hash = 13 * hash + Objects.hashCode(this.folga_maxima);
        hash = 13 * hash + Objects.hashCode(this.x_minimo);
        hash = 13 * hash + Objects.hashCode(this.y_minimo);
        hash = 13 * hash + Objects.hashCode(this.comprimento_passagem_chama_minimo);
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
        final ExCarcaca other = (ExCarcaca) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.carcaca_minimo, other.carcaca_minimo)) {
            return false;
        }
        if (!Objects.equals(this.tampa_maximo, other.tampa_maximo)) {
            return false;
        }
        if (!Objects.equals(this.folga_maxima, other.folga_maxima)) {
            return false;
        }
        if (!Objects.equals(this.x_minimo, other.x_minimo)) {
            return false;
        }
        if (!Objects.equals(this.y_minimo, other.y_minimo)) {
            return false;
        }
        if (!Objects.equals(this.comprimento_passagem_chama_minimo, other.comprimento_passagem_chama_minimo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExCarcaca{" + "id=" + id + ", carcaca=" + carcaca + ", linha=" + linha + ", carcaca_minimo=" + carcaca_minimo + ", tampa_maximo=" + tampa_maximo + ", folga_maxima=" + folga_maxima + ", x_minimo=" + x_minimo + ", y_minimo=" + y_minimo + ", comprimento_passagem_chama_minimo=" + comprimento_passagem_chama_minimo + '}';
    }
     
}
