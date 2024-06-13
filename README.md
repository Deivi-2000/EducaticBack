
# EducaticBack

Para ejecutar un proyecto, sigue estos pasos:

# Configuración del Entorno de Desarrollo:

1.Asegúrate de tener Java JDK instalado en tu sistema. Puedes descargarlo desde el sitio web oficial de Oracle: https://www.oracle.com/java/technologies/downloads/#java11  o utilizar una distribución OpenJDK.


2.Descargar e Importar el Proyecto:


# Clonar el Repositorio o Descargar en Formato ZIP

Puedes clonar el repositorio o descargarlo en formato ZIP con los siguientes pasos:
 
 
   1.Clonar el Repositorio: Abre la terminal cmd del equipo y especifica directorio donde deseas clonar el repositorio. 
   
    Por ejemplo:   cd C:\Users\Usuario\Documents   


    Por último, clona el repositorio desde GitHub usando el siguiente comando:
    
     git clone https://github.com/Deivi-2000/EducaticBack.git

   2.Descargar en Formato ZIP:
   
     1. Ve a la página del repositorio en GitHub: https://github.com/Deivi-2000/EducaticBack.git 
     
     2. Haz clic en el botón verde "Code".
     
     3. Selecciona "Download ZIP".
     
     4. Extrae el archivo ZIP descargado a una carpeta de tu elección.
     


# Configuración de la Base de Datos 

Si el proyecto de Spring Boot utiliza una base de datos, asegúrate de que tengas la base de datos instalada y configurada correctamente en tu sistema.
Actualiza las configuraciones de conexión a la base de datos en el archivo application.properties o application.yml del proyecto Spring Boot.

# Instalación de la Base de Datos

Este manual te guiará a través del proceso de instalación y configuración de la base de datos para el proyecto. 

## Paso 1: Instalación del Motor de Base de Datos

Primero, necesitas instalar Oracle XE, que es el motor de base de datos que usaremos. Puedes descargarlo desde el siguiente enlace:

