public class Main {
    public static void main(String[] args) {

        System.out.println("Exercícios Retorno de Métodos");

        double areaQuadrado = Quadrilateros.area(5);
        double areaRetangulo = Quadrilateros.area(3.8,5.5);
        double areaTrapezio = Quadrilateros.area(3,4,2);
        double areaLosango = Quadrilateros.area(6f, 8f);

        System.out.println("Área do Quadrado: " + areaQuadrado);
        System.out.println("Área do Retângulo: " + areaRetangulo);
        System.out.println("Área do Trapézio: " + areaTrapezio);
        System.out.println("Área do Losango: " + areaLosango);
    }
}