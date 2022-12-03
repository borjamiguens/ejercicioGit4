import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Persona persona = new Persona();
        persona.nombre = "Pepe Pérez";
        persona.edad = 31;
        persona.fechaContratacion = new Date(90, Calendar.FEBRUARY, 1);

        System.out.println("Se ha registrado a " + persona.nombre + " (" + persona.edad + " años; contratado en 19" + persona.fechaContratacion.getYear() + ")");

        Empleado p = new Empleado("Pepe Pérez", new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);

        p.edad = -31; // Ahora acepta edades negativas

        Empleado p2 = new Empleado("Pepe Pérez", -31, new Date(90, Calendar.FEBRUARY, 1));
        System.out.println(p);

        
    }
}