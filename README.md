# **Spring Doc OpenAPI**

# Índice
### Definición del proyecto
### Prueba
### Spring Doc OpenAPI: Swagger
### Ventajas
### Configuraciones 
### Anotaciones
### Documentacion oficial
### Índice de proyectos Spring Boot

#  **Definición del proyecto**

Demostración de una aplicación que implementa la libreria Spring Doc OpenAPI: Swagger.

#  **Prueba**

Se puede probar esta aplicación:

http://localhost:8080/spring-doc/swagger-ui/index.html

http://localhost:8080/api-docs

#  **Spring Doc OpenAPI: Swagger**

Swagger es una herramienta fundamental en Spring Boot que permite documentar y exponer automáticamente las APIs REST, proporcionando una interfaz interactiva para probar y visualizar los endpoints.


#  **Ventajas**

- Documentación automática de APIs sin necesidad de mantener documentación separada. Que se actualiza con cada cambio.
- Interfaz web interactiva (Swagger UI) para probar endpoints directamente, sin necesidad de herramientas externas.
- Validación en tiempo real de las peticiones.

 
#  **Configuraciones**

Configuraciones de Swagger para el application.properties. 
Aclaracion importante: puede funcionar sin ningun tipo de configuracion.

  ### Para desactivar SpringDoc (por defecto esta activado)
  springdoc.api-docs.enabled=false
  ### Deshabilitar la UI (por defecto esta activada)
  springdoc.swagger-ui.enabled=false

  ### Cambiar la ruta del JSON de OpenAPI (por defecto es /v3/api-docs)
  springdoc.api-docs.path=/api-docs

  ### Cambiar la ruta de la interfaz Swagger UI (por defecto es /swagger-ui.html)
  springdoc.swagger-ui.path=/swagger-ui

  ### Titulo, version y descripcion (alternativa a @OpenAPIDefinition)
  springdoc.info.title=Demo Swagger API
  
  springdoc.info.version=1.0.0
  
  springdoc.info.description=API de ejemplo con SpringDoc

  ### Habilitar autenticacion en Swagger UI
  springdoc.swagger-ui.oauth.client-id=my-client-id
  
  springdoc.swagger-ui.oauth.client-secret=my-secret

#  **Anotaciones**

  Las anotaciones de Swagger documentan automáticamente la funcionalidad de la API.
  
  Listado de anotaciones de Swagger que se usaron en este proyecto:
  
  @Tag: definicion del controller.
  
  @Operation: definicion del endpoint.
  
  @Parameter: describe un parámetro.
  
  @Parameters: agrupa @Parameter.
  
  @ApiResponse: definicion de posibles respuestas HTTP en cada endpoint
  
  @ApiResponses: agrupa @ApiResponse.
  
  @Schema: describe una clase o atributo.
  
  ### Importante:
  - Hay mas opciones de anotaciones, buscar en la documentación oficial.
    
  - @RequestBody (ojo con confundir con la anotacion de Spring)
  

#  **Documentación oficial**


https://springdoc.org/






# Índice de proyectos Spring Boot
- [Response Uniforme](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Response-Wrapper)
- [LogBack](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Logback)
- [Profile](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Profile)
- [Spring Doc](https://github.com/pabloEmanuelIgoldi/Spring-Boot-Swagger)
