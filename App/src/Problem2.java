import java.util.*;

class Problem2 {

    HashMap<String,Integer> stock = new HashMap<>();
    Queue<Integer> waitingList = new LinkedList<>();

    public int checkStock(String product){
        return stock.getOrDefault(product,0);
    }

    public void purchaseItem(String product,int userId){
        int count = stock.getOrDefault(product,0);

        if(count>0){
            stock.put(product,count-1);
            System.out.println("Success purchase, remaining "+(count-1));
        }
        else{
            waitingList.add(userId);
            System.out.println("Added to waiting list");
        }
    }
}