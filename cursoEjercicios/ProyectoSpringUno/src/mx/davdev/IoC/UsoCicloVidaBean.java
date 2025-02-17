package mx.davdev.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// crear un contexto para cargar archivo de configuracion- XML		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// Peticion de bens al contenedor Spring 
		DirectorEmpleado Maria = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		DirectorEmpleado Pedro = contexto.getBean("miDirectorEmpleado", DirectorEmpleado.class);
		
		
		// imrpimir el espacion en memoria
		System.out.println(Maria.getInformes());
		System.out.println(Pedro.getNombreEmpresa());
		
		// cerrar el XML
		contexto.close();
		

	}

}
