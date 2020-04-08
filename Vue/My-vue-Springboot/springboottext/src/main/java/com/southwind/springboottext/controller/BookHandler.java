package com.southwind.springboottext.controller;

import com.southwind.springboottext.entity.Book;
import com.southwind.springboottext.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookHandler {

    @Autowired
    private BookRepository bookRepository;


    //查询 设置传递数据
    @GetMapping("/findAll/{page}/{size}")     //设置get请求
    public Page<Book> findAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        PageRequest request = PageRequest.of(page,size);
        return bookRepository.findAll(request);
    }

    //添加 设置添加数据
    @PostMapping("/save")
    public String save(@RequestBody Book book){
        Book result = bookRepository.save(book);
        if (result != null){
            return "success";
        }else{
            return "error";
        }
    }

    //传递等于当前id的数据
    @GetMapping("/findById/{id}")
    public Book findById(@PathVariable("id")Integer id){
        return bookRepository.findById(id).get();
    }

    //修改数据
    @PutMapping("/update")
    public String update(@RequestBody Book book){
        Book result = bookRepository.save(book);
        if (result != null){
            return "success";
        }else {
            return "error";
        }
    }

    //删除当前id的数据
    @DeleteMapping("/deleteById/{id}")
    public void  deleteById(@PathVariable("id") Integer id){
        bookRepository.deleteById(id);
    }
}
