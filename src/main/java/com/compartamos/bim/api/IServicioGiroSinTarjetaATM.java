package com.compartamos.bim.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.compartamos.bim.model.DemoPersona;
import com.compartamos.bim.model.GiroSinTarjetaATMRpt;
import com.compartamos.bim.model.GiroSinTarjetaATMRqt;
import com.compartamos.bim.util.ResponseDto;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

import pe.com.creararequipa.wcfnovatronic.ServicioCanalesRPTRQT;

@Path("/api/giroSinTarjeta/")
@Api(value = "/api/giroSinTarjeta/", description = "Giro de desembolso BIM en ATM sin tarjeta")
public interface IServicioGiroSinTarjetaATM {
	
	@POST
	@Path("/wmGiroSinTarjetaATM/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "wmGiroSinTarjetaATM", notes = "Método que se comunica con el Switch Transaccional de Novatronic para realizar la operacion de giro sin tarjeta ATM")
	@ApiResponses(value = { 
			@ApiResponse(code = 500, message = "Invalid GiroSinTarjetaATMRqt",response = GiroSinTarjetaATMRqt.class),
			@ApiResponse(code = 204, message = "GiroSinTarjetaATMRpt not found",response = GiroSinTarjetaATMRpt.class) 
	})
	public ResponseDto<GiroSinTarjetaATMRpt> wmGiroSinTarjetaATM(GiroSinTarjetaATMRqt peticion);
	
	@POST
	@Path("/wmGiroSinTarjetaATMSimulation/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="wmGiroSinTarjetaATMSimulation", notes="Método que trae información Sumlada")
	@ApiResponses(value = { 
			@ApiResponse(code = 500, message = "Invalid GiroSinTarjetaATMRqt",response = GiroSinTarjetaATMRqt.class),
			@ApiResponse(code = 204, message = "GiroSinTarjetaATMRpt not found",response = GiroSinTarjetaATMRpt.class) 
	})
	public ResponseDto<GiroSinTarjetaATMRpt> wmGiroSinTarjetaATMSimulation(GiroSinTarjetaATMRqt peticion);
	
	/*@POST
	@Path("/wmGetDataATM/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="wmGetDataATM", notes="Método demo que trae información de prueba")
	public String wmGetDataATM(DemoPersona persona);*/
	
	@POST
	@Path("/wmGetDemo/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="wmGetDataATM", notes="Método demo que trae información de prueba")
	public String wmGetDemo();
	
	@POST
	@Path("/wmGetServicioCanalesRPTRQT/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value="wmGetServicioCanalesRPTRQT", notes="Método demo que trae información de prueba")
	public ServicioCanalesRPTRQT wmGetServicioCanalesRPTRQT(GiroSinTarjetaATMRqt peticion);
}
