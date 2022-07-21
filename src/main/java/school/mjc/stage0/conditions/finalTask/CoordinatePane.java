package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (0<x && 0<y){
            System.out.println("first");
        }
        if (0>x && 0<y){
            System.out.println("second");
        }
        if (0>x && 0>y){
            System.out.println("third");
        }
        if (0<x && 0>y){
            System.out.println("fourth");
        }
        if (0==x && 0==y){
            System.out.println("zero");
        }
    }
}
