package mkn;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UpdatePizzaRequest {
	
	@NotNull
	private Long id;
	
	@NotBlank
	private String type;
}
