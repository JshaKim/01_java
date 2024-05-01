package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.compartor.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application2 {

    public static void main(String[] args) {
        List<BookDTO> bookDTOList = new ArrayList<>();
        bookDTOList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookDTOList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookDTOList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookDTOList.add(new BookDTO(5, "삼국유사", "일연", 58000));
    }
}