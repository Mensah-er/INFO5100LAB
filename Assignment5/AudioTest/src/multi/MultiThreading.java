/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multi;

/**
 *
 * @author Ernest Mensah
 */
class Thread1 extends Thread {

    FilePlayer filePlayer = new FilePlayer();

    @Override
    public void run() {

        try {
            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\do.wav");
            System.out.println("do");
            Thread.sleep(4000);
            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\mi.wav");
            System.out.println("mi");
            Thread.sleep(4000);
            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\sol.wav");
             System.out.println("sol");
            Thread.sleep(4000);
            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\si.wav");
            System.out.println("Si");
            Thread.sleep(2000);
             filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\do-octave.wav");
             System.out.println("do-octave");
             Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
       
    }
}

class Thread2 extends Thread {

    FilePlayer filePlayer = new FilePlayer();

    @Override
    public void run() {
         try {
        Thread.sleep(2000);
        filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\re.wav");
        System.out.println("re");
         Thread.sleep(4000);
        filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\fa.wav");
        System.out.println("fa");
        Thread.sleep(4000);
        filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\la.wav");
        System.out.println("la");
        Thread.sleep(4000);
        filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest\\src\\multi\\Sounds\\do-octave.wav");
        System.out.println("do-octave");
        Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        
    }
}

public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }

}