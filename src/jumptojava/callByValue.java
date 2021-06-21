package jumptojava;

class Updater {
    public void update(callByValue counter) {
        counter.count++;
    }
}

public class callByValue {
    int count = 0;  // 객체변수
    public static void main(String[] args) {        
        callByValue myCounter = new callByValue();        
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}
