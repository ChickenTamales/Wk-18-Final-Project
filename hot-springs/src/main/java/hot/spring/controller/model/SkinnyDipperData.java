package hot.spring.controller.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import hot.spring.entity.Detail;
import hot.spring.entity.HotSpring;
import hot.spring.entity.SkinnyDipper;
import lombok.Data;
import lombok.NoArgsConstructor;

//DAO

@Data
@NoArgsConstructor
public class SkinnyDipperData {

	private Long skinnyDipperId;
    private String skinnyDipperName;
    private String skinnyDipperEmail;
    
    //change HotSpring to HotSpringResponse
    private Set<HotSpringResponse> hotSprings = new HashSet<>();
    
    /* convert from a SkinnyDipper object to a SkinnyDipperData object */
    public SkinnyDipperData(SkinnyDipper skinnyDipper) {
    	skinnyDipperId = skinnyDipper.getSkinnyDipperId();
    	skinnyDipperName = skinnyDipper.getSkinnyDipperName();
    	skinnyDipperEmail = skinnyDipper.getSkinnyDipperEmail();
    	
    	for(HotSpring hotSpring : skinnyDipper.getHotSprings()) {
    		hotSprings.add(new HotSpringResponse(hotSpring));
    	}
	}
    
    /*only creates getters, and a HotSpring constructor with all the fields in 
     * it */
    
    @Data
    @NoArgsConstructor
    static class HotSpringResponse {
    	private Long hotSpringId;
    	private String hotSpringName;
    	private BigDecimal longitude;
    	private BigDecimal latitude;
    	private String county;
    	private String directions;
    	
    	//change Detail to String
    	private Set<String> details = new HashSet<>();
    	
    	HotSpringResponse(HotSpring hotSpring){
    		hotSpringId = hotSpring.getHotSpringId();
    		hotSpringName = hotSpring.getHotSpringName();
    		longitude = hotSpring.getLongitude();
    		latitude = hotSpring.getLatitude();
    		county = hotSpring.getCounty();
    		directions = hotSpring.getDirections();
    		
    		for(Detail detail : hotSpring.getDetails()) {
    			details.add(detail.getDetail());
    		}
    	}
    	    
    }
}
