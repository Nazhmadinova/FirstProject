package ReturnMethods;

public class CheckPasswordUsername {
    //Create a method for logging in. User passes the username and password as parameters.
    // If the passed values are the same as the given username and password return true,
    // but if either the username or password is invalid return false
    //Username: james123
    //Password: password

    public static boolean check(String username, String password){
        String givenEsername="james123";
        String givenPassword="password";
        if(givenEsername.equals(username) && givenPassword.equals(password))
        return true;
        // you don't need else, you can put return false, if it is true then you can return true;

            return false;
    }

    public static void main(String[] args) {
        System.out.println(check("james123","password"));
        // or
        //if(check("james123","password")){
        // System.out.println("lo

    }
}
