package cn.itcast.domain;

public class Account {

    private int id;
    private String name;
    private Double money;
    private String imgSrc;

    public Account() {
        System.out.println("Account()");
    }

    public Account(int id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }



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

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", imgSrc='" + imgSrc + '\'' +
                '}';
    }
}
