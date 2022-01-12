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
public class OrderInformation {
   private String place_id;
    private String place_name;
    private String place_img;
    private String vehical_id;
    private String vehical_name;
    private String brand_id;
    private String brand_name;
    private int ticket_quantity;
    private String hotel_id;
    private String hotel_name;
    private int room_quantity;
    private String customer_id;
    private String order_date;
    private String start_date;
    private float order_price;
        private String order_id;

    public OrderInformation() {
    }

    public OrderInformation(String place_id, String place_name, String place_img, String vehical_id, String vehical_name, String brand_id, String brand_name, int ticket_quantity, String hotel_id, String hotel_name, int room_quantity, String customer_id, String order_date, String start_date, float order_price, String order_id) {
        this.place_id = place_id;
        this.place_name = place_name;
        this.place_img = place_img;
        this.vehical_id = vehical_id;
        this.vehical_name = vehical_name;
        this.brand_id = brand_id;
        this.brand_name = brand_name;
        this.ticket_quantity = ticket_quantity;
        this.hotel_id = hotel_id;
        this.hotel_name = hotel_name;
        this.room_quantity = room_quantity;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.start_date = start_date;
        this.order_price = order_price;
        this.order_id = order_id;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_img() {
        return place_img;
    }

    public void setPlace_img(String place_img) {
        this.place_img = place_img;
    }

    public String getVehical_id() {
        return vehical_id;
    }

    public void setVehical_id(String vehical_id) {
        this.vehical_id = vehical_id;
    }

    public String getVehical_name() {
        return vehical_name;
    }

    public void setVehical_name(String vehical_name) {
        this.vehical_name = vehical_name;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public int getTicket_quantity() {
        return ticket_quantity;
    }

    public void setTicket_quantity(int ticket_quantity) {
        this.ticket_quantity = ticket_quantity;
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

    public int getRoom_quantity() {
        return room_quantity;
    }

    public void setRoom_quantity(int room_quantity) {
        this.room_quantity = room_quantity;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public float getOrder_price() {
        return order_price;
    }

    public void setOrder_price(float order_price) {
        this.order_price = order_price;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "OrderInformation{" + "place_id=" + place_id + ", place_name=" + place_name + ", place_img=" + place_img + ", vehical_id=" + vehical_id + ", vehical_name=" + vehical_name + ", brand_id=" + brand_id + ", brand_name=" + brand_name + ", ticket_quantity=" + ticket_quantity + ", hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + ", room_quantity=" + room_quantity + ", customer_id=" + customer_id + ", order_date=" + order_date + ", start_date=" + start_date + ", order_price=" + order_price + ", order_id=" + order_id + '}';
    }

    
        
  
}
