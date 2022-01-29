public class Main {
    public static void main(String[] args) {
        Director director1 = new Director(6);
        director1.countre(new Countre() {
            @Override
            public void back() {
                System.out.println("Отчет за "  + 6 + " готов");
            }
        });
        Director director = new Director(5);
        director.back();
    }
}
