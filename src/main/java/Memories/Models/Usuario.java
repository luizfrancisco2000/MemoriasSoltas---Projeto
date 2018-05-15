/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memories.Models;

import java.io.Serializable;
import java.util.Base64;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Chico
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    private String email;
    private String nome;
    private Date datanasc;
    private String senha;
    private String nacionalidade;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public String getSenha() {
        return senha;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    /*@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.email == null && other.email != null) || (this.email != null && !this.email.equals(other.email))) {
            return false;
        }
        return true;
    }*/
}
