/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.Enums.Status;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Pedidos {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date data;
    private Status status;
    
    private Cliente cliente;
    private List<PedidoItem> pedidos = new ArrayList<>();
    
    public Pedidos(){}

    public Pedidos(Date data, Status status, Cliente cliente) {
        this.data = data;
        this.status = status;
        this.cliente = cliente;
    }

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Pedidos.sdf = sdf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addPedido(PedidoItem pedido){
        pedidos.add(pedido);
    }
    
    public void removePedido(PedidoItem pedido){
        pedidos.remove(pedido);
    }
    
    public double total(){
        double soma = 0.0;
        for (PedidoItem item: pedidos){
            soma += item.subTotal();
        }
        return soma;
    }
    
    @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("ORDER SUMMARY:");
            sb.append(sdf.format(data) + "\n");
            sb.append("Order Status: ");
            sb.append(status + "\n");
            sb.append("Cliente: ");
            sb.append(cliente + "\n");
            sb.append("Pedido: ");
            for (PedidoItem item : pedidos){
                sb.append(item + "\n");
            }
            sb.append("Valor Total: $");
            sb.append(String.format("%.2f", total()));
            return sb.toString();
        }
}
