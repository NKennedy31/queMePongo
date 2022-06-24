package dominio;

import java.util.Objects;

public class Prenda {
	TipoPrenda tipo;
	Tela tela;
	Color primario;
	
	/*
	public Prenda(TipoPrenda tipo, Material material, Color primario) {
		this.tipo = Objects.requireNonNull(tipo, "tipo de prenda es obligatorio");
		this.tela = Objects.requireNonNull(tela, "material es obligatorio");
		this.primario = Objects.requireNonNull(primario, "color primario es obligatorio");
	}*/

	public Categoria getCategoria(TipoPrenda tipo) {
		return tipo.categoria;
	}

	  //TODO agregar setter para darle forma a la prenda en borrador

	  void setTipo(TipoPrenda tipo){
	    this.tipo = tipo;
	  }

	  public void setColor(Color color) {
	    this.primario = color;
	  }

	  public void setTela(Tela tela) {
	    this.tela = tela;
	  }
}//