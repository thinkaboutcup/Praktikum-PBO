
package Pertemuan6;


public class MyThread  extends Thread{
    @Override
    public void run() {
        System.out.println("Thread sedang berjalan!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
    }
}

public class Nomor7 {
    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();
    }
}
