public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square(3);

        for (Shape shape : shapes){
            System.out.println(shape);
            if (shape instanceof Square){
                Colorable colorable = new Square();//Square square = new Square();
                System.out.println(colorable.howToColor());//System.out.println(square.howToColor());
            }
        }
    }
}
