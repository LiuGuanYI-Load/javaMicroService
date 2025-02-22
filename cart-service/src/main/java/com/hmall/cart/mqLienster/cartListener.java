package com.hmall.cart.mqLienster;

import com.hmall.api.client.CartClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class cartListener {
    private final CartClient cartClient;
//    @RabbitListener(bindings = @QueueBinding(
//            value = @Queue(name = "cart.clear", durable = "true"),
//            exchange = @Exchange(name = "trade.topic"),
//            key = "cart.clear"
//    ))
//    public void clearCart(Collection<Long> orderId)
//    {
//
//        cartClient.deleteCartItemByIds(orderId);
//    }

}