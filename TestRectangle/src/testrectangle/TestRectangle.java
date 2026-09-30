public class TestRectangle {

    public static void main(String[] args) {

        Rectangle dikdortgen1 = new Rectangle(4, 40);
        Rectangle dikdortgen2 = new Rectangle(3.5, 35.9);

        System.out.println("Birinci dikdortgen");
        System.out.println("Genislik: " + dikdortgen1.width);
        System.out.println("Yukseklik: " + dikdortgen1.height);
        System.out.println("Alan: " + dikdortgen1.getArea());
        System.out.println("Cevre: " + dikdortgen1.getPerimeter());

        System.out.println();

        System.out.println("Ikinci dikdortgen");
        System.out.println("Genislik: " + dikdortgen2.width);
        System.out.println("Yukseklik: " + dikdortgen2.height);
        System.out.println("Alan: " + dikdortgen2.getArea());
        System.out.println("Cevre: " + dikdortgen2.getPerimeter());
    }
}

class Rectangle {

    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
