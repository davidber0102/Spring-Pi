package mx.davdev.IoC;

public class JefeEmpleado  implements Empleados {
	private CreacionInformes informeNuevo;	
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de seccion ";
	}

	@Override
	public String getInformes() {
		return "Informe presentado por Jefe de Area, con adaptacion y agreaciones al informe General" + informeNuevo.getInformes();
	}

}
