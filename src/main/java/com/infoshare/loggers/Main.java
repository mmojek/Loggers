package com.infoshare.loggers;

import jdk.nashorn.internal.runtime.options.LoggingOption;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Main {

    private final static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Start application");
        LOGGER.log(Level.INFO, "Start aplication");
    }
    
}
