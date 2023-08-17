package test;

public class Motor {
	int numeroCilindors;
	int registro;
	String tipo;
	
	void cambiarRegistro(int registro) 
	{
		this.registro = registro
	}
	void asignarTipo(String tipo)
	{
		if(tipo=="electrico" || tipo=="gasolina")
		{
			this.tipo = tipo
		}
	}
}
