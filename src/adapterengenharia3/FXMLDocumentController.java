/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterengenharia3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Aluno
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button btEnviar;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfRG;
    @FXML
    private TextField tfTelefone;
    @FXML
    private TextField tfCPF;
    @FXML
    private TextField tfEndereco;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void clkEnviar(ActionEvent event) throws IOException 
    {
        FileWriter arq = new FileWriter("arquivoGerado.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf(tfNome.getText() + ";" + tfRG.getText() + ";" + tfCPF.getText() + ";" + tfTelefone.getText() + ";" + tfEndereco.getText() + ";");
        arq.close();
        
        Target adaptador = new AdapterTXT();
        adaptador.request("arquivoGerado.txt");
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLExibe.fxml"));
        tfNome.getParent().getScene().setRoot(root);
    }
}
