public class VirtualThreadDemo {
    public static void main(String args[]){
        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        //Normal Threading
        /*for(int j=0;j<10000;j++){
            Thread t = new Thread(r);
            t.setName(""+j);
            t.start();
            System.out.println("Main Thread Number : "+t.getName());
        }*/
        //Virtual Threads
        for(int k=0;k<1000000;k++){
            Thread virtualThread = Thread.ofVirtual().unstarted(r);
            virtualThread.setName("virtual : "+k);
            virtualThread.start();
            System.out.println("thread : "+virtualThread.getName());
        }
    }
}
