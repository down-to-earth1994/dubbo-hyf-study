package com.hyf;

import com.hyf.pojo.User;

/**
 * @Author heyanfeng
 * @Contact
 * @Description
 * @Date Created in 2019/12/11
 */
public class ProviderStartMain {
    public static void main(String[] args) {
        User user = new User();
        user.setUuid(1L);
        user.setName("hyf");
        System.out.println(user.toString());
    }
}
