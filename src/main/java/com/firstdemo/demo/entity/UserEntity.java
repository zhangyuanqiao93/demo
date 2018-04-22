package com.firstdemo.demo.entity;




import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Create By Bridge On 2018/04/19
 * function: UserEntity 用户实体类
 */


@Entity
public class UserEntity {

    @Id//指定主键
    @Generated(value = "")//自增
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;

    /**
     * UserEntity的构造函数
     * @param id
     * @param name
     * @param age
     * @param salary
     */
    public UserEntity(Integer id, String name, Integer age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
