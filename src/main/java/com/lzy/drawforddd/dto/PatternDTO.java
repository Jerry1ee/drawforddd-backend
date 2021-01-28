package com.lzy.drawforddd.dto;

import lombok.*;

import java.util.List;

/**
 * @author
 * @version 1.0
 * @className
 * @description
 * @date
 * @e-mail cqulizhiying@foxmail.com
 **/
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PatternDTO {

    private String type;
    private String id;
    private String name;
    private String identity;
    private List<Integer> in;
    private List<Integer> out;

    @Override
    public String toString() {
        return " type:" + this.type + " id:" + this.id + " name:" + this.name + " identity:" + this.identity
                + " in :" + this.in + " out :" + this.out;
    }
}