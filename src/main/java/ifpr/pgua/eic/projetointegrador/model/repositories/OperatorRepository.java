package ifpr.pgua.eic.projetointegrador.model.repositories;

import java.util.List;

import ifpr.pgua.eic.projetointegrador.model.daos.OperatorDao;
import ifpr.pgua.eic.projetointegrador.model.entities.Operator;

public class OperatorRepository {
      
      private OperatorDao dao;

      public OperatorRepository(OperatorDao dao){
            this.dao = dao;
      }

      public List<Operator> listar(){
            return dao.buscarTodos();
      }

}
