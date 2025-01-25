/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_state;
import java.util.Observable;

/**
 *
 * @author user
 */
public class Ticket extends Observable{
    private String nome;
    private TicketEstado estado;
    private Pessoa solicitante;

    public Ticket(Pessoa solicitante) {
        this.estado = TicketEstadoAberto.getInstance();
        this.solicitante = solicitante;
    }
    
    public void setEstado(TicketEstado estado) {
        this.estado = estado;
    }
    
    public boolean abrir() {
        return estado.abrir(this);
    }
    
    public boolean tramitar() {
        return estado.tramitar(this);
    }
    
    public boolean cancelar() {
        return estado.cancelar(this);
    }
    
    public boolean resolver() {
        return estado.resolver(this);
    }
    
    public boolean fechar() {   
        return estado.fechar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public TicketEstado getEstado() {
        return estado;
    }    
}
