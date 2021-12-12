public class Question_3 {

    public static boolean emailValidity(String s) {
        String re = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        return s.matches(re);
    }

    public static void TreadMethod(int[] a, int[] b)throws InterruptedException {
        Runnable task1 = () -> {
            System.out.println("task 1");
        };
        System.out.println("start");
        Thread t = new Thread(task1);
        t.start();
        t.join();
        System.out.println("end");
    }


    public static void main(String[] args)throws InterruptedException {
    //    String email = "05wdw471@qq.com";
    //    System.out.println(emailValidity(email));

    }
}
