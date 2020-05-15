import java.util.concurrent.ThreadLocalRandom;
class Thread1 extends Thread {
    
    public void run() {
        System.out.println("Negative Number");
    }
}
class Thread2 extends Thread {
    
    public void run() {
        System.out.println("Even Number");
    }
}
class Thread3 extends Thread {
   
    public void run() {
        System.out.println("Odd Number");
    }
}

public class ThreadRandomNo{

	public static void main(String args[]) {
            
            for (int i = 1; i <= 10; i++) {
                int rand_num= ThreadLocalRandom.current().nextInt();


                if(rand_num < 0){

                    Thread1 x = new Thread1();              
                    x.start();

                }

                else if (rand_num % 2 ==0){


                    Thread2 y = new Thread2();
                    y.start();
                }

                else if(rand_num % 2 !=0){

                    Thread3 z = new Thread3();
                    z.start();


                }
                System.out.println("The generated number is: "+rand_num);

            }
        }
    }