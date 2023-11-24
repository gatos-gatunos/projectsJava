
package polimorfia;
public class Employee extends Person{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
	
    public Employee(double sueldo, String nombre){
        super(nombre);
        this.idEmpleado = ++Employee.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado(){
	return idEmpleado;
    }

    public double getSueldo(){
	return sueldo;
    }

    public void setSueldo(double sueldo){
	this.sueldo = sueldo;
    }
	
    @Override
    public String obtenerDetalle(){
	return super.obtenerDetalle() + "Sueldo: " + this.sueldo;
    }

    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Employee{");
    sb.append("idEmpleado=").append(idEmpleado);
    sb.append(", sueldo=").append(sueldo);
    sb.append(",").append(this.sueldo);
    sb.append('}');
    return sb.toString();
    }
}

