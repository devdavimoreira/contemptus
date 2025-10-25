public class Pontos {
    private int x, y, z;

    public Pontos(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void info(){
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        System.out.println("z = "+ z);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    
}
