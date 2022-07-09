public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(32);
        persona.setNombre("Pepito");
        persona.setTelefono(916101010);

        System.out.println("Nombre: " + persona.getNombre() + ". Edad: " + persona.getEdad() + ". Telefono: " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}