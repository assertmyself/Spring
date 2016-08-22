/**
 *
 */
package com.idea.app;

import org.springframework.stereotype.Component;

/**
 *   this is ok .
 */
@Component
public class HelloService {
    public String sayHello() {
        return "Hello world!";
    }


    public static void main(String args[]){
        new HelloService().sayHello();
    }
}
