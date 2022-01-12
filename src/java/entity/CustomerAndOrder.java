/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author taola
 */
public class CustomerAndOrder {
     private String id;
    private String name;
    private String address;
    private int phone;
    private int numOrders;

    public CustomerAndOrder() {
    }

    public CustomerAndOrder(String id, String name, String address, int phone, int numOrders) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.numOrders = numOrders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getNumOrders() {
        return numOrders;
    }

    public void setNumOrders(int numOrders) {
        this.numOrders = numOrders;
    }

    @Override
    public String toString() {
        return "CustomerAndOrder{" + "id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", numOrders=" + numOrders + '}';
    }
    
    
     
}
