package com.zyf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author zyfds
 * @description: TODO
 * @date 2021/5/7 22:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class School {
    private String name;
    private List<Student> students;
}
