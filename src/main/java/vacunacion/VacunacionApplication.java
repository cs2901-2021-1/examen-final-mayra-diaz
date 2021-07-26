package vacunacion;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;


public class VacunacionApplication {
    VacunacionHandler handler = new VacunacionHandler();
    static final Logger logger = Logger.getLogger(VacunacionApplication.class.getName());

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        VacunacionApplication.printOptions();
        var o = scanner.nextInt();
        while (o != -1){
            switch (o){
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
                case 7:{
                    break;
                }
                default:{
                    logger.info("Opcion incorrecta.");
                }
            }
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
