# Transformando IFs en polimorfismo

Programando en objetos no podemos tener sentencias *ifs* que pregunten por el tipo de un objeto. Si es el caso
refactoricemoslo aplicando los siguientes pasos:

1. Creamos una jerarquía polimórfica con una abstracción por cada condición.
2. Usando el mismo nombre de mensaje repartir el *cuerpo del if* en cada abstracción (usar polimorfismo).
3. Nombrar el mensaje del paso anterior.
4. Nombrar las abtracciones.
5. Reemplazar el if por envío de mensaje polimórfico.