
public class tuyen2 implements Runnable{
    tuyen1 object;
    int i = 0;
 
    public tuyen2(tuyen1 t1) {
        super();
        this.object = t1;
    }
 
    public void run() {     
        for(int i = 1000; i <= 1000000; i++){
            if(i%1000 == 0){
                object.setValue(i);
            }
        }
        System.out.println("Thread A - Finished");
    }
 
}
