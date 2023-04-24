package PlayLand;

public class OrderList {
	
	private int ticketSelect;
	private int ageGroup;
	private int orderCount;
	private int discountSelect;
	private int totalPrice; 
	private String customerIDNumber;
	
	
	public int getTicketSelect() {
		return ticketSelect;
	}
	public void setTicketSelect(int ticketSelect) {
		this.ticketSelect = ticketSelect;
	}
	public int getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public int getDiscountSelect() {
		return discountSelect;
	}
	public void setDiscountSelect(int discountSelect) {
		this.discountSelect = discountSelect;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCustomerIDNumber() {
		return customerIDNumber;
	}
	public void setCustomerIDNumber(String customerIDNumber) {
		this.customerIDNumber = customerIDNumber;
	}

}