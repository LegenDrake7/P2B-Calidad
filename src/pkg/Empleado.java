package pkg;

public class Empleado {
	
	public enum TipoEmpleado{Vendedor, Encargado};
	static float salarioBase = 0;
	static float primas = 0;
	static float extras = 0;
	
	public static float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		if(tipo==TipoEmpleado.Vendedor) {
			salarioBase = 2000;
		} else if(tipo==TipoEmpleado.Encargado) {
			salarioBase = 2500;
		}
		
		if(ventasMes>=1500) {
			primas = 200;
		} else if(ventasMes>=1000) {
			primas = 100;
		} 
		
		extras = horasExtra*30;
		
		return salarioBase + primas + extras;
	}
	
	public static float calculoNominaNeta(float nominaBruta) {
		float retencion= 0;
		
		if(nominaBruta >= 2500) {
			retencion = 0.18f;
		} else if(nominaBruta >= 2100) {
			retencion = 0.15f;
		}
		
		return nominaBruta*(1-retencion);
	}
}
