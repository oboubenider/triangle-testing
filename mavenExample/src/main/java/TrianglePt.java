public class TrianglePt extends Triangle {

    private point _p1;
    private point _p2;
    private point _p3;

    public TrianglePt(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
    }

    public TrianglePt(point p1, point p2, point p3){
        super(0,0,0);
        _p1 = p1;
        _p2 = p2;
        _p3 = p3;
    }
}

