package mx.davdev.IoC;

public class DirectorEmpleado implements Empleados {
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

	// creacion de campo tipo creacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	// Creacion de constructor que inyecta la dependencia 
	public DirectorEmpleado( CreacionInformes informe) {
		this.informeNuevo = informe;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInformes();
	}
		// METODO INIT. EJECUTAR TAREAS ANTES DE QUE EL BEAN ESTE DISPONIBLE
	public void metodoInicial() {
		System.out.println("Metodo init: Aqui irian las tareas a ejecutar antes de que el bean este listo");
	}
	
	
		// METODO DESTROY EJECUTAR TAREAS DESPUES DE QUE EL BEAN HAYA SIDO UTILIZADO
	public void metodoFinal() {
		System.out.println("Metodo destroy: Aqui irian las tareas a ejecutar despues de que el bean sea usado");
	}
}
