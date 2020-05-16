package helpers;


public class Environment {
// COMMON CONFIG
    public final static String
        url = System.getProperty("url", "http://facebook.com"),
        email = System.getProperty("email", "qa.guru.test@gmail.com"),
        password = System.getProperty("password", "testpassword#&!");

}
