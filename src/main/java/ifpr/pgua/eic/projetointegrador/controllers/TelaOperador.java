package ifpr.pgua.eic.projetointegrador.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.projetointegrador.controllers.viewmodels.OperatorRow;
import ifpr.pgua.eic.projetointegrador.controllers.viewmodels.TelaOperadorViewModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TelaOperador extends BaseController implements Initializable {

      private TableColumn<OperatorRow, String> tbcNome;

      @FXML
      private TableView<OperatorRow> tbOperator;

      private TelaOperadorViewModel viewModel;

      public TelaOperador(TelaOperadorViewModel viewModel){
            this.viewModel = viewModel;
      }

      @Override
      public void initialize(URL arg0, ResourceBundle arg1) {
            // TODO Auto-generated method stub

            tbcNome.setCellValueFactory(new PropertyValueFactory<>("nome"));

            tbOperator.setItems(viewModel.getOperators());

            viewModel.updateList();
            
      }
      
}
