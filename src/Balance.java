public class Balance {
    public int left;
    public int right;

    public Balance(){
        this.left=0;
        this.right=0;
    }

    public void addRight(int weight){
        right+= weight;
        System.out.println("Вес на правой чаше: " + right);
    }

    public void addLeft(int weight){
        left+= weight;
        System.out.println("Вес на левой чаше: " + left);
    }

    public String result()
    {
        if (left==right) {
            return "=";
        } else if (right > left) {
            return "R";
        } else {
            return "L";
        }

    }

    public void reset(){
        left=0;
        right=0;
        System.out.println("Счётчики сброшены.");
    }
}