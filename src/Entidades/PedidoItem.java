/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


/**
 *
 * @author pedro
 */
public class PedidoItem {
    
    
    private Integer quantidade;
    private Double price;
    
    private Produtos produto;

    public PedidoItem(Integer quantidade, double price, Produtos produto) {
        this.quantidade = quantidade;
        this.price = price;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }
   
    public Double subTotal(){
        return quantidade * price;
    }
    
    @Override
        public String toString(){
            return getProduto().getNome()
                    + ", $"
                    +String.format("%.2f ", price)
                    + " Quantidade: " 
                    + quantidade
                    + " Subtotal: $"
                    +String.format("%.2f", subTotal());
    }
}
