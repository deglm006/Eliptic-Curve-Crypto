class EllipticCurve{
    int p;
    int a;
    int b;

    EllipticCurve(int a, int b, int p){
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
}