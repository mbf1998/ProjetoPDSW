/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "tb_produto")

 
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
 
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Produto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDProduto;
   
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Nome")
    private String nome;
   
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tamanho_Altura")
    private float tamanhoAltura;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tamanho_Largura")
    private float tamanhoLargura;
   
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantidade")
    private int quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Preco")
    private Float preco;
    
    @Column(name = "Descricao")
    private String descricao;
    
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Cor")
    private String cor;
   
    @Size(max = 100)
    @Column(name = "tipo")
    private String tipo;
   
   @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Image_01")
    private String image01;
    
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Image_02")
    private String image02;
    
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Image_03")
    private String image03;
    
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Image_04")
    private String image04;
    
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Image_05")
    private String image05;
    
   
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "produto")
    private Pedido pedido;
   
    
    
    @JoinColumn(name = "Produto_Promocao", referencedColumnName = "ID_Promocao")
    @ManyToOne
    private Promocao produtoPromocao;

    public Produto() {
    }

    public Produto(Integer iDProduto) {
        this.IDProduto = iDProduto;
    }

    public Produto(Integer iDProduto, String nome, float tamanhoAltura, float tamanhoLargura, int quantidade, String cor) {
        this.IDProduto = iDProduto;
        this.nome = nome;
        this.tamanhoAltura = tamanhoAltura;
        this.tamanhoLargura = tamanhoLargura;
        this.quantidade = quantidade;
        this.cor = cor;
    }

    public Integer getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(Integer iDProduto) {
        this.IDProduto = iDProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTamanhoAltura() {
        return tamanhoAltura;
    }

    public void setTamanhoAltura(float tamanhoAltura) {
        this.tamanhoAltura = tamanhoAltura;
    }

    public float getTamanhoLargura() {
        return tamanhoLargura;
    }

    public void setTamanhoLargura(float tamanhoLargura) {
        this.tamanhoLargura = tamanhoLargura;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   public String getImage01() {
        return image01;
    }

    public void setImage01(String image01) {
        this.image01 = image01;
    }

    public String getImage02() {
        return image02;
    }

    public void setImage02(String image02) {
        this.image02 = image02;
    }

    public String getImage03() {
        return image03;
    }

    public void setImage03(String image03) {
        this.image03 = image03;
    }
     public String getImage04() {
        return image04;
    }

    public void setImage04(String image04) {
        this.image04 = image04;
    }

    public String getImage05() {
        return image05;
    }

    public void setImage05(String image05) {
        this.image05 = image05;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

  

    public Promocao getProdutoPromocao() {
        return produtoPromocao;
    }
    

    public void setProdutoPromocao(Promocao produtoPromocao) {
        this.produtoPromocao = produtoPromocao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (IDProduto != null ? IDProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.IDProduto == null && other.IDProduto != null) || (this.IDProduto != null && !this.IDProduto.equals(other.IDProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produto[ iDProduto=" + IDProduto + " ]";
    }
    
  
}