package duo_xian_chen;

public class Question_4 {
    public static void AlternatePrint(int[] a,int[] b){
        final Object o = new Object();
        new Thread(() -> {
            synchronized (o) {
                for (int k : a) {
                    try {
                        System.out.println(k);
                        o.wait();
                        o.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (o) {
                for (int k : b) {
                    System.out.println(k);
                    o.notify();
                    try {
                        o.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }).start();
    }

    public static void main(String[] args) {

        int aa[]={1,3,5,7,9};
        int bb[]={2,4,6,8,10};
        AlternatePrint(aa,bb);
    }
}
