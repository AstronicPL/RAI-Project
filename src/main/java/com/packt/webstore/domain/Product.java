package com.packt.webstore.domain;
import java.math.BigDecimal;

public class Product {
   private String productId;
   private String name;
   private BigDecimal unitPrice;
   private String description;
   private String manufacturer;
   private String category;
   private long unitsInStock;
   private long unitsInOrder;
   private boolean discontinued;
   private String condition;
   
   public Product() {
      super();
   }
   public Product(String productId, String name, BigDecimal unitPrice) {
	      this.productId = productId;
	      this.name = name;
	      this.unitPrice = unitPrice;
	   }
   public String getProductId() {          //getter
       return productId;
   }

   public void setProductId(String productId) { //setter
       this.productId = productId;
   }
   public String getName() {          //getter
       return name;
   }

   public void setName(String name) { //setter
       this.name = name;
   }
   public BigDecimal getUnitPrice() {          //getter
       return unitPrice;
   }

   public void setUnitPrice(BigDecimal unitPrice) { //setter
       this.unitPrice = unitPrice;
   }
   public String getDescription() {          //getter
       return description;
   }

   public void setDescription(String description) { //setter
       this.description = description;
   }
   
   public String getManufacturer() {          //getter
       return manufacturer;
   }

   public void setManufacturer(String manufacturer) { //setter
       this.manufacturer = manufacturer;
   }
   public String getCategory() {          //getter
       return category;
   }

   public void setCategory(String category) { //setter
       this.category = category;
   }
   public long getUnitsInStock() {          //getter
       return unitsInStock;
   }

   public void setUnitsInStock(long unitsInStock) { //setter
       this.unitsInStock = unitsInStock;
   }
   
   
   public long getUnitsInOrder() {          //getter
       return unitsInOrder;
   }

   public void setUnitsInOrder(long unitsInOrder) { //setter
       this.unitsInOrder = unitsInOrder;
   }
   
   
   public boolean getDiscontinued() {          //getter
       return discontinued;
   }

   public void setDiscontinued(boolean discontinued) { //setter
       this.discontinued = discontinued;
   }
   
   public String getCondition() {          //getter
       return condition;
   }

   public void setCondition(String condition) { //setter
       this.condition = condition;
   }

	   @Override
	   public boolean equals(Object obj) {
	      if (this == obj)
	         return true;
	      if (obj == null)
	         return false;
	      if (getClass() != obj.getClass())
	         return false;
	      Product other = (Product) obj;
	      if (productId == null) {
	         if (other.productId != null)
	         return false;
	      } else if (!productId.equals(other.productId))
	         return false;
	      return true;
	   }
	   
	   @Override
	   public int hashCode() {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + ((productId == null) ? 0 :productId.hashCode());
	      return result;
	   }
	   
	   @Override
	   public String toString() {
	      return "Produkt [productId=" + productId + ", nazwa=" + name +"]";
	   }
	 }