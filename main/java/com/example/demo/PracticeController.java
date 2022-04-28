package com.example.demo;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController 
{
	
	@GetMapping("/data/{arr}")
	public MyData sendData(@PathVariable String[] arr)
	{
		String[] i=new String[10];
		String[] c=new String[10];
		boolean s=false;
		if(arr==null)
		{
			s=false;
		}
		else
		{
			s=true;
		}
		for(int j=0;j<arr.length;j++)
		{
			int p=0;
			int m=0;
			if(arr[j].matches("[a-zA-Z]"))
			{
				c[p]=arr[j];
				p++;
			}
			else if(arr[j].matches("[0-9]"))
			{
				i[m]=arr[j];
				m++;
			}
		}
		MyData md=new MyData(s, "shital_mukunda_naphade_27/10/1994", "shital.naphade2016@gmail.com", "110200674", i, c);
		return md;
		
	}

}
