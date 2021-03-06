# kissis.src

Servicios /paciente

|    Método    	|               URL              	|                                                                         Acción                                                                        	|                                               Parámetros                                               	|                 Cuerpo                 	|                             Retorno                            	|
|:------------:	|:------------------------------:	|:-----------------------------------------------------------------------------------------------------------------------------------------------------:	|:------------------------------------------------------------------------------------------------------:	|:--------------------------------------:	|:--------------------------------------------------------------:	|
|      GET     	|           /pacientes           	|                                     Retorna todos los objetos JSON de Paciente (RETRIEVE).   Se trae nombre e ID.                                     	|                                                                                                        	|                                        	|             Colección de objetos de JSON Paciente.             	|
|      GET     	|          pacientes/id          	|                    Obtener los atributos de una instancia de Paciente   en formato JSON (RETRIEVE). No trae las citas del paciente.                   	|                              @PathParam   Id:   Identificador del Paciente                             	|                                        	|     Objeto JSON con detalle de la instancia de   Paciente.     	|
|      GET     	|       pacientes/id/citas       	|    Retorna todos los objetos JSON de Citas específicas   a un Paciente (RETRIEVE). Se trae hora inicio, fin, doctor, especialidad y   consultorio.    	|                              @PathParam   Id:   Identificador del Paciente                             	|                                        	|    Colección de objetos JSON de las Citas de un   Paciente.    	|
|      PUT     	|          /pacientes/id         	|              Actualiza una instancia de la entidad   Paciente (UPDATE). No recibe las citas. Recibe la información propia del   paciente.             	|                              @PathParam   Id:   Identificador del Paciente                             	|         Objeto JSON de Paciente        	|               Objeto JSON de Paciente actualizado              	|
|     POST     	|           /pacientes           	|             Crear una nueva instancia de la entidad   Paciente (CREATE). No recibe las Citas. Recibe la información propia de un Paciente.            	|                                                                                                        	|    Objeto JSON de Paciente a crear.    	|                   Objeto JSON de Book creado                   	|
|    DELETE    	|    /pacientes/id1/citas/id2    	|                         Elimina la asociación de la Cita   identificada con id2 en la colección de Citas del Paciente con id1                         	|    @PathParam   Id1:   Identificador del Paciente y    @PathParam   Id2:   Identificador de la cita    	|                                        	|                                                                	|
Servicios/especialidades


|    Método    |    URI                   |    Acción                                                                                  |    Parámetros                                            |    Cuerpo                                   |    Retorno                                                      |
|--------------|--------------------------|--------------------------------------------------------------------------------------------|----------------------------------------------------------|---------------------------------------------|-----------------------------------------------------------------|
|    GET       |    /especialidades       |    Retorna todos los   objetos JSON de Especialidad                                        |                                                          |                                             |    Colección de   objetos JSON Especialidad.                    |
|    GET       |    /especialidades/id    |    Obtener los   atributos de una instancia de Especialidad en formato JSON (RETRIEVE).    |    @PathParam id: Identificador   del registro           |                                             |    Objeto JSON con   detalle de la instancia de Especialidad    |
|    POST      |    /especialidades       |    Crear una nueva   instancia de la entidad Especialidad (CREATE).                        |                                                          |    Objeto JSON de   Especialidad a crear    |    Objeto JSON de Especialidad   creado                         |
|    PUT       |    /especialidades/id    |    Actualiza una   instancia de la entidad Especialidad (UPDATE).                          |    @PathParam id: Identificador   del registro           |    Objeto JSON de   Especialidad            |    Objeto JSON   de  Especialidad actualizado                   |
|    DELETE    |    /especialidades/id    |    Borra instancia   de Especialidad en el servidor (DELETE).                              |    @PathParam id: Identificador   de la especialidad.    |                                             |                                                                 |

Servicio /consultorio

|     Método     |     URI                |     Acción                                                                                                                                                               |     Parámetros                                      |     Cuerpo                               |     Retorno                                                   |
|----------------|------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------|------------------------------------------|---------------------------------------------------------------|
|    GET         |    /Consultorios       |    Retorna todos los objetos JSON de Consultorios (RETRIEVE).   Trae dentro de cada objeto individual su especialidad asociada.                                          |                                                     |                                          |    Colección de objetos JSON Consultorio.                     |
|    GET         |    /Consultorios/id    |    Obtener los atributos de una instancia de Consultorios en   formato JSON(RETRIEVE). Trae la especialidad asociada al consultorio.                                     |    @PathParam id: Identificador del registro        |                                          |    Objeto JSON con detalle de la instancia de Consultorio.    |
|    POST        |    /Consultorios       |    Crear una nueva instancia de la entidad Consultorio (CREATE).   Recibe una referencia a su especialidad asociada.                                                     |                                                     |    Objeto JSON de Consultorio a crear    |    Objeto JSON de Consultorio creado                          |
|    PUT         |    /Consultorios/id    |    Actualiza una instancia de la entidad Consultorio (UPDATE).  Se puede recibir una nueva especialidad que   reemplazará a la anteriormente asociada al consultorio.    |    @PathParam id: Identificador del registro        |    Objeto JSON de Book                   |    Objeto JSON de Book actualizado                            |
|    DELETE      |    /Consultorios/id    |    Borra instancia de Consultorio  en el servidor (DELETE). NO se borra la   especialidad asociada al consultorio..                                                      |    @PathParam id: Identificador del consultorio.    |                                          |                                                               |

servicios/doctores

