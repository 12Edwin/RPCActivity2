package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClientRPC {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config= new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client= new XmlRpcClient();
        client.setConfig(config);
        String opcion= "", num1= "", num2="";
        boolean repetir=true;
        int val1=0,val2=0;
        double result;
        Object param [];
        do{
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("5. División");
            System.out.println("6. Raiz");
            System.out.println("7. Exponente");
            System.out.println("8. Historial de operaciones");
            System.out.println("9. Salir");
            opcion = teclado.next();
            if (isNumber(opcion)){
                switch (Integer.parseInt(opcion)){
                    case 1:
                        do {
                            System.out.println("Ingresa el primer valor");
                            num1= teclado.next();
                            if (!isNumber(num1)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val1 = Integer.parseInt(num1);
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresa el segundo valor");
                            num2= teclado.next();
                            if (!isNumber(num2)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val2= Integer.parseInt(num2);
                            }
                        }while (!isNumber(num2));
                        // llamada al servicio web
                        param= new Object[2];
                        param [0]=val1;
                        param [1]=val2;
                        try {
                            result = (Double) client.execute("Methods.suma",param);
                            System.out.println("Su resultado es: "+ result);
                        }catch (Exception e){
                            System.out.println("Ooops ocurrió un error");
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        do {
                            System.out.println("Ingresa el primer valor");
                            num1= teclado.next();
                            if (!isNumber(num1)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val1 = Integer.parseInt(num1);
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresa el segundo valor");
                            num2= teclado.next();
                            if (!isNumber(num2)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val2 = Integer.parseInt(num2);
                            }
                        }while (!isNumber(num2));
                        // llamada al servicio web
                        param= new Object[2];
                        param [0]=val1;
                        param [1]=val2;
                        try {
                            result = (Double) client.execute("Methods.resta",param);
                            System.out.println("Su resultado es: "+ result);
                        }catch (Exception e){
                            System.out.println("Ooops ocurrió un error");
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        do {
                            System.out.println("Ingresa el primer valor");
                            num1= teclado.next();
                            if (!isNumber(num1)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val1 = Integer.parseInt(num1);
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresa el segundo valor");
                            num2= teclado.next();
                            if (!isNumber(num2)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val2 = Integer.parseInt(num2);
                            }
                        }while (!isNumber(num2));
                        // llamada al servicio web
                        param= new Object[2];
                        param [0]=val1;
                        param [1]=val2;
                        try {
                            result = (Double) client.execute("Methods.producto",param);
                            System.out.println("Su resultado es: "+ result);
                        }catch (Exception e){
                            System.out.println("Ooops ocurrió un error");
                            e.printStackTrace();
                        }
                        break;
                    case 4:
                        do {
                            System.out.println("Ingresa el primer valor");
                            num1= teclado.next();
                            if (!isNumber(num1)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val1 = Integer.parseInt(num1);
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresa el segundo valor");
                            num2= teclado.next();
                            if (!isNumber(num2)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val2 = Integer.parseInt(num2);
                            }
                        }while (!isNumber(num2));
                        // llamada al servicio web
                        param= new Object[2];
                        param [0]=num1;
                        param [1]=num2;
                        try {
                            result = (Double) client.execute("Methods.division",param);
                            System.out.println("Su resultado es: "+ result);
                        }catch (Exception e){
                            System.out.println("Ooops ocurrió un error");
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        do {
                            System.out.println("Ingresa el primer valor");
                            num1= teclado.next();
                            if (!isNumber(num1)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val1 = Integer.parseInt(num1);
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresa el segundo valor");
                            num2= teclado.next();
                            if (!isNumber(num2)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                if (indeterminacion(num2)){
                                    System.out.println("Hay una indeterminación...Inténtelo de nuevo");
                                }
                                else {
                                    val2 = Integer.parseInt(num2);
                                }
                            }
                            if (isNumber(num2)){
                                if(num2.equals("0")){
                                    repetir=true;
                                }else{
                                    repetir= false;
                                }
                            }
                        }while (repetir);
                        // llamada al servicio web
                        param= new Object[2];
                        param [0]=val1;
                        param [1]=val2;
                        try {
                            result = (Double) client.execute("Methods.division",param);
                            System.out.println("Su resultado es: "+ result);
                        }catch (Exception e){
                            System.out.println("Ooops ocurrió un error");
                            e.printStackTrace();
                        }
                        break;
                    case 6:
                        do {
                            System.out.println("Ingresa el primer valor");
                            num1= teclado.next();
                            if (!isNumber(num1)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val1 = Integer.parseInt(num1);
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresa el segundo valor");
                            num2= teclado.next();
                            if (!isNumber(num2)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val2 = Integer.parseInt(num2);
                            }
                        }while (!isNumber(num2));
                        // llamada al servicio web
                        param= new Object[2];
                        param [0]=val1;
                        param [1]=val2;
                        try {
                            result = (Double) client.execute("Methods.raiz",param);
                            System.out.println("Su resultado es: "+ result);
                        }catch (Exception e){
                            System.out.println("Ooops ocurrió un error");
                            e.printStackTrace();
                        }
                        break;
                    case 7:
                        do {
                            System.out.println("Ingresa el primer valor");
                            num1= teclado.next();
                            if (!isNumber(num1)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val1 = Integer.parseInt(num1);
                            }
                        }while (!isNumber(num1));
                        do {
                            System.out.println("Ingresa el segundo valor");
                            num2= teclado.next();
                            if (!isNumber(num2)){
                                System.out.println("Error, ingrese un valor numérico");
                            }else {
                                val2 = Integer.parseInt(num2);
                            }
                        }while (!isNumber(num2));
                        // llamada al servicio web
                        param= new Object[2];
                        param [0]=val1;
                        param [1]=val2;
                        try {
                            result = (Double) client.execute("Methods.potencia",param);
                            System.out.println("Su resultado es: "+ result);
                        }catch (Exception e){
                            System.out.println("Ooops ocurrió un error");
                            e.printStackTrace();
                        }
                        break;
                    case 8:
                        param = new Object[1];
                        int count=0;
                        String cadena="";
                        do {
                            param [0]= count;
                            try {
                                cadena = (String) client.execute("Methods.lisOperations",param);
                                System.out.println(cadena);
                                count++;
                            }catch (Exception e){
                                System.out.println("Oooops ocurrió un error");
                            }
                        }while (!(cadena.equals("")));

                        break;
                    case 9:
                        System.out.println("Fin de la app");
                        break;
                    default:
                        System.out.println("Ingresa una opción valida");
                }
            }else {
                System.out.println("Ingresa un valor valido");
            }
        }while(!opcion.equals("9"));
    }
    public static boolean isNumber (String number){
        try {
            int num= Integer.parseInt(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean isDouble (String number){
        try {
            double num = Double.parseDouble(number);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static boolean indeterminacion (String val){
        int num = Integer.parseInt(val);
        if (num == 0){
            return true;
        }else {
            return false;
        }
    }
}
