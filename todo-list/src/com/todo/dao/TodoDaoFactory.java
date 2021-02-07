package com.todo.dao;

public class TodoDaoFactory {
	private static TodoDao myTodoDao = new MockDao();

	public static TodoDao getDao() {
		return myTodoDao;
	}
}
