package com.goldenhouse.dao;

import com.goldenhouse.entity.Book;

import java.util.List;

public interface IBookDao {

    /**
     * 根据书籍分类ID查询是否有书籍在该分类下
     * @param bsId
     * @return
     */
    List<Book> queryBookOfBsId(int bsId);
}
