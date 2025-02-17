package mx.davdev.IoC;

public class SecretarioEmpleado implements Empleados {
	private CreacionInformes informeNuevo;	
	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInformes() {
		return "Informe generado por el Secretario " + informeNuevo.getInformes();
	}
}
