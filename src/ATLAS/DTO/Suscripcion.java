
package ATLAS.DTO;

import java.util.Date;

/**
 *
 * @author CASA
 */
public class Suscripcion {
    private Date FechaInicio_sc;
    private int ValorSuscripcion_sc;
    private String EquiposSuscritos_sc;
    private int AbonoTotal_sc;
    private int NroCorrelativo_sc;
    
    public Suscripcion(){
        this.FechaInicio_sc=new Date();
        this.ValorSuscripcion_sc=0;
        this.EquiposSuscritos_sc="";
        this.AbonoTotal_sc=0;
        this.NroCorrelativo_sc=0;
    }

    public Suscripcion(Date FechaInicio_sc, int ValorSuscripcion_sc, String EquiposSuscritos_sc, int AbonoTotal_sc, int NroCorrelativo_sc) {
        this.FechaInicio_sc = FechaInicio_sc;
        this.ValorSuscripcion_sc = ValorSuscripcion_sc;
        this.EquiposSuscritos_sc = EquiposSuscritos_sc;
        this.AbonoTotal_sc = AbonoTotal_sc;
        this.NroCorrelativo_sc = NroCorrelativo_sc;
    }

    public Date getFechaInicio_sc() {
        return FechaInicio_sc;
    }

    public void setFechaInicio_sc(Date FechaInicio_sc) {
        this.FechaInicio_sc = FechaInicio_sc;
    }

    public int getValorSuscripcion_sc() {
        return ValorSuscripcion_sc;
    }

    public void setValorSuscripcion_sc(int ValorSuscripcion_sc) {
        this.ValorSuscripcion_sc = ValorSuscripcion_sc;
    }

    public String getEquiposSuscritos_sc() {
        return EquiposSuscritos_sc;
    }

    public void setEquiposSuscritos_sc(String EquiposSuscritos_sc) {
        this.EquiposSuscritos_sc = EquiposSuscritos_sc;
    }

    public int getAbonoTotal_sc() {
        return AbonoTotal_sc;
    }

    public void setAbonoTotal_sc(int AbonoTotal_sc) {
        this.AbonoTotal_sc = AbonoTotal_sc;
    }

    public int getNroCorrelativo_sc() {
        return NroCorrelativo_sc;
    }

    public void setNroCorrelativo_sc(int NroCorrelativo_sc) {
        this.NroCorrelativo_sc = NroCorrelativo_sc;
    }
    
    
    
}
