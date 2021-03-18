package com.example.comedoressociales.models;

public class ModelProduct {
    private String productId, productTitle, productDescription, productCategory, productQuantity, productIcon, originalPrice,
        discountPrice, discountNote, discountAvailable, timestamp, uid;


    public ModelProduct() {
    }

    public ModelProduct(String productId, String productTitle, String productDescription, String productCategory,
                        String productQuantity, String productIcon, String originalPrice, String discountPrice,
                        String discountNote, String discountAvailable, String timestamp, String uid) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.productQuantity = productQuantity;
        this.productIcon = productIcon;
        this.originalPrice = originalPrice;
        this.discountPrice = discountPrice;
        this.discountNote = discountNote;
        this.discountAvailable = discountAvailable;
        this.timestamp = timestamp;
        this.uid = uid;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public String getDiscountNote() {
        return discountNote;
    }

    public String getDiscountAvailable() {
        return discountAvailable;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getUid() {
        return uid;
    }
}
