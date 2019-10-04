/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterengenharia3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class FXMLExibeController implements Initializable {

    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfRG;
    @FXML
    private TextField tfCPF;
    @FXML
    private TextField tfTelefone;
    @FXML
    private TextField tfEndereco;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        FileReader arq;
        try {
            // TODO
            arq = new FileReader("dados.txt");
            BufferedReader leArq = new BufferedReader(arq);
            String larry = leArq.readLine();
            
            String[] campos = larry.split(";");
            
            Dados d = new Dados();
            
            d.setNome(campos[0]);
            d.setRG(campos[1]);
            d.setCPF(campos[2]);
            d.setTelefone(campos[3]);
            d.setEndereco(campos[4]);
            
            arq.close();
            
            tfNome.setText(d.getNome());
            tfRG.setText(d.getRG());
            tfCPF.setText(d.getCPF());
            tfTelefone.setText(d.getTelefone());
            tfEndereco.setText(d.getEndereco());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLExibeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FXMLExibeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
