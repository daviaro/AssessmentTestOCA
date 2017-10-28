# Punto 1
What is the result of the following class? (Choose all that apply)

```JAVA
1: public class _C {
2: private static int $;
3: public static void main(String[] main) {
4:      String a_b;
5:      System.out.print($);
6:      System.out.print(a_b);
7: } }
A. Compiler error on line 1.
B. Compiler error on line 2.
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. 0null
G. nullnull
```
Para este ejercicio tenemos que revisar cual es el resultado. Se presenta
un error en la linea 6 porque la variable local de  tipo String a_b no esta inicializada.

E. La opción E es correcta porque las variables locales requieren asignación antes de hacer referencia a ellas. 
La opción D es incorrecta porque las variables de clase e instancia tienen valores predeterminados y permiten la referencia. a_b se predetermina a un valor nulo. 
Las opciones A, B y C son incorrectas porque los identificadores pueden comenzar con una letra, guión bajo o signo de dólar. 
Las opciones F y G son incorrectas porque el código no se compila. Si a_b era una variable de instancia, el código se compilaría y produciría 0null.
Para obtener más información, consulte el Capítulo 1.
