package pe.com.creararequipa.wcfnovatronicqa.clientsample;

import pe.com.creararequipa.wcfnovatronicqa.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        CanalesUBAWCFImplService service3 = new CanalesUBAWCFImplService();
	        System.out.println("Create Web Service...");
	        ICanalesUBAWCF port5 = service3.getCanalesUBAWCFImplPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port5.wmProcesarTramaPinPad(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: port5.procesarTramaMonitoreoFraude() is a void method!");
	        System.out.println("Server said: " + port5.wmProcesarTramaUBA(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        ICanalesUBAWCF port6 = service3.getCanalesUBAWCFImplPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port6.wmProcesarTramaPinPad(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: port6.procesarTramaMonitoreoFraude() is a void method!");
	        System.out.println("Server said: " + port6.wmProcesarTramaUBA(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
