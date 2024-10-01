package br.com.vinibuffalo.model;

import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class Produto {
    @CsvBindByName(column = "productId", required = true)
    private int id;
    @CsvBindByName(column = "productName", required = true)
    private String name;
    @CsvBindByName(column = "description", required = true)
    private String description;
    @CsvBindByName(column = "price", required = true)
    private BigDecimal price;
    @CsvBindByName(column = "category", required = true)
    private String category;

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
