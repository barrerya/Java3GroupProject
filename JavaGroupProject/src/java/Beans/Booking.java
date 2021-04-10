/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * 
 */
public class Booking {
    private int ID;
    private int HallID;
    private int ClientID;
    private String Date;

    public Booking() {
    }

    public Booking(int ID, int HallID, int ClientID, String Date) {
        this.ID = ID;
        this.HallID = HallID;
        this.ClientID = ClientID;
        this.Date = Date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getHallID() {
        return HallID;
    }

    public void setHallID(int HallID) {
        this.HallID = HallID;
    }

    public int getClientID() {
        return ClientID;
    }

    public void setClientID(int ClientID) {
        this.ClientID = ClientID;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Booking{" + "ID=" + ID + ", HallID=" + HallID + ", ClientID=" + ClientID + ", Date=" + Date + '}';
    }
    
    
}
