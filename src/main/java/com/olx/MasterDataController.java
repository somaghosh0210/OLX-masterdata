package com.olx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="*")
public class MasterDataController {
	
	@GetMapping(value="/category",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Category>> getAllAdCategory(){
		Category category1 = new Category();
		category1.setId(1);
		category1.setCategory("Furniture");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setCategory("Car");
		
		Category category3 = new Category();
		category2.setId(3);
		category2.setCategory("Mobile");
		List<Category> categoryList=new ArrayList<Category>();
		categoryList.add(category1);
		categoryList.add(category2);
		categoryList.add(category3);
		return new ResponseEntity(categoryList,HttpStatus.OK);
	}
	

	@GetMapping(value="/status",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Status>> getAllAdStatus(){
		Status status1 = new Status();
		status1.setId(1);
		status1.setStatus("OPEN");
		Status status2 = new Status();
		status2.setId(2);
		status2.setStatus("CLOSE");
		
		status2.setId(3);
		status2.setStatus("CLOSE");
		
		List<Status> statusList=new ArrayList<Status>();
		statusList.add(status1);
		statusList.add(status2);
		
		return new ResponseEntity(statusList,HttpStatus.OK);
	}
}
