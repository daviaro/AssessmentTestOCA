# Punto 2

What is the result of the following code?

```JAVA
String s1 = "Java";
String s2 = "Java";
StringBuilder sb1 = new StringBuilder();
sb1.append("Ja").append("va");
System.out.println(s1 == s2);
System.out.println(s1.equals(s2));
System.out.println(sb1.toString() == s1);
System.out.println(sb1.toString().equals(s1));
```
A. true is printed out exactly once.
B. true is printed out exactly twice.
C. true is printed out exactly three times.
D. true is printed out exactly four times.
E. The code does not compile.


Se imprime 3 veces true por lo que la C es la correcta. La primera con el operador == compara el objeto y el valor. como las variables tipo String
provienen de un grupo de cadenas o de un pool de cadenas, cada que se instancia una variable es un mismo objeto y como s1 y s2 tienen el mismo valor 
la primera expresion imprime true. La segunda linea imprime true porque se compara especificamente el valor de la variable s1 y s2, al tener el 
mismo valor imprime true. En la tercera instruccion se tiene un variable sb1 que proviene del objeto StringBuildery la variabla String S1, en este caso
imprime false porque apesar de que ambas variables cuentan con el mismo valor el objeto de donde provienen es distinto. Es decir que sb1 no proviene del
String pool. La cuarta expresion tiene una variabla sb1 con el metodo toString que entrega el valor sb1 como una cadena y lo compara exactamente con el
valor de la cadena s1, razon por la cual se imprime un true.

El libro dice:

C. Los literales de cadena se usan desde el grupo de cadenas. Esto significa que s1 y s2 se refieren al mismo objeto y son iguales. Por lo tanto, 
las primeras dos instrucciones de impresión se imprimen verdaderas. La tercera instrucción de impresión imprime falsa porque toString () usa un método 
para calcular el valor y no es del grupo de cadenas. La instrucción de impresión final vuelve a imprimir verdadera porque equals () mira los valores de 
los objetos String. Para más información, ver Capítulo 3.

