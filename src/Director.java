public class Director implements Countre {
    private int Mount;

    @Override
    public void back() {
        System.out.println("Отчет готов через " + Mount);
    }

    public Director(int mount) {
        Mount = mount;
    }
    public void countre(Countre countre){
        countre.back();
    }

    public int getMount() {
        return Mount;
    }
}
