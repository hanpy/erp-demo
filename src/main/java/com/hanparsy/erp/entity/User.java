package com.hanparsy.erp.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="user") 
public class User {
        @Id
        @Column(name="id")    
        @GeneratedValue(strategy=GenerationType.AUTO) //注解于属性中 
        private int id;
        
        @Column(name="name")    
        private String name;
        
        @Column(name="age")    
        private int age;
        
        @Column(name="addr")    
        private String addr;
        
        @Column(name="sex")    
        private int sex;
        
        @Column(name="phone")    
        private String phone;
        
        @Column(name = "password")
        private String password;
        
        @Column(name = "corp_code")
        private String corpCode;
        
        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getAddr() {
                return addr;
        }

        public void setAddr(String addr) {
                this.addr = addr;
        }

        public int getSex() {
                return sex;
        }

        public void setSex(int sex) {
                this.sex = sex;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getCorpCode() {
                return corpCode;
        }

        public void setCorpCode(String corpCode) {
                this.corpCode = corpCode;
        }        
}
