package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentRadioStation7() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);
        int expected = 7;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioStation12() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(12);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioStationMinus1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioStation1() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setCurrentRadioStation9() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void clickNextStation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(3);
        int expected = 4;
        int actual = rad.clickNextStation();
        assertEquals(expected, actual);
    }
    @Test
    public void clickNextStation2Attempt(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        int expected = 0;
        int actual = rad.clickNextStation();
        assertEquals(expected, actual);
    }
    @Test
    public void clickNextStation3Attempt(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        int expected = 1;
        int actual = rad.clickNextStation();
        assertEquals(expected, actual);
    }
    @Test
    public void clickPrevStation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        int expected = 9;
        int actual = rad.clickPrevStation();
        assertEquals(expected, actual);
    }
    @Test
    public void clickPrevStation2Attempt(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        int expected = 8;
        int actual = rad.clickPrevStation();
        assertEquals(expected, actual);
    }
    @Test
    public void clickPrevStation3Attempt(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(2);
        int expected = 1;
        int actual = rad.clickPrevStation();
        assertEquals(expected, actual);
    }

    @Test
    public void clickPlusVolume(){
        Radio rad = new Radio();

        rad.setCurrentVolume(3);
        int expected = 4;
        int actual = rad.clickPlusVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void clickPlusVolume2Attempt(){
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        int expected = 10;
        int actual = rad.clickPlusVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void clickPlusVolume3Attempt(){
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        int expected = 1;
        int actual = rad.clickPlusVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void clickMinusVolume(){
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        int expected = 0;
        int actual = rad.clickMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void clickMinusVolume2Attempt(){
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        int expected = 9;
        int actual = rad.clickMinusVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void clickMinusVolume3Attempt(){
        Radio rad = new Radio();

        rad.setCurrentVolume(15);
        int expected = 0;
        int actual = rad.clickMinusVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void clickMinusVolume4Attempt(){
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.clickMinusVolume();
        assertEquals(expected, actual);
    }
}