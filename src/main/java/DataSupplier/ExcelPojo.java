package DataSupplier;

import com.creditdatamw.zerocell.annotation.Column;

import io.github.sskorol.data.Sheet;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Sheet(name="testdata")
public class ExcelPojo {
	
	
	@Column(index=0, name="username")
	private String username;
	
	@Column(index=1, name="password")
	private String password;

}
