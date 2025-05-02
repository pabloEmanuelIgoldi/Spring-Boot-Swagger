package com.swagger.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductoDTO {

	@Schema(description = "ID unico del producto.")
	private Long id;
	@Schema(description = "Nombre del producto.")
	private String nombre;
	@Schema(description = "Precio del producto.")
	private Double precio;
}
