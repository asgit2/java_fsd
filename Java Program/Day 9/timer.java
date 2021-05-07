public class timer extends Thread{
    public static void main(String[] args){
        timer t1 = new timer();
        t1.start();
        //Thread.start();
    }
    @Override
    public void run(){
        this.runTimer();
    }
    public void runTimer(){
        int i=1;
        while(i!=0){
            System.out.print(i +"\r" );
            try{
                i++;
                Thread.sleep(1000L);
            }
            catch(InterruptedException ref){}
        }
    }
}