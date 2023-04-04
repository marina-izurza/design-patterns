package com.kreitek.pets;

//Esta clase solo permitirá que se haga una instancia del objeto
public class Logger {
    private static Logger debug; //Variable estática
    private int contador = 0;//Mi contador

    //Hago el constructor privado para que no se creen objetos desde fuera
    private Logger(){
    }

    //Devuelve un objeto de tipo log única que se irá guardando en nuestra variable arriba
    public static Logger getInstance(){

        if (debug == null){//si nos e ha creado ninguna instancia
            debug = new Logger();//creamos la instancia
        }

        return debug;//si no entra en el if porque tiene instancia creada, le damos esa instancia
    }

    //Método del objeto que me imprime los logs
    public void debug (String mensaje) {
        System.out.println("[debug]" + "[" + contador++ + "]" + " - " + mensaje);
    }
}
