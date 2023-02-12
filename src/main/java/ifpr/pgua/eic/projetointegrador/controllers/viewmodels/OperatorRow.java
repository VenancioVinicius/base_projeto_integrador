package ifpr.pgua.eic.projetointegrador.controllers.viewmodels;

import ifpr.pgua.eic.projetointegrador.model.entities.Operator;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OperatorRow {
      
      private Operator operator;

      public OperatorRow(Operator operator){
            this.operator = operator;
      }

      public Operator getOperator(){
            return operator;
      }

      public StringProperty nomeProperty(){
            return new SimpleStringProperty(String.valueOf(operator.getNome()));
      }

}
