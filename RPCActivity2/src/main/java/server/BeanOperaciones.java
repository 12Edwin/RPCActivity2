package server;

import java.util.Date;

public class BeanOperaciones {
    private String operacion;
    private int val1;
    private int val2;
    private double result;
    private Date fecha;

    public BeanOperaciones() {
    }

    public BeanOperaciones(String operacion, int val1, int val2, double result, Date fecha) {
        this.operacion = operacion;
        this.val1 = val1;
        this.val2 = val2;
        this.result = result;
        this.fecha = fecha;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getOperacion() {
        return operacion;
    }

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }

    public double getResult() {
        return result;
    }

    public Date getFecha() {
        return fecha;
    }
}
