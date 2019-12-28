package AbstractClass;

import Abstraction.Interface.Bookmark;

public class Chrome extends Browser implements Bookmark {

    //Implement the methods in the Chrome class
    //    - When add method is called, user sees:
    //        givenurl added to bookmarks
    //    - Wehn remove method is called, user sees:
    //        givenurl removed from bookmarks
    @Override
    public void addUrlToBookmark(String url) {
        System.out.println(url + " added to bookmarks");
    }

    @Override
    public void removeUrlFromBookmark(String url) {
        System.out.println(url+"  removed from bookmarks");
    }

    public Chrome(){

    }

    @Override
    public void launch(){
        System.out.println("Chrome is launching");
    }

    @Override
    public void browse(String url){
        System.out.println("Chrome is browsing URL: "+url);
    }

    @Override
    public int getNumOfTabs(){
        System.out.println("Chrome is returning number of tabs open");
        return 10;
    }


}
