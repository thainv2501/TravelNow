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
public class Tours {
    private String id;
    private String name;
    private String status;
    private int price;
    private String img;
    private boolean hot;

    public Tours() {
    }

    public Tours(String id, String name, String status, int price, String img, boolean hot) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.price = price;
        this.img = img;
        this.hot = hot;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }
    

    @Override
    public String toString() {
        return "Tours{" + "id=" + id + ", name=" + name + ", status=" + status + ", price=" + price + ", img=" + img + '}';
    }
    
    
}
