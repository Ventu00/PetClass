public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int opcionmascota = 0;
        boolean salir =true;
        String mascota = null;

        mascota=menuNombre(mascota);
        Animal animal = new Animal(mascota);
        animal.valores();

        do {inicio(opcionmascota,salir);} while (!salir);

        do {
            opcion=juego(opcion,animal);
            switch (opcion) {
                case 0:
                    System.out.println("¡¡Adios!!");
                    salir=false;
                    break;
                case 1:
                    animal.dormirAnimal();
                    break;

                case 2:
                    animal.jugarAnimal();
                    break;

                case 3:
                    animal.comerAnimal();
                    break;

                case 4:
                    animal.duchaAnimal();
                    break;
            }
            salir=animal.muerteMascota(salir);
        } while (salir);
    }

    private static int juego(int opcion, Animal animal) {
        animal.mostrarDatosMascota();
        menuDos();
        opcion = Teclat.llegirInt();
        validadorDos(opcion);
    return opcion;}

    private static void inicio(int opcionmascota, boolean salir) {
        menuPrimero();
        opcionmascota = Teclat.llegirInt();
        validadorMenu(opcionmascota,salir);
    }

    private static void validadorDos(int opcion) {
        if (opcion != 0 && opcion !=4 && opcion !=3 && opcion !=2 && opcion !=1) {
            System.out.println("Caracter no permitido");
        }

    }

    private static void menuDos() {
        System.out.println("Ingrese su opcion:");
        System.out.println("[1]Dormir [2]Jugar [3]Comer [4]Ducha [0]Salir");
    }

    private static String menuNombre(String mascota) {
        System.out.println("Escribe el nombre de tu mascota: ");
        mascota = Teclat.llegirString();
    return mascota;}

    private static boolean validadorMenu(int opcionmascota, boolean salir) {
        if (opcionmascota != 2 && opcionmascota != 1) {
            System.out.println("Caracter no permitido");
            salir=false;
        }return salir;
    }

    private static void menuPrimero() {
        System.out.println("Quieres crear un perro o un gato?: ");
        System.out.println("[1]Gato");
        System.out.println("[2]Perro");
    }
}