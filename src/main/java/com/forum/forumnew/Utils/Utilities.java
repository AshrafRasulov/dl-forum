package com.forum.forumnew.Utils;

import java.sql.Timestamp;

public class Utilities {
    public Timestamp GetCurrentDataTime(){
        Timestamp datenowTS = new Timestamp(System.currentTimeMillis());
        return datenowTS;
    }
}
