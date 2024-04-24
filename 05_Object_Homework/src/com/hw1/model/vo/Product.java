package com.hw1.model.vo;

public class Product {
	
	
	  private String productld;
	   private String productName;
	   private String productArea;
	   private int price;
	   private double tax;
	   
	   public Product() {
	      
	   }
	   
	   public Product(String productld,String productName,String productArea ) {
	      
	       this.productld = productld;
	         this.productName = productName;
	         this.productArea =productArea;
	   }
	   
	      public Product(String productld,String productName,String productArea, int price, double tax) {
	         
	            this.productld = productld;
	            this.productName = productName;
	            this.productArea = productArea;
	            this.price = price;
	            this.tax =tax;
	            
	      }
	      
	        public void setproductld(String productld) {
	               this.productld =productld; 
	         }
	            
	            public void setproductName(String productName) {
	               this.productName = productName;
	            }
	            
	            public void setproductArea(String productArea) {
	               this.productArea =productArea ;
	               
	            }
	            
	            public void setprice(int price) {
	               this.price = price;
	            }
	            
	            public void settax (double tax ) {
	               this.tax = tax;
	            }
	            
	            public String getproductld() {
	               return productld;
	            }
	            
	            public String getproductArea() {
	               return productArea;
	            }
	            
	            public int getprice() {
	               return price;
	            }
	            
	            public double tax() {
	               return tax;
	            }

	               
	            public String information() {
	               return productld + " " + productName + " " + productArea + " "  + price+" "+" " + tax;
	            }

	      

	      

	    
	      

	       
	      
	   }
	   
	   



	
	
	
	

	
	
	 
	
