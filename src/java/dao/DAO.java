/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Customer;
import entity.CustomerAndOrder;
import entity.Hotel;
import entity.HotelControl;
import entity.OrderInformation;
import entity.Tours;
import entity.Vehical;
import entity.VehicalAdminControl;
import entity.VehicalControl;
import entity.Vehical_Brand;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author taola
 */
public class DAO {
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

//    public List<Tours> getHotTours() {
//        Vector vec = new Vector();
//        try {
//            con = new DBContext().getConnection();
//            try {
//                System.out.println("Ket noi Thanh cong");
//            } catch (Exception e) {
//                System.out.println("Co loi khi ket noi " + e.getMessage());
//            }
//            String sql = "select * from Tours";
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                vec.add(new Tours(rs.getString(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getInt(4),
//                        rs.getString(5),
//                        rs.getBoolean(6)));
//            }
//        } catch (Exception ex) {
//            System.out.println("Error");
//        }
//        return vec;
//    }
    public Vector<Tours> getAllTours() {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "select * from Tours";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new Tours(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getBoolean(6)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Account loadAccount(String account) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "select * from account\n"
                    + "where account_name = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, account);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(2), rs.getString(3));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return null;
    }
    
    public Customer loadCustomer(String cmnd) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT  [customer_id]\n"
                    + "      ,[customer_name]\n"
                    + "      ,[address]\n"
                    + "      ,[phone]\n"
                    + "  FROM [Customer]\n"
                    + "  where customer_id = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, cmnd);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return null;
    }
    
    public Tours getToursFromId(String id) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "select * from Tours\n"
                    + "where place_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Tours(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return null;
    }
    
    public Vector<Tours> getToursByFilter(String textFil) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT *\n"
                    + "  FROM Tours\n"
                    + "  order by " + textFil;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new Tours(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getBoolean(6)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Vector<VehicalControl> getAllVehicalByPid(String pid) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT [place_id]\n"
                    + "      ,[vehical_id],vehical_name\n"
                    + "      ,a.[brand_id],c.brand_name,\n"
                    + "	  a.[status]\n"
                    + "      ,[quantity]\n"
                    + "      ,[price],\n"
                    + "	  [img]\n"
                    + "	  \n"
                    + "  FROM vehical_available as a join vehical as b on a.vehical_id = b.vehicle_id\n"
                    + "       join vehical_brand as c on a.brand_id = c.brand_id\n"
                    + "	   where place_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new VehicalControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getFloat(8), rs.getString(9)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Vector<VehicalAdminControl> getAllVehical() {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT a.[place_id],t.place_name\n"
                    + "      ,[vehical_id],vehical_name\n"
                    + "      ,a.[brand_id],c.brand_name,\n"
                    + "	  a.[status]\n"
                    + "      ,[quantity]\n"
                    + "      ,[price],\n"
                    + "	  [img]\n"
                    + "	  \n"
                    + "  FROM vehical_available as a join vehical as b on a.vehical_id = b.vehicle_id\n"
                    + "       join vehical_brand as c on a.brand_id = c.brand_id\n"
                    + "	   join Tours as t on t.place_id = a.place_id\n"
                    + "	   order by a.vehical_id";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new VehicalAdminControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getFloat(9), rs.getString(10)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Vector<VehicalControl> getVehicalsById(String pid, String vType) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "/****** Script for SelectTopNRows command from SSMS  ******/\n"
                    + "SELECT [place_id]\n"
                    + "      ,[vehical_id],vehical_name\n"
                    + "      ,a.[brand_id],c.brand_name,\n"
                    + "	  a.[status]\n"
                    + "      ,[quantity]\n"
                    + "      ,[price],\n"
                    + "	  [img]\n"
                    + "	  \n"
                    + "  FROM vehical_available as a join vehical as b on a.vehical_id = b.vehicle_id\n"
                    + "       join vehical_brand as c on a.brand_id = c.brand_id\n"
                    + "	   where place_id = ? and a.vehical_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.setString(2, vType);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new VehicalControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getFloat(8), rs.getString(9)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Vector<VehicalControl> getVehicalsByFilter(String pid, String textFil) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT [place_id]\n"
                    + "      ,[vehical_id],vehical_name\n"
                    + "      ,a.[brand_id],c.brand_name,\n"
                    + "	  a.[status]\n"
                    + "      ,[quantity]\n"
                    + "      ,[price],\n"
                    + "	  [img]\n"
                    + "	  \n"
                    + "  FROM vehical_available as a join vehical as b on a.vehical_id = b.vehicle_id\n"
                    + "       join vehical_brand as c on a.brand_id = c.brand_id\n"
                    + "	   where place_id = ?  \n"
                    + "order by " + textFil;
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new VehicalControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getFloat(8), rs.getString(9)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Vector<Vehical_Brand> getAllVehicalsBrand() {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT *\n"
                    + "  FROM [TravelNow].[dbo].[vehical_brand]";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new Vehical_Brand(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public VehicalControl getVehicalInforById(String pid, String vid, String bid) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT [place_id]\n"
                    + "      ,[vehical_id],vehical_name\n"
                    + "      ,a.[brand_id],c.brand_name,\n"
                    + "	  a.[status]\n"
                    + "      ,[quantity]\n"
                    + "      ,[price],\n"
                    + "	  [img]\n"
                    + "	  \n"
                    + "  FROM vehical_available as a join vehical as b on a.vehical_id = b.vehicle_id\n"
                    + "       join vehical_brand as c on a.brand_id = c.brand_id\n"
                    + "	   where place_id = ? and a.vehical_id = ? and a.brand_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.setString(2, vid);
            ps.setString(3, bid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new VehicalControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getFloat(8), rs.getString(9));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return null;
    }
    
    public VehicalAdminControl adminGetVehicalInforById(String pid, String vid, String bid) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT a.[place_id],t.place_name\n"
                    + "      ,[vehical_id],vehical_name\n"
                    + "      ,a.[brand_id],c.brand_name,\n"
                    + "	  a.[status]\n"
                    + "      ,[quantity]\n"
                    + "      ,[price],\n"
                    + "	  [img]\n"
                    + "	  \n"
                    + "  FROM vehical_available as a join vehical as b on a.vehical_id = b.vehicle_id\n"
                    + "       join vehical_brand as c on a.brand_id = c.brand_id\n"
                    + "	   join Tours as t on t.place_id = a.place_id\n"
                    + "	   where a.place_id = ? and vehical_id = ? and a.brand_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.setString(2, vid);
            ps.setString(3, bid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new VehicalAdminControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getFloat(9), rs.getString(10));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return null;
    }
    
    public Vector<Vehical> getAllVehicalType() {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT* from vehical";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new Vehical(rs.getString(1), rs.getString(2)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Vector<Hotel> getAllHotel() {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT  [hotel_id]\n"
                    + "      ,[hotel_name]\n"
                    + "      ,[img]\n"
                    + "      ,[status]\n"
                    + "  FROM [Hotels]";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new Hotel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Vector<HotelControl> getAllHotelAvailable(String pid) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT  [place_id]\n"
                    + "      ,a.[hotel_id],b.hotel_name,b.status,b.img\n"
                    + "      ,[quantity]\n"
                    + "      ,[price]\n"
                    + "  FROM [hotel_available] as a join Hotels as b on a.hotel_id = b.hotel_id\n"
                    + "  where a.place_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new HotelControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getFloat(7)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public HotelControl getHotelInforFromId(String pid, String hid) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT  [place_id]\n"
                    + "      ,a.[hotel_id],b.hotel_name,b.status,b.img\n"
                    + "      ,[quantity]\n"
                    + "      ,[price]\n"
                    + "  FROM [hotel_available] as a join Hotels as b on a.hotel_id = b.hotel_id\n"
                    + "  where a.place_id = ?  and a.hotel_id = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.setString(2, hid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new HotelControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getFloat(7));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return null;
    }
    
    public Vector<HotelControl> getHotelsByFilter(String pid, String textFil) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT  [place_id]\n"
                    + "      ,a.[hotel_id],b.hotel_name,b.status,b.img\n"
                    + "      ,[quantity]\n"
                    + "      ,[price]\n"
                    + "  FROM [hotel_available] as a join Hotels as b on a.hotel_id = b.hotel_id\n"
                    + "  where a.place_id = " + pid + " \n"
                    + "  order by " + textFil;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new HotelControl(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getFloat(7)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public Customer getCustomer(String cusId) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT [customer_id]\n"
                    + "      ,[customer_name]\n"
                    + "      ,[address]\n"
                    + "      ,[phone]\n"
                    + "  FROM [Customer]\n"
                    + "  where customer_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, cusId);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return null;
    }
    
    public void insertCustomer(String cusId, String name, String address, String phone) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "INSERT INTO [dbo].[Customer]\n"
                    + "           ([customer_id]\n"
                    + "           ,[customer_name]\n"
                    + "           ,[address]\n"
                    + "           ,[phone])\n"
                    + "     VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, cusId);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void updateCustomer(String cusId, String name, String address, String phone) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "UPDATE [dbo].[Customer]\n"
                    + "   SET [customer_name] = ?\n"
                    + "      ,[address] = ?\n"
                    + "      ,[phone] = ?\n"
                    + " WHERE customer_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, address);
            ps.setString(3, phone);
            ps.setString(4, cusId);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void updateVehicalAvailableQuantity(String pid, String vid, String bid, int veXeRest) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "UPDATE [dbo].[vehical_available]\n"
                    + "   SET [quantity] = ?\n"
                    + "      \n"
                    + " WHERE place_id = ? and vehical_id = ? and brand_id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, veXeRest);
            ps.setString(2, pid);
            ps.setString(3, vid);
            ps.setString(4, bid);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void updateHotelAvailableQuantity(String pid, String hid, int roomRest) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "UPDATE [hotel_available]\n"
                    + "   SET [quantity] = ?\n"
                    + "     \n"
                    + " WHERE place_id = ? and hotel_id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, roomRest);
            ps.setString(2, pid);
            ps.setString(3, hid);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void insertOrder(String pid, String vid, String bid, int soVeXe, String hid, int soLuongPhong, String cusId, String orderDate, String startDate) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "INSERT INTO [order_details]\n"
                    + "           ([place_id]\n"
                    + "           ,[vehical_id]\n"
                    + "           ,[brand_id]\n"
                    + "           ,[ticket_quantity]\n"
                    + "           ,[hotel_id]\n"
                    + "           ,[room_quantity]\n"
                    + "           ,[customer_id]\n"
                    + "           ,[order_date]\n"
                    + "           ,[start_date])\n"
                    + "     VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.setString(2, vid);
            ps.setString(3, bid);
            ps.setInt(4, soVeXe);
            ps.setString(5, hid);
            ps.setInt(6, soLuongPhong);
            ps.setString(7, cusId);
            ps.setString(8, orderDate);
            ps.setString(9, startDate);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public Vector<OrderInformation> getOrdersInforFromCustomerId(String customerId) {
        Vector vec = new Vector();
        
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "/****** Script for SelectTopNRows command from SSMS  ******/\n"
                    + "SELECT a.[place_id],b.place_name,b.images\n"
                    + "      ,a.[vehical_id],c.vehical_name\n"
                    + "      ,a.[brand_id],d.brand_name\n"
                    + "      ,[ticket_quantity]\n"
                    + "      ,a.[hotel_id],h.hotel_name\n"
                    + "      ,[room_quantity]\n"
                    + "      ,[customer_id]\n"
                    + "      ,[order_date]\n"
                    + "      ,[start_date],\n"
                    + "	  b.tour_price + a.ticket_quantity*va.price +a.room_quantity*ha.price as order_price\n"
                    + "      ,[order_id]\n"
                    + "  FROM [order_details] as a join Tours as b on a.place_id = b.place_id\n"
                    + "  join vehical as c on a.vehical_id = c.vehicle_id\n"
                    + "  join vehical_brand as d on a.brand_id = d.brand_id\n"
                    + "  join Hotels as h on a.hotel_id = h.hotel_id\n"
                    + "  join vehical_available as  va on va.place_id = a.place_id and va.vehical_id = a.vehical_id and va.brand_id = a.brand_id\n"
                    + "  join hotel_available as ha on ha.place_id =a.place_id and ha.hotel_id = a.hotel_id\n"
                    + "  where customer_id = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, customerId);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new OrderInformation(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getFloat(15), rs.getString(16)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public int getToursPage() {
        int pageCount = 0;
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT COUNT(*)\n"
                    + "FROM Tours";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                pageCount = rs.getInt(1) / 5;
                if (rs.getInt(1) % 5 != 0) {
                    pageCount++;
                }
            }
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return pageCount;
    }
    
    public Vector<Tours> getToursInPage(int index) {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT *\n"
                    + "FROM Tours\n"
                    + "order by hot desc,place_name\n"
                    + "OFFSET ? ROWS \n"
                    + "FETCH first 5 ROWS ONLY";
            ps = con.prepareStatement(sql);
            ps.setInt(1, (index - 1) * 5);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new Tours(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public void updateTour(String tid, String tname, String status, int tprice, String img, boolean hot) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "UPDATE [dbo].[Tours]\n"
                    + "   SET [place_name] = ?\n"
                    + "      ,[status] = ?\n"
                    + "      ,[tour_price] = ?\n"
                    + "      ,[images] = ?\n"
                    + "      ,[hot] = ?\n"
                    + " WHERE place_id = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, tname);
            ps.setString(2, status);
            ps.setInt(3, tprice);
            ps.setString(4, img);
            ps.setBoolean(5, hot);
            ps.setString(6, tid);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void updateVehicalAvailable(String pid, String vid, String bid, String status, int quantity, float price, String img) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "UPDATE [dbo].[vehical_available]\n"
                    + "   SET[quantity] = ?\n"
                    + "      ,[price] = ?\n"
                    + "      ,[img] = ?\n"
                    + "      ,[status] = ?\n"
                    + " WHERE place_id = ? and vehical_id = ? and brand_id = ? ";
            ps = con.prepareStatement(sql);
            ps.setInt(1, quantity);
            ps.setFloat(2, price);
            ps.setString(3, img);
            ps.setString(4, status);
            ps.setString(5, pid);
            ps.setString(6, vid);
            ps.setString(7, bid);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void insertVehicalAvailable(String pid, String vid, String bid, String status, int quantity, float price, String img) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "INSERT INTO [dbo].[vehical_available]\n"
                    + "           ([place_id]\n"
                    + "           ,[vehical_id]\n"
                    + "           ,[brand_id]\n"
                    + "           ,[quantity]\n"
                    + "           ,[price]\n"
                    + "           ,[img]\n"
                    + "           ,[status])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?) ";
            ps = con.prepareStatement(sql);
            ps.setString(1, pid);
            ps.setString(2, vid);
            ps.setString(3, bid);
            ps.setInt(4, quantity);
            ps.setFloat(5, price);
            ps.setString(6, img);
            ps.setString(7, status);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void insertTour(String tid, String tname, String status, int tprice, String img, boolean hot) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "INSERT INTO [dbo].[Tours]\n"
                    + "           ([place_id]\n"
                    + "           ,[place_name]\n"
                    + "           ,[status]\n"
                    + "           ,[tour_price]\n"
                    + "           ,[images]\n"
                    + "           ,[hot])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, tid);
            ps.setString(2, tname);
            ps.setString(3, status);
            ps.setInt(4, tprice);
            ps.setString(5, img);
            ps.setBoolean(6, hot);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public void deleteVehicalAvailable(String pid, String vid, String bid) {
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "DELETE FROM [dbo].[vehical_available]\n"
                    + "      WHERE  place_id = " + pid + " and vehical_id = " + vid + " and brand_id = " + bid;
            ps = con.prepareStatement(sql);
            ps.execute();
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
    
    public Vector<CustomerAndOrder> getCustomerAndOrder() {
        Vector vec = new Vector();
        try {
            con = new DBContext().getConnection();
            try {
                System.out.println("Ket noi Thanh cong");
            } catch (Exception e) {
                System.out.println("Co loi khi ket noi " + e.getMessage());
            }
            String sql = "SELECT a.customer_id,b.customer_name,b.address,b.phone,count(a.customer_id) as numberOfOrder\n"
                    + "  FROM [order_details] as a join Customer as b on a.customer_id = b.customer_id\n"
                    + "\n"
                    + "  group by a.customer_id,customer_name,b.customer_name,b.address,b.phone\n"
                    + "  order by count(a.customer_id) desc";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                vec.add(new CustomerAndOrder(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
            }
        } catch (Exception ex) {
            System.out.println("Error");
        }
        return vec;
    }
    
    public static void main(String[] args) {
        DAO dao = new DAO();
//        Vector<Tours> tour = (Vector) dao.getHotTours();
//        for (Tours tours : tour) {
//            System.out.println(tours);
//        }
//
//        Vector<Tours> tour = (Vector) dao.getAllTours();
//        for (Tours tours : tour) {
//            System.out.println(tours);
//        }
//        Account a = dao.loadAccount("admin");
//        System.out.println(a);
//
//        Tours t = dao.getToursFromId("1");
//        System.out.println(t);
//
//        Vector<Tours> tour = (Vector) dao.getToursByFilter("place_name");
//        for (Tours tours : tour) {
//            System.out.println(tours);
//
//        }

//        Vector<VehicalControl> ve = dao.getAllVehical("1");
//        for (VehicalControl vehicalControl : ve) {
//            System.out.println(vehicalControl);
//        }
//
//Vector<Vehical> ve = dao.getAllVehicalType();
//        for (Vehical vehicalControl : ve) {
//            System.out.println(vehicalControl);
//        }
//
//   Vector<Hotel> tour = (Vector) dao.getAllHotel();
//        for (Hotel tours : tour) {
//            System.out.println(tours);
//
//        }
//        Vector<HotelControl> tour = (Vector) dao.getAllHotelAvailable("1");
//        for (HotelControl tours : tour) {
//            System.out.println(tours);
//
//        }
//        HotelControl h = dao.getHotelInforFromId("1", "1");
//        System.out.println(h.toString());
//        Vector<HotelControl> tour = (Vector) dao.getHotelsByFilter("1", "1");
//        for (HotelControl tours : tour) {
//            System.out.println(tours);
//
//        }
//  Vector<VehicalControl> ve = dao.getVehicalsById("1","1");
//        for (VehicalControl vehicalControl : ve) {
//            System.out.println(vehicalControl);
//        }
//        
//        Vector<VehicalControl> ve = dao.getVehicalsByFilter("1", "brand_name");
//        for (VehicalControl vehicalControl : ve) {
//            System.out.println(vehicalControl);
//        }
//        VehicalControl ve = dao.getVehicalInforById("1", "1", "1");
//        System.out.println(ve);
//        Customer cus = dao.getCustomer("0");
//        System.out.println(cus);
//        dao.updateCustomer("4", "THai hoan1", "cua lo", "098766543");
//        dao.insertCustomer("5", "THai hoan1", "cua lo", "098766543");
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = formatter.format(date);
        System.out.println(strDate);
        System.out.println(dao.getToursPage());
//        Vector<VehicalAdminControl> ve = dao.getAllVehical();
//        for (VehicalAdminControl vehicalAdminControl : ve) {
//            System.out.println(vehicalAdminControl);
//        }

       Vector<OrderInformation> orders = dao.getOrdersInforFromCustomerId("153793");
        for (OrderInformation order : orders) {
            System.out.println(order);
        }
       
        
    }
    
}
