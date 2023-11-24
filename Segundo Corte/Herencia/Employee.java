
package inhiretance;

public class Employee extends Person{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleo;

    public Employee(int idEmpleado, double sueldo, String nombre) {
        super(nombre);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    Employee(int i, String alex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + "Sueldo: " + this.sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
