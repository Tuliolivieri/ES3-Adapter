/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterengenharia3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tulio
 */
public class AdapterTXT extends Target
{
    Dados d;
    @Override
    public void request(String nomeArq)
    {
        FileReader arq;
        try
        {
            arq = new FileReader(nomeArq);
            BufferedReader leArq = new BufferedReader(arq);
            String larry = leArq.readLine();
            
            String[] campos = larry.split(";");
            
            d = new Dados();
            
            d.setNome(campos[0]);
            d.setRG(campos[1]);
            d.setCPF(campos[2]);
            String[] tels = campos[3].split(",");
            for(int i = 0; i < tels.length; i++)
                d.getTelefone().add(tels[i]);
            
            d.setEndereco(campos[4]);
            
            arq.close();
            
            FileWriter fr = new FileWriter("dados.txt");
            PrintWriter gravarArq = new PrintWriter(fr);
            
            String linha = d.getNome() + ";" + d.getRG() + ";" + d.getCPF() + ";";
        
            for(int i = 0; i < d.getTelefone().size(); i++)
                linha += d.getTelefone().get(i) + ",";
            linha += ";";
            linha += d.getEndereco() + ";";
            
            gravarArq.printf(linha);
            fr.close();
            
        } catch (FileNotFoundException ex)
        {
            Logger.getLogger(AdapterTXT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(AdapterTXT.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
