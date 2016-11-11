/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Comissionado extends Empregado {

    @Column
    private double txComissao;
    @Column
    private double totalVenda;

    public Comissionado() {
    }
    
    public Comissionado(double txComissao, double totalVenda, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.txComissao = txComissao;
        this.totalVenda = totalVenda;
    }
    

    public double Calcvenc(double txcom, double totalven){
        double venc = totalven * (txcom/100);
        return venc;
    }
    
    public double getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(double totalVenda) {
        this.totalVenda = totalVenda;
    }

    public double getTxComissao() {
        return txComissao;
    }

    public void setTxComissao(double txComissao) {
        this.txComissao = txComissao;
    }
    
    
}
