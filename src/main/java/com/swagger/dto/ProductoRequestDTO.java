package com.swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
public class ProductoRequestDTO {

	@Schema(description = "Nombre del producto.")
	private String nombre;
	@Schema(description = "Precio del producto.", example = "123.9")
	private Double precio;
}
