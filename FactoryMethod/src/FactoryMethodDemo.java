
public class FactoryMethodDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ConcreteShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("cricle");
		shape1.draw();

	}

}
