 # Conversión de objetos en java 
![ConversionObjectJava](https://github.com/ezequielmariscal/AlmacenamientoImg/blob/main/06%20-%20ConversionObjetosJava.png)

# Downcasting

##  el downcasting se refiere a la conversión de un objeto de una clase de nivel superior a un objeto de una clase de nivel inferior en la jerarquía de clases.

### Por ejemplo, suponga que tiene una clase Animal y una clase Gato que hereda de la clase Animal. Si crea un objeto Gato y lo asigna a una variable Animal, puede convertir ese objeto Animal de vuelta a un objeto Gato utilizando downcasting.

### Aquí hay un ejemplo de cómo se hace el downcasting en Java:

### Animal animal = new Gato(); // Asignar un objeto Gato a una variable Animal
### Gato gato = (Gato) animal; // Downcasting: convertir animal a un objeto Gato

### En este ejemplo, la variable animal se asigna a un objeto Gato. Luego, el downcasting se realiza utilizando el operador de conversión (Gato) para convertir el objeto de nuevo a un objeto Gato y asignarlo a la variable gato.

### Es importante tener en cuenta que el downcasting solo es seguro si el objeto en cuestión realmente es una instancia de la clase de destino. De lo contrario, se producirá una excepción ClassCastException en tiempo de ejecución.

# Upcasting

## En Java, el upcasting es el proceso de convertir una variable de referencia de una subclase en una variable de referencia de su superclase. Esto es posible porque un objeto de una subclase también es una instancia de su superclase.

### El upcasting se realiza automáticamente por la Máquina Virtual de Java (JVM) cuando se asigna un objeto de una subclase a una variable de referencia de su superclase. Esto significa que puede asignar un objeto de una subclase a una variable de tipo de su superclase sin necesidad de convertirlo explícitamente.

### Por ejemplo, considere la siguiente jerarquía de clases:


### class Animal {
###  void makeSound() {
###    System.out.println("El animal está haciendo un sonido");
###  }
### }


### class Perro extends Animal {
###  void makeSound() {
###    System.out.println("El perro está ladrando");
###  }
### }

### Si crea un objeto de la clase Perro y lo asigna a una variable de tipo Animal, se produce el upcasting:


### Perro perro = new Perro();
### Animal animal = perro; // upcasting


### En este ejemplo, perro es un objeto de la clase Perro y animal es una variable de referencia de la clase Animal.