[Descargar Oracle XE](https://www.oracle.com/co/database/technologies/xe-downloads.html)

Sigue las instrucciones de instalación proporcionadas en el sitio web de Oracle.

## Paso 2: Instalación de SQL Developer

A continuación, instala SQL Developer, que es la herramienta que utilizaremos para gestionar la base de datos. Descárgalo desde el siguiente enlace:

[Descargar SQL Developer](https://www.oracle.com/database/sqldeveloper/technologies/download/)

Sigue las instrucciones de instalación en el sitio web de Oracle.

## Paso 3: Creación de la Base de Datos

1. Abre SQL Developer.
2. Conéctate a la base de datos usando el usuario `system` y la contraseña `1234`.
3. Crea la base de datos ejecutando el siguiente comando SQL:

```sql
CREATE DATABASE EducaTIC;
```

## Paso 4: Creación de tablas

Después de crear la base de datos, ejecuta los siguientes comandos SQL para crear las tablas necesarias:

```sql
CREATE TABLE carrera (
    id_carrera VARCHAR(5) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE materia (
    id_materia VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(20) NOT NULL,
    descripcion VARCHAR(200),
    fecha_creacion VARCHAR(10) NOT NULL,
    fecha_actualizado VARCHAR(10) NOT NULL,
    ruta_imagen VARCHAR(30)
);

CREATE TABLE modulo (
    id_modulo VARCHAR(15) PRIMARY KEY,
    id_materia VARCHAR(10) NOT NULL,
    CONSTRAINT mod_mat_id_fk FOREIGN KEY (id_materia) REFERENCES materia(id_materia),
    nombre VARCHAR(50) NOT NULL,
    descripcion VARCHAR(1000),
    fecha_creacion VARCHAR(10) NOT NULL,
    fecha_actualizado VARCHAR(10) NOT NULL,
    ruta_imagen VARCHAR(30)
);

CREATE TABLE novedad (
    id_novedad INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    id_materia VARCHAR(10) NOT NULL,
    CONSTRAINT nov_mat_id_fk FOREIGN KEY (id_materia) REFERENCES materia(id_materia),
    fecha_publicacion VARCHAR(10) NOT NULL,
    ruta_imagen VARCHAR(30) NOT NULL
);

CREATE TABLE evaluacion (
    id_evaluacion INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    id_modulo VARCHAR(15) NOT NULL,
    CONSTRAINT eva_mod_id_fk FOREIGN KEY (id_modulo) REFERENCES modulo(id_modulo),
    dificultad VARCHAR(10) NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    contenido VARCHAR(100),
    puntaje_maximo INT NOT NULL,
    fecha_creacion VARCHAR(10) NOT NULL,
    fecha_actualizado VARCHAR(10) NOT NULL
);

CREATE TABLE pregunta (
    id_pregunta INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    id_evaluacion INT NOT NULL,
    CONSTRAINT pre_eva_id_fk FOREIGN KEY (id_evaluacion) REFERENCES evaluacion(id_evaluacion),
    descripcion VARCHAR(1000),
    opcion_uno VARCHAR(100) NOT NULL,
    opcion_dos VARCHAR(100) NOT NULL,
    opcion_tres VARCHAR(100),
    opcion_cuatro VARCHAR(100),
    respuesta_correcta VARCHAR(100) NOT NULL,
    ruta_imagen VARCHAR(30)
);

CREATE TABLE usuario (
    id_usuario VARCHAR(50) PRIMARY KEY,
    id_carrera VARCHAR(5) NOT NULL,
    CONSTRAINT usu_car_fk_id FOREIGN KEY (id_carrera) REFERENCES carrera(id_carrera),
    nombre VARCHAR(50) NOT NULL,
    fecha_registro VARCHAR(10) NOT NULL,
);

CREATE TABLE comentario (
    id_comentario INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    id_usuario VARCHAR(50) NOT NULL,
    CONSTRAINT com_usu_fk_id FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    id_materia VARCHAR(10) NOT NULL,
    CONSTRAINT com_mat_fk_id FOREIGN KEY (id_materia) REFERENCES materia(id_materia),
    texto VARCHAR(100) NOT NULL,
    fecha_creacion VARCHAR(10) NOT NULL,
    hora_creacion VARCHAR(5) NOT NULL
);

CREATE TABLE calificacion (
    id_usuario VARCHAR(50) NOT NULL,
    CONSTRAINT cal_usu_fk_id FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    id_evaluacion INT NOT NULL,
    CONSTRAINT cal_eva_fk_id FOREIGN KEY (id_evaluacion) REFERENCES evaluacion(id_evaluacion),
    nota FLOAT NOT NULL,
    PRIMARY KEY (id_usuario, id_evaluacion)
);

CREATE TABLE matricula (
    id_usuario VARCHAR(50) NOT NULL,
    CONSTRAINT matr_usu_fk_id FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario),
    id_materia VARCHAR(10) NOT NULL,
    CONSTRAINT matr_mat_fk_id FOREIGN KEY (id_materia) REFERENCES materia(id_materia),
    semestre VARCHAR(6),
    estado VARCHAR(10),
    PRIMARY KEY (id_usuario, id_materia)
);

```

## Paso 5: Inserción de Registros

Finalmente, inserta los registros en las tablas creadas. A continuación, se muestra un ejemplo de cómo insertar un registro en la tabla novedad:

```sql
INSERT INTO novedad (id_materia, fecha_publicacion, ruta_imagen) VALUES ('Callint', '26/05/2024', 'novedad_1.jpeg');

```

Repite este proceso para todos los registros necesarios, ajustando las especificaciones según sea necesario.



# Ejecutar la Aplicación:

-Abre el proyecto en tu IDE como IntelliJ IDEA,puedes descargar aquí : https://www.jetbrains.com/es-es/idea/download/?section=windows  (Importa el proyecto descargado en tu IDE como un proyecto de Maven.)

-Espera a que se carguen todas las dependencias.

-Nota: Si no se han descargado las dependencias automáticamente, ve a la opción Maven (icono "m"), desglosa api, haz clic derecho en Dependencies y selecciona la opción Download Sources.

-Busca la clase principal del proyecto, generalmente una clase con la anotación @SpringBootApplication y que suele llamarse ApiApplication.java.

-Ejecuta la aplicación haciendo clic derecho en la clase principal y seleccionando la opción "Run" o "Debug".

# Verificar la Ejecución

Una vez que la aplicación se haya iniciado correctamente, puedes verificar su ejecución abriendo un navegador web y navegando a la URL predeterminada de Spring Boot, que suele ser http://localhost:8080.
