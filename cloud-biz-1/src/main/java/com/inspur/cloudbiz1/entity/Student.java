package com.inspur.cloudbiz1.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * TODO
 *
 * @author chenboyu02
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Student {

    private int id;

    private String name;

    private int age;
}
