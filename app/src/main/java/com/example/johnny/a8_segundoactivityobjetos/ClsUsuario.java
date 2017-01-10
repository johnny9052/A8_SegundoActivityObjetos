package com.example.johnny.a8_segundoactivityobjetos;

import java.io.Serializable;

/**
 * Created by Johnny on 10/01/2017.
 */
public class ClsUsuario  implements Serializable {

    private String usuario;
    private String password;

    public ClsUsuario() {

    }

    public ClsUsuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario
     *            the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
