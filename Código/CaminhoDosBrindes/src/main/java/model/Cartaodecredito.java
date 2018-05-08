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
import javax.persistence.CascadeType;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tb_cartaodecredito")
public class Cartaodecredito implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Cartao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDCartao;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Numero")
    private int numero;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "CodigoSeguranca")
    private int codigoSeguranca;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NomeTitular")
    private String nomeTitular;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Validade")
    @Temporal(TemporalType.DATE)
    private Date validade;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Bandeira")
    private String bandeira;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart\u00e3oid")
    private Collection<Pedido> pedidoCollection;
    
    @OneToMany(mappedBy = "cartao")
    private Collection<Cliente> clienteCollection;

    public Cartaodecredito() {
    }

    public Cartaodecredito(Integer iDCartao) {
        this.iDCartao = iDCartao;
    }

    public Cartaodecredito(Integer iDCartao, int numero, int codigoSeguranca, String nomeTitular, Date validade, String bandeira) {
        this.iDCartao = iDCartao;
        this.numero = numero;
        this.codigoSeguranca = codigoSeguranca;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.bandeira = bandeira;
    }

    public Integer getIDCartao() {
        return iDCartao;
    }

    public void setIDCartao(Integer iDCartao) {
        this.iDCartao = iDCartao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    @XmlTransient
    public Collection<Pedido> getPedidoCollection() {
        return pedidoCollection;
    }

    public void setPedidoCollection(Collection<Pedido> pedidoCollection) {
        this.pedidoCollection = pedidoCollection;
    }

    @XmlTransient
    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCartao != null ? iDCartao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartaodecredito)) {
            return false;
        }
        Cartaodecredito other = (Cartaodecredito) object;
        if ((this.iDCartao == null && other.iDCartao != null) || (this.iDCartao != null && !this.iDCartao.equals(other.iDCartao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cartaodecredito[ iDCartao=" + iDCartao + " ]";
    }
    
}
