package sms;

import lombok.Data;

@Data
public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;

	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GbMuz0vVtxKEk3\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		String d1 = data.replace("{", "");
		d1 = d1.replace("}", "");
		d1 = d1.replace("\"", "");
		Response res = new Response();

		String[] dataList = d1.split(",");

		res.setGroup_id(dataList[0].split(":")[1]);
		res.error_list = (dataList[1].split(":")[2]);
		res.success_count = dataList[2].split(":")[1];
		res.error_count = dataList[3].split(":")[1];
		System.out.println(res);

	}
}

