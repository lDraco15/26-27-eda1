# Elecciones
El ejercicio de las elecciones lo planteo de la siguiente forma: array de objetos "candidato" que guarde el número de votos en cada objeto creado.

# Justificación
- Veo un array de objetos de tipo "candidato" que cada uno guarde sus propios votos, al inicializar el array, la cantidad de objetos será el número de candidatos, luego el programa automáticamente asignará dos espacios de memoria para almacenar los votos nulos y las abstenciones en dos objetos de tipo "candidato" para su respectivo conteo. Un problema de esta solución es preguntarse: ¿el voto blanco y el voto nulo son candidatos? 

- Si los votos en blanco y nulo son candidatos el programa funciona correctamente.
- Si los votos en blanco y nulo no son candidatos el programa debe tener su propio contador de votos blancos y nulos ya que son estados fijos a diferencia de los candidatos que exige un nombre.
