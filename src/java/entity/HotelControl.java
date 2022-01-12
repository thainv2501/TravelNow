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
public class HotelControl {
    private String place_id;
    private String hotel_id;
    private String hotel_name;
    private String status;
    private String img;
    private int quantity;
    private float price;

    public HotelControl() {
    }

    public HotelControl(String place_id, String hotel_id, String hotel_name, String status, String img, int quantity, float price) {
        this.place_id = place_id;
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.status = status;
        this.img = img;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quatity) {
        this.quantity = quatity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HotelControl{" + "place_id=" + place_id + ", hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + ", status=" + status + ", img=" + img + ", quantity=" + quantity + ", price=" + price + '}';
    }

   
    
    
}
