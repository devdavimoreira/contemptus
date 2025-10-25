public class Calc {
    public static int getAlcance(Pontos p1, Pontos p2){
        return (int) Math.sqrt(
            Math.pow((p1.getX() - p2.getX()),2) +
            Math.pow((p1.getY() - p2.getY()),2)
        );
    }

   public static int getDeriva(Pontos cb, Pontos pv, Pontos aa){
    // Vetores a partir de CB
    int[] v1 = {pv.getX() - cb.getX(), pv.getY() - cb.getY(), pv.getZ() - cb.getZ()};
    int[] v2 = {aa.getX() - cb.getX(), aa.getY() - cb.getY(), aa.getZ() - cb.getZ()};

    // Produto escalar
    double v1xv2 = v1[0]*v2[0] + v1[1]*v2[1] + v1[2]*v2[2];

    // Módulos dos vetores
    double v1mod = Math.sqrt(v1[0]*v1[0] + v1[1]*v1[1] + v1[2]*v1[2]);
    double v2mod = Math.sqrt(v2[0]*v2[0] + v2[1]*v2[1] + v2[2]*v2[2]);

    // Cálculo do cosseno do ângulo
    double cosTheta = v1xv2 / (v1mod * v2mod);

    // Proteção contra erros numéricos
    if(cosTheta > 1.0) cosTheta = 1.0;
    if(cosTheta < -1.0) cosTheta = -1.0;

    // Ângulo em radianos
    double thetaRad = Math.acos(cosTheta);

    // Converter para graus
    double thetaDeg = Math.toDegrees(thetaRad);

    // Converter para milesimos
    double thetaMil = thetaDeg / 0.05625;

    int cross = v1[0]*v2[1] - v1[1]*v2[0];

    if(cross > 0) return (int) (2800 + thetaMil);
    else if(cross < 0) return (int) (2800 - thetaMil);
    else return 2800;   
    }
}
