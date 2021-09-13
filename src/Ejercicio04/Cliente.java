package Ejercicio04;

public class Cliente {
	private String apenom;
	private String cuil;
	
	public Cliente(String apenom, String cuil) {
		super();
		this.apenom = apenom;
		this.cuil = cuil;
	}

	public String getApenom() {
		return apenom;
	}
	public void setApenom(String apenom) {
		this.apenom = apenom;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	
	
}
