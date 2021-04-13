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
public class Client {
    private int ID;
    private String Name;
    private String CreditCard;

    public Client() {
        
        
    }
    

    public Client(int ID, String Name, String CreditCard) {
        this.ID = ID;
        this.Name = Name;
        this.CreditCard = CreditCard;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(String CreditCard) {
        this.CreditCard = CreditCard;
    }

    @Override
    public String toString() {
        return "Client{" + "ID=" + ID + ", Name=" + Name + ", CreditCard=" + CreditCard + '}';
    }
    
    
}
