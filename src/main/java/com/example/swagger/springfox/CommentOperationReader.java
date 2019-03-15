package com.example.swagger.springfox;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.OperationBuilderPlugin;
import springfox.documentation.spi.service.contexts.OperationContext;

/**
 * 
 * @author salted fish
 * @Date:2018年8月7日
 */
@Component
@Order(Ordered.LOWEST_PRECEDENCE)
public class CommentOperationReader implements OperationBuilderPlugin{
    @Override
    public void apply(OperationContext context) {
        String name = context.getRequestMappingInfo().getName();
        if (name != null && name.length() > 0) {
            context.operationBuilder()
                    .summary(name);
        }
    }


    @Override
    public boolean supports(DocumentationType delimiter) {
        return true;
    }
}

