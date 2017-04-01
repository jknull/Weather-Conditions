package protectedarea.bigdata.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "areas")
public class Area {
	@Id
	private String WDPAID;
	private String NAME;
	private String SUB_LOC;
	private float LAT;
	private float LON;
	
	public String getWDPAID(){
		return WDPAID;
	}
	public void setWDPAID(String wDPAID){
		WDPAID = wDPAID;
	}
    public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getSUBLOC() {
		return SUB_LOC;
	}
	public void setSTATUS(String subLoc) {
		SUB_LOC = subLoc;
	}
	public float getLAT() {
		return LAT;
	}
	public void setLAT(float lat) {
		LAT = lat;
	}
	public float getLON(){
		return LON;
	}
	public void setLON(float lon){
		LON = lon;
	}
	
	
}
