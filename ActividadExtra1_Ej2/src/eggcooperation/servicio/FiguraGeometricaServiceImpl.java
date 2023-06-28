package eggcooperation.servicio;

import eggcooperation.entidad.FiguraGeometrica;

public class FiguraGeometricaServiceImpl implements FiguraGeometricaService { 

	@Override
	public double calcularArea(FiguraGeometrica figura) {
		return figura.calcularArea();
	}

	@Override
	public double calcularPerimetro(FiguraGeometrica figura) {
		return figura.calcularPerimetro();
	}

}
