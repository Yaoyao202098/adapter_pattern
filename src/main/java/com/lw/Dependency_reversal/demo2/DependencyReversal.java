package com.lw.Dependency_reversal.demo2;

/**
 * @BelongsProject: design_pattern
 * @BelongsPackage: com.lw.Dependency_reversal.demo2
 * @Author: lw
 * @CreateTime: 2024-01-15  09:32
 * @Description: TODO 使用依赖倒转原则时
 * @Version: 1.0
 */
public class DependencyReversal{
    public static void main(String[] args) {
        Person person=new Person();
        person.receive(new Email());
        person.receive(new WeiXIn());
    }
}
interface IReceiver{
    String getInfo();
}
class Person {
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息:hello world";
    }
}
class WeiXIn implements IReceiver {
    @Override
    public String getInfo() {
        return "微信接收消息:hello world";
    }
}
