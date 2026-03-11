import java.util.*;

class Problem1 {

    HashMap<String,Integer> users = new HashMap<>();
    HashMap<String,Integer> attempts = new HashMap<>();

    public boolean checkAvailability(String username){
        attempts.put(username, attempts.getOrDefault(username,0)+1);
        return !users.containsKey(username);
    }

    public List<String> suggestAlternatives(String username){
        List<String> list = new ArrayList<>();
        for(int i=1;i<=3;i++){
            list.add(username+i);
        }
        list.add(username.replace("_","."));
        return list;
    }

    public String getMostAttempted(){
        String maxUser="";
        int max=0;
        for(Map.Entry<String,Integer> e:attempts.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                maxUser=e.getKey();
            }
        }
        return maxUser;
    }
}