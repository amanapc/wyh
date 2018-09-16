package com.wyh.domain;

import java.util.Date;

public class UserDetail {
    private Integer id;

    private Integer userId;

    private String realName;

    private String sex;

    private String cardAddress;

    private String cardno;

    private Date birthday;

    private Date createdate;

    private Integer flag;

    private String idImage1;

    private String idImage2;

    private String idImage3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCardAddress() {
        return cardAddress;
    }

    public void setCardAddress(String cardAddress) {
        this.cardAddress = cardAddress == null ? null : cardAddress.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public String getIdImage1() {
        return idImage1;
    }

    public void setIdImage1(String idImage1) {
        this.idImage1 = idImage1 == null ? null : idImage1.trim();
    }

    public String getIdImage2() {
        return idImage2;
    }

    public void setIdImage2(String idImage2) {
        this.idImage2 = idImage2 == null ? null : idImage2.trim();
    }

    public String getIdImage3() {
        return idImage3;
    }

    public void setIdImage3(String idImage3) {
        this.idImage3 = idImage3 == null ? null : idImage3.trim();
    }
}