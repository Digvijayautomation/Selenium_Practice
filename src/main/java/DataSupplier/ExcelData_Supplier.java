package DataSupplier;

import static io.github.sskorol.data.TestDataReader.use;
import java.lang.reflect.Method;
import org.testng.annotations.Test;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;

public class ExcelData_Supplier {

	@DataSupplier
	public StreamEx<ExcelPojo> getdata(Method method) {
		return use(XlsxReader.class)
				.withTarget(ExcelPojo.class)
				.withSource("testdata.xlsx")
				.read();
	}

	@Test(dataProvider = "getdata")
	public void testdata(ExcelPojo excel) {
		System.out.println(excel);
		
		
}

}