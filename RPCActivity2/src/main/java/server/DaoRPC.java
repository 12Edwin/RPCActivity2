package server;

import utils.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoRPC {
    public boolean SaveOperations (int val1,int val2,double resultado,String oper){
        boolean result = false;

        try
                (Connection con = MySQLConnection.getConnection();
                 PreparedStatement pstm = con.prepareStatement("insert into operations (operaciones,val1,val2,result) values (?,?,?,?);");
                 ){
            pstm.setString(1,oper);
            pstm.setInt(2,val1);
            pstm.setInt(3,val2);
            pstm.setDouble(4,resultado);
            result = pstm.executeUpdate() == 1;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<BeanOperaciones> listOperations (){
        ArrayList<BeanOperaciones> list = new ArrayList<>();
        try {
            Connection connection = MySQLConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from operations");
            while (rs.next()){
                BeanOperaciones operation = new BeanOperaciones();
                operation.setOperacion(rs.getString("operaciones"));
                operation.setVal1(rs.getInt("val1"));
                operation.setVal2(rs.getInt("val2"));
                operation.setResult(rs.getDouble("result"));
                operation.setFecha(rs.getDate("fecha"));

                list.add(operation);
            };

            rs.close();
            connection.close();
            statement.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
