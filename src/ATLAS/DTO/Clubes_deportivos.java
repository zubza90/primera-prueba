/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATLAS.DTO;

/**
 *
 * @author CASA
 */
public class Clubes_deportivos {
    private String Codigo_cd;
    private String NombreEquipo_cd;
    private String Nfundador_cd;
    private String AñoFundacion_cd;
    private String PaisOrigen_cd;
    private String Lema_cd;
    private String Colores_cd;
    private int ValorSuscripcion;
    
     public Clubes_deportivos(){
        this.Codigo_cd="";
        this.NombreEquipo_cd="";
        this.Nfundador_cd="";
        this.AñoFundacion_cd="";
        this.PaisOrigen_cd="";
        this.Lema_cd="";
        this.Colores_cd="";
        this.ValorSuscripcion=0;   
     }

    public Clubes_deportivos(String Codigo_cd, String NombreEquipo_cd, String Nfundador_cd, String AñoFundacion_cd, String PaisOrigen_cd, String Lema_cd, String Colores_cd, int ValorSuscripcion) {
        this.Codigo_cd = Codigo_cd;
        this.NombreEquipo_cd = NombreEquipo_cd;
        this.Nfundador_cd = Nfundador_cd;
        this.AñoFundacion_cd = AñoFundacion_cd;
        this.PaisOrigen_cd = PaisOrigen_cd;
        this.Lema_cd = Lema_cd;
        this.Colores_cd = Colores_cd;
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public String getCodigo_cd() {
        return Codigo_cd;
    }

    public void setCodigo_cd(String Codigo_cd) {
        this.Codigo_cd = Codigo_cd;
    }

    public String getNombreEquipo_cd() {
        return NombreEquipo_cd;
    }

    public void setNombreEquipo_cd(String NombreEquipo_cd) {
        this.NombreEquipo_cd = NombreEquipo_cd;
    }

    public String getNfundador_cd() {
        return Nfundador_cd;
    }

    public void setNfundador_cd(String Nfundador_cd) {
        this.Nfundador_cd = Nfundador_cd;
    }

    public String getAñoFundacion_cd() {
        return AñoFundacion_cd;
    }

    public void setAñoFundacion_cd(String AñoFundacion_cd) {
        this.AñoFundacion_cd = AñoFundacion_cd;
    }

    public String getPaisOrigen_cd() {
        return PaisOrigen_cd;
    }

    public void setPaisOrigen_cd(String PaisOrigen_cd) {
        this.PaisOrigen_cd = PaisOrigen_cd;
    }

    public String getLema_cd() {
        return Lema_cd;
    }

    public void setLema_cd(String Lema_cd) {
        this.Lema_cd = Lema_cd;
    }

    public String getColores_cd() {
        return Colores_cd;
    }

    public void setColores_cd(String Colores_cd) {
        this.Colores_cd = Colores_cd;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }
     
    
    
    
     
}
