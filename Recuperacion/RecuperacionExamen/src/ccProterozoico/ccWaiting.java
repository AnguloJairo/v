package ccProterozoico;
public class ccWaiting {

    public void ccL(){
        
        String[] ccsigno = {"o0o", "0oo", "oo0", "o0o"};
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r"  + ccsigno[i % 4] + " " + i + "%" ); 

            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
