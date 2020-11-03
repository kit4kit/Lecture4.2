public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 65.5F;
        float height = 1.76F;
        float index = service.calculate(weight, height);
        System.out.printf("Body mass index: %.2f %n", index);
    }
}
