package com.southwind.springboottext;

import com.southwind.springboottext.entity.Book;
import com.southwind.springboottext.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
class SpringboottextApplicationTests {

	@Autowired
	private BookRepository repository;


	@Test
	void contextLoads() {
		PageRequest pageRequest = PageRequest.of(0,6);
		Page<Book> page = repository.findAll(pageRequest);
		int i = 0;
	}

	@Test
	void save(){
		Book book = new Book();
		book.setName("Springa Boot");
		book.setAuthor("张三");
		Book book1 = repository.save(book);
		System.out.println(book);
	}

	@Test
	void findById(){
		Book book = repository.findById(1).get();
		System.out.println(book);
	}

	@Test
	void upDate(){
		Book book = new Book();
		book.setId(1);
		book.setName("解忧杂货店11");
		book.setAuthor("东野圭吾");
		Book book1 = repository.save(book);
		System.out.println(book1);
	}

	@Test
	void  delete(){
		repository.deleteById(18);
	}

//	@Test
//	void login(){
//		Login login = new Login();
//		login.setId(4);
//		login.setUsername("user");
//		login.setPassword("123");
//		Login login1 = loginRepository.save(login);
//		System.out.println(login1);
//	}
}
