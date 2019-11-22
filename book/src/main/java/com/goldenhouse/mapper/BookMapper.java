package com.goldenhouse.mapper;

import com.goldenhouse.entity.Book;

import java.util.List;

public interface BookMapper {


    /**
     * 根据书籍分类ID查询是否有书籍在该分类下
     * @param bsId
     * @return
     */
    List<Book> queryBookOfBsId(int bsId);
}
