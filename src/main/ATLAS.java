/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import ATLAS.DTO.Usuario;
import ATLAS.DTO.Clubes_deportivos;
import ATLAS.DTO.Suscripcion;
import java.util.Date;

public class ATLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario U = new Usuario();
        U.setID_us(1);
        U.setNombre_us("Juan");
        U.setSnombre_us("Pablo");
        U.setAppaterno_us("Ortega");
        U.setApmaterno_us("Lopez");
        U.setRun_us(21209298);
        U.setDV_us("3");
        U.setFecha_nac_us("21/01/1998");
        U.setTelefono_us(975232790);
        U.setEmail_us("Jlopez@gmail.com");
        U.setNusuario_us("jlop");
        U.setContraseña_us("lop1234");
        
        Clubes_deportivos AC = new Clubes_deportivos();
        AC.setCodigo_cd("ARH11");
        AC.setNombreEquipo_cd("Arsenal de Coquimbo");
        AC.setNfundador_cd("Jordan Navarro");
        AC.setAñoFundacion_cd("06/06/1986");
        AC.setPaisOrigen_cd("Jordania");
        AC.setLema_cd("Alzad las armas");
        AC.setColores_cd("Negro,Blanco");
        AC.setValorSuscripcion(10500);
        
        System.out.println("ID: "+U.getID_us());
        System.out.println("Nombre Usuario: "+U.getNusuario_us());
        System.out.println("Email: "+U.getEmail_us());
        System.out.println("Contraseña: "+U.getContraseña_us());
        System.out.println("_____________________________________________________");
        System.out.println("Codigo: "+AC.getCodigo_cd());
        System.out.println("Nombre: "+AC.getNombreEquipo_cd());
        System.out.println("Lema: "+AC.getLema_cd());
        System.out.println("Valor suscripcion: $"+AC.getValorSuscripcion());
        System.out.println("Color: "+AC.getColores_cd());
    }
    
    
}
