package com.compartamos.bim.util;

public class Mensajes {
	
     private Mensajes() {
        throw new IllegalStateException("Class Utility");
     }
     
     public static final String M_ERROR_TOKEN = "Ocurrio un error al obtener el token: ";
     public static final String M_ERROR_TOKEN_SEGURIDAD_INTERNO = "Error Peticion Token Api Seguridad Compartamos";
	 public static final String _M_ERROR_PARAMETROS_INCOMPLETOS = "Parámetros incompletos";
	 public static final String _M_ERROR_CFIS = "Error al registrar la operación en CFIS.";	 
	 public static final String _M_OPERACION_BIM = "Operación BIM: ";
	 public static final String _M_ERROR_TOKEN_SEGURIDAD_INTERNO = "Error Peticion Token Api Seguridad Compartamos";
	 public static final String _M_SERVICIO_NO_DISPONIBLE ="Servicio no disponible";
	 public static final String _M_ERROR_REGISTRAR_TRAMA_CFIS ="Error al registrar la trama CANDMET";
	 public static final String _M_ERROR_ACTUALIZAR_TRAMA_CFIS ="Error al actualizar la trama CANDMET";
	 public static final String _M_ERROR_OPERACION_INTENTE_NUEVAMENTE ="Error en la operación, intente nuevamente.";
	 
	 public static final String _M_CONTACTECE_CON_INFORMATICA = "EL DINERO DEL CLIENTE. \n Contactarse con el Area de TI y Canales";
	 public static final String _M_SE_REVIRTIO_SACAR_PLATA = "Se revirtio la Operacion Sacar Plata, Vuelva a Intentarlo";
	 public static final String _M_DINERO_CLIENTE_CONTINUAR = "EL DINERO DEL CLIENTE. \n Click en Aceptar para completar la operación en CFIS";
	 
}
