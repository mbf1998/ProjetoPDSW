/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
   
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Pedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iDPedido;
   
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Status_Pedido")
    private String statusPedido;
  
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Arquivo_pedido")
    private String arquivopedido;
   
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantidade_Pedido")
    private int quantidadePedido;
   
    @Size(max = 2000)
    @Column(name = "Mensagem")
    private String mensagem;
   
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Cor")
    private String cor;
    
    @JoinColumn(name = "Cart\u00e3o_id", referencedColumnName = "ID_Cartao")
    @ManyToOne(optional = false)
    private Cartaodecredito cartãoid;
  
    @JoinColumn(name = "id_usu", referencedColumnName = "User_ID")
    @ManyToOne
    private Cliente idUsu;
  
    @JoinColumn(name = "ID_Pedido", referencedColumnName = "ID_Produto", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Produto produto;

    public Pedido() {
    }

    public Pedido(Integer iDPedido) {
        this.iDPedido = iDPedido;
    }

    public Pedido(Integer iDPedido, String statusPedido, int quantidadePedido, String cor) {
        this.iDPedido = iDPedido;
        this.statusPedido = statusPedido;
        this.quantidadePedido = quantidadePedido;
        this.cor = cor;
    }

    public Integer getIDPedido() {
        return iDPedido;
    }

    public void setIDPedido(Integer iDPedido) {
        this.iDPedido = iDPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public String getArquivopedido() {
        return arquivopedido;
    }

    public void setArquivopedido(String arquivopedido) {
        this.arquivopedido = arquivopedido;
    }

    public int getQuantidadePedido() {
        return quantidadePedido;
    }

    public void setQuantidadePedido(int quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Cartaodecredito getCartãoid() {
        return cartãoid;
    }

    public void setCartãoid(Cartaodecredito cartãoid) {
        this.cartãoid = cartãoid;
    }

    public Cliente getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Cliente idUsu) {
        this.idUsu = idUsu;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPedido != null ? iDPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.iDPedido == null && other.iDPedido != null) || (this.iDPedido != null && !this.iDPedido.equals(other.iDPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Pedido[ iDPedido=" + iDPedido + " ]";
    }
    
}