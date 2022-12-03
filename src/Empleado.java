import java.util.Date;

class Empleado {
    String nombre;
    private int edad;
    Date fechaContratacion;

    public Empleado(String nombre, int edad, Date fechaContratacion) {
        @@ -11,6 +11,11 @@ public Empleado(String nombre, int edad, Date fechaContratacion) {
            this.fechaContratacion = fechaContratacion;
        }

        public void setEdad(int edad) {
            if (edad<0) throw new RuntimeException("Un empleado no puede tener edad negativa");
            else this.edad = edad;
        }

        @Override
        public String toString() {
            return "Se ha registrado a " + nombre + " (" + edad + " años; contratado en 19" + fechaContratacion.getYear() + ")";
        }
    }