
package polimorfia;

public class Person{

    protected String Nombre;
    private char genero;
    private int edad;
    private String direccion;
	
    public Person(){
	
    }

    public Person(String Nombre){
	this.Nombre = Nombre;
    }

    public Person(String Nombre, char genero, int edad, String direccion){
	this.Nombre = Nombre;
	this.genero = genero;
	this.edad = edad;
	this.direccion = direccion;
    }
	
    public String obtenerDetalle(){
	return "Nombre: %s Edad: %d ".formatted(this.Nombre, this.edad);
    }

    public String getNombre(){
	return Nombre;
    }

    public void setNombre(String Nombre){
	this.Nombre = Nombre;
    }

    public char getGenero(){
	return genero;
    }

    public void setGenero(char genero){
	this.genero = genero;
    }

    public int getEdad(){
	return edad;
    }

    public void setEdad(int edad){
	this.edad = edad;
    }
	
    public String getDireccion(){
	return direccion;
    }

    public void setDireccion(String direccion){
	this.direccion = direccion;
    }

    @Override
    public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("Persona{");
	sb.append("Nombre=").append(Nombre);
	sb.append(", genero=").append(genero);
	sb.append(", edad=").append(edad);
	sb.append(", direccion=").append(direccion);
	sb.append('}');
	return sb.toString();
	}
}