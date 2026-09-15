import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> usuarios = new ArrayList<>();

        System.out.println("¡Hola!");

        while(true){

            System.out.println("Inserte 1 para ingresar a la gestion de usuarios");
            System.out.println("Inserte 2 para ver el estado del sistema");
            System.out.println("Inserte 0 para salir");

            int seleccion = sc.nextInt();
            if (seleccion == 0){break;}
            if (seleccion < 0 || seleccion > 2){System.out.println("No existe esta opcion escogida");}

            switch (seleccion){
                case 1:
                    gestionDeUsuarios(sc, usuarios);

                    break;

                case 2:
                    System.out.println("El sistema funciona correctamente");
                    System.out.println();
                    break;

            }
        }


    }

    public void gestionDeUsuarios(Scanner sc, ArrayList usuarios){
        System.out.println("Seleccione 1 para ver los usuarios");
        System.out.println("Selecciona 2 para agregar un nuevo usuario");

        int seleccion2 = sc.nextInt();
        if (seleccion2 < 1 || seleccion2 > 2){System.out.println("No existe esta opcion escogida");}
        sc.nextLine();

        if (seleccion2 == 1){
            System.out.println("Los usuarios guardados son: " + usuarios);
            System.out.println();
        }

        else if (seleccion2 == 2){
            System.out.println("Escriba el nombre del usuario");
            String nombre = sc.nextLine();
            usuarios.add(nombre);
        }

    }
}
