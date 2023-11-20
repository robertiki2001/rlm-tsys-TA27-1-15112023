package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table (name = "suministra")
public class Suministra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_pieza")
	private Pieza pieza;

	@ManyToOne
	@JoinColumn(name="id_proveedor")
	private Proveedor proveedor;
	
	private int precio;
	
	  public Suministra() {
	    }
	  
	    public Suministra(int id, Pieza pieza, Proveedor proveedor, int precio) {
	    	this.id = id;
	        this.pieza = pieza;
	        this.proveedor = proveedor;
	        this.precio = precio;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Pieza getPieza() {
			return pieza;
		}

		public void setPieza(Pieza pieza) {
			this.pieza = pieza;
		}

		public Proveedor getProveedor() {
			return proveedor;
		}

		public void setProveedor(Proveedor proveedor) {
			this.proveedor = proveedor;
		}

		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

	    
	   
}