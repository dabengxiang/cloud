package com.squirrel.cloud.mqcustomer.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Date:2018/10/6
 * Author:gyc
 * Desc:
 */

@Table(name = "t_order")
public class Order implements Serializable{

    private static final long serialVersionUID = 9111357402963030257L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private String id;

    private String name;

    private String messageId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", messageId='" + messageId + '\'' +
                '}';
    }
}
