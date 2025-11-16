Practica Obligatoria tema 2
MANUAL PARA USUARIOS:
HOTEL CIUDAD DE MARTOS

1. Información General del Proyecto
Nombre del proyecto:
 Sistema de Gestión de Hotel – Martos
Autores:
Juan Martínez Estrella
Ángel Miranda Molina
Descripción:
 Este sistema es un software creado en Java para gestionar las operaciones básicas de un hotel ubicado en Martos.
 El programa permite administrar habitaciones, realizar reservas, gestionar check-outs generando facturas, y ofrece un panel de administración para consultar estadísticas y controlar el sistema.

2. Objetivos del Sistema
Facilitar la gestión de habitaciones.


Permitir realizar reservas de manera sencilla y rápida.


Automatizar el proceso de check-out, incluyendo pago y generación de factura.


Ofrecer a los administradores un panel con información clave:


Ingresos totales generados,


Número de reservas finalizadas,


Control del dinero disponible para cambio,


Apagado seguro del software.



3. Funcionalidades Principales
3.1 Menú Principal
Al iniciar el programa, el usuario accede al menú principal, donde puede elegir:

 1. Ver el estado de las habitaciones
El sistema muestra todas las habitaciones indicando:
Si están libres o reservadas


El estado actual de cada una.

 2. Reservar una habitación
El usuario puede seleccionar una habitación libre y registrar su reserva.

Aquí vemos como usuario debe elegir un número de habitación entre el 1-10, si eliges el número 0 se saldrá al menú principal, si eliges otro aparte que no sea del 1-10, dará error.
Luego pedirá escribir su nombre y apellidos seguido del año, el mes y el día que va a reservar la habitación.
3. Hacer el Check-out
En este proceso el sistema solicita:
Días de estancia, el cual si pone una fecha anterior a la de reserva, se le reiniciará hasta que ponga una mayor a la de entrada con los días que ha estado.


Precio total a pagar
Información del cambio y cuántos billetes/monedas se le darán de vuelto


Genera una factura completa, mostrando:


nombre del cliente
numero de confirmacion
Entrada de la habitación
Salida de la habitación
PAX
Noches
Tarifa
Monto o total
Subtotal
IVA
Total

La habitación vuelve a estar disponible automáticamente.

3.2 Menú de Administrador
El acceso requiere:
Usuario : admin


Contraseña: admin
Una vez dentro, se muestra un menú con las siguientes funciones:

✔ 1. Consultar ingresos totales yel número de reservas finalizadas

Muestra cuánto dinero ha generado el hotel mediante reservas y checkouts e indica la cantidad de clientes que han completado su estancia.

✔ 2. Consultar monedas disponibles (caja para cambio)
Permite ver cuántas monedas o billetes están disponibles para dar cambio durante los pagos.

✔ 3. Apagar el software
Cierra el programa de forma segura.
