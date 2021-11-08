package co.edu.unbosque.backAnkaraStore.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Productos {

	@Id
	private Long codigo_producto;
	private String nombre_producto;
	private Double precio_venta;
	private Double precio_compra;
	private Double iva_compra;
	private Long nitproveedor;
	
	public Long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
	public Double getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}
	public Double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(Double precio_compra) {
		this.precio_compra = precio_compra;
	}
	public Double getIva_compra() {
		return iva_compra;
	}
	public void setIva_compra(Double iva_compra) {
		this.iva_compra = iva_compra;
	}
	public Long getNitproveedor() {
		return nitproveedor;
	}
	public void setNitproveedor(Long nitproveedor) {
		this.nitproveedor = nitproveedor;
	}
	
}	