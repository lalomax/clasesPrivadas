public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(48);
        persona.setNombre("Orlando");
        persona.setTelefono(77595073);
        Integer edad = persona.getEdad();
        String nombre = persona.getNombre();
        Integer telefono = persona.getTelefono();
        System.out.println("La edad de la persona es: " + edad);
        System.out.println("El nombre es : " + nombre);
        System.out.println("Su teléfono es: " + telefono);
    }
}

class Persona {
    private Integer edad;
    private String nombre;
    private Integer telefono;

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getTelefono() {
        return this.telefono;
    }
}
