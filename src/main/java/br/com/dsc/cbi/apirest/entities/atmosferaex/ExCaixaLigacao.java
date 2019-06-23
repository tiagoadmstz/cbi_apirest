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
@Document("ex_caixa_ligacao")
public class ExCaixaLigacao implements Serializable {

    @Id
    private String id;
    @Indexed
    private Integer carcaca;
    @Indexed
    private String linha;
    private BigDecimal w1; //distância mínima entre furo e interior ou exterior do invólucro
    private BigDecimal w2; //idem W21 - L1 Comprimento Axial do Encaixe W22
    private BigDecimal w3; //idem W21 - L1 Comprimento Axial do Encaixe W22
    private BigDecimal largura_minima_junta_W1; //Largura mínima da junta
    private BigDecimal largura_minima_junta_W2; //idem W21 - ØD1 Nominal W22
    private BigDecimal face_tampa_D1_minimo; //ØD1 - W22
    private BigDecimal face_tampa_D1_maximo; //ØD1 - W22
    private BigDecimal comprimento_radial_encaixe; //w1 - W22
    private BigDecimal encaixe_tampa_minimo; //D3 - W22
    private BigDecimal encaixe_tampa_maximo; //D3 - W22

    public ExCaixaLigacao() {
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

    public BigDecimal getW1() {
        return w1;
    }

    public void setW1(BigDecimal w1) {
        this.w1 = w1;
    }

    public BigDecimal getW2() {
        return w2;
    }

    public void setW2(BigDecimal w2) {
        this.w2 = w2;
    }

    public BigDecimal getW3() {
        return w3;
    }

    public void setW3(BigDecimal w3) {
        this.w3 = w3;
    }

    public BigDecimal getLargura_minima_junta_W1() {
        return largura_minima_junta_W1;
    }

    public void setLargura_minima_junta_W1(BigDecimal largura_minima_junta_W1) {
        this.largura_minima_junta_W1 = largura_minima_junta_W1;
    }

    public BigDecimal getLargura_minima_junta_W2() {
        return largura_minima_junta_W2;
    }

    public void setLargura_minima_junta_W2(BigDecimal largura_minima_junta_W2) {
        this.largura_minima_junta_W2 = largura_minima_junta_W2;
    }

    public BigDecimal getFace_tampa_D1_minimo() {
        return face_tampa_D1_minimo;
    }

    public void setFace_tampa_D1_minimo(BigDecimal face_tampa_D1_minimo) {
        this.face_tampa_D1_minimo = face_tampa_D1_minimo;
    }

    public BigDecimal getFace_tampa_D1_maximo() {
        return face_tampa_D1_maximo;
    }

    public void setFace_tampa_D1_maximo(BigDecimal face_tampa_D1_maximo) {
        this.face_tampa_D1_maximo = face_tampa_D1_maximo;
    }

    public BigDecimal getComprimento_radial_encaixe() {
        return comprimento_radial_encaixe;
    }

    public void setComprimento_radial_encaixe(BigDecimal comprimento_radial_encaixe) {
        this.comprimento_radial_encaixe = comprimento_radial_encaixe;
    }

    public BigDecimal getEncaixe_tampa_minimo() {
        return encaixe_tampa_minimo;
    }

    public void setEncaixe_tampa_minimo(BigDecimal encaixe_tampa_minimo) {
        this.encaixe_tampa_minimo = encaixe_tampa_minimo;
    }

    public BigDecimal getEncaixe_tampa_maximo() {
        return encaixe_tampa_maximo;
    }

    public void setEncaixe_tampa_maximo(BigDecimal encaixe_tampa_maximo) {
        this.encaixe_tampa_maximo = encaixe_tampa_maximo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.carcaca);
        hash = 79 * hash + Objects.hashCode(this.linha);
        hash = 79 * hash + Objects.hashCode(this.w1);
        hash = 79 * hash + Objects.hashCode(this.w2);
        hash = 79 * hash + Objects.hashCode(this.w3);
        hash = 79 * hash + Objects.hashCode(this.largura_minima_junta_W1);
        hash = 79 * hash + Objects.hashCode(this.largura_minima_junta_W2);
        hash = 79 * hash + Objects.hashCode(this.face_tampa_D1_minimo);
        hash = 79 * hash + Objects.hashCode(this.face_tampa_D1_maximo);
        hash = 79 * hash + Objects.hashCode(this.comprimento_radial_encaixe);
        hash = 79 * hash + Objects.hashCode(this.encaixe_tampa_minimo);
        hash = 79 * hash + Objects.hashCode(this.encaixe_tampa_maximo);
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
        final ExCaixaLigacao other = (ExCaixaLigacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.linha, other.linha)) {
            return false;
        }
        if (!Objects.equals(this.carcaca, other.carcaca)) {
            return false;
        }
        if (!Objects.equals(this.w1, other.w1)) {
            return false;
        }
        if (!Objects.equals(this.w2, other.w2)) {
            return false;
        }
        if (!Objects.equals(this.w3, other.w3)) {
            return false;
        }
        if (!Objects.equals(this.largura_minima_junta_W1, other.largura_minima_junta_W1)) {
            return false;
        }
        if (!Objects.equals(this.largura_minima_junta_W2, other.largura_minima_junta_W2)) {
            return false;
        }
        if (!Objects.equals(this.face_tampa_D1_minimo, other.face_tampa_D1_minimo)) {
            return false;
        }
        if (!Objects.equals(this.face_tampa_D1_maximo, other.face_tampa_D1_maximo)) {
            return false;
        }
        if (!Objects.equals(this.comprimento_radial_encaixe, other.comprimento_radial_encaixe)) {
            return false;
        }
        if (!Objects.equals(this.encaixe_tampa_minimo, other.encaixe_tampa_minimo)) {
            return false;
        }
        if (!Objects.equals(this.encaixe_tampa_maximo, other.encaixe_tampa_maximo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExCaixaLigacao{" + "id=" + id + ", carcaca=" + carcaca + ", linha=" + linha + ", w1=" + w1 + ", w2=" + w2 + ", w3=" + w3 + ", largura_minima_junta_W1=" + largura_minima_junta_W1 + ", largura_minima_junta_W2=" + largura_minima_junta_W2 + ", face_tampa_D1_minimo=" + face_tampa_D1_minimo + ", face_tampa_D1_maximo=" + face_tampa_D1_maximo + ", comprimento_radial_encaixe=" + comprimento_radial_encaixe + ", encaixe_tampa_minimo=" + encaixe_tampa_minimo + ", encaixe_tampa_maximo=" + encaixe_tampa_maximo + '}';
    }

}
