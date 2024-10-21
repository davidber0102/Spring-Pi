package mx.davdev.pruebaAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {
	public static void main(String[] args) {
			// crear un contexto para cargar archivo de configuracion- XML		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// Peticion de bens al contenedor Spring 
		Empleados Maria = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados Pedro = contexto.getBean("comercialExperimentado", Empleados.class);
				
				
				// imrpimir el espacion en memoria
				System.out.println(Maria.getInforme());
				System.out.println(Pedro.getTareas());
				
				// cerrar el XML
				contexto.close();

	}

}
