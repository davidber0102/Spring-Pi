package mx.davdev.pruebaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// crear un contexto para cargar archivo de configuracion- XML		
				//ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// leer la clase de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadoConfig.class);
		// contexto.register(EmpleadoConfig.class);
		// contexto.refresh();
						
						// Peticion de bens al contenedor Spring 
		
		Empleados empleado = contexto.getBean("directorFinanciero",Empleados.class);
		DirectorFinanciero empleado2 = contexto.getBean("directorFinanciero",DirectorFinanciero.class); 
		
		System.out.println(empleado.getInforme());
		System.out.println(empleado.getTareas());
		
		// probar la inyeccion en los campos de clase con el archivo de propouedades
		System.out.println("Email del director: " +empleado2.getEmail());
		System.out.println("Nombre de la Empresa" + empleado2.getNombreEmpresa());
		
			/*	Empleados Maria = contexto.getBean("comercialExperimentado", Empleados.class);
				Empleados Pedro = contexto.getBean("comercialExperimentado", Empleados.class);
						
						
						// imrpimir el espacion en memoria
						System.out.println(Maria);
						System.out.println(Pedro);
						
						if(Maria == Pedro) System.out.println("Estan en la misma memoria encapusalda");
						else System.out.println("Diferente particion de memoria");*/
						
						// cerrar el XML
						contexto.close();

	}

}
