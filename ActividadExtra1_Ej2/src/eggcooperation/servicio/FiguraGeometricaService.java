package eggcooperation.servicio;

import eggcooperation.entidad.FiguraGeometrica;

public interface FiguraGeometricaService {
	
	double calcularArea(FiguraGeometrica figura);
    double calcularPerimetro(FiguraGeometrica figura);

}
