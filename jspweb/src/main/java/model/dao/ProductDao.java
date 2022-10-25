package model.dao;

import java.util.ArrayList;

import model.dto.PcategoryDto;
import model.dto.ProductDto;

public class ProductDao extends Dao {

	// 1. 카테고리 등록 [ C ]
	public boolean setPcategory( String pcname ) {
		String sql = "insert into pcategory(pcname) values(?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString( 1 , pcname );
			ps.executeUpdate(); return true;
		}catch (Exception e) { System.out.println(e);	}
		return false;
	}
	// 2. 카테고리 출력 [ R ]
	public ArrayList< PcategoryDto > getPcategory(){
		return null;
	}
	// 3. 제품 등록  [ C ]
	public boolean setProduct (ProductDto dto ) {
		return false;
	}
	// 4. 제품 출력  [ R ]
	public ArrayList< ProductDto > getProductlist(){
		return null;
	}
	
	
}
