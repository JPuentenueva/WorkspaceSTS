package psp.pojo;

public class User {
	String nombreUsuario;
	String contrasenya;
	
	public User() {
		super();
	}

	public User(String nombreUsuario, String contrasenya) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.contrasenya = contrasenya;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}
	
	
}
