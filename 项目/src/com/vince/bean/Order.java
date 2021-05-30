package com.vince.bean;

import com.vince.utils.OrderStatusType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenjie
 * @date 2021/5/28-9:30
 */
//订单   明细组成一个订单     Order  -》 OrderItem  是一对多的关系，从 Order中可以查找到 OrderItem
public class Order {
    private int orderId;  // 订单 id
    private List<OrderItem> orderItemLIst = new ArrayList<>(); // 所有的明细
    private String createDate;  // ?????
    private float sum; // 总金额
    private OrderStatusType status = OrderStatusType.UNPAID;  // 工具类， 判断 Order 的状态
    private int userId; //同一用户可以下 很多 Order
}
