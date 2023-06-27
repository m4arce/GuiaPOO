package eggcooperation.entidad;

public class NIF {

	    // Atributos
	    private long numeroDNI;
	    private String letra;
	    
	    

	    public NIF() {
		
		}  
	    

		public NIF(long numeroDNI, String letra) {
			super();
			this.numeroDNI = numeroDNI;
			this.letra = letra;
		}



		// Getters y setters
	    public long getNumeroDNI() {
	        return numeroDNI;
	    }

	    public void setNumeroDNI(long numeroDNI) {
	        this.numeroDNI = numeroDNI;
	    }

	    public String getLetra() {
	        return letra;
	    }

	    public void setLetra(String letra) {
	        this.letra = letra;
	    }
	}



