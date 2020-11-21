package com.compartamos.bim.util;

public class Constantes{
	
    private Constantes() {
        throw new IllegalStateException("Class Utility");
    }
	
	public static final String EMPTY_STRING = "";
	public static final String UN_ESPACIO_STRING = " ";
	public static final String FORMATO_YMD_HMS = "yyyy-MM-dd HH:mm:ss";
	public static final String URL_REST_PDP_PONER_PLATA = "url_cashin_api_pdp";
	public static final String URL_REST_PDP_SACAR_PLATA = "url_cashout_api_pdp";
	public static final String URL_REST_PDP_REVERSAL_SACAR_PLATA = "url_reversal_api_pdp";
	
	public static final String URL_REST_SEGURIDAD = "url_rest_seguridad";
	public static final String URL_REST_BIM = "url_rest_bim";
	
	
	public static final String URL_SOAP_MIDDLEWARE = "url_soap_middleware";
	public static final String URL_SOAP_CANALES = "url_soap_canales";
	
	public static final String WSDL_MIDDLEWARE = "WSMiddleWare.asmx?WSDL";
	
	public static final String ERROR_COMUNICACION_HTTP = "Error en la comunicacion con PDP: ";
	public static final String ERROR_PROCESAR_CFIS = "Error al registrar transaccion en Cfis";
	public static final String ERROR_COINCIDENCIA_IDE_INTERNO = "Error Identificador Interno Origen no Coincide Con el Retornado por PDP";
	public static final String ERROR_CONVERSION_XML = "Error Conversion Xml a Object";
	
	
	public static final String PDP_OK = "OK";
	public static final String CODIGO_ESTADO_HTTP_500 = "500";
	
	public static final String FRI = "FRI:";
	public static final String MSISDN = "MSISDN";
	public static final String BARRA = "/";
	public static final String PREFIJO_TEL_PERU = "51";
		
	public static final String Error_critico = "-1";
	public static final String ERROR_ABRIR_FORMULARIO_999 = "999";
	public static final String ERROR_REGRISTRAR_TRAMAS_777 = "777";
	
	public static final String  CODIGO_CASHOUT= "CASHOUT";
	public static final String  CODIGO_ERROR_CASHOUT = "ERROR_CASHOUT";
	
	public static final String Poner_Plata_774 = "000047";
	public static final String Sacar_Plata_774 = "000048";
	public static final String Reversal_774 = "000071";
	public static final String Todos_774 = "000000";
	
	public static final String Pendiente_279 = "P";
	public static final String Completado_279 = "T";
	
	/*para solicitar el token de acceso al api de seguridad*/
    public static final String username_login = "vmamani";
    public static final int idUser_login = 0;
        
    public static final String RECIBIR = "RECIBIR";
    public static final String ENTREGAR = "ENTREGAR";
    
    
    /*
     * Url Web Api Canales
     * */
	public static final String context_fcompartamos = "fcompartamos_ofi";
	public static final String cashInPdp = "/cashin";
	public static final String cashOutPdp = "/atmcashout";
	public static final String reversalPdp = "/reversal";
	public static final String logOperacion = "api/LogOperacion/registrarLog";
	public static final String transaccionesBim = "api/LogOperacion/registrarOperacionEnLineaMonedero";
	public static final String actualizaTransaccionBim = "api/LogOperacion/actualizarOperacionEnLineaMonedero";
	
	public static final String url_switch_api_novatronic = "url_switch_api_novatronic";
	public static final String WSDL_SWITCH_NOVATRONIC = "CanalesUBAWCF.svc?wsdl";
}

