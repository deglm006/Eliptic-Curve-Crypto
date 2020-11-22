public class Main {
    public static void main(String args[]){
        EllipticCurve curve = new EllipticCurve(-3, 3, 5);
        Point P = new Point(-2,-1);
        Point Q = new Point(1,-1);
        System.out.println(curve.add(P,Q));
        System.out.println(curve.add(P,P));
        System.out.println(curve.add(Q,Q));
        
    }
}
