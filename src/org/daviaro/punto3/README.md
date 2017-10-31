# Punto 3

What is the output of the following code? (Choose all that apply)

```JAVA
1: interface HasTail { int getTailLength(); }
2: abstract class Puma implements HasTail {
3:  protected int getTailLength() {return 4;}
4: }
5: public class Cougar extends Puma {
6: public static void main(String[] args) {
7:   Puma puma = new Puma();
8:   System.out.println(puma.getTailLength());
9:   }
10:
11:  public int getTailLength(int length) {return 2;}
12: }
```

A. 2
B. 4
C. The code will not compile because of line 3.
D. The code will not compile because of line 5.
E. The code will not compile because of line 7.
F. The code will not compile because of line 11.
G. The output cannot be determined from the code provided.

En la linea 3 se presenta un problema porque se va a realizar la implmentacion de un 
metodo que en la interfaz se definio y por defecto los metodos que se definen en una interfaz sus
modificadores de acceso son publicos.
Al tener problemas con la clase Puma no se puede ejecutar la linea 7 que llama al constructor de la clase puma.

Lo que dice el  libro:

C, D, E. Primero, se supone que el método getTailLength () en la interfaz HasTail es público, ya que es parte de una interfaz. 
La implementación del método en la línea 3 es, por lo tanto, una anulación inválida, ya que protected es un modificador de 
acceso más restrictivo que public, por lo que la opción C es correcta. A continuación, la clase Cougar implementa una versión 
sobrecargada de getTailLength (), pero como la declaración en la clase primaria Puma no es válida, debe implementar una versión 
pública del método. Como no es así, la declaración de Puma no es válida, por lo que la opción D es correcta. La opción E es incorrecta, 
ya que Puma está marcado como abstracto y no se puede crear una instancia. El método sobrecargado en la línea 11 se declara correctamente, 
por lo que la opción F no es correcta. Finalmente, como el código tiene múltiples errores de compilación, las opciones A, B y G pueden eliminarse. 
Para obtener más información, consulte el Capítulo 5.
