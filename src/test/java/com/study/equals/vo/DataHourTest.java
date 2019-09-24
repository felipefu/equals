package com.study.equals.vo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

public class DataHourTest {

    @Test
    public void createNewDataHourEmptyException() {

        Assertions.assertThrows(Exception.class, () -> {
            DataHour enterRegister = new EnterRegister(null);
        });
    }

    @Test
    public void createNewDataHour() throws Exception {

        DataHour enterRegister = new EnterRegister(new GregorianCalendar());
    }
}
