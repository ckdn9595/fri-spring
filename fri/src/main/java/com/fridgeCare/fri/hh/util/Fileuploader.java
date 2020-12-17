package com.fridgeCare.fri.hh.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public class Fileuploader {
	MultipartFile files;
	String uploadpath , exportpath;
	public Fileuploader(MultipartFile uploadtarget) {
		files = uploadtarget;
		uploadpath = this.getClass().getResource("").getPath();
		uploadpath = uploadpath.substring(0, uploadpath.indexOf("/classes")) + "/upload/";
		
		File f = new File(uploadpath);
		if(!f.exists()) {
			System.out.println("make upload dir = " + f.mkdir());
		}
//		f = new File(downloadpath);
//		if(!f.exists()) {
//			System.out.println("make download dir = " + f.mkdir());
//		}
	}
	public File upload() {
		uploadpath += files.getOriginalFilename();
		File f = new File(uploadpath);
		try {
			files.transferTo(f);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}
	public String rename(String oriname , int bno , int i) {
		String left = oriname.substring(0, oriname.lastIndexOf('.'));
		String right = oriname.substring(oriname.lastIndexOf('.'));
		oriname = bno + left + i + right;
		return oriname;
	}
	public void export() {
		exportpath = "C:\\Users\\class02\\git\\fri-spring\\fri\\src\\main\\webapp\\resources\\upload\\";
	}
}
