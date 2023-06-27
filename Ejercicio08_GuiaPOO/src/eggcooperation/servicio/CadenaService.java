package eggcooperation.servicio;

import eggcooperation.entidad.Cadena;

public class CadenaService {
	
	public int contarVocales(Cadena cadena) {
        int contador = 0;
        String frase = cadena.getFrase().toLowerCase();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public String invertirFrase(Cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());
        return sb.reverse().toString();
    }

    public int vecesRepetido(Cadena cadena, String letra) {
        String frase = cadena.getFrase().toLowerCase();
        char caracter = letra.toLowerCase().charAt(0);
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public boolean compararLongitud(Cadena cadena, String frase) {
        int longitudFrase = frase.length();
        return cadena.getLongitud() == longitudFrase;
    }

    public String unirFrases(Cadena cadena, String frase) {
        return cadena.getFrase() + " " + frase;
    }

    public String reemplazarLetra(Cadena cadena, String letra, String reemplazo) {
        String frase = cadena.getFrase();
        return frase.replace(letra, reemplazo);
    }

    public boolean contieneLetra(Cadena cadena, String letra) {
        String frase = cadena.getFrase().toLowerCase();
        char caracter = letra.toLowerCase().charAt(0);
        return frase.contains(String.valueOf(caracter));
    }

}