|    Método    |    URI                   |    Acción                                                                                                                                                    |    Parámetros                                     |    Cuerpo                              |    Retorno                                             |
|--------------|--------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------|----------------------------------------|--------------------------------------------------------|
|    GET       |    /doctores             |    Retorna todos los   objetos JSON de doctor (RETRIEVE). Trae la información básica de la cita.                                                             |                                                   |                                        |    Colección de objetos   JSON DOCTOR.                 |
|    GET       |    /doctores/id          |    Obtener los   atributos de una instancia de doctor en formato JSON (RETRIEVE). Trae la información   de la cita. Hora de inicio, fin y el consultorio.    |    @PathParam id: Identificador del   registro    |                                        |    Objeto JSON con   detalle de la instancia DOCTOR    |
|    GET       |    /doctores/id/citas    |    Obtener los   atributos de una instancia de CITA en formato JSON (RETRIEVE). Trae la información   de la cita. Hora de inicio, fin y el consultorio.      |    @PathParam id: Identificador del   registro    |                                        |    Objeto JSON con   detalle de la instancia CITA      |
|    POST      |    /doctores             |    Crear una nueva   instancia de la entidad  DOCTOR  (CREATE).  No se agrega con citas, si con especialidad   y en general con sus atributos.               |                                                   |    Objeto JSON de doctor   a crear.    |    Objeto JSON de DOCTOR   creado                      |
|    POST      |    /doctores/id/citas    |    Crear una nueva   instancia de la entidad  CITA (CREATE).                                                                                                 |                                                   |    Objeto JSON de CITA a   crear.      |    Objeto JSON de CITA   creada                        |
|    PUT       |    /doctores/id          |    Actualiza una   instancia de la entidad DOCTOR (UPDATE).  No se modifica con citas, si con   especialidad y en general con sus atributos.                 |    @PathParam id: Identificador del   registro    |    Objeto JSON de DOCTOR               |    Objeto JSON de DOCTOR   actualizado                 |
|    PUT       |    /doctores/id/citas    |    Actualiza una   instancia de la entidad CITA(UPDATE).  Se   modifican horarios de la cita.                                                                |    @PathParam id: Identificador del   registro    |    Objeto JSON de CITA                 |    Objeto JSON de CITA actualizado                     |
|    DELETE    |    /doctores/id          |    Borra instancia de  DOCTOR en el servidor (DELETE). No borra la   cita asociada al doctor.                                                                |    @PathParam id: Identificador del   doctor.     |                                        |                                                        |
|    DELETE    |    /doctores/id/citas    |    Borra instancia de  CITA en el servidor (DELETE).                                                                                                         |    @PathParam id: Identificador del   doctor.     |                                        |                                                        |


Servicios/citas

| Metodo | URL    | Acción                                                                                                                            | Parámetros | Cuerpo | Retorno                         |
|--------|--------|-----------------------------------------------------------------------------------------------------------------------------------|------------|--------|---------------------------------|
| GET    | /citas | Retorna todos los objetos JSON de   Cita que no están reservados. Trae el nombre de los doctores, consultorios, y   especialidad. |            |        | Colección de objetos JSON Cita. |


<p><em>Analisis de logistica, persistencia y relaciones para el desarrollo de la app.Web de la Clinica Santander</em></p>
<p><em>&nbsp;</em></p>
<p>Modulos:(Horarios, citas, doctores, especialidades y consultorios)</p>
<p><strong>&nbsp;</strong></p>
<p><strong>Condiciones de tiempo </strong></p>
<p>&nbsp;</p>
<ol>
<li>El horario de las cita debe ser de 8am a 6pm.</li>
</ol>
<p>&nbsp;</p>
<ol start="2">
<li>Las citas corresponden a dias del calendario de Lunes a Viernes.</li>
</ol>
<p>&nbsp;</p>
<ol start="3">
<li>Cada dia puede tener en total 8 citas que duran 1 hora cada una.</li>
</ol>
<p>&nbsp;</p>
<p><strong>Condiciones de Infraestructura</strong></p>
<p>&nbsp;</p>
<ol>
<li>Los consultorios deben tener asignada una especilidad.</li>
</ol>
<p>&nbsp;</p>
<p><strong>Relaciones de persistencia</strong></p>
<p>&nbsp;</p>
<ol>
<li>Una cita puede tener muchos horarios y un horario una cita. Citas-horarios: @ManyToOne.</li>
<li>Un doctor tiene muchas citas y una cita un medico.Doctor-citas: @ManyToOne</li>
<li>Un consultorio puede tener varias citas y una cita un consultorio. Consultorio-citas: @ManyToOne</li>
<li>Un doctor puede tener a lo menos una especialidad y la especilidad puede tener muchos doctores. Doctor-Especilidad: @ManyToMany</li>
</ol>
<p><strong>&nbsp;</strong></p>
<p><strong>&nbsp;</strong></p>
<p><strong>Agregaci&oacute;n individual</strong></p>
<p><strong>Agregaci&oacute;n compartida</strong></p>
<ol>
<li>Doctor y especialidad.</li>
<li>Consultorio y especialidad.</li>
<li>Cita y horarios.</li>
</ol>
<p><strong>Relaciones inexistentes</strong></p>
<ol>
<li>horarios y especilidades.</li>
<li>Citas y especilidades.</li>
<li>Horarios y consultorio.</li>
</ol>
<p>&nbsp;</p>
<p><strong>Desciciones por tomar</strong></p>
<p>Los horarios ser&aacute;n un atributo de las citas?</p>
<p>Las citas podrian tener un arreglo de 8 horarios?</p>
<p>Como se agregar&aacute;n las citas?</p>
<p>Como se agregar&aacute;n los horario?</p>

