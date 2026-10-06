package Lab04.AccessModifier.p3;

import Lab04.AccessModifier.p1.P;

public class P3 extends P {
    private void test() {
        P firstObj = new P();
        firstObj.a = 10;
        firstObj.b = 10;
        super.c = 10;        //protected:
        firstObj.d = 10;
    }
    public static void main(String[] args) {

    }
}
