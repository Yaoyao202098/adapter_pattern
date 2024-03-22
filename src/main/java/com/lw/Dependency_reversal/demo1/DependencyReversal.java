package com.lw.Dependency_reversal.demo1;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.Dependency_reversal
 * @Author: lw
 * @CreateTime: 2024-01-15  09:25
 * @Description: TODO 未使用依赖倒转原则时
 * @Version: 1.0
 */

public class DependencyReversal{
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
    }
}
class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
class Email{
    public String getInfo(){
        return "电子邮件信息:hello world";
    }
}