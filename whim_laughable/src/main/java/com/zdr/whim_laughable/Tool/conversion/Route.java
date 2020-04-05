package com.zdr.whim_laughable.Tool.conversion;

import com.zdr.whim_laughable.Tool.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 本地链接
 * 
 * @author 好人
 *
 */
@Component
public class Route {

	@Autowired
	private Tool tool;

	// 动态爬虫模块地址
	private static  String Address_dynamic_crawler_module;
	// 仓库name
	private static  String warehouse_cookie_name;
	// 仓库cookie
	private static  String warehouse_cookie_value;
	// 仓库页码
	private static  String warehouse_pagination;
	// 本地保存地址
	private static  String Local_storage_address;
	// 图片保存地址
	private static  String Picture_crawler;
	//邮箱账号
	private static  String mail_user;
	//邮箱密码
	private static  String mail_password;
	//邮箱密钥
	private static  String IPAPI_KEY;
	// videosCookie
	private static  String Xvideos_Cookie_value;
	//36Kr页码(每次会在网站上获取,写出来只是为了统一)
	private static  String Kr36_pagination;
	//非常有名的gif网站
	private static  String SssGif_pagination;
	//不用说都懂
	private static  String Xvideos_pagination;





	//存储页码等成对出现的数值类型
	private static final Map<String,Integer> Numeric_Types = new HashMap<String,Integer>();


	
	/**
	 * 静态代码块 (存入缓存当中)
	 */

	public void MISinitialize(){

		List<String> route = tool.getDisplayColumns("route");
		Address_dynamic_crawler_module = route.get(0);
		warehouse_cookie_name = route.get(1);
		warehouse_cookie_value = route.get(2);
		Local_storage_address = route.get(3);
		Picture_crawler = route.get(4);
		mail_user = route.get(5);
		mail_password = route.get(6);
		IPAPI_KEY = route.get(7);
		Xvideos_Cookie_value = route.get(8);
		
		List<String> valueS = tool.getDisplayColumns("valueS");
		warehouse_pagination = valueS.get(0);
		Kr36_pagination =  valueS.get(1);
		SssGif_pagination =  valueS.get(2);
		Xvideos_pagination =  valueS.get(3);


		Numeric_Types.put("cangku_F",PartitionInt(warehouse_pagination,0));
		Numeric_Types.put("cangku_L",PartitionInt(warehouse_pagination,1));

		Numeric_Types.put("Kr36_F",PartitionInt(Kr36_pagination,0));
		Numeric_Types.put("Kr36_L",PartitionInt(Kr36_pagination,1));

		Numeric_Types.put("SssGif_F",PartitionInt(SssGif_pagination,0));
		Numeric_Types.put("SssGif_L",PartitionInt(SssGif_pagination,1));

		Numeric_Types.put("Xvideos_F",PartitionInt(Xvideos_pagination,0));
		Numeric_Types.put("Xvideos_L",PartitionInt(Xvideos_pagination,1));



		
//		for (String ss : Element) {
//			System.out.println(ss);
//		}
	}


	public static Integer PartitionInt(String StrInt , int place){
		String []  ArrayStrInt = StrInt.split("P");
		Integer[] ParInt = {Integer.parseInt(ArrayStrInt[0]),Integer.parseInt(ArrayStrInt[1])};
		return ParInt[place];
	}



	
	public  String getIPAPI_KEY() {
		return IPAPI_KEY;
	}

	public  String getAddressDynamicCrawlerModule() {
		return Address_dynamic_crawler_module;
	}

	public  String getWarehouseCookieName() {
		return warehouse_cookie_name;
	}

	public  String getWarehouseCookieValue() {
		return warehouse_cookie_value;
	}

	public  String getLocalStorageAddress() { return Local_storage_address; }

	public  String getPictureCrawler() {
		return Picture_crawler;
	}

	public  String getMailUser() {
		return mail_user;
	}

	public  String getMailPassword() {
		return mail_password;
	}
	
	public  String getVideosCookie() {
		return Xvideos_Cookie_value;
	}
	
	public  String getWarehouse_pagination() {
		return warehouse_pagination;
	}

	public  String getKr36_pagination() {
		return Kr36_pagination;
	}

	public  String getSssGif_pagination() {
		return SssGif_pagination;
	}

	public  String getXvideos_pagination() {
		return Xvideos_pagination;
	}





	public Integer getNumeric_Types(String name) {
		return Numeric_Types.get(name);
	}
}