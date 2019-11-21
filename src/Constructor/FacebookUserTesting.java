package Constructor;

public class FacebookUserTesting {
    public static void main(String[] args) {
        FacebookUser user= new FacebookUser("Zhaina","Zhaina12", "Zhaina",23,500);
        user.info();
        FacebookUser user2= new FacebookUser("Kana","56767bvg","Kana",23,500);

        System.out.println(user.sendFriendRequest(user2));
        user.info();
        user2.info();
    }

}
