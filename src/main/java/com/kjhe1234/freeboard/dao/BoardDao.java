package com.kjhe1234.freeboard.dao;

import java.util.ArrayList;

import com.kjhe1234.freeboard.dto.BoardDto;

public interface BoardDao {
	
	public void writeDao(String bname,String btitle,String bcontent); // 글쓰기
	public ArrayList<BoardDto> listDao(); //글목록 가져오기
	
}
