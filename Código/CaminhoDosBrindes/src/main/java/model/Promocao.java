/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tb_promocao")
public class Promocao implements Serializable {

    private static final long serialVersionUID = 1L;
  
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Promocao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDPromocao;
   
    @Basic(optional = false)
    @NotNull
    @Column(name = "DataInicio")
   
    private String dataInicio;
 
    @Basic(optional = false)
    @NotNull
    @Column(name = "DataFim")
    
    private String dataFim;
  
    @Basic(optional = false)
    @NotNull
    @Column(name = "DescontoPreco")
    private float descontoPreco;
 
    @OneToMany(mappedBy = "produtoPromocao")
    private Collection<Produto> produtoCollection;

    public Promocao() {
    }

    public Promocao(Integer iDPromocao) {
        this.iDPromocao = iDPromocao;
    }

    public Promocao(Integer iDPromocao, String dataInicio, String dataFim, float descontoPreco) {
        this.iDPromocao = iDPromocao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descontoPreco = descontoPreco;
    }

    public Integer getIDPromocao() {
        return iDPromocao;
    }

    public void setIDPromocao(Integer iDPromocao) {
        this.iDPromocao = iDPromocao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public float getDescontoPreco() {
        return descontoPreco;
    }

    public void setDescontoPreco(float descontoPreco) {
        this.descontoPreco = descontoPreco;
    }

    @XmlTransient
    public Collection<Produto> getProdutoCollection() {
        return produtoCollection;
    }

    public void setProdutoCollection(Collection<Produto> produtoCollection) {
        this.produtoCollection = produtoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPromocao != null ? iDPromocao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promocao)) {
            return false;
        }
        Promocao other = (Promocao) object;
        if ((this.iDPromocao == null && other.iDPromocao != null) || (this.iDPromocao != null && !this.iDPromocao.equals(other.iDPromocao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Promocao[ iDPromocao=" + iDPromocao + " ]";
    }
    
}