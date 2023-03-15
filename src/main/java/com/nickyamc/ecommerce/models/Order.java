package com.nickyamc.ecommerce.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date dateCreated;
    private Date dateReceived;
    private double total;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> details;

    public Order() {

    }

    public Order(Integer id, String number, Date dateCreated, Date dateReceived, double total) {
        this.id = id;
        this.number = number;
        this.dateCreated = dateCreated;
        this.dateReceived = dateReceived;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateReceived=" + dateReceived +
                ", total=" + total +
                '}';
    }
}
