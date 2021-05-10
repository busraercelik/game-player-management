package entities;

public class SalesCampaign {
	private long id;
	private String campaignCode;
	private String discountAmount;
	
	public SalesCampaign(long id, String campaignCode, String discountAmount) {
		super();
		this.id = id;
		this.campaignCode = campaignCode;
		this.discountAmount = discountAmount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCampaignCode() {
		return campaignCode;
	}

	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}
	
}
