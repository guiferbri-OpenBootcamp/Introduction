public class Main {
    public static void main(String[] args) {
        // Parte 1
        add(10, 20, 30);

        // Parte 2
        Coche miCoche = new Coche();
        miCoche.addDoors();
        System.out.println("Número de puertas: " + miCoche.doors);
    }

    public static void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(result);
    }
}
class Coche {
    public int doors = 0;

    public void addDoors() {
        this.doors++;
    }
}