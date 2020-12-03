package jsonex;

import java.util.List;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Example {
	public String squadName;
	public String homeTown;
	public Integer formed;
	public String secretBase;
	public Boolean active;
	public List<Member> members = null;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Member {
	public String name;
	public Integer age;
	public String secretIdentity;
	public List<String> powers = null;
}

public class Json02 {
	public static void main(String[] args) {
		String json = "{\r\n"
				+ "  \"squadName\": \"Super hero squad\",\r\n"
				+ "  \"homeTown\": \"Metro City\",\r\n"
				+ "  \"formed\": 2016,\r\n"
				+ "  \"secretBase\": \"Super tower\",\r\n"
				+ "  \"active\": true,\r\n"
				+ "  \"members\": [\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Molecule Man\",\r\n"
				+ "      \"age\": 29,\r\n"
				+ "      \"secretIdentity\": \"Dan Jukes\",\r\n"
				+ "      \"powers\": [\r\n"
				+ "        \"Radiation resistance\",\r\n"
				+ "        \"Turning tiny\",\r\n"
				+ "        \"Radiation blast\"\r\n"
				+ "      ]\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Madame Uppercut\",\r\n"
				+ "      \"age\": 39,\r\n"
				+ "      \"secretIdentity\": \"Jane Wilson\",\r\n"
				+ "      \"powers\": [\r\n"
				+ "        \"Million tonne punch\",\r\n"
				+ "        \"Damage resistance\",\r\n"
				+ "        \"Superhuman reflexes\"\r\n"
				+ "      ]\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"name\": \"Eternal Flame\",\r\n"
				+ "      \"age\": 1000000,\r\n"
				+ "      \"secretIdentity\": \"Unknown\",\r\n"
				+ "      \"powers\": [\r\n"
				+ "        \"Immortality\",\r\n"
				+ "        \"Heat Immunity\",\r\n"
				+ "        \"Inferno\",\r\n"
				+ "        \"Teleportation\",\r\n"
				+ "        \"Interdimensional travel\"\r\n"
				+ "      ]\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";

		Gson gson = new Gson();
		
		Example jsondata = gson.fromJson(json, Example.class);
		System.out.println(jsondata);
		
		String json1 = gson.toJson(jsondata);
		System.out.println(json1);
	}

}
