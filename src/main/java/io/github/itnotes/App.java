package io.github.itnotes;


import org.apache.log4j.Logger;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        try {
            Logger log = Logger.getLogger(App.class);
            Date date = new Date();
            System.out.println(date);
            log.debug(date);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
