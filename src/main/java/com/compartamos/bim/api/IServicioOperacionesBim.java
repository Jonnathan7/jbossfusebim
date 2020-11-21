package com.compartamos.bim.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.compartamos.bim.model.OperacionRpt;
import com.compartamos.bim.util.ResponseDto;
import com.compartamos.bim.model.PonerPlataRqt;
import com.compartamos.bim.model.SacarPlataRqt;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


@Path("/api/operacionesBim/")
@Api(value = "/api/operacionesBim/", description = "Comunicacion con api Pdp")

public interface IServicioOperacionesBim {


	@POST
	@Path("/ponerPlata/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "ponerPlata", notes = "Metodo que se comunica con Pdp para realizar la operacion de poner plata")
	@ApiResponses(value = { 
			@ApiResponse(code = 500, message = "Invalid PonerPlataRqt",response = PonerPlataRqt.class),
			@ApiResponse(code = 204, message = "PonerPlataRpt not found",response = OperacionRpt.class) 
	})
	public ResponseDto<OperacionRpt> ponerPlata(@HeaderParam("Authorization") String token, PonerPlataRqt peticion);
	
	@POST
	@Path("/sacarPlata/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "sacarPlata", notes = "Metodo que se comunica con Pdp para realizar la operacion de sacar plata")
	@ApiResponses(value = { 
			@ApiResponse(code = 500, message = "Invalid SacarPlataRqt",response = SacarPlataRqt.class),
			@ApiResponse(code = 204, message = "SacarPlataRpt not found",response = OperacionRpt.class) 
	})
	public ResponseDto<OperacionRpt> sacarPlata(@HeaderParam("Authorization") String token, SacarPlataRqt peticion);


}
