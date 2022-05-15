# pPráctica 5 - Entornos de desarrollo

## Josep Maria Castell y Rafael Ivorra

## 1er curso de DAW

- El primer paso consistirá en crear un repositorio en GitHub donde alojar la práctica.


![20220515_20h02m37s_grim](https://user-images.githubusercontent.com/91564852/168487273-63b0f02e-4e9f-4e90-930a-126ce54f334b.png)

- Pasamos a implementar la interficie iCalculadora.

```java

package com.entorns.practica5;

/**
 *
 * @author Josep Maria Castell y Rafael Ivorra
 */
public interface iCalculadora {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    float sumar(float a, float b);

    /**
     *
     * @param a
     * @param b
     * @return
     */
    float restar(float a, float b);

    /**
     *
     * @param a
     * @param b
     * @return
     */
    float multiplicar(float a, float b);

    /**
     *
     * @param a
     * @param b
     * @return
     */
    float dividir(float a, float b);
}
```

Y la clase que implementa los métodos de la interficie, Calculadora.

```java
package com.entorns.practica5;

/**
 *
 * @author Josep Maria Castell y Rafael Ivorra
 */
public class Calculadora implements iCalculadora {

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public float sumar(float a, float b) {
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public float restar(float a, float b) {
        return a - b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public float multiplicar(float a, float b) {
        return a * b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public float dividir(float a, float b) {
        return a / b;
    }
}
```

