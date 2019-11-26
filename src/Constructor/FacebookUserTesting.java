package Constructor;

public class FacebookUserTesting {
    public static void main(String[] args) {
        FacebookUser user= new FacebookUser("Zhaina","Zhaina12", "Zhaina",23,500);
        user.info();
        FacebookUser user2= new FacebookUser("Kana","56767bvg","Kana",23,500);
        FacebookUser user3 = new FacebookUser("Mari","kjhgjmgjh","Meri",25,166);

        System.out.println(user2.sendFriendRequest(user));
        user.info();
        user2.info();


    }

}
