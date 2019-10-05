public class tuyen3 implements Runnable{
    tuyen1 obj;
 
    public tuyen3(tuyen1 obj) {
        this.obj = obj;
    }
 
    public void run() {     
        while(true){            
            obj.showValue();
            if(obj.i == 1000000)
                break;
        }
        System.out.println("Thread B - Finished");
    }
 
}