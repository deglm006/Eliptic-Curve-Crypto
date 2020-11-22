public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point p;
        if(!( obj instanceof Point)){   
            return false;
        }
        else {
            p = (Point) obj;
        }

        if(p.x!=this.x){
            return false;
        }
        else if(p.y!=this.y){
            return false;
        }
        else{
            return true;
        }
    }

    public String toString(){
        return "<"+x+","+y+">";
    }
}
