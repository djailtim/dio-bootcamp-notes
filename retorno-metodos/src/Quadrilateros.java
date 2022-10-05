public class Quadrilateros {
    public static double area(double lado) {
        double areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    public static double area(double lado1, double lado2) {
        double areaRetangulo = lado1 * lado2;
        return areaRetangulo;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {
        double areaTrapezio = ((baseMaior + baseMenor) * altura) /2;
        return areaTrapezio;
    }

    public static float area(float diagonal1, float diagonal2) {
        float areaLosango = (diagonal1 * diagonal2) /2;
        return areaLosango;
    }
}
