public class Animal {
    // Atributos
    private int energia;
    private int fatiga;
    private int sueño;
    private int higiene;
    private int peso ;
    private String mascota;
    private int opcionmascota;
    final int MAX = 60;
    final int MIN = 40;

    // Constructores
    public Animal(){

    }

    public Animal(int energia, int fatiga, int sueño, int higiene, int peso, String mascota) {
        this.energia = energia;
        this.fatiga = fatiga;
        this.sueño = sueño;
        this.higiene = higiene;
        this.peso = peso;
        this.mascota = mascota;
    }

    public Animal(String mascota) {
        this.mascota = mascota;
    }

    // Getters y setters
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {this.energia = energia;}

    public int getFatiga() {
        return fatiga;
    }

    public void setFatiga(int fatiga) {
        this.fatiga = fatiga;
    }

    public int getSueño(int i) {
        return sueño;
    }

    public void setSueño(int sueño) {
        this.sueño = sueño;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getMascota() {
        return mascota;
    }

    public void setMascota(String mascota) {
        this.mascota = mascota;
    }

    public void valores() {

        energia = (int) Math.floor(Math.random() * (double) (MAX - MIN + 1) + (double) MIN);
        fatiga = (int) Math.floor(Math.random() * (double) (MAX - MIN + 1) + (double) MIN);
        sueño = (int) Math.floor(Math.random() * (double) (MAX - MIN + 1) + (double) MIN);
        higiene = (int) Math.floor(Math.random() * (double) (MAX - MIN + 1) + (double) MIN);
        peso = (int) Math.floor(Math.random() * (double) (MAX - MIN + 1) + (double) MIN);
    }
    void mostrarDatosMascota(){
        System.out.println("----------------------------\nEstado de:" + mascota + "\nEnergia:" + energia
                + "\nFatiga:" + fatiga + "\nSueño:" + sueño + "\nHigiene:" + higiene + "\nPeso:" + peso + "\n----------------------------");
    }
void dormirAnimal(){
    System.out.println("Zzz...");
    fatiga = fatiga - 15;
    energia = energia + 15;
    if (opcionmascota == 2) {
        sueño = sueño - 25;
    }
    if (opcionmascota == 1) {
        sueño = sueño - 20;
    }
}
void jugarAnimal(){
    System.out.println("jugando...");
    fatiga = fatiga - 10;
    energia = energia - 10;
    higiene = higiene - 15;
    peso = peso - 10;
    if (opcionmascota == 2) {
        sueño = sueño - 10;
    }
    if (opcionmascota == 1) {
        sueño = sueño + 15;
    }
}

void comerAnimal(){
    System.out.println("Ñam ñam...");
    energia = energia + 10;
    higiene = higiene + 10;
    peso = peso + 10;
    if (opcionmascota == 2) {
        sueño = sueño + 15;
    }
    if (opcionmascota == 1) {
        sueño = sueño + 10;
    }
}
void duchaAnimal(){
    System.out.println("En la ducha...");
    higiene = higiene + 20;
    if (opcionmascota == 2) {
        sueño = sueño - 15;
    }
    if (opcionmascota == 1) {
        sueño = sueño + 10;
    }
}
public  boolean muerteMascota(boolean salir){
    if (peso >= 100 || peso <= 0 || energia >= 100 || energia <= 0 || fatiga >= 100 || fatiga <= 0 || sueño >= 100 ||
            sueño <= 0 || higiene >= 100 || higiene <= 0) {
        System.out.println(mascota + " MURIÓ");
        mostrarDatosMascota();
        salir=false;
    }
    return salir;
}
}
