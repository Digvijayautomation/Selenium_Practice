package DataSupplier;

import static io.github.sskorol.data.TestDataReader.use;
import java.lang.reflect.Method;
import org.testng.annotations.Test;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.JsonReader;
import one.util.streamex.StreamEx;

public class JsonData_Supplier {

	@DataSupplier
	public StreamEx<JsonPojo> getdata(Method method) {
		return use(JsonReader.class)
				.withTarget(JsonPojo.class)
				.withSource("testdata.json")
				.read();

	}

	@Test(dataProvider = "getdata")
	public void testdata(JsonPojo json) {
		System.out.println(json);

	}

}
