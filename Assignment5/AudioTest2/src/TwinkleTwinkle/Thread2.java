package TwinkleTwinkle;

class Thread2 extends Thread {

    FilePlayer filePlayer = new FilePlayer();

    @Override
    public void run() {
        try {
            // First part of Twinkle Twinkle Little Star
            Thread.sleep(2000); // Wait for thread1 to play first note
            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\re.wav");
            System.out.println("re");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\fa.wav");
            System.out.println("fa");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\la.wav");
            System.out.println("la");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\do-octave.wav");
            System.out.println("do-octave");
            Thread.sleep(4000);

            // Second part of Twinkle Twinkle Little Star
            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\so.wav");
            System.out.println("so");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\so.wav");
            System.out.println("so");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\la.wav");
            System.out.println("la");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\sol.wav");
            System.out.println("sol");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\si.wav");
            System.out.println("si");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\si.wav");
            System.out.println("si");
            Thread.sleep(4000);

            filePlayer.play("C:\\Users\\Coach\\Desktop\\INFO5100\\Assignment5\\AudioTest2\\src\\TwinkleTwinkle\\Sounds\\do.wav");
            System.out.println("do");
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
    }
}
