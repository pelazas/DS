CBDe_t@4

QUE SOLUCIÓN ES MEJOR:
ADAPTER:
se puede cambiar de plataforma en tiempo de ejecución
si se añade otro juego solo hay que hacer una nueva clase. Interfaz Platform es independiente
si se añade otra plataforma solo hay que hacer una clase que implemente Platform y llamarlo en el main

TEMPLATE:
cuando se añade un nuevo juego hay que añadir tantas clases como plataformas que extiendan de la clase abstracta del nuevo juego
si tienes muchos juegos y quieres añadir una nueva plataforma, hay que añadirla en todos los juegos