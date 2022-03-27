# Plan De Pruebas - RetoScreenplaySerenityWeb

| Version  | Comentarios |Fecha|Descripción|Responsable|
|----------|:-------------:|------:|-------:|---------|
| 1.0  | Creacion  |27/03/2021|Creación Plan De pruebas|Jorge Escorcia|

## Descripción
En esta ocasion necesitamos automatizar algunos modulos que se encuentran implementados en la web http://automationpractice.com/index.php, verificaremos que los modulos
sean completamente funcionales

## Alcance de las pruebas
Se realizarán pruebas de caja negra (automatizadas) a las funcionalidades seleccionadas durante la planificación de cada sprint.
Las funcionalidades a ser automatizadas serán seleccionadas utilizando los criterios de la Lista de Chequeo
-	Las pruebas se realizarán en navegadores  
•	Mozilla v54 o superior
•	Chrome v55 o superior
-	Se realizarán pruebas automatizadas
-	Se realizarán las pruebas en computadoras con sistema operativo Windows 10
-	Se probará la visualización del sitio web en un equipo móvil con sistema operativo Android 12

## **HU001 – Registro en la web**
 Yo como usuario del sitio web
 Quiero poder registrarme en la pagina
 Para poder comprar los diferentesproductos
 
 ### Criterios De Aceptación
 - Verificar que el boton de registro se encuente visible en la web
 - Verficar que al presionar el boton de registro se despliegue el formulario para registrarse
 - Verificar que el boton "create an acount" se encuentre visible

## Fuera de Alcance
- Verificar opciones diferentes a las de registro
- Realizar pruebas en navegadore diferentes a Google Chrome y Mozilla Firefox
- No se verificará la visualización de los elementos en diseño responsive.
- No se validarán en un sistema operativo diferente a Windows

## **HU002 – Sing In**
 Yo como usuario del sitio web
 Quiero poder loguearme en la web
 Para poder navegar por los diferentes apartados de la web
 
 ### Criterios De Aceptación
 - Verificar que el boton de Sing in se encuente visible en la web
 - Verficar que al presionar el boton Sing In se despliegue los campos para loguarse
 - Verificar que el boton "Sing In" se encuentre visible

## Fuera de Alcance
- Verificar opciones diferentes a las de  Sing In
- Realizar pruebas en navegadore diferentes a Google Chrome y Mozilla Firefox
- No se verificará la visualización de los elementos en diseño responsive.
- No se validarán en un sistema operativo diferente a Windows

## **HU003 – Contact Us**
 Yo como usuario del sitio web
 Quiero poder contactarme con el servicio al cliente
 Para poder solicitar algunos servicios adicionales
 
 ### Criterios De Aceptación
 - Verificar que el boton de Contact us se encuente visible en la web
 - Verficar que al presionar el Contact us  se desplieguen los campos enviar mensaje a servicio al cliente
 - Verificar que el boton "Contact Us" se encuentre visible

## Fuera de Alcance
- Verificar opciones diferentes a las de  ContacUs
- Realizar pruebas en navegadore diferentes a Google Chrome y Mozilla Firefox
- No se verificará la visualización de los elementos en diseño responsive.
- No se validarán en un sistema operativo diferente a Windows


## Roles Y Responsabilidades
| Roles  | Responsabilidades |
|----------|:-------------:|
| Manager QA | Planificación y monitoreo de las pruebas automatizadas Reporte de Defectos Reporte de progreso de las pruebas||----------|:-------------:|  
|Ingeniero QA de Automatización/ Analista QA|Diseño e implementación de las pruebas. /Ejecución de las pruebas automatizadas. /Reporte de resultados de las pruebas|        |----------|:-------------:|  
|Product Owner/Stakeholders|Toma de decisiones|

## Estrategias de Pruebas
### Todas las ejecuciones de pruebas serán de tipo Manual.

Se iniciará realizando un Smoke Test para determinar que el portal cargue correctamente, también que todos los campos están disponibles para ingresar información y que los botones se encuentren presentes, Para los módulos que se mencionan en el alcance se realizaran pruebas funcionales a nivel de sistema.

## Herramientas de Pruebas
| Herramienta  | Función |
|----------|:-------------:|
|Serenity BDD|es una herramienta que nos facilita hacer BDD centralizando los test de nuestra aplicación|
|Gradle|Creación de la estructura de proyectos y uso e importación de librerías|
|Chromedriver|Crea una instancia del navegador Chrome|


## Requerimientos
- Se debe contar con un ambiente de pruebas en el que se encuentre la versión más reciente de la aplicación
- Contar con la ultima version de la web desplegada

## Infraestructura  Y Datos
- Disponibilidad en la conexión a la red.
- Computador con sistema operativo Windows.

