# Excepciones

## ¿Qué son las excepciones?

### Son los errores que se pueden producir en nuestras aplicaciones Java en tiempo de ejecución, es decir, aquellos que se generan cuando estamos ejecutando la aplica-ción y llevan a que esta finalice abruptamente.
### Lo importante es saber que, como programadores, debemos anticiparnos ante estos errores que pueden hacer que nuestra aplicación deje de funcionar.

### Existen muchos tipos de excepciones, y cuando se producen se crea un objeto de una determinada clase dependiendo del tipo de error que se haya producido. Este objeto tendrá la información sobre el error y nos proporcionará métodos para obtener dicha información.

## Jerarquía de Excepciones

![jerarquiaJava](https://github.com/ezequielmariscal/AlmacenamientoImg/blob/main/08%20-%20JerarquiaExcepcionJava.png)

## TryCatch

![tryCatch](https://github.com/ezequielmariscal/AlmacenamientoImg/blob/main/09%20-%20Exception%20trycatch.png)

![lanzarException](https://github.com/ezequielmariscal/AlmacenamientoImg/blob/main/10%20-%20LanzarExcepciones.png)

## Crear nuestras propias excepciones

### Además de lanzar excepciones que nos provee la Api de Java también podemos crear propias:

### Por ejemplo, para el caso anterior lanzamos una excepción del tipo RuntimeException, pero este tipo de excepción es muy general. ¿Qué pasa si necesitamos una excepción más particular?, es decir, una propia para manejar este tipo de errores. Para ello podemos crear nuestras excepciones:

### Lo único que debemos hacer es crear una clase y hacer que herede de la clase Exception.

### Veamos cómo hacerlo.

![ExceptionComplete](https://github.com/ezequielmariscal/AlmacenamientoImg/blob/main/11%20-%20ExcepcionComplete.png)