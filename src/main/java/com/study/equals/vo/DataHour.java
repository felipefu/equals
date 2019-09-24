package com.study.equals.vo;

import java.util.GregorianCalendar;

public abstract class DataHour {

    private GregorianCalendar dataHour;

    public DataHour(GregorianCalendar dataHour) throws Exception {
        validateNewDataHour(dataHour);
        this.dataHour = dataHour;
    }

    private void validateNewDataHour(GregorianCalendar dataHour) throws Exception {
        if (dataHour == null) {
            throw new Exception();
        }
    }

}
