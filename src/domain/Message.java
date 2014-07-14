/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Message {
    public Message ant;
    public Message sig;
    public Persona creador;
    public String data;
    public String time;

    public Message(Persona creador, String data, String time) {
        this.ant = null;
        this.sig = null;
        this.creador = creador;
        this.data = data;
        this.time = time;
    }

    public Message() {
        this.ant = null;
        this.sig = null;
    }

    public Message(Message ant, Message sig, Persona creador, String data, String time) {
        this.ant = ant;
        this.sig = sig;
        this.creador = creador;
        this.data = data;
        this.time = time;
    }
    
    
}
