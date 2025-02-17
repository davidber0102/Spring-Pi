package mx.davdev.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// crear un contexto para cargar archivo de configuracion- XML		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Peticion de bens al contenedor Spring 
			SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
			SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
			
			SecretarioEmpleado Manolo = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
			SecretarioEmpleado Juan = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
			
			SecretarioEmpleado Ana = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
			SecretarioEmpleado David = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

			
			// imrpimir el espacion en memoria
			System.out.println(Maria);
			System.out.println(Pedro);
			
			System.out.println(Manolo);
			System.out.println(Juan);
			
			System.out.println(Ana);
			System.out.println(David);
			
			
			/*if(Maria == Pedro ) System.out.println("Apuntan al mismo objeto creado en meoria");
			else System.out.println(" No se trata del mismo objeto creado en meoria"); */
			contexto.close();
	}

}
