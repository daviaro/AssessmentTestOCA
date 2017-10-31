punto 5

What is the output of the following code snippet?
```JAVA
13: System.out.print("a");
14: try {
15: System.out.print("b");
16: throw new IllegalArgumentException();
17: } catch (RuntimeException e) {
18: System.out.print("c");
19: } finally {
20: System.out.print("d");
21: }
22: System.out.print("e");
```

A. abe
B. abce
C. abde
D. abcde
E. The code does not compile.
F. An uncaught exception is thrown.