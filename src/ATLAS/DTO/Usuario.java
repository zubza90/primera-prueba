
package ATLAS.DTO;

/**
 *
 * @author CASA
 */
public class Usuario {
    private int ID_us;
    private String Nombre_us;
    private String Snombre_us;
    private String Appaterno_us;
    private String Apmaterno_us;
    private int Run_us;
    private String DV_us;
    private String Fecha_nac_us;
    private int Telefono_us;
    private String Email_us;
    private String Nusuario_us;
    private String Contraseña_us;
    
    public Usuario(){
        this.ID_us=0;
        this.Nombre_us="";
        this.Snombre_us="";
        this.Appaterno_us="";
        this.Apmaterno_us="";
        this.Run_us=0;
        this.DV_us="";
        this.Fecha_nac_us="";
        this.Telefono_us=0;
        this.Email_us="";
        this.Nusuario_us="";
        this.Contraseña_us="";
    }

    public Usuario(int ID_us, String Nombre_us, String Snombre_us, String Appaterno_us, String Apmaterno_us, int Run_us, String DV_us, String Fecha_nac_us, int Telefono_us, String Email_us, String Nusuario_us, String Contraseña_us) {
        this.ID_us = ID_us;
        this.Nombre_us = Nombre_us;
        this.Snombre_us = Snombre_us;
        this.Appaterno_us = Appaterno_us;
        this.Apmaterno_us = Apmaterno_us;
        this.Run_us = Run_us;
        this.DV_us = DV_us;
        this.Fecha_nac_us = Fecha_nac_us;
        this.Telefono_us = Telefono_us;
        this.Email_us = Email_us;
        this.Nusuario_us = Nusuario_us;
        this.Contraseña_us = Contraseña_us;
    }

    public int getID_us() {
        return ID_us;
    }

    public void setID_us(int ID_us) {
        this.ID_us = ID_us;
    }

    public String getNombre_us() {
        return Nombre_us;
    }

    public void setNombre_us(String Nombre_us) {
        this.Nombre_us = Nombre_us;
        
    }

    public String getSnombre_us() {
        return Snombre_us;
    }

    public void setSnombre_us(String Snombre_us) {
        this.Snombre_us = Snombre_us;
    }

    public String getAppaterno_us() {
        return Appaterno_us;
    }

    public void setAppaterno_us(String Appaterno_us) {
        this.Appaterno_us = Appaterno_us;
    }

    public String getApmaterno_us() {
        return Apmaterno_us;
    }

    public void setApmaterno_us(String Apmaterno_us) {
        this.Apmaterno_us = Apmaterno_us;
    }

    public int getRun_us() {
        return Run_us;
    }

    public void setRun_us(int Run_us,String DV_us) {
        this.Run_us = Run_us;
        if(this.validarRut(Run_us, DV_us)){
            int Run = 0;
            this.Run_us = Run;
            String Dv = null;
            this.DV_us = Dv+"";
        }}

    public String getDV_us() {
        return DV_us;
    }

    public void setDV_us(String DV_us) {
        this.DV_us = DV_us;
    }

    public String getFecha_nac_us() {
        return Fecha_nac_us;
    }

    public void setFecha_nac_us(String Fecha_nac_us) {
        this.Fecha_nac_us = Fecha_nac_us;
    }

    public int getTelefono_us() {
        return Telefono_us;
    }

    public void setTelefono_us(int Telefono_us) {
        this.Telefono_us = Telefono_us;
    }

    public String getEmail_us() {
        return Email_us;
    }

    public void setEmail_us(String Email_us) {
        this.Email_us = Email_us;
        if(Email_us.length() > 5 && Email_us.contains("@") && Email_us.contains(".com")){
            String Email = null;
            this.Email_us = Email;}
    }

    public String getNusuario_us() {
        return Nusuario_us;
    }

    public void setNusuario_us(String Nusuario_us) {
        this.Nusuario_us = Nusuario_us;
    }

    public String getContraseña_us() {
        return Contraseña_us;
    }

    public void setContraseña_us(String Contraseña_us) {
        this.Contraseña_us = Contraseña_us;
    }

    private boolean validarRut(int Run_us, String DV_us) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    
    
    

    
}
