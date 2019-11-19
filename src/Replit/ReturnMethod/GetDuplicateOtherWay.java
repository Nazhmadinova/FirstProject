package Replit.ReturnMethod;

public class GetDuplicateOtherWay {
    public static int get(String ... r){
        String a="";
        int sumCount=0;
        for(int i=0; i< r.length;i++){
            if(!a.contains(r[i])){
                a+=r[i];
                int count =0;
                for(int j=0;j<r.length;j++){
                    if(r[i].equals(r[j])){
                        count++;
                    }
                }
                if(count>1){
                    sumCount+=count;
                }
            }
        }
        return sumCount;
    }

    public static void main(String[] args) {
        System.out.println(get("1","2","1","aa","3","aa"));
    }
}
