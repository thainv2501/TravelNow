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
public class VehicalAdminControl {
    private String place_id;
    private String place_name;
    private String vehical_id;
    private String vehical_name;
    private String brand_id;
    private String Brand_name;
    private String status;
    private int quantity;
    private float price;
    private String img;

    public VehicalAdminControl() {
    }

    public VehicalAdminControl(String place_id, String place_name, String vehical_id, String vehical_name, String brand_id, String Brand_name, String status, int quantity, float price, String img) {
        this.place_id = place_id;
        this.place_name = place_name;
        this.vehical_id = vehical_id;
        this.vehical_name = vehical_name;
        this.brand_id = brand_id;
        this.Brand_name = Brand_name;
        this.status = status;
        this.quantity = quantity;
        this.price = price;
        this.img = img;
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
        return Brand_name;
    }

    public void setBrand_name(String Brand_name) {
        this.Brand_name = Brand_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "VehicalAdminControl{" + "place_id=" + place_id + ", place_name=" + place_name + ", vehical_id=" + vehical_id + ", vehical_name=" + vehical_name + ", brand_id=" + brand_id + ", Brand_name=" + Brand_name + ", status=" + status + ", quantity=" + quantity + ", price=" + price + ", img=" + img + '}';
    }
    
}
