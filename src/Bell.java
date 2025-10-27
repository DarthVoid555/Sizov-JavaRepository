public class Bell {
    public int ding;

    public Bell(){
        this.ding=1;
    }

    public void sound() {
        if (ding==1){
            ding = 0;
            System.out.println("ding");
        } else {
            ding = 1;
            System.out.println("dong");
        }
    }
}