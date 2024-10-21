package mx.davdev.pruebaAnnotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {	
	public DirectorFinanciero(CreacionInformeFinanciero nuevoFinanciero) {
		this.nuevoFinanciero = nuevoFinanciero;
	}

	
	public String getEmail() {
		return email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	@Override
	public String getTareas() {
		return "Gestion y direcion de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		return nuevoFinanciero.getInformeFinanciero();
	}	
	private CreacionInformeFinanciero nuevoFinanciero;
	
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
}
