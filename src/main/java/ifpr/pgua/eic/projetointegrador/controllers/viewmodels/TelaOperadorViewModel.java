package ifpr.pgua.eic.projetointegrador.controllers.viewmodels;

import ifpr.pgua.eic.projetointegrador.model.results.Result;
import ifpr.pgua.eic.projetointegrador.model.repositories.OperatorRepository;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TelaOperadorViewModel{

      private SimpleStringProperty nomeProperty = new SimpleStringProperty();
      private ObjectProperty<Result> alertProperty = new SimpleObjectProperty<>();

      private ObservableList<OperatorRow> operator = FXCollections.observableArrayList();

      private OperatorRepository repository;

      public TelaOperadorViewModel(OperatorRepository repository){
            this.repository = repository;
      }

      public ObjectProperty<Result> alertProperty() {
            return alertProperty;
        }

      public SimpleStringProperty nomeProperty(){
            return nomeProperty;
      }

      public void updateList(){
            operator.clear();

            alertProperty.setValue(Result.fail("BUSCAR NO BANCO DE DADOS"));
      }

      public ObservableList<OperatorRow> getOperators(){
            return operator;
      }

}
