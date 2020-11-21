package pe.com.creararequipa.wcfnovatronic.clientsample;

import pe.com.creararequipa.wcfnovatronic.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        CanalesUBAWCF service2 = new CanalesUBAWCF();
	        System.out.println("Create Web Service...");
	        ICanalesUBAWCF port5 = service2.getBasicHttpBindingICanalesUBAWCF();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port5.wmProcesarTramaPinPad(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port5.wmProcesarTramaUBA(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: port5.procesarTramaMonitoreoFraude() is a void method!");
	        System.out.println("Create Web Service...");
	        ICanalesUBAWCF port6 = service2.getBasicHttpBindingICanalesUBAWCF();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port6.wmProcesarTramaPinPad(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port6.wmProcesarTramaUBA(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: port6.procesarTramaMonitoreoFraude() is a void method!");
	        System.out.println("Create Web Service...");
	        ICanalesUBAWCF port7 = service2.getNetTcpBindingICanalesUBAWCF();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port7.wmProcesarTramaPinPad(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port7.wmProcesarTramaUBA(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: port7.procesarTramaMonitoreoFraude() is a void method!");
	        System.out.println("Create Web Service...");
	        ICanalesUBAWCF port8 = service2.getNetTcpBindingICanalesUBAWCF();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port8.wmProcesarTramaPinPad(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port8.wmProcesarTramaUBA(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: port8.procesarTramaMonitoreoFraude() is a void method!");
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
