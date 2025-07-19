package com.nt.array;
//@Service
public class TxnService {
	private static TxnResponse  response;
	
	public static TxnResponse processTxn(TxnRequest request) {
		 response = new TxnResponse();
	    response.setTxnId(request.getTxnId());
	    response.setAmt(request.getAmt());
	    return response;
	}
	
	public static void main(String[] args) {
		TxnRequest req1 = new TxnRequest();
		req1.setTxnId(12);req1.setAmt("2000");
		 
        System.out.println("req1"+processTxn(req1));		
        
    	TxnRequest req2 = new TxnRequest();
		req2.setTxnId(13);req2.setAmt("3000");
		 
        System.out.println("req2"+processTxn(req2));		
	}
	
	
}

class TxnRequest{
	
	private int txnId;
	private String amt;
	
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "TxnRequest [txnId=" + txnId + ", amt=" + amt + "]";
	}
	
	
}


class TxnResponse{
	
	private int txnId;
	private String amt;
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "TxnResponse [txnId=" + txnId + ", amt=" + amt + "]";
	}
	
	
}