public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 32;
        cliente.nombre = "Cliente";
        cliente.telefono = 916101010;
        cliente.credito = 1500.75;
        System.out.println("Nombre: " + cliente.nombre + ". Edad: " + cliente.edad + ". Telefono: " + cliente.telefono + ". Credito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 21;
        trabajador.nombre = "Trabajador";
        trabajador.telefono = 916223344;
        trabajador.salario = 2600.5;
        System.out.println("Nombre: " + trabajador.nombre + ". Edad: " + trabajador.edad + ". Telefono: " + trabajador.telefono + ". Salario: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    public double credito;
}

class Trabajador extends Persona {
    public double salario;
}