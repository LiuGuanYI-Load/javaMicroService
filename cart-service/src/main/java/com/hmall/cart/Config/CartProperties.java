//package com.hmall.cart.Config;
//
//import lombok.Data;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//@Data
//@Component
//@ConfigurationProperties(prefix="hmall.cart")  <-- 配置文件前缀
//public class CartProperties {
//
//    private Integer maxItems;
//
//}
package com.hmall.cart.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "hm.cart")
public class CartProperties {
    private Integer maxItems;
}
