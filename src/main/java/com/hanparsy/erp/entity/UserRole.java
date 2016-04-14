package com.hanparsy.erp.entity;
import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole {
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
//        
//        @Column(name = "user_id")
//        private int user_id;
//        
//        @Column(name = "role_id")
//        private int role_id;
        
        @ManyToOne(targetEntity = User.class)
        @JoinColumn(name = "user_id")
        private User user;
        
        @ManyToOne(targetEntity = Role.class)
        @JoinColumn (name = "role_id")
        private Role role;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        public Role getRole() {
                return role;
        }

        public void setRole(Role role) {
                this.role = role;
        }
//
//        public int getUserId() {
//                return user_id;
//        }
//
//        public void setUserId(int userId) {
//                this.user_id = userId;
//        }
//
//        public int getRoleId() {
//                return role_id;
//        }
//
//        public void setRoleId(int roleId) {
//                this.role_id = roleId;
//        }


        
}
