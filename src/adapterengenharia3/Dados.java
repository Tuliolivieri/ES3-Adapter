/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterengenharia3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Dados 
{
    String Nome;
    String RG;
    String CPF;
    List<String> Telefone;
    String Endereco;

    public Dados(String Nome, String RG, String CPF, List Telefone, String Endereco) {
        this.Nome = Nome;
        this.RG = RG;
        this.CPF = CPF;
        Telefone = new ArrayList<String>();
        this.Telefone.addAll(Telefone);
        this.Endereco = Endereco;
    }
    
    public Dados(){Telefone = new ArrayList<String>();}
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public List<String> getTelefone() {
        return Telefone;
    }

    public void setTelefone(List<String> Telefone) {
        this.Telefone = Telefone;
    }
    
    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
}
