package product;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
class Product
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id ;
  
  public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getExDate() {
		return exDate;
	}
	public void setExDate(LocalDate exDate) {
		this.exDate = exDate;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
  private String name ;
    private double price ;
    private LocalDate exDate;
    private Integer quantity;
    
    @Override
    public String toString() {
        return "Product [id=" + id +
               ", name=" + name +
               ", price=" + price +
               ", quantity=" + quantity +
               ", exDate=" + exDate + "]";
    }


}