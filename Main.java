import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Declaramos las variables que vamos a necesitar
        Scanner sc = new Scanner(System.in);
        long diasRestantes;
        int eleccionHabitacion = 0, numCOnfirm = 2000, diaEntrada, mesEntrada, anioEntrada, diasDelMes = 0, reservas = 0;
        int tarifa = 0, billetes500euros = 0, billetes200euros = 0, billetes100euros = 0, billetes50euros = 0, billetes20euros = 0, billetes10euros = 0, billetes5euros = 0, monedas2euros = 0, monedas1euro = 0, monedas50cts = 0, monedas20cts = 0, monedas10cts = 0, monedas5cts = 0, monedas2cts = 0, monedas1cts = 0;
        int stock500 = 100, stock200 = 100, stock100 = 100, stock50 = 100, stock20 = 100, stock10 = 100, stock5 = 100, stock2 = 100, stock1 = 100, stock50cts = 100, stock20cts = 100, stock10cts = 100, stock5cts = 100, stock2cts = 100, stock1cts = 100;
        double ingresosTotales = 0, subtotal = 0, monto = 0, precioHDoble = 0, cambio = 0, dineroIntroducido = 0, iva = 0, total = 0;
        String opcion, opcionMenuAdministrador = "", nombreAdmin = "admin", contraseniaAdmin = "admin";
        String nombreClienteH1 = "", nombreClienteH2 = "", nombreClienteH3 = "", nombreClienteH4 = "", nombreClienteH5 = "", nombreClienteH6 = "", nombreClienteH7 = "", nombreClienteH8 = "", nombreClienteH9 = "", nombreClienteH10 = "";
        boolean habitacion1 = false, habitacion2 = false, habitacion3 = false, habitacion4 = false, habitacion5 = false, habitacion6 = false, habitacion7 = false, habitacion8 = false, habitacion9 = false, habitacion10 = false;
        boolean reserva = false, bisiesto = false, usuarioCorrecto = false, contraseniaCorrecta = false, diasCorrectos = false;
        LocalDate fechaHabitacion1 = null,fechaHabitacion2 = null, fechaHabitacion3 = null, fechaHabitacion4 = null, fechaHabitacion5 = null, fechaHabitacion6 = null, fechaHabitacion7 = null, fechaHabitacion8 = null, fechaHabitacion9 = null, fechaHabitacion10 = null;

        //Pintamos el menú para pedir los datos al usuario

        System.out.println("""
                 _   _       _       _   _____ _           _           _  ______      ___  ___           _           \s
                | | | |     | |     | | /  __ (_)         | |         | | |  _  \\     |  \\/  |          | |          \s
                | |_| | ___ | |_ ___| | | /  \\/_ _   _  __| | __ _  __| | | | | |___  | .  . | __ _ _ __| |_ ___  ___\s
                |  _  |/ _ \\| __/ _ \\ | | |   | | | | |/ _` |/ _` |/ _` | | | | / _ \\ | |\\/| |/ _` | '__| __/ _ \\/ __|
                | | | | (_) | ||  __/ | | \\__/\\ | |_| | (_| | (_| | (_| | | |/ /  __/ | |  | | (_| | |  | || (_) \\__ \\
                \\_| |_/\\___/ \\__\\___|_|  \\____/_|\\__,_|\\__,_|\\__,_|\\__,_| |___/ \\___| \\_|  |_/\\__,_|_|   \\__\\___/|___/""");

        //Ponemos para que el usuario pulse una tecla para que pueda avanzar
        System.out.print("Pulsa una tecla para continuar: ");
        sc.nextLine();


        //Pintamos el menú para que el usuario pueda elegir bien la opción. El menu lo hago dependiendo de la eleccion del usuario
        do {
            for (int i = 0; i < 100; i++) {//Bucle para limpiar pantalla
                System.out.println();
            }
            System.out.print("""
                Menú principal
                a) Ver el estado de las habitaciones
                b) Reservar una habitación
                c) Realizar el checkout de una habitación
                d) Menú de administrador\s""");
            opcion = sc.nextLine();

            //Hacemos el menú con un swicth
            switch (opcion){
                case "a", "A":
                    for (int i = 0; i < 100; i++) {//Bucle para limpiar pantalla
                        System.out.println();
                    }



                        //Pedimos al usuario si quiere ver el estado de las habitaciones
                        System.out.print("Has accedido a ver el estado de las habitaciones.\n");

                        if (!habitacion1) System.out.println("La habitación 1 está libre");
                        else System.out.println("La habitación 1 está ocupada");
                        if (!habitacion2) System.out.println("La habitación 2 está libre");
                        else System.out.println("La habitación 2 está ocupada");
                        if (!habitacion3) System.out.println("La habitación 3 está libre");
                        else System.out.println("La habitación 3 está ocupada");
                        if (!habitacion4) System.out.println("La habitación 4 está libre");
                        else System.out.println("La habitación 4 está ocupada");
                        if (!habitacion5) System.out.println("La habitación 5 está libre");
                        else System.out.println("La habitación 5 está ocupada");
                        if (!habitacion6) System.out.println("La habitación 6 está libre");
                        else System.out.println("La habitación 6 está ocupada");
                        if (!habitacion7) System.out.println("La habitación 7 está libre");
                        else System.out.println("La habitación 7 está ocupada");
                        if (!habitacion8) System.out.println("La habitación 8 está libre");
                        else System.out.println("La habitación 8 está ocupada");
                        if (!habitacion9) System.out.println("La habitación 9 está libre");
                        else System.out.println("La habitación 9 está ocupada");
                        if (!habitacion10) System.out.println("La habitación 10 está libre");
                        else System.out.println("La habitación 10 está ocupada");
                    System.out.print("Pulsa una tecla para continuar: ");
                    sc.nextLine();

                    break;
                case "b", "B":
                    for (int i = 0; i < 100; i++) {//Bucle para limpiar pantalla
                        System.out.println();
                    }
                    System.out.println("Has accedido a reservar una habitación");
                    System.out.print("Dime que habitación quieres reservar 1...10 teniendo en cuenta que la 9 y la 10 son individuales, o pulsa 0 para salir: ");
                    eleccionHabitacion = Integer.parseInt(sc.nextLine());



                    switch (eleccionHabitacion){
                        case 0:
                            System.out.println("Saliendo del estado de las habitaciones...");
                            break;
                        case 1:
                            reserva = false;
                            if (habitacion1) System.out.println("La habitación 1 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH1 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion1 = true;
                                reservas++;
                                fechaHabitacion1 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();

                            break;
                        case 2:
                            reserva = false;
                            if (habitacion2) System.out.println("La habitación 2 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH2 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion2 = true;
                                reservas++;
                                fechaHabitacion2 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 3:
                            reserva = false;
                            if (habitacion3) System.out.println("La habitación 3 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH3 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion3 = true;
                                reservas++;
                                fechaHabitacion3 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 4:
                            reserva = false;
                            if (habitacion4) System.out.println("La habitación 4 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos  : ");
                                    nombreClienteH4 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion4 = true;
                                reservas++;
                                fechaHabitacion4 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 5:
                            reserva = false;
                            if (habitacion5) System.out.println("La habitación 5 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH5 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion5 = true;
                                reservas++;
                                fechaHabitacion5 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 6:
                            reserva = false;
                            if (habitacion6) System.out.println("La habitación 6 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH6 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion6 = true;
                                reservas++;
                                fechaHabitacion6 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 7:
                            reserva = false;
                            if (habitacion7) System.out.println("La habitación 7 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos  : ");
                                    nombreClienteH7 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion7 = true;
                                reservas++;
                                fechaHabitacion7 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 8:
                            reserva = false;
                            if (habitacion8) System.out.println("La habitación 8 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH8 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion8 = true;
                                reservas++;
                                fechaHabitacion8 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 9:
                            reserva = false;
                            if (habitacion9) System.out.println("La habitación 9 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH9 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion9 = true;
                                reservas++;
                                fechaHabitacion9 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        case 10:
                            reserva = false;
                            if (habitacion10) System.out.println("La habitación 10 esta ocupada en estos momentos...");
                            else{
                                do {
                                    System.out.print("Escriba su nombre completo y apellidos por favor: ");
                                    nombreClienteH10 = sc.nextLine();

                                    System.out.print("Dime el año de entrada: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de entrada: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de entrada: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        reserva = true;
                                        System.out.printf("Has reservado la habitacion %d en el dia %d, el mes %d y el año %d \n", eleccionHabitacion, diaEntrada, mesEntrada, anioEntrada);
                                        //Aquí reiniciamos contadores de billetes y monedas antes de cualquier pago
                                        billetes500euros = 0;
                                        billetes200euros = 0;
                                        billetes100euros = 0;
                                        billetes50euros = 0;
                                        billetes20euros = 0;
                                        billetes10euros = 0;
                                        billetes5euros = 0;
                                        monedas2euros = 0;
                                        monedas1euro = 0;
                                        monedas50cts = 0;
                                        monedas20cts = 0;
                                        monedas10cts = 0;
                                        monedas5cts = 0;
                                        monedas2cts = 0;
                                        monedas1cts = 0;
                                    }
                                }while (!reserva);

                                habitacion10 = true;
                                reservas++;
                                fechaHabitacion10 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                            }
                            System.out.print("Pulsa una tecla para continuar: ");
                            sc.nextLine();
                            break;
                        default:
                            for (int i = 0; i < 100; i++) {//Bucle para limpiar pantalla
                                System.out.println();
                            }
                            System.out.print("Lo siento el numero de la habitación es incorrecto por favor vuelve a introducirlo: ");
                            sc.nextLine();
                            break;
                    }
                    break;
                case "c", "C":
                    for (int i = 0; i < 100; i++) { //Bucle para limpiar pantalla
                        System.out.println();
                    }
                    System.out.println("Has accedido ha realizar el checkout de una habitación");

                    //Ahora vamos a preguntar por el número de habitación ya que si elige una que no ha sido reservada, no le dejará realizarlo
                    System.out.print("Introduce el número de habitación que has reservado: ");
                    eleccionHabitacion = Integer.parseInt(sc.nextLine());

                    switch (eleccionHabitacion){
                        case 1:
                            if (!habitacion1) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {
                                        LocalDate fechaSalidaHabitacion1 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion1.isBefore(fechaSalidaHabitacion1) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion1 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion1, fechaSalidaHabitacion1);

                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 1 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                                if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                                else {
                                                    cambio = dineroIntroducido - total;
                                                    System.out.printf("El cambio es de %.2f\n", cambio);

                                                    if (cambio >= 500){
                                                        do {
                                                            if (stock500 > 0) {
                                                                cambio -= 500;
                                                                billetes500euros++;
                                                                stock500--;
                                                            } else break;
                                                        } while (cambio >= 500);
                                                    }
                                                    if (cambio >= 200){
                                                        do {
                                                            if (stock200 > 0) {
                                                                cambio -= 200;
                                                                billetes200euros++;
                                                                stock200--;
                                                            } else break;
                                                        } while (cambio >= 200);
                                                    }
                                                    if (cambio >= 100){
                                                        do {
                                                            if (stock100 > 0) {
                                                                cambio -= 100;
                                                                billetes100euros++;
                                                                stock100--;
                                                            } else break;
                                                        } while (cambio >= 100);
                                                    }
                                                    if (cambio >= 50){
                                                        do {
                                                            if (stock50 > 0) {
                                                                cambio -= 50;
                                                                billetes50euros++;
                                                                stock50--;
                                                            } else break;
                                                        } while (cambio >= 50);
                                                    }
                                                    if (cambio >= 20){
                                                        do {
                                                            if (stock20 > 0) {
                                                                cambio -= 20;
                                                                billetes20euros++;
                                                                stock20--;
                                                            } else break;
                                                        } while (cambio >= 20);
                                                    }
                                                    if (cambio >= 10){
                                                        do {
                                                            if (stock10 > 0) {
                                                                cambio -= 10;
                                                                billetes10euros++;
                                                                stock10--;
                                                            } else break;
                                                        } while (cambio >= 10);
                                                    }
                                                    if (cambio >= 5){
                                                        do {
                                                            if (stock5 > 0) {
                                                                cambio -= 5;
                                                                billetes5euros++;
                                                                stock5--;
                                                            } else break;
                                                        } while (cambio >= 5);
                                                    }
                                                    if (cambio >= 2) {
                                                        do {
                                                            if (stock2 > 0) {
                                                                cambio -= 2;
                                                                monedas2euros++;
                                                                stock2--;
                                                            } else break;
                                                        } while (cambio >= 2);
                                                    }

                                                    if (cambio >= 1) {
                                                        do {
                                                            if (stock1 > 0) {
                                                                cambio -= 1;
                                                                monedas1euro++;
                                                                stock1--;
                                                            } else break;
                                                        } while (cambio >= 1);
                                                    }

                                                    if (cambio >= 0.5) {
                                                        do {
                                                            if (stock50cts > 0) {
                                                                cambio -= 0.5;
                                                                monedas50cts++;
                                                                stock50cts--;
                                                            } else break;
                                                        } while (cambio >= 0.5);
                                                    }

                                                    if (cambio >= 0.2) {
                                                        do {
                                                            if (stock20cts > 0) {
                                                                cambio -= 0.2;
                                                                monedas20cts++;
                                                                stock20cts--;
                                                            } else break;
                                                        } while (cambio >= 0.2);
                                                    }

                                                    if (cambio >= 0.1) {
                                                        do {
                                                            if (stock10cts > 0) {
                                                                cambio -= 0.1;
                                                                monedas10cts++;
                                                                stock10cts--;
                                                            } else break;
                                                        } while (cambio >= 0.1);
                                                    }

                                                    if (cambio >= 0.05) {
                                                        do {
                                                            if (stock5cts > 0) {
                                                                cambio -= 0.05;
                                                                monedas5cts++;
                                                                stock5cts--;
                                                            } else break;
                                                        } while (cambio >= 0.05);
                                                    }

                                                    if (cambio >= 0.02) {
                                                        do {
                                                            if (stock2cts > 0) {
                                                                cambio -= 0.02;
                                                                monedas2cts++;
                                                                stock2cts--;
                                                            } else break;
                                                        } while (cambio >= 0.02);
                                                    }

                                                    if (cambio >= 0.01) {
                                                        do {
                                                            if (stock1cts > 0) {
                                                                cambio -= 0.01;
                                                                monedas1cts++;
                                                                stock1cts--;
                                                            } else break;
                                                        } while (cambio >= 0.01);
                                                    }
                                                    System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                                }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH1, numCOnfirm, fechaHabitacion1, fechaSalidaHabitacion1, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;
                        case 2:
                            if (!habitacion2) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes invalido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion2 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion2.isBefore(fechaSalidaHabitacion2) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion2 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion2, fechaSalidaHabitacion2);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 2 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH2, numCOnfirm, fechaHabitacion2, fechaSalidaHabitacion2, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;
                        case 3:
                            if (!habitacion3) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion3 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion3.isBefore(fechaSalidaHabitacion3) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion3 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion3, fechaSalidaHabitacion3);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitacion 3 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH3, numCOnfirm, fechaHabitacion3, fechaSalidaHabitacion3, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }
                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;
                        case 4:
                            if (!habitacion4) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion4 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion4.isBefore(fechaSalidaHabitacion4) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion4 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion4, fechaSalidaHabitacion4);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 4 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH4, numCOnfirm, fechaHabitacion4, fechaSalidaHabitacion4, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;
                        case 5:
                            if (!habitacion5) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion5 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion5.isBefore(fechaSalidaHabitacion5) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion5 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion5, fechaSalidaHabitacion5);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 5 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH5, numCOnfirm, fechaHabitacion5, fechaSalidaHabitacion5, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;
                        case 6:
                            if (!habitacion6) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion6 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion6.isBefore(fechaSalidaHabitacion6) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion6 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion6, fechaSalidaHabitacion6);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 6 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH6, numCOnfirm, fechaHabitacion6, fechaSalidaHabitacion6, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;
                        case 7:
                            if (!habitacion7) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion7 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion7.isBefore(fechaSalidaHabitacion7) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion7 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion7, fechaSalidaHabitacion7);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 7 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH7, numCOnfirm, fechaHabitacion7, fechaSalidaHabitacion7, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }
                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;
                        case 8:
                            if (!habitacion8) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion8 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion8.isBefore(fechaSalidaHabitacion8) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion8 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion8, fechaSalidaHabitacion8);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 60;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 8 es doble por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 2 huéspedes
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH8, numCOnfirm, fechaHabitacion8, fechaSalidaHabitacion8, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;

                        case 9:
                            if (!habitacion9) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion9 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion9.isBefore(fechaSalidaHabitacion9) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion9 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion9, fechaSalidaHabitacion9);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 45;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 9 es individual por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 1 huésped
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH9, numCOnfirm, fechaHabitacion9, fechaSalidaHabitacion9, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;

                        case 10:
                            if (!habitacion10) System.out.println("Lo siento la habitación que has seleccionado no esta reservada y no se puede hacer el checkout...");
                            else {
                                do {
                                    System.out.print("Dime el año de salida: ");
                                    anioEntrada = Integer.parseInt(sc.nextLine());
                                    if ((anioEntrada % 4 == 0 && anioEntrada % 100 != 0) || (anioEntrada % 400 == 0)) {
                                        bisiesto = true;
                                    }
                                    System.out.print("Dime el mes de salida: ");
                                    mesEntrada = Integer.parseInt(sc.nextLine());
                                    switch (mesEntrada){
                                        case 1,3,5,7,8,10,12:
                                            diasDelMes = 31;
                                            break;
                                        case 4,6,9,11:
                                            diasDelMes = 30;
                                            break;
                                        case 2:
                                            if (bisiesto) diasDelMes = 29;
                                            else diasDelMes = 28;
                                            break;
                                        default:
                                            System.out.println("Mes inválido introduce un número entre el 1 y el 12...");
                                            break;
                                    }
                                    System.out.print("Dime el día de salida: ");
                                    diaEntrada = Integer.parseInt(sc.nextLine());
                                    if (diaEntrada < 1 || diaEntrada > diasDelMes) System.out.println("El dia introducido es incorrecto");
                                    else {

                                        LocalDate fechaSalidaHabitacion10 = LocalDate.of(anioEntrada, mesEntrada, diaEntrada);
                                        if (fechaHabitacion10.isBefore(fechaSalidaHabitacion10) ){
                                            System.out.println("La fecha es válida");
                                            diasCorrectos = true;
                                            habitacion1 = false;
                                            diasRestantes = ChronoUnit.DAYS.between(fechaHabitacion10, fechaSalidaHabitacion10);
                                            System.out.println("Los dias restantes son " + diasRestantes);
                                            tarifa = 45;
                                            precioHDoble = tarifa * diasRestantes;
                                            monto = precioHDoble;
                                            subtotal = monto;
                                            iva = subtotal * 0.21;
                                            total = subtotal + iva;
                                            System.out.println("La habitación 10 es individual por lo cual debes pagar: "+ (total) + " €");

                                            System.out.print("Por favor introduzca el dinero con el que va a pagar: ");
                                            dineroIntroducido = Double.parseDouble(sc.nextLine());

                                            if (dineroIntroducido < precioHDoble) System.out.println("No puede pagar menos de lo que cuesta");
                                            else {
                                                cambio = dineroIntroducido - total;
                                                System.out.printf("El cambio es de %.2f\n", cambio);

                                                if (cambio >= 500){
                                                    do {
                                                        if (stock500 > 0) {
                                                            cambio -= 500;
                                                            billetes500euros++;
                                                            stock500--;
                                                        } else break;
                                                    } while (cambio >= 500);
                                                }
                                                if (cambio >= 200){
                                                    do {
                                                        if (stock200 > 0) {
                                                            cambio -= 200;
                                                            billetes200euros++;
                                                            stock200--;
                                                        } else break;
                                                    } while (cambio >= 200);
                                                }
                                                if (cambio >= 100){
                                                    do {
                                                        if (stock100 > 0) {
                                                            cambio -= 100;
                                                            billetes100euros++;
                                                            stock100--;
                                                        } else break;
                                                    } while (cambio >= 100);
                                                }
                                                if (cambio >= 50){
                                                    do {
                                                        if (stock50 > 0) {
                                                            cambio -= 50;
                                                            billetes50euros++;
                                                            stock50--;
                                                        } else break;
                                                    } while (cambio >= 50);
                                                }
                                                if (cambio >= 20){
                                                    do {
                                                        if (stock20 > 0) {
                                                            cambio -= 20;
                                                            billetes20euros++;
                                                            stock20--;
                                                        } else break;
                                                    } while (cambio >= 20);
                                                }
                                                if (cambio >= 10){
                                                    do {
                                                        if (stock10 > 0) {
                                                            cambio -= 10;
                                                            billetes10euros++;
                                                            stock10--;
                                                        } else break;
                                                    } while (cambio >= 10);
                                                }
                                                if (cambio >= 5){
                                                    do {
                                                        if (stock5 > 0) {
                                                            cambio -= 5;
                                                            billetes5euros++;
                                                            stock5--;
                                                        } else break;
                                                    } while (cambio >= 5);
                                                }
                                                if (cambio >= 2) {
                                                    do {
                                                        if (stock2 > 0) {
                                                            cambio -= 2;
                                                            monedas2euros++;
                                                            stock2--;
                                                        } else break;
                                                    } while (cambio >= 2);
                                                }

                                                if (cambio >= 1) {
                                                    do {
                                                        if (stock1 > 0) {
                                                            cambio -= 1;
                                                            monedas1euro++;
                                                            stock1--;
                                                        } else break;
                                                    } while (cambio >= 1);
                                                }

                                                if (cambio >= 0.5) {
                                                    do {
                                                        if (stock50cts > 0) {
                                                            cambio -= 0.5;
                                                            monedas50cts++;
                                                            stock50cts--;
                                                        } else break;
                                                    } while (cambio >= 0.5);
                                                }

                                                if (cambio >= 0.2) {
                                                    do {
                                                        if (stock20cts > 0) {
                                                            cambio -= 0.2;
                                                            monedas20cts++;
                                                            stock20cts--;
                                                        } else break;
                                                    } while (cambio >= 0.2);
                                                }

                                                if (cambio >= 0.1) {
                                                    do {
                                                        if (stock10cts > 0) {
                                                            cambio -= 0.1;
                                                            monedas10cts++;
                                                            stock10cts--;
                                                        } else break;
                                                    } while (cambio >= 0.1);
                                                }

                                                if (cambio >= 0.05) {
                                                    do {
                                                        if (stock5cts > 0) {
                                                            cambio -= 0.05;
                                                            monedas5cts++;
                                                            stock5cts--;
                                                        } else break;
                                                    } while (cambio >= 0.05);
                                                }

                                                if (cambio >= 0.02) {
                                                    do {
                                                        if (stock2cts > 0) {
                                                            cambio -= 0.02;
                                                            monedas2cts++;
                                                            stock2cts--;
                                                        } else break;
                                                    } while (cambio >= 0.02);
                                                }

                                                if (cambio >= 0.01) {
                                                    do {
                                                        if (stock1cts > 0) {
                                                            cambio -= 0.01;
                                                            monedas1cts++;
                                                            stock1cts--;
                                                        } else break;
                                                    } while (cambio >= 0.01);
                                                }
                                                System.out.printf("""
                                                                   Le vamos a dar de cambio:
                                                                   De billete/s %d billetes de 500€, %d de 200€, %d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€
                                                                   De moneda/s %d monedas de 2€, %d de 1€, %d de 50cts, %d de 20cts, %d de 10cts, %d de 5cts, %d de 2cts, %d de 1cts
                                                                   """, billetes500euros, billetes200euros, billetes100euros, billetes50euros, billetes20euros, billetes10euros, billetes5euros, monedas2euros, monedas1euro, monedas50cts, monedas20cts, monedas10cts, monedas5cts, monedas2cts, monedas1cts);
                                            }

                                            System.out.println("Factura:");
                                            System.out.printf("""
                                                    -Descripción: %s
                                                    -Confir: %d
                                                    -Entrada: %s
                                                    -Salida: %s
                                                    -Pax: 1 huésped
                                                    -Noches: %d
                                                    -Tarifa: %d
                                                    -Monto: %.2f
                                                    \n
                                                    -Subtotal: %.2f
                                                    -IVA: %.2f
                                                    -TOTAL: %.2f \n""", nombreClienteH10, numCOnfirm, fechaHabitacion10, fechaSalidaHabitacion10, diasRestantes, tarifa, monto, subtotal, iva, total);
                                            numCOnfirm++;
                                            ingresosTotales += total;
                                        }
                                        else System.out.println("La fecha es inválida, la fecha de salida no puede ser inferior a la de entrada");
                                    }

                                    System.out.print("Pulse una tecla para continuar: ");
                                    sc.nextLine();
                                }while (!diasCorrectos);
                            }
                            break;

                        default:
                            System.out.println("EL número introducido es incorrecto");
                            break;

                    }
                    break;
                case "d", "D":
                    //Hacemos el login
                    do {
                        System.out.print("Introduce el nombre de usuario: "); //Nombre de usuario
                        nombreAdmin = sc.nextLine();
                        if (!nombreAdmin.equals("admin")) System.out.println("El nombre de usuario es incorrecto");
                        else {
                            usuarioCorrecto = true;
                            System.out.print("Introduce la contraseña: "); //Contraseña
                            contraseniaAdmin = sc.nextLine();
                            if (!contraseniaAdmin.equals("admin")) System.out.println("La contraseña es incorrecta");
                            else {
                                System.out.println("Entrando al sistema...");
                                contraseniaCorrecta = true;
                            }
                        }
                    } while (!usuarioCorrecto || !contraseniaCorrecta);

                    //Pintamos el menu del administrador
                    System.out.println("""
                            I. Consultar los ingresos totales y el número de reservas finalizadas
                            II. Consultar las monedas restantes para el cambio
                            III. Apagar el Software""");
                    //Pedimos la opcion del usuario
                    opcionMenuAdministrador = sc.nextLine();

                    switch (opcionMenuAdministrador){
                        case "I", "i":
                            System.out.println("Consultar los ingresos totales y el número de reservas finalizadas");
                            System.out.println("El número de reservas es " + reservas);
                            System.out.printf("El número total de ingresos es de %.2f \n", ingresosTotales);
                            System.out.println("Pulsa una tecla para continuar...");
                            sc.nextLine();
                            break;
                        case "II", "ii":
                            System.out.println("Consultar las monedas restantes para el cambio");
                            System.out.printf("El total de billetes que quedan son %d billetes de 500€, %d de 200€, €d de 100€, %d de 50€, %d de 20€, %d de 10€, %d de 5€ \n", stock500, stock200, stock100, stock50, stock20, stock10, stock5);
                            System.out.printf("Quedan un total de %d monedas de 2 euros, %d de 1 euro \n", stock2, stock1);
                            System.out.printf("Quedan un total de %d monedas de 50 céntimos, %d de 20 céntimos, %d de 10 céntimos, %d de 5 céntimos, %d de 2 céntimos, %d de 1 céntimo \n", stock50cts, stock20cts, stock10cts, stock5cts, stock2cts, stock1cts);
                            System.out.println("Pulsa una tecla para continuar...");
                            sc.nextLine();
                            break;
                        case "III", "iii":
                            System.out.println("Saliendo del sistema...");
                            break;
                        default:
                            System.out.println("Lo siento la opción elegida no es la correcta...");
                            break;
                    }
                    break;
                default:
                    for (int i = 0; i < 100; i++) {
                        System.out.println();
                    }
                    System.out.println("Lo siento la letra introducida no es correcta. Por favor vuelva a repetirla");
                    break;
            }
        }while (!opcionMenuAdministrador.equalsIgnoreCase("III"));
    }
}