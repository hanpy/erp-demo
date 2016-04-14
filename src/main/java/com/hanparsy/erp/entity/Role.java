package com.hanparsy.erp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
        @Id
        @Column(name="id")    
        @GeneratedValue(strategy=GenerationType.AUTO) 
        private int id;
        
        @Column(name = "name")
        private String name;
        
        @Column(name = "info")
        private String info;
        
        @OneToMany(cascade=CascadeType.ALL)
        private Set<UserRole> userRoleSet;
        
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

        public Set<UserRole> getUserRoleSet() {
                return userRoleSet;
        }

        public void setUserRoleSet(Set<UserRole> userRoleSet) {
                this.userRoleSet = userRoleSet;
        }
        
        public void addUserRole(UserRole userRole){
                if( this.userRoleSet == null)
                        this.userRoleSet = new HashSet<UserRole>();
                this.userRoleSet.add(userRole);
        }

        public String getInfo() {
                return info;
        }

        public void setInfo(String info) {
                this.info = info;
        }

        
}
