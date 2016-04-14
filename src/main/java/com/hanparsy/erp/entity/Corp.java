package com.hanparsy.erp.entity;

import javax.persistence.*;

@Entity
@Table(name="corp")
public class Corp {
        
        @Id
        @Column(name="id")
        @GeneratedValue(strategy=GenerationType.AUTO)
        private int id;
        
        @Column(name="corp_code")
        private String corpCode;
        
        @Column(name="corp_name")
        private String corpName;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getCorpCode() {
                return corpCode;
        }

        public void setCorpCode(String corpCode) {
                this.corpCode = corpCode;
        }

        public String getCorpName() {
                return corpName;
        }

        public void setCorpName(String corpName) {
                this.corpName = corpName;
        }
        
        
}
