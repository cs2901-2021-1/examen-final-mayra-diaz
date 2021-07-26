package vacunacion;

import java.util.Scanner;
import java.util.logging.Logger;


public class VacunacionApplication {
    static final Logger logger = Logger.getLogger(VacunacionApplication.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VacunacionHandler handler = new VacunacionHandler();
        Usuarios users = new Usuarios();
        users.agregarUsuario("mayra", "123");
        while (true){
            logger.info("Ingrese su usuario: ");
            var u = scanner.next();
            logger.info("Ingrese su clave");
            var p = scanner.next();
            var auth = users.autentificarse(u, p);
            if (Boolean.TRUE.equals(auth))
                break;
        }

        printOptions();
        var o = scanner.nextInt();
        while (o != -1){
            switch (o){
                case 1:{
                    var a = handler.getAvance();
                    logger.info(String.valueOf(a));
                    break;
                }
                case 2:{
                    var a = handler.getCobertura();
                    logger.info(String.valueOf(a));
                    break;
                }
                case 3:{
                    var a = handler.getCantidadCentros();
                    logger.info(String.valueOf(a));
                    break;
                }
                case 4:{
                    var a = handler.getParcialmenteVacunados();
                    logger.info(String.valueOf(a));
                    break;
                }
                case 5:{
                    var a = handler.getVacunados();
                    logger.info(String.valueOf(a));
                    break;
                }
                case 6:{
                    logger.info("Ingrese el id del centro");
                    var a = scanner.nextInt();
                    handler.darDeBaja(a);
                    break;
                }
                case 7:{
                    logger.info("Ingrese el id del centro");
                    var a = scanner.nextInt();
                    handler.darDeAlta(a);
                    break;
                }
                default:{
                    logger.info("Opcion incorrecta.");
                    break;
                }
            }
            printOptions();
            o = scanner.nextInt();
        }
    }

    public static void printOptions(){
        logger.info("Eliga la opción que más le guste: \n" +
                    "1. Avance\n" +
                    "2. Cobertura\n" +
                    "3. # Centros de vacunación\n" +
                    "4. # Vacunados parcialmente\n" +
                    "5, # Vacunados completamente\n" +
                    "6. Dar de alta un centro de vacunación\n" +
                    "7. Dar de baja un centro de vacunación\n" +
                    "Ingrese -1 para terminar el programa.");
    }

}
