class EllipticCurve{
    int p;
    int a;
    int b;

    EllipticCurve(int a, int b, int p){
        if((4*(int)Math.pow(a, 3)+27*(int)Math.pow(b, 3))%p==0){
            System.err.println("Invalid curve");
        }
        this.a = a;
        this.b = b;
        this.p = p;
    }

    Point add(Point P, Point Q){
        int s;
        if(P.equals(Q)){
            s = ((3*(int)Math.pow(P.x,2) + a)/(2*P.y)) % p;
        }
        else{
            s = ((Q.y-P.y)/(Q.x-P.x)) % p;
        }
        int Rx = ( (int)Math.pow(s, 2)-P.x-Q.x ) % p;
        int Ry = (s*(P.x - Rx)-P.y) % p;
        Point R = new Point(Rx,Ry);
        return R;
    }

    boolean inCurve(Point P){
        return Math.pow(P.y, 2) % p == (Math.pow(P.x,3)+a*P.x+b) % p;
    }
}