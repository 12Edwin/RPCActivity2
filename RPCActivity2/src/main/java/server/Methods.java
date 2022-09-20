package server;

import java.util.ArrayList;

public class Methods {

    public Methods() {
    }

    public double suma (int val1, int val2){
        DaoRPC daoRPC = new DaoRPC();
        boolean result = daoRPC.SaveOperations(val1,val2,val1+val2,"Suma");
        return val1+val2;
    }
    public double resta (int val1, int val2){
        DaoRPC daoRPC = new DaoRPC();
        boolean result = daoRPC.SaveOperations(val1,val2,val1-val2,"Resta");
        return val1-val2;
    }
    public  double producto (int val1, int val2){
        DaoRPC daoRPC= new DaoRPC();
        boolean result = daoRPC.SaveOperations(val1,val2,val1*val2,"Producto");
        return val1 * val2;
    }

    public  double division (int val1, int val2){
        double num1 = val1;
        double num2 = val2;
        DaoRPC daoRPC = new DaoRPC();
        boolean result = daoRPC.SaveOperations(val1,val2,num1/num2,"División");
        return  num1 / num2;
    }
    public double potencia (int val1, int val2){
        DaoRPC daoRPC = new DaoRPC();
        boolean result = daoRPC.SaveOperations(val1,val2,Math.pow(val1,val2),"Potencia");
        return Math.pow(val1,val2);
    }
    public double raiz (int val1,int val2){
        double num1= val1;
        double num2 = val2;
        DaoRPC daoRPC = new DaoRPC();
        boolean result = daoRPC.SaveOperations(val1,val2,Math.pow(num1,1/num2),"Raiz");
        return Math.pow(num1,1/num2);
    }
    public String lisOperations (int count){
        DaoRPC daoRPC= new DaoRPC();
        ArrayList<BeanOperaciones> list = daoRPC.listOperations();
        if (count == list.size()){
            return "";
        }else {
            String cadena= list.get(count).getOperacion()+" "+list.get(count).getVal1()+" "+list.get(count).getVal2()+" "+list.get(count).getResult()+" "+list.get(count).getFecha();
            return cadena;
        }
    }
}
