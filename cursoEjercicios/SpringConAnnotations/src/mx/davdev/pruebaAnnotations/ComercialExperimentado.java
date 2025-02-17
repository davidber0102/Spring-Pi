package mx.davdev.pruebaAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ComercialExperimentado implements Empleados {
	
	// Ejecucion de codigo despues de la creacion del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creacion de Bean");
	}
	
	
	// Ejecucion de codigo despues del cerrado del Bean
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutado antes de la destruccion del Bean");
	}
	
	
	@Autowired
	@Qualifier("informeFinancieroTrim2") // bean id que va a utilizar el campo de clase
	private CreacionInformeFinanciero nuevoInforme;
	/*
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	} */
	/*	
	@Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		// return "Vender, vender y vender mas!";
		return nuevoInforme.getInformeFinanciero();
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el Comercial Experimentado";
	}

}
