package Lab04.AccessModifier.p2;

import Lab04.AccessModifier.p1.P;

public class P2 {
    public static void main(String[] args) {
        P firstObj = new P();
        firstObj.a = 10;        //public: gọi ở đâu cũng được
        firstObj.b = 10;        /* b c d đều lỗi vì đang sử dụng ở 1 package khác*/
        firstObj.c = 10;
        firstObj.d = 10;
    }
}
