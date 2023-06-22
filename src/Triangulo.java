class Triangulo extends Figura {
    private double l1;
    private double l2;
    private double l3;

    @Override
    public double calcularPerimetro() {
        double l1 = calcularDistancia(0, 1);
        double l2 = calcularDistancia(0, 2);
        double l3 = calcularDistancia(1, 2);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        return l1 + l2 + l3;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        double area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
        return area;
    }
}
