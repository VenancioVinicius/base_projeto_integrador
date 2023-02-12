package ifpr.pgua.eic.projetointegrador.model.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ifpr.pgua.eic.projetointegrador.model.FabricaConexoes;
import ifpr.pgua.eic.projetointegrador.model.entities.Operator;
import ifpr.pgua.eic.projetointegrador.model.results.Result;

public class JDBCOperatorDao implements OperatorDao {

      private FabricaConexoes fabricaConexoes;

      public JDBCOperatorDao(FabricaConexoes fabricaConexoes){
            this.fabricaConexoes = fabricaConexoes;
      }

      @Override
      public Result inserir(Operator operator) {
            // TODO Auto-generated method stub
            return null;
      }

      @Override
      public List<Operator> buscarTodos() {
            // TODO Auto-generated method stub

            try {
                  Connection con = fabricaConexoes.getConnection();
                  PreparedStatement pstm = con.prepareStatement("SELECT * FROM operators");
                  ResultSet resultSet = pstm.executeQuery();
                  ArrayList<Operator> operators = new ArrayList<>();

                  while(resultSet.next()){
                        String nome = resultSet.getString("nome_operador");

                        Operator operator = new Operator(nome);

                        operators.add(operator);
                  }
                  return operators;
                  
            } catch (SQLException e) {
                  return Collections.emptyList();
            }
      }
      
}
