package com.todo.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todo.pages.TodoPage;
import com.todo.utils.Setup;

public class AddTodoTest extends Setup {

	public AddTodoTest() throws IOException {
		super();
		
	}
	
	TodoPage todopage;
	
	@Test
	public void iCanAddTodo() throws IOException {
		
		todopage = new TodoPage();
		boolean text = todopage.isElementDisplayed(TodoPage.textField);
		Assert.assertTrue(text);
		todopage.submitTodo(prop.getProperty("todo1"));
		String result = todopage.checkItem(TodoPage.item1);
		Assert.assertTrue(result.contains(prop.getProperty("todo1")));
		boolean checkBox = todopage.isCheckBoxSelected(TodoPage.checkBox);
		Assert.assertFalse(checkBox);
		
		
	}
	
	

}
