
package script;

class Circle{
    double pi = 3.1416;
    
    public double area(double radius){
	double C = pi*radius*radius;
	return C;
    }

    public static void main(String[] args){
        Circle Circulo = new Circle();
        double pizza_area = Circulo.area(12/2);
        double teaching_table_area = Circulo.area(36/2);
        double round_room_area = Circulo.area(11460/2);
        System.out.println(pizza_area);
        System.out.println(teaching_table_area);
        System.out.println(round_room_area);
    }
}