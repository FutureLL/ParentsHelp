package org.westos.ph.bean.shoppingbean.llbean;

public class WareHouse {
    private Integer id;
    private String goodname;
    private Integer goodprice;
    private String factory;
    private String school;
    private String classes;
    private String pic;
    private String modle;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodname() {
        return goodname;
    }

    public void setGoodname(String goodname) {
        this.goodname = goodname;
    }

    public Integer getGoodprice() {
        return goodprice;
    }

    public void setGoodprice(Integer goodprice) {
        this.goodprice = goodprice;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "id=" + id +
                ", goodname='" + goodname + '\'' +
                ", goodprice=" + goodprice +
                ", factory='" + factory + '\'' +
                ", school='" + school + '\'' +
                ", classes='" + classes + '\'' +
                ", pic='" + pic + '\'' +
                ", modle='" + modle + '\'' +
                ", count=" + count +
                '}';
    }
}
