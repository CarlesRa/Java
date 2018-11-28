# Java
MetodosJava

```java

 /**
     * Metode per omplir un array amb nombres aleatoris.
     * @param vector li pasem un array buit.
     */
    public static void crearArray(int []vector){
        int max=50;
        int min=0;
        for (int i=0; i<vector.length; i++){
            int num=rnd.nextInt(max-min+1)-min;
            vector[i]=num;
        }
    }
    ```
