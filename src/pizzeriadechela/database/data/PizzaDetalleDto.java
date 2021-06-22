/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeriadechela.database.data;

/**
 *
 * @author Anaiza
 */
public class PizzaDetalleDto {
    private Integer _id;
    private Integer _pizzaId;
    private PizzasDto _pizzas;
    private byte _metodoPago;
    private String _tamanio;
    private byte _cantidad;
    private byte _estado;
    
    public PizzaDetalleDto(){
    }

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public Integer getPizzaId() {
        return _pizzaId;
    }

    public void setPizzaId(Integer _pizzaId) {
        this._pizzaId = _pizzaId;
    }

    public PizzasDto getPizzas() {
        return _pizzas;
    }

    public void setPizzas(PizzasDto _pizzas) {
        this._pizzas = _pizzas;
    }
    
    public byte getMetodoPago() {
        return _metodoPago;
    }

    public void setMetodoPago(byte _metodoPago) {
        this._metodoPago = _metodoPago;
    }

    public String getTamanio() {
        return _tamanio;
    }

    public void setTamanio(String _tamanio) {
        this._tamanio = _tamanio;
    }

    public byte getCantidad() {
        return _cantidad;
    }

    public void setCantidad(byte _cantidad) {
        this._cantidad = _cantidad;
    }

    public byte getEstado() {
        return _estado;
    }
    
    public String getEstadoString(){
        switch (_estado){
            case 1:
                return "Delivery";
                
            default:
                return "Entregado";
        }
    }

    public void setEstado(byte _estado) {
        this._estado = _estado;
    }
}
