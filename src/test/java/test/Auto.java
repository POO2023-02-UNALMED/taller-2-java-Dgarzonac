package test;

public class Auto {
	int precio;
	int registro;
	String marca;
	String modelo;
	Motor motor;
	Asiento [] asientos;
	static int cantidadCreados;
	
	int cantidadAsientos(){
		int numAsientos=0;
		
		for(int i = 0 ; i < asientos.length; i++ )
		{
			if(asientos[i] !=null) 
			{
				numAsientos++;
			}
		}
		return numAsientos;
	}
	String verificarIntegridad()
	{
		boolean verificador;
		if (registro.motor==registro && registro.auto==registro) 
		{
			verificador=true;
		}
		for(int i = 0 ; i < asientos.length; i++ )
		{
			if (asientos[i] != null  && asientos[i].registro==registro)
			{
				verificador=true;
			}
		}
		if(verificador)
		{
			System.out.println("Auto original");
		}
		else {
			System.out.println("Las piezas no son originales");
		}
		
	}
}
