# Transformando IFs en polimorfismo

Programando en objetos no podemos tener sentencias *ifs* que pregunten por el tipo de un objeto. Si es el caso
refactoricemoslo aplicando los siguientes pasos:

1. Creamos una jerarquía polimórfica con una abstracción por cada condición.
2. Agregamos el método polimórfico en cada abstracción.
3. Llevamos el *cuerpo del if* a cada abstracción.
4. Reemplazar el if por envío de mensaje polimórfico.