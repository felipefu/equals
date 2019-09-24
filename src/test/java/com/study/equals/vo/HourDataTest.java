package com.study.equals.vo;

import org.junit.jupiter.api.Test;

public class HourDataTest {

    @Test
    public void registerNewDataHour() throws Exception {

        DataHour listRegisters = new EnterRegister(null);
    }

    @Test
    public void createNewRegisterList() throws Exception {

        ListRegisters listRegisters = new ListRegisters();

        DataHour enterRegister01 = new EnterRegister(null);
        DataHour enterRegister02 = new EnterRegister(null);
        DataHour leftRegister01 = new LeftRegister(null);
        DataHour leftRegister02 = new LeftRegister(null);

        listRegisters.getListRegister().add(enterRegister01);
        listRegisters.getListRegister().add(enterRegister02);
        listRegisters.getListRegister().add(leftRegister01);
        listRegisters.getListRegister().add(leftRegister02);
    }


}
