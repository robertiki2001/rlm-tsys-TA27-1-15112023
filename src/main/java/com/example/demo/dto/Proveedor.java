package com.example.demo.dto;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table (name = "proveedores")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id_proveedor")
	private List<Suministra> suministra;
	
	  public Proveedor() {
	    }
	  
	    public Proveedor(String id, String nombre, List<Suministra> suministra) {
	    	this.id = id;
	        this.nombre = nombre;	 
	        this.suministra = suministra;
	    }

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
		public List<Suministra> getSuminstra() {
			return suministra;
		}

		public void setSuminstra(List<Suministra> suminstra) {
			this.suministra = suminstra;
		}

	   
}