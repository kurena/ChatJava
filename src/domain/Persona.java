/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Administrador
 */
public class Persona {
    private String username;
    private String ipAdress;
    private int port;
    private int localport;

    public Persona(String username, String ipAdress, int port, int localport) {
        this.username = username;
        this.ipAdress = ipAdress;
        this.port = port;
        this.localport = localport;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getLocalport() {
        return localport;
    }

    public void setLocalport(int localport) {
        this.localport = localport;
    }
    
    public Persona(String username, String ipAdress) {
        this.username = username;
        this.ipAdress = ipAdress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }    
}
