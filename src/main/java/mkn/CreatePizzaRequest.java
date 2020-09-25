package mkn;

import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CreatePizzaRequest {
	@NotBlank
	private String orderedBy;
	
	@NotBlank
	private String type;
}
