public class App {
    public static void main(String[] args) throws Exception {
        Pontos cb = new Pontos(60973, 72121, 0);
        cb.info();
        Pontos pv = new Pontos(59308, 72160, 0);
        pv.info();
        Pontos aa = new Pontos(57360, 72050, 0);
        aa.info();

        System.out.println("O alcance é "+ Calc.getAlcance(cb,aa));
        System.out.println("A deriva é "+ Calc.getDeriva(cb, pv, aa));
        System.out.println("Fim do Programa");
    }
}
