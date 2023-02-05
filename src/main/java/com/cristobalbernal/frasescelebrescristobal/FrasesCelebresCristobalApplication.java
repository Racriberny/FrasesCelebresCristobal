package com.cristobalbernal.frasescelebrescristobal;

import com.cristobalbernal.frasescelebrescristobal.util.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrasesCelebresCristobalApplication {

    public static boolean DEBUG = true;
    public static String CONFIG_FILE =  null;

    public static void main(String[] args) {
        SpringApplication.run(FrasesCelebresCristobalApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Log.i("TAG", "Texto cualquiera");
    }
}
