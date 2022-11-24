package DataSupplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonPojo {
	
	
	
	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "Pojo [username=" + username + ", password=" + password + "]";
	}

}
