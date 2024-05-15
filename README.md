# metodos-n
T5 - E2 - Problemario
# Método de interpolación
El método de interpolación de Lagrange es una técnica utilizada para encontrar un polinomio que pasa a través de un conjunto dado de puntos. 
Es útil cuando se tiene un conjunto de puntos discretos y se desea encontrar una función que pase exactamente por esos puntos.
[![polinomios-de-Lagrange-0-1-2.jpg](https://i.postimg.cc/XJwXhsXP/polinomios-de-Lagrange-0-1-2.jpg)](https://postimg.cc/zbGJHSCw)

[Ejercicio de clase](Ejerciciodeclase.java)

[Ejercicio 1](Ejercicio1.java)

[Ejercicio 2](Ejercicio2.java)

[Ejercicio 3](Ejercicio3.java)

[Ejercicio 4](Ejercicio4.java)

# Método Cuadratico

El concepto básico de la interpolación cuadrática implica seleccionar tres puntos de datos conocidos (x0, y0), (x1, y1) y (x2, y2) y encontrar una parábola que pase exactamente a través de estos tres puntos.

Formula

[![330670660-02296822-fded-4449-b7b3-27c52293188c.png](https://i.postimg.cc/sg3DqFYb/330670660-02296822-fded-4449-b7b3-27c52293188c.png)](https://postimg.cc/BXw0PVwC)

Algoritmo

1: Obtener los puntos conocidos: Identifica los tres puntos conocidos (x0, y0), (x1, y1) y (x2, y2) que utilizarás para realizar la interpolación cuadrática.

2: Calcular el coeficiente cuadrático (𝑎): Utiliza la fórmula para calcular el coeficiente cuadrático 𝑎 utilizando los valores de los puntos conocidos.

3: Calcular el coeficiente lineal (𝑏): Utiliza la fórmula para calcular el coeficiente lineal 𝑏 utilizando 𝑎 y los valores de los puntos conocidos.

4: Calcular el término independiente (𝑐): Utiliza la fórmula para calcular el término independiente 𝑐 utilizando 𝑎, 𝑏 y los valores de los puntos conocidos.

5: Evaluar el polinomio cuadrático: Utiliza el polinomio cuadrático 𝑦 = 𝑎𝑥^2 + 𝑏𝑥 + 𝑐 con los coeficientes calculados para evaluar el valor de 𝑦 en el punto de interés 𝑥.

6: Mostrar el resultado: Muestra el valor interpolado de 𝑦 en el punto 𝑥.

[Ejercicio 1]()

[Ejercicio 2]()

[Ejercicio 3]()

[Ejercicio 4]()











