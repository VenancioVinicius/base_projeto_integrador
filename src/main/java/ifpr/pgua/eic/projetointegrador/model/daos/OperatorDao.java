package ifpr.pgua.eic.projetointegrador.model.daos;

import java.util.List;

import ifpr.pgua.eic.projetointegrador.model.entities.Operator;
import ifpr.pgua.eic.projetointegrador.model.results.Result;

public interface OperatorDao {

      Result inserir(Operator operator);
      List<Operator> buscarTodos();
      
}
