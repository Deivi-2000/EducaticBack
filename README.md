
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

# Ejecutar la Aplicación:

-Abre el proyecto en tu IDE como IntelliJ IDEA,puedes descargar aquí : https://www.jetbrains.com/es-es/idea/download/?section=windows  (Importa el proyecto descargado en tu IDE como un proyecto de Maven.)

-Espera a que se carguen todas las dependencias.

-Nota: Si no se han descargado las dependencias automáticamente, ve a la opción Maven (icono "m"), desglosa api, haz clic derecho en Dependencies y selecciona la opción Download Sources.

-Busca la clase principal del proyecto, generalmente una clase con la anotación @SpringBootApplication y que suele llamarse ApiApplication.java.

-Ejecuta la aplicación haciendo clic derecho en la clase principal y seleccionando la opción "Run" o "Debug".

# Verificar la Ejecución

Una vez que la aplicación se haya iniciado correctamente, puedes verificar su ejecución abriendo un navegador web y navegando a la URL predeterminada de Spring Boot, que suele ser http://localhost:8080.
