# Sepomex API
Es un proyecto desarrollado con `Java`, `Spring boot` y `Gradle` para exponer mediante servicios 
RestFul la información de los asentamientos de la república mexicana. Esta información es previamente 
cargada mediante un proceso dentro del proyecto [Data Integrator](https://github.com/P1NH34D/data-integrator)

## SepomexCommons
Es el encapsulamiento de los pojos de la API que son comunes para ser poder ser implementados dentro
de los servicios del API como dentro del Data Integrator.

### Build
Con esta instrucción se construye y se instala en el repositorio local de Maven, para poder ser 
utilizada como dependencia dentro de los proyectos.
```
gradle clean build publishToMavenLocal
```

