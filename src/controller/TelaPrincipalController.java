/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 631620220
 */
public class TelaPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    @FXML
    private AnchorPane painelFormularioPaciente;
    @FXML
    private TextField textFieldRg;
    @FXML
    private TextField textFieldNome;
    @FXML
    private TextField textFieldDataNascimento;

    //private ClienteNegocio clienteNegocio;

    @FXML
    public void tratarBotaoSalvar(ActionEvent event) throws IOException {
        Stage stage = (Stage) painelFormularioPaciente.getScene().getWindow();
/*
        try {
            pacienteNegocio.salvar(new Paciente(
                    textFieldRg.getText(),
                    textFieldNome.getText(),
                    DateUtil.stringToDate(textFieldDataNascimento.getText())
            ));
            PrintUtil.printMessageSucesso("Cadastro realizado com sucesso!");
            limparCampos();
        } catch (NegocioException | ParseException ex) {
            PrintUtil.printMessageError(ex.getMessage());
        }
*/
    }

    @FXML
    public void tratarBotaoCancelar(ActionEvent event) throws IOException {
        Stage stage = (Stage) painelFormularioPaciente.getScene().getWindow();
        stage.close();

    }

    private void limparCampos() {
        textFieldRg.clear();
        textFieldNome.clear();
        textFieldDataNascimento.clear();
    }
}
