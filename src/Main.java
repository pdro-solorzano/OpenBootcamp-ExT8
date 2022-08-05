public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Asinar valores
        persona.setEdad(25);
        persona.setNombre("Ricardo Esquivel");
        persona.setTelefono("1234567890");

        // Mostrar valores clase
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}