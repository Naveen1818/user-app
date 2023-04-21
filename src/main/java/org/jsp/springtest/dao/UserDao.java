package org.jsp.springtest.dao;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.jsp.springtest.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {
	@Autowired
	EntityManager manager;
	public User update(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.merge(user);
		transaction.begin();
		transaction.commit();
		return user;
	}
	public User save(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
	}
	public User findUser(int id) {
		return	manager.find(User.class, id);
	}
	public Boolean delete(int id) {
		User u=manager.find(User.class, id);
		if(u!=null)
		{
			EntityTransaction transaction=manager.getTransaction();
			manager.remove(u);
			transaction.begin();
			transaction.commit();
			return  true;
		}
		return false;
	}
	public List<User> findAll() {
		Query q=manager.createQuery("select u from User u");
		return q.getResultList();
	}
	public User verify(long phone, String password) {
		Query q=manager.createQuery("select u from User u where u.phone=?1 and u.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		List<User> list=q.getResultList();
		if(list.size()>0)
		{
			return list.get(0);
		}
		return null;            
	}
}
