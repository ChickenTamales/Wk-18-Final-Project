package hot.spring.controller.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import hot.spring.entity.Detail;
import hot.spring.entity.HotSpring;
import hot.spring.entity.SkinnyDipper;
import lombok.Data;
import lombok.NoArgsConstructor;

/*Copy/paste everything from the HotSpring entity.
Add @ Data lombok annotation to create Getters/Setters.
Add @ NoArgsConstructor.
Delete pasted annotations
Change skinnyDipper to: HotSpringSkinnyDipper
Change Set<Detail> details to Set<String> details
*/

@Data
@NoArgsConstructor
public class HotSpringData {

	 private Long hotSpringId;
	 private String hotSpringName;
	 private BigDecimal longitude;
	 private BigDecimal latitude;
	 private String county;
	 private String directions;
	 
	 //change SkinnyDipper to HotSpringSkinnyDipper
	 private HotSpringSkinnyDipper skinnyDipper;
	 
	 //change Set<Detail> to Set<String>
	 private Set<String> details = new HashSet<>();
	 
	 public HotSpringData(HotSpring hotSpring) {
		 hotSpringId = hotSpring.getHotSpringId();
		 hotSpringName = hotSpring.getHotSpringName();
		 longitude = hotSpring.getLongitude();
		 latitude = hotSpring.getLatitude();
		 county = hotSpring.getCounty();
		 directions = hotSpring.getDirections();
		 
		 //need a new hot spring skinny dipper, not a new skinny dipper entity
		 skinnyDipper = new HotSpringSkinnyDipper(hotSpring.getSkinnyDipper());
		 
		 //set details
		 for(Detail detail : hotSpring.getDetails()) {
			 details.add(detail.getDetail());
		 }
	 }
	 
	 /*Create HotSpringSkinnyDipper object, like we did for skinnyDipperData
	  * copy/paste - Id, Name, and Email from skinnydipper class.
	  * Delete all the pasted annotations from skinnydipper class. DTO?*/
	 
	 @Data
	 @NoArgsConstructor
	 public static class HotSpringSkinnyDipper {
		 private Long skinnyDipperId;
		 private String skinnyDipperName;
		 private String skinnyDipperEmail;
		 
		 //constructor for hot spring skinny dipper that takes a skinny dipper
		 public HotSpringSkinnyDipper(SkinnyDipper skinnyDipper) {
			 
			 //set fields for skinny dipper
			 skinnyDipperId = skinnyDipper.getSkinnyDipperId();
			 skinnyDipperName = skinnyDipper.getSkinnyDipperName();
			 skinnyDipperEmail = skinnyDipper.getSkinnyDipperEmail();
		 }
	 }
}
