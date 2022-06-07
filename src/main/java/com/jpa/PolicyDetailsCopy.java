package com.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="policydetails")
public class PolicyDetailsCopy implements Serializable {

    @Id
    @Column(name="policyno")
    private String policyno;

    @Column(name="policyholdername")
    private String PolicyHoldeName;

    @Column(name="POLICYSTARTDT")
    private Date policyStartDate;

    @Column(name="POLICYENDDT")
    private Date policyEndDate;

    public String getPolicyno() {
        return policyno;
    }

    public void setPolicyno(String policyno) {
        this.policyno = policyno;
    }

    public String getPolicyHoldeName() {
        return PolicyHoldeName;
    }

    public void setPolicyHoldeName(String policyHoldeName) {
        PolicyHoldeName = policyHoldeName;
    }

    public Date getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }
}
