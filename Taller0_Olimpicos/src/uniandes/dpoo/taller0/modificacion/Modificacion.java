package uniandes.dpoo.taller0.modificacion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	
	{
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		Map<String, Integer> Mapa = calc.paisConMasMedallistas();

		for (Integer i : Mapa.values()) { 
			
			int tamano = Mapa.size();
            System.out.println(i); 
            System.out.println(tamano); 
            
        } 
		
	}
}
