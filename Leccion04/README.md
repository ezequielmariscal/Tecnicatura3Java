# Tecnicatura3Java Leccion04 ... 
## Method overriding sobreescritura
### La sobreescritura de métodos (overriding) es un concepto en programación orientada a objetos en el que una subclase proporciona una implementación específica de un método que ya está definido en su superclase. La subclase reemplaza la implementación del método de la superclase, lo que permite que la subclase proporcione su propia versión del comportamiento del método.

### Para realizar la sobreescritura de un método en Java, la subclase debe declarar el mismo nombre, tipo de retorno y lista de argumentos que el método que se está sobrescribiendo en la superclase. La palabra clave @Override se puede utilizar para indicar que un método está sobrescribiendo otro método en la superclase.

### La sobreescritura de métodos es una forma importante de implementar la herencia en Java. Permite que las subclases proporcionen su propia implementación de un método que se define en la superclase, lo que les permite extender o modificar el comportamiento de la superclase. También permite que las subclases aprovechen la funcionalidad de la superclase, al tiempo que proporcionan su propia lógica adicional en los métodos que sobrescriben.

## Polimorfismo

### En Java, el polimorfismo se refiere a la capacidad de los objetos de una clase derivada (subclase) para ser tratados como objetos de su clase base (superclase). Esto significa que un objeto de una clase derivada puede tomar varias formas o comportarse de diferentes maneras según el contexto en el que se use.

### Existen dos tipos de polimorfismo en Java: el polimorfismo de sobrecarga (overloading) y el polimorfismo de sobrescritura (overriding).

- Polimorfismo de sobrecarga: ocurre cuando se definen varios métodos con el mismo nombre en una clase, pero con diferentes listas de parámetros. En tiempo de compilación, Java elige el método adecuado para invocar en función del número y tipo de argumentos utilizados en la llamada al método.

- Polimorfismo de sobrescritura: ocurre cuando una subclase proporciona su propia implementación de un método que ya está definido en su superclase. El método de la subclase debe tener el mismo nombre, tipo de retorno y lista de argumentos que el método en la superclase. En tiempo de ejecución, Java utiliza la implementación del método de la subclase en lugar del método de la superclase correspondiente.

### El polimorfismo es una característica importante de la programación orientada a objetos, ya que permite escribir código más genérico y flexible. Al utilizar el polimorfismo, se pueden crear clases más especializadas y extender la funcionalidad de una clase base sin tener que modificarla directamente.

##Instance Of

### instanceof es un operador en Java que se utiliza para comprobar si un objeto es una instancia de una clase o de una subclase de esa clase. En otras palabras, el operador instanceof devuelve true si el objeto en cuestión es una instancia de la clase especificada o de cualquier subclase de esa clase, y devuelve false en caso contrario.

