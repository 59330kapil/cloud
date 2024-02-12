package catering;

public class bill {
	int plateCount;
	int rateperPlate;
	public int getPlateCount() {
		return plateCount;
	}
	public void setPlateCount(int plateCount) {
		this.plateCount = plateCount;
	}
	public int getRateperPlate() {
		return rateperPlate;
	}
	public void setRateperPlate(int rateperPlate) {
		this.rateperPlate = rateperPlate;
	}
	public int genrateBill() {
		int bill;
		 bill=plateCount*rateperPlate;
		System.out.println("bill amount is :"+bill);
		return bill;
		
	}
	public void geneartedisBill(int dis,int bill) {
		
		float dicbill=bill-(bill/dis);
		System.out.println("discounted bill is :"+dicbill);
		
	}

}
