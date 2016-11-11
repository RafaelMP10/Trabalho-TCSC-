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
public class Horista extends Empregado {

    public Horista() {
    }
    
    public Horista(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }
    @Column
    private double precoHora;
    @Column
    private double hrTrab;

    public Horista(double precoHora, double hrTrab, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.hrTrab = hrTrab;
    }

    public double CalcVenc(double preco, double HoraTrab){
        double venc = HoraTrab * preco;
        return venc;
    }
    
    public double getHrTrab() {
        return hrTrab;
    }

    public void setHrTrab(double hrTrab) {
        this.hrTrab = hrTrab;
    }
    
    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }
    
}